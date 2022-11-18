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

    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        this.ID = iD;
    }
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        this.Brand = brand;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        this.Model = model;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        this.Year = year;
    }
    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        this.Price = price;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        this.Type = type;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        this.Department = department;
    }

}