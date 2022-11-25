package model.Cliente;
import java.util.ArrayList;

public class Clientes{

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();    

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> cars) {
        clientes = cars;
    }


    public static Cliente searchObj(Cliente cli) {
        for (Cliente c: clientes){
            if(c == cli){
             return c;
            }
         }
        return null;
    }

    public static Cliente searchID(int ID) {
        for (Cliente c: clientes){
            if(c.getID() == ID){
             return c;
            }
         }
        return null;
    }

    public static Cliente search(String name, String document, String city, String type) {
        for (Cliente c: clientes){
            if(c.getName() == name & c.getDocument() == document & c.getCity() == city & c.getType() == type){
             return c;
            }
         }
        return null;
    }

    public static ArrayList<Cliente> searchList(String name, String document, String city, String type) {
        
        ArrayList<Cliente> output = new ArrayList<Cliente>();

        if (name != null){
            for (Cliente c: clientes){
                if(c.getName() == name){
                    output.add(c);
                }
             }
        }else if(document != null){
            for (Cliente c: clientes){
                if(c.getDocument() == document){
                    output.add(c);
                }
             }
        }else if(city != null){
            for (Cliente c: clientes){
                if(c.getCity() == city){
                    output.add(c);
                }
             }
        }else if(type != null){
            for (Cliente c: clientes){
                if(c.getType() == type){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public static Boolean add(Cliente cli) {
        cli.setID(lastID() + 1);
        clientes.add(cli);
        return true;
    }

    public  static Boolean remove(Cliente cli) {
        if (clientes.contains(cli)) { 
            clientes.remove(cli);
            return true; 
        }
        return false;
    }

    public static int lastID() {
        if(clientes.size() == 0){
            return 0;
        }else{
            return clientes.get(clientes.size() - 1).getID();
        }
    }
    
  
}
