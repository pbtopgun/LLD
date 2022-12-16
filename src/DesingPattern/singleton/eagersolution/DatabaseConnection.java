package DesingPattern.singleton.eagersolution;

//Eager
//1. Going to increase the application bootup time.
//2. We can not assign attributes
public class DatabaseConnection {
    //https//<domainname>/myapplicationDB
    String databaseUrl;

    private static DatabaseConnection instance = new DatabaseConnection(); ///private 

    private DatabaseConnection(){
    }

    public static DatabaseConnection getInstance() { //multiple threads come here to READ the value of instance
        return instance;
    }
}
