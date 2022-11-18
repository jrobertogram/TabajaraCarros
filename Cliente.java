public abstract class Cliente {
  
    private int ID;
    private String Name;
    private String Document;
    private String City;
    private String Type;

    public Cliente( String name, String document, String city, String type) {
      Name = name;
      Document = document;
      City = city;
      Type = type;
    }
  
}
