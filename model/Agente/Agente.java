package model.Agente;

public abstract class Agente {

    protected int ID;
    protected String type;
    protected String username;
    protected String password;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    

}
