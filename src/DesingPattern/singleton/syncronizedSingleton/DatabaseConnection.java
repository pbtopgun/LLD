package DesingPattern.singleton.syncronizedSingleton;

//MultiThreaded
public class DatabaseConnection {

    //String databaseUrl;

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){
    }
    //Multithreaded safe
    //Lock is on the class level
    //Wait time increases even in case of singleton already created
    //Threads executing in sequential manner!!
    public synchronized static DatabaseConnection getInstance() {  //T1(t0),T2(t0), T3(t10),T4(t10),T5(t10),T6,T7.....T100(t10)
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance; //T1(t5),T2(t6)
    }
}
