package model.Agente;
import java.util.ArrayList;

import model.Container;
import model.Iterator;

public class Agentes implements Container{

    private static ArrayList<Agente> agentes;
    private static Agentes instance = null;  
    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < agentes.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Agente next() {
        
           if(this.hasNext()){
            return agentes.get(index++);
           }
           return null;
        }		
     }
    
    public boolean authenticate(Agente agente){
        for(Iterator iter = getIterator(); iter.hasNext();){
            Agente a = (Agente)iter.next();
            if(a == agente){
             return true;
            }
         }
        return false;
    }

    public boolean authenticateP(String username, String password, String type){
        for(Iterator iter = getIterator(); iter.hasNext();){
            Agente a = (Agente)iter.next();
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

    public  Boolean remove(Agente cli) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Agente c = (Agente)iter.next();
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

    public static Agentes getInstance() {
        if (instance == null) {
			instance = new Agentes();
        }
        return instance;
    }
    
}
