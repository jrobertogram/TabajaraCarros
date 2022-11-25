package model.Agente;

public class Employee extends Agente{
 
    public Employee(String Username, String Password) {
        super.type = "Employee";
        super.username = Username;
        super.password = Password;
    }
   
}
