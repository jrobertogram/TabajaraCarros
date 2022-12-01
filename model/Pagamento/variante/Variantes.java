package model.Pagamento.variante;
import java.util.ArrayList;
import model.Container;
import model.Iterator;

public class Variantes implements Container{
    private ArrayList<Variante> variantes = new ArrayList<Variante>();   
    private static Variantes instance = null;

    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < variantes.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Variante next() {
        
           if(this.hasNext()){
            return variantes.get(index++);
           }
           return null;
        }		
     }

    public static Variantes getInstance() {
        if (instance == null) {
			instance = new Variantes();
        }

        return instance;
    }

    public Variante searchObj(Variante var) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object vv = iter.next();
            Variante v = (Variante)vv;
            if(v == var){
             return v;
            }
         }
        return null;
    }

    public Variante searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object vv = iter.next();
            Variante var = (Variante)vv;
            if(var.getID() == ID){
             return var;
            }
         }
        return null;
    }

    public Variante search(String Name) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object vv = iter.next();
            Variante var = (Variante)vv;
            if(var.getName() == Name){
             return var;
            }
         }
        return null;
    }

    public Boolean add(Variante var) {
        var.setID(lastID() + 1);
        variantes.add(var);
        return true;
    }

    public Boolean remove(Variante var) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object vv = iter.next();
            Variante v = (Variante)vv;
           if(v == var){
            variantes.remove(var);
            return true;
           }
        }
        return false;
    }

    public int lastID() {
        if(variantes.size() == 0){
            return 0;
        }else{
            return variantes.get(variantes.size() - 1).getID();
        }
    }

}
