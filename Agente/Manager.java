package model.Agente;

public class Manager extends Agente{
 
    public Manager(String Username, String Password) {
        super.type = "Manager";
        super.username = Username;
        super.password = Password;
    }
       
}
