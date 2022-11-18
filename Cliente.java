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
  
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getDocument() {
        return Document;
    }
    public void setDocument(String document) {
        Document = document;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
  
}
