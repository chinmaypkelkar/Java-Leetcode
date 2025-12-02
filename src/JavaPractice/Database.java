package JavaPractice;

public class Database {
    private volatile static Database db;
    private String connectionString;

    
    private Database(){
        connectionString = "test connection";
    }

    public static  Database getInstance(){
        if(db == null){
            synchronized(Database.class){
                if(db == null){
                    db = new Database();
                } 
            }
        }
        return db;
    }

     public void query(String sql) {
        System.out.println(Thread.currentThread().getName() + " executing query: " + sql);
    }
}
