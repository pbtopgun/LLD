package DesingPattern.singleton.multithreadedDOUBLEcheck;

//MultiThreaded
public class DatabaseConnection {

    String databaseUrl;

    private static DatabaseConnection instance = null;

    private DatabaseConnection(String databaseURL){
        this.databaseUrl = databaseURL;
    }
    //Multithreaded safe
    //Much more concurrent
    public static DatabaseConnection getInstance(String databaseURL) {  //T1(t0),T2(t0), T3(t10),T4(t10),T5(t10),T6,T7.....T100(t10)
        if(instance == null) {//T1(t1),T2(t1), T3(t11),T4(t11),T5(t11),T6,T7.....T100(t11)
            synchronized(DatabaseConnection.class){ //T1(t2),T2(5)
               if(instance == null) {
                    instance = new DatabaseConnection(databaseURL);
                }
            }//remove lock  T1(t4),T2(6)
        }//T3(t12),T4(t12),T5(t12),T6,T7.....T100(t12)
        return instance; //T1(t5),T2(t6)
    }
}
