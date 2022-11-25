package model.Departamento;
import java.util.ArrayList;

public class Departamentos{

    private static ArrayList<Departamento> departamentos = new ArrayList<Departamento>();    

    public static ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public static void setDepartamentos(ArrayList<Departamento> departs) {
        departamentos = departs;
    }

    public static Departamento searchObj(Departamento derp) {
        for (Departamento d: departamentos){
            if(d == derp){
             return d;
            }
         }
        return null;
    }

    public static Departamento searchID(int ID) {
        for (Departamento d: departamentos){
            if(d.getID() == ID){
             return d;
            }
         }
        return null;
    }


    public static Departamento search(String name,  String city, String state) {
        for (Departamento d: departamentos){
            if(d.getName() == name & d.getCity() == city & d.getState() == state){
             return d;
            }
         }
        return null;
    }

    public static ArrayList<Departamento> searchList(String name,  String city, String state) {
        
        ArrayList<Departamento> output = new ArrayList<Departamento>();

        if (name != null){
            for (Departamento d: departamentos){
                if(d.getName() == name){
                    output.add(d);
                }
             }
        }else if(city != null){
            for (Departamento d: departamentos){
                if(d.getCity() == city){
                    output.add(d);
                }
             }
        }else if(state != null){
            for (Departamento d: departamentos){
                if(d.getState() == state){
                    output.add(d);
                }
             }
        }
        return output;
    }

    public static Boolean add(Departamento dpt) {
        dpt.setID(lastID() + 1);
        departamentos.add(dpt);
        return true;
    }

    public static Boolean remove(Departamento derp) {
        for (Departamento d: departamentos){
           if(d == derp){
            departamentos.remove(derp);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        if(departamentos.size() == 0){
            return 0;
        }else{
            return departamentos.get(departamentos.size() - 1).getID();
        }
    }

}
