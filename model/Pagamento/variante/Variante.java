package model.Pagamento.variante;

public abstract class Variante {

    protected int ID;
    protected String Name;
    protected float Value;
    protected String Type;

    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public float getValue() {
        return Value;
    }


    public void setValue(float value) {
        Value = value;
    }


    public String getType() {
        return Type;
    }


    public void setType(String type) {
        Type = type;
    }

    

}
