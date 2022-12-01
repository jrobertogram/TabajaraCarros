package model.Carro;
import java.util.ArrayList;

import model.Container;
import model.Iterator;

public class Carros implements Container{

    private ArrayList<Carro> carros;
    private static Carros instance = null;
    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < carros.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Carro next() {
        
           if(this.hasNext()){
            return carros.get(index++);
           }
           return null;
        }		
     }

    public static Carros getInstance() {
        if (instance == null) {
			instance = new Carros();
        }

        return instance;
    }

    public ArrayList<Carro> getCars() {
        return carros;
    }

    public void setCars(ArrayList<Carro> cars) {
        carros = cars;
    }

    public Carro searchObj(Carro car) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Carro c = (Carro)iter.next();
            if(c == car){
             return c;
            }
         }
        return null;
    }

    public Carro searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Carro c = (Carro)iter.next();
            if(c.getID() == ID){
             return c;
            }
         }
        return null;
    }

    
    public Carro search(String brand, String model, int year, int department) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Carro c = (Carro)iter.next();
            if(c.getBrand() == brand & c.getModel() == model & c.getYear() == year & c.getDepartment() == department){
             return c;
            }
         }
        return null;
    }


    public ArrayList<Carro> searchList(String brand, String model, int year, int department, String Type) {
        
        ArrayList<Carro> output = new ArrayList<Carro>();

        if (brand != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Carro c = (Carro)iter.next();
                if(c.getBrand() == brand){
                    output.add(c);
                }
             }
        }else if(model != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Carro c = (Carro)iter.next();
                if(c.getBrand() == model){
                    output.add(c);
                }
             }
        }else if(year != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Carro c = (Carro)iter.next();
                if(c.getYear() == year){
                    output.add(c);
                }
             }
        }else if(department != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Carro c = (Carro)iter.next();
                if(c.getDepartment() == department){
                    output.add(c);
                }
             }
        }else if(Type != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Carro c = (Carro)iter.next();
                if(c.getType() == Type){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public Boolean add(Carro car) {
        car.setID(lastID() + 1);
        carros.add(car);
        return true;
    }

    public Boolean remove(Carro car) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Carro c = (Carro)iter.next();
           if(c == car){
            carros.remove(car);
            return true;
           }
        }
        return false;
    }

    public int lastID() {
        if(carros.size() == 0){
            return 0;
        }else{
            return carros.get(carros.size() - 1).getID();
        }
    }
  
}
