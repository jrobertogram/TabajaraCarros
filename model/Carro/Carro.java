package model.Carro;

public class Carro {
private int ID;
private String Brand;
private String Model;
private int Year;
private int Price;
private String Type;
private int Department;
private boolean available;



public Carro(String brand, String model, int year, int price, String type, int department) {
    this.Brand = brand;
    this.Model = model;
    this.Year = year;
    this.Price = price;
    this.Type = type;
    this.Department = department;
    this.available = true;
}

public boolean Edit(String brand, String model, int year, int price, String type, int department) {
    
    if((brand != null) & (brand == "")){
        Brand = brand;
    }
    if((model != null) & (model == "")){
        Model = model;
    }
    if((year != 0)){
        Year = year;
    }
    if((price != 0)){
        Price = price;
    }
    if((type != null) & (type == "")){
        Type = type;
    }
    if((department != 0)){
        Department = department;
    }
    return true;
}

public int getID() {
    return ID;
}
public void setID(int iD) {
    ID = iD;
}
public String getBrand() {
    return Brand;
}
public void setBrand(String brand) {
    Brand = brand;
}
public String getModel() {
    return Model;
}
public void setModel(String model) {
    Model = model;
}
public int getYear() {
    return Year;
}
public void setYear(int year) {
    Year = year;
}
public int getPrice() {
    return Price;
}
public void setPrice(int price) {
    Price = price;
}
public String getType() {
    return Type;
}
public void setType(String type) {
    Type = type;
}
public int getDepartment() {
    return Department;
}
public void setDepartment(int department) {
    Department = department;
}

public boolean isAvailable() {
    return available;
}

public void setAvailable(boolean available) {
    this.available = available;
}

  
}
