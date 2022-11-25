package model.Agente;

public class Director extends Agente{

    public Director(String Username, String Password) {
        super.type = "Director";
        super.username = Username;
        super.password = Password;
    }

}
