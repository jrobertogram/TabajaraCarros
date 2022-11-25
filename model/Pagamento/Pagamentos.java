package model.Pagamento;
import java.util.ArrayList;

public class Pagamentos {
    private static ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();    

    public static ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public static void setPagamentos(ArrayList<Pagamento> pags) {
        pagamentos = pags;
    }

    public static Pagamento searchObj(Pagamento pag) {
        for (Pagamento p: pagamentos){
            if(p == pag){
             return p;
            }
         }
        return null;
    }

    public static Pagamento searchID(int ID) {
        for (Pagamento pag: pagamentos){
            if(pag.getID() == ID){
             return pag;
            }
         }
        return null;
    }


    public static Pagamento search(String status, String type, float valueTotal, float valueFinal) {
        for (Pagamento pag: pagamentos){
            if(pag.getStatus() == status  & pag.getType() == type & pag.getValueTotal() == valueTotal & pag.getValueFinal() == valueFinal){
             return pag;
            }
         }
        return null;
    }

    public static ArrayList<Pagamento> searchList(String status, String type) {
        
        ArrayList<Pagamento> output = new ArrayList<Pagamento>();

        if (status != null){
            for (Pagamento pag: pagamentos){
                if(pag.getStatus() == status){
                    output.add(pag);
                }
             }
        }else if(type != null){
            for (Pagamento pag: pagamentos){
                if(pag.getType() == type){
                    output.add(pag);
                }
             }
        }
        return output;
    }

    public static Boolean add(Pagamento pag) {
        pag.setID(lastID() + 1);
        pagamentos.add(pag);
        return true;
    }

    public static Boolean remove(Pagamento pag) {
        for (Pagamento p: pagamentos){
           if(p== pag){
            pagamentos.remove(pag);
            return true;
           }
        }
        return false;
    }
    
    public static int lastID() {
        if(pagamentos.size() == 0){
            return 0;
        }else{
            return pagamentos.get(pagamentos.size() - 1).getID();
        }
    }
    
  
}
