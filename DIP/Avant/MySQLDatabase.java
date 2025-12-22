package DIP.Avant;

public class MySQLDatabase{
    public void save(String data){
        System.out.println("Saving to MySQL:" +data);
    }

    
}
 class OrderProcessor {
    private MySQLDatabase database;
    public OrderProcessor(){
        this.database = new MySQLDatabase();

    }
    public void processorOrder(String order){
        database.save(order);
    }
}

    

