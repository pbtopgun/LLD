package DesingPattern.singleton.singlethreaded;

//SingleThreaded
public class DatabaseConnection {

    //String databaseUrl;

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){
    }
    //Doesn't work for multithreaded environment
    public static DatabaseConnection getInstance() { 
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
