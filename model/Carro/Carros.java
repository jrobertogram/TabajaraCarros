package model.Carro;
import java.util.ArrayList;

public class Carros{

    private static ArrayList<Carro> carros;

    public static ArrayList<Carro> getCars() {
        return carros;
    }

    public static void setCars(ArrayList<Carro> cars) {
        carros = cars;
    }

    public static Carro searchID(int ID) {
        for (Carro c: carros){
            if(c.getID() == ID){
             return c;
            }
         }
        return null;
    }

    public static Carro search(String brand, String model, int year, int department) {
        for (Carro c: carros){
            if(c.getBrand() == brand & c.getModel() == model & c.getYear() == year & c.getDepartment() == department){
             return c;
            }
         }
        return null;
    }


    public static ArrayList<Carro> searchList(String brand, String model, int year, int department, String Type) {
        
        ArrayList<Carro> output = new ArrayList<Carro>();

        if (brand != null){
            for (Carro c: carros){
                if(c.getBrand() == brand){
                    output.add(c);
                }
             }
        }else if(model != null){
            for (Carro c: carros){
                if(c.getBrand() == model){
                    output.add(c);
                }
             }
        }else if(year != 0){
            for (Carro c: carros){
                if(c.getYear() == year){
                    output.add(c);
                }
             }
        }else if(department != 0){
            for (Carro c: carros){
                if(c.getDepartment() == department){
                    output.add(c);
                }
             }
        }else if(Type != null){
            for (Carro c: carros){
                if(c.getType() == Type){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public static Boolean add(Carro car) {
        car.setID(lastID() + 1);
        carros.add(car);
        return true;
    }

    public static Boolean remove(int ID) {
        for (Carro c: carros){
           if(c.getID() == ID){
            carros.remove(ID);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        return carros.size();
    }

    public static Boolean update(Carro old, Carro now) {
        int index;
        index = carros.indexOf(old);
        if (index != -1){
            carros.set(index, now);
        }
        return true;
    }
  
}
