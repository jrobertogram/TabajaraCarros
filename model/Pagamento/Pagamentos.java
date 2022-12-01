package model.Pagamento;
import java.util.ArrayList;
import model.Container;
import model.Iterator;
import model.PagamentosITF;

public class Pagamentos implements Container{
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>(); 
    private static Pagamentos instance = null;   
    int index;
 
    public boolean executePagar(PagamentosITF pay){
        pay.pagar();
        return true;
    }

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < pagamentos.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Pagamento next() {
        
           if(this.hasNext()){
            return pagamentos.get(index++);
           }
           return null;
        }		
     }
		

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pags) {
        pagamentos = pags;
    }

    public Pagamento searchObj(Pagamento pag) {

        for(Iterator iter = getIterator(); iter.hasNext();){
            Object p = iter.next();
            Pagamento pp = (Pagamento)p;
            if(pp == pag){
                return pp;
               }
            }
           return null;
    }

    public Pagamento searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object pp = iter.next();
            Pagamento pag = (Pagamento)pp;
            if(pag.getID() == ID){
                return pag;
               }
            }
           return null;
    }


    public Pagamento search(String status, String type, float valueTotal, float valueFinal) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object pp = iter.next();
            Pagamento pag = (Pagamento)pp;
            if(pag.getStatus() == status  & pag.getType() == type & pag.getValueTotal() == valueTotal & pag.getValueFinal() == valueFinal){
             return pag;
            }
         }
        return null;
    }

    public ArrayList<Pagamento> searchList(String status, String type) {
        
        ArrayList<Pagamento> output = new ArrayList<Pagamento>();

        if (status != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Object pp = iter.next();
                 Pagamento pag = (Pagamento)pp;
                if(pag.getStatus() == status){
                    output.add(pag);
                }
             }
        }else if(type != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Object pp = iter.next();
                Pagamento pag = (Pagamento)pp;
                if(pag.getType() == type){
                    output.add(pag);
                }
             }
        }
        return output;
    }

    public Boolean add(Pagamento pag) {
        pag.setID(lastID() + 1);
        pagamentos.add(pag);
        return true;
    }

    public Boolean remove(Pagamento pag) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Object pp = iter.next();
            Pagamento p = (Pagamento)pp;
           if(p== pag){
            pagamentos.remove(pag);
            return true;
           }
        }
        return false;
    }
    
    public int lastID() {
        if(pagamentos.size() == 0){
            return 0;
        }else{
            return pagamentos.get(pagamentos.size() - 1).getID();
        }
    }
    
    public static Pagamentos getInstance() {
        if (instance == null) {
			instance = new Pagamentos();
        }
        return instance;
    }

}
