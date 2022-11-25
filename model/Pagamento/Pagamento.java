package model.Pagamento;
import java.util.ArrayList;

import model.Pagamento.variante.Variante;
import model.Pagamento.variante.Variantes;

public abstract class Pagamento {

    protected int ID;
    protected String status;
    protected String type;
    protected float valueTotal;
    protected float valueVariantes;
    protected float valueFinal;
    protected static ArrayList<Integer> variantes = new ArrayList<Integer>();  
    
    
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(float valueTotal) {
        this.valueTotal = valueTotal;
    }


    public float getValueFinal() {
        this.valueFinal = this.valueTotal - this.valueVariantes;
        if (this.valueFinal < 0){
           this.valueFinal = 0;
        }
        return valueFinal;
    }


    public float getValueVariantes() {
        return valueVariantes;
    }

    public void setValueVariantes() {
        Variante objVariante;
        this.valueVariantes = 0;
        for (Integer var: variantes){
            objVariante =  Variantes.searchID(var);
            this.valueVariantes += objVariante.getValue();
         }
    }


    public Boolean addVariante(int var) {
        variantes.add(var);
        return true;
    }

    public  Boolean removeVariante(int ID) {
        for (Integer var: variantes){
           if(var == ID){
            variantes.remove(ID);
            return true;
           }
        }
        return false;
    }






}
