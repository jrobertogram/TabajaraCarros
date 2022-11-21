package model.Pagamento.variante;
import java.util.ArrayList;

public class Variantes {
    private static ArrayList<Variante> variantes = new ArrayList<Variante>();   

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

    public static Boolean remove(int ID) {
        for (Variante var: variantes){
           if(var.getID() == ID){
            variantes.remove(ID);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        return variantes.size();
    }

    public static Boolean update(Variante old, Variante now) {
        int index;
        index = variantes.indexOf(old);
        if (index != -1){
            variantes.set(index, now);
        }
        return true;
    }
}
