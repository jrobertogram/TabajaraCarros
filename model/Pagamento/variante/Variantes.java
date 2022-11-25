package model.Pagamento.variante;
import java.util.ArrayList;

public class Variantes {
    private static ArrayList<Variante> variantes = new ArrayList<Variante>();   


    public static Variante searchObj(Variante var) {
        for (Variante v: variantes){
            if(v == var){
             return v;
            }
         }
        return null;
    }

    public static Variante searchID(int ID) {
        for (Variante var: variantes){
            if(var.getID() == ID){
             return var;
            }
         }
        return null;
    }

    public static Variante search(String Name) {
        for (Variante var: variantes){
            if(var.getName() == Name){
             return var;
            }
         }
        return null;
    }

    public static Boolean add(Variante var) {
        var.setID(lastID() + 1);
        variantes.add(var);
        return true;
    }

    public static Boolean remove(Variante var) {
        for (Variante v: variantes){
           if(v == var){
            variantes.remove(var);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        if(variantes.size() == 0){
            return 0;
        }else{
            return variantes.get(variantes.size() - 1).getID();
        }
    }

}
