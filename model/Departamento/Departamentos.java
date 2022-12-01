package model.Departamento;
import java.util.ArrayList;

import model.Container;
import model.Iterator;

public class Departamentos implements Container{

    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();    
    private static Departamentos instance = null;
    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < departamentos.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Departamento next() {
        
           if(this.hasNext()){
            return departamentos.get(index++);
           }
           return null;
        }		
     }

    public static Departamentos getInstance() {
        if (instance == null) {
			instance = new Departamentos();
        }
        return instance;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departs) {
        departamentos = departs;
    }

    public Departamento searchObj(Departamento derp) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Departamento d = (Departamento)iter.next();
            if(d == derp){
             return d;
            }
         }
        return null;
    }

    public Departamento searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Departamento d = (Departamento)iter.next();
            if(d.getID() == ID){
             return d;
            }
         }
        return null;
    }


    public Departamento search(String name,  String city, String state) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Departamento d = (Departamento)iter.next();
            if(d.getName() == name & d.getCity() == city & d.getState() == state){
             return d;
            }
         }
        return null;
    }

    public ArrayList<Departamento> searchList(String name,  String city, String state) {
        
        ArrayList<Departamento> output = new ArrayList<Departamento>();

        if (name != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Departamento d = (Departamento)iter.next();
                if(d.getName() == name){
                    output.add(d);
                }
             }
        }else if(city != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Departamento d = (Departamento)iter.next();
                if(d.getCity() == city){
                    output.add(d);
                }
             }
        }else if(state != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Departamento d = (Departamento)iter.next();
                if(d.getState() == state){
                    output.add(d);
                }
             }
        }
        return output;
    }

    public Boolean add(Departamento dpt) {
        dpt.setID(lastID() + 1);
        departamentos.add(dpt);
        return true;
    }

    public Boolean remove(Departamento derp) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Departamento d = (Departamento)iter.next();
           if(d == derp){
            departamentos.remove(derp);
            return true;
           }
        }
        return false;
    }

    public int lastID() {
        if(departamentos.size() == 0){
            return 0;
        }else{
            return departamentos.get(departamentos.size() - 1).getID();
        }
    }

}
