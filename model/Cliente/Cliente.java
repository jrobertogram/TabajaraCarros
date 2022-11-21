package model.Cliente;

public abstract class Cliente {
    
    protected int ID;
    protected String Name;
    protected String Document;
    protected String City;
    protected String Type;

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
