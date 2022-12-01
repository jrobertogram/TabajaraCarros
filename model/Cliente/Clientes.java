package model.Cliente;
import java.util.ArrayList;

import model.Container;
import model.Iterator;

public class Clientes  implements Container{

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();    
    private static Clientes instance = null;
    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < clientes.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Cliente next() {
        
           if(this.hasNext()){
            return clientes.get(index++);
           }
           return null;
        }		
     }

    public static Clientes getInstance() {
        if (instance == null) {
			instance = new Clientes();
        }

        return instance;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> cars) {
        clientes = cars;
    }


    public Cliente searchObj(Cliente cli) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Cliente c = (Cliente)iter.next();
            if(c == cli){
             return c;
            }
         }
        return null;
    }

    public Cliente searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Cliente c = (Cliente)iter.next();
            if(c.getID() == ID){
             return c;
            }
         }
        return null;
    }

    public Cliente search(String name, String document, String city, String type) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Cliente c = (Cliente)iter.next();
            if(c.getName() == name & c.getDocument() == document & c.getCity() == city & c.getType() == type){
             return c;
            }
         }
        return null;
    }

    public ArrayList<Cliente> searchList(String name, String document, String city, String type) {
        
        ArrayList<Cliente> output = new ArrayList<Cliente>();

        if (name != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Cliente c = (Cliente)iter.next();
                if(c.getName() == name){
                    output.add(c);
                }
             }
        }else if(document != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Cliente c = (Cliente)iter.next();
                if(c.getDocument() == document){
                    output.add(c);
                }
             }
        }else if(city != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Cliente c = (Cliente)iter.next();
                if(c.getCity() == city){
                    output.add(c);
                }
             }
        }else if(type != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Cliente c = (Cliente)iter.next();
                if(c.getType() == type){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public Boolean add(Cliente cli) {
        cli.setID(lastID() + 1);
        clientes.add(cli);
        return true;
    }

    public  Boolean remove(Cliente cli) {
        if (clientes.contains(cli)) { 
            clientes.remove(cli);
            return true; 
        }
        return false;
    }

    public int lastID() {
        if(clientes.size() == 0){
            return 0;
        }else{
            return clientes.get(clientes.size() - 1).getID();
        }
    }
    
  
}
