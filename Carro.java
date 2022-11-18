public abstract class Carro {
    private String ID;
    private String Brand;
    private String Model;
    private int Year;
    private String Price;
    private String Type;
    private String Department;

    public Carro(String brand, String model, int year, String price, String type, String department) {
       
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.Price = price;
        this.Type = type;
        this.Department = department;
        
    }

}