package model.Pagamento.variante;

public class Cupom extends Variante {
    
    private String Date;


    public Cupom(String name, float value, String date) {
        super.Name = name;
        super.Value = value;
        super.Type = "cupom";
        Date = date;
    }

    public boolean Edit(String name, float value, String date) {
        super.Name = name;
        super.Value = value;
        Date = date;
        return true;
    }

    public String getDate() {
        return Date;
    }


    public void setDate(String date) {
        Date = date;
    }

    
    
}
