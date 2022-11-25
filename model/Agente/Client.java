package model.Agente;

public class Client extends Agente{
    
    public Client(String Username, String Password) {
        super.type = "Client";
        super.username = Username;
        super.password = Password;
    }

}
