package model.Cliente;

public class ClienteFisico extends Cliente {
    
    private int Wage;
    private Boolean Married;
    private Boolean Children;
    private Boolean Countryside;
    private Boolean GroupOfRisk;

    

    public Boolean edit(String name, int wage, String document, String city, Boolean married,
    Boolean children, Boolean countryside) {
        Cliente old;
        Cliente now;
        old = this;
        super.Name = name;
        Wage = wage;
        super.Document = document;
        super.City = city;
        super.Type = "Física";
        Married = married;
        Children = children;
        Countryside = countryside;
        now = this;
        Clientes.update(old, now);
        return true;
    }
    
    public ClienteFisico(String name, int wage, String document, String city) {
        super.Name = name;
        Wage = wage;
        super.Document = document;
        super.City = city;
        super.Type = "Física";
    }

    public ClienteFisico( String name, int wage, String document, String city, Boolean married,
            Boolean children, Boolean countryside) {
        super.Name = name;
        Wage = wage;
        super.Document = document;
        super.City = city;
        super.Type = "Física";
        Married = married;
        Children = children;
        Countryside = countryside;
    }


    
    public Boolean getMarried() {
        return Married;
    }



    public void setMarried(Boolean married) {
        Married = married;
    }



    public Boolean getChildren() {
        return Children;
    }



    public void setChildren(Boolean children) {
        Children = children;
    }



    public Boolean getCountryside() {
        return Countryside;
    }



    public void setCountryside(Boolean countryside) {
        Countryside = countryside;
    }



    public int getWage() {
        return Wage;
    }



    public void setWage(int wage) {
        Wage = wage;
    }

    public Boolean getGroupOfRisk() {

        if (GroupOfRisk != null){
            if(Wage > 60){
                GroupOfRisk = true;
            }else{
                GroupOfRisk = false; 
            }
        }

        return GroupOfRisk;
    }

    


  

    
}
