package model.Departamento;

public class Departamento {
    private int ID;
    private String Name;
    private String City;
    private String State;
    private String Longitude;
    private String Latitude;


    public Departamento(String name, String city, String state, String longitude, String latitude) {
        Name = name;
        City = city;
        State = state;
        Longitude = longitude;
        Latitude = latitude;
    }

    public boolean edit(String name, String city, String state, String longitude, String latitude) {
        Name = name;
        City = city;
        State = state;
        Longitude = longitude;
        Latitude = latitude;
        return true;
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


    public String getCity() {
        return City;
    }


    public void setCity(String city) {
        City = city;
    }


    public String getState() {
        return State;
    }


    public void setState(String state) {
        State = state;
    }


    public String getLongitude() {
        return Longitude;
    }


    public void setLongitude(String longitude) {
        Longitude = longitude;
    }


    public String getLatitude() {
        return Latitude;
    }


    public void setLatitude(String latitude) {
        Latitude = latitude;
    } 

    
    
}
