package model.Agente;
import java.util.ArrayList;

public class Agentes {

    private static ArrayList<Agente> agentes;
    
    public static boolean authenticate(Agente agente){
        for (Agente a: agentes){
            if(a == agente){
             return true;
            }
         }
        return false;
    }

    public static boolean authenticateP(String username, String password, String type){
        for (Agente a: agentes){
            if (a.getUsername() == username && a.password == password && a.type == type){
                return true;
            }
         }
        return false;
    }

    public static Boolean add(Agente cli) {
        cli.setID(lastID() + 1);
        agentes.add(cli);
        return true;
    }

    public  static Boolean remove(Agente cli) {
        for (Agente c: agentes){
           if(c == cli){
            agentes.remove(cli);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        if(agentes.size() == 0){
            return 0;
        }else{
            return agentes.get(agentes.size() - 1).getID();
        }
    }
    
}
