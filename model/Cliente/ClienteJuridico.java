package model.Cliente;

public class ClienteJuridico extends Cliente {

    public ClienteJuridico(String name, String document, String city) {
        super.Name = name;
        super.Document = document;
        super.City = city;
        super.Type = "Jurídico";
    }

    public Boolean edit(String name, String document, String city) {
        super.Name = name;
        super.Document = document;
        super.City = city;
        return true;
    }

    
}
