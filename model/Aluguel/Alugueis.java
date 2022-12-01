package model.Aluguel;
import java.util.ArrayList;
import java.util.Date;

import model.Container;
import model.Iterator;
import model.Carro.Carros;

public class Alugueis implements Container{

    private static ArrayList<Aluguel> alugueis;
    private static Alugueis instance = null;   
    int index;

    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
  
        @Override
        public boolean hasNext() {
        
            if(index < alugueis.size()){
              return true;
           }
           return false;
        }
  
        @Override
        public Aluguel next() {
        
           if(this.hasNext()){
            return alugueis.get(index++);
           }
           return null;
        }		
     }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(ArrayList<Aluguel> alugueis) {
        Alugueis.alugueis = alugueis;
    }


    public Aluguel searchObj(Aluguel alg) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Aluguel a = (Aluguel)iter.next();
            if(a == alg){
             return a;
            }
         }
        return null;
    }

    public Aluguel searchID(int ID) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Aluguel a = (Aluguel)iter.next();
            if(a.getID() == ID){
             return a;
            }
         }
        return null;
    }

    public Aluguel search(int Cliente, Date dateiincio) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Aluguel a = (Aluguel)iter.next();
            if(a.getDateIincio() == dateiincio & a.getCliente() == Cliente){
             return a;
            }
         }
        return null;
    }

    public ArrayList<Aluguel> searchList(String status, Date dateIincio, Date dateFinal, int intervalo, int cliente,int car ,int departamento,
    int pagamento) {
        
        ArrayList<Aluguel> output = new ArrayList<Aluguel>();


        if (status != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getStatus() == status){
                    output.add(c);
                }
             }
        }else if(dateIincio != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getDateIincio() == dateIincio){
                    output.add(c);
                }
             }
        }else if(dateFinal != null){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getDateFinal() == dateFinal){
                    output.add(c);
                }
             }
        }else if(intervalo != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getIntervalo() == intervalo){
                    output.add(c);
                }
             }
        }else if(cliente != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getCliente() == cliente){
                    output.add(c);
                }
             }
        }else if(car != 0){
            for (Aluguel alg: alugueis){
                for (Integer c: alg.getCarros()){
                    if(c == car && Carros.getInstance().searchID(car) != null){
                       output.add(alg);
                       break;
                    }
                }
             }
        }else if(departamento != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getDepartamento() == departamento){
                    output.add(c);
                }
             }
        }else if(pagamento != 0){
            for(Iterator iter = getIterator(); iter.hasNext();){
                Aluguel c = (Aluguel)iter.next();
                if(c.getPagamento() == pagamento){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public Boolean add(Aluguel alg) {
        alg.setID(lastID() + 1);
        alugueis.add(alg);
        return true;
    }

    public Boolean remove(Aluguel alg) {
        for(Iterator iter = getIterator(); iter.hasNext();){
            Aluguel a = (Aluguel)iter.next();
           if(a == alg){
            alugueis.remove(alg);
            return true;
           }
        }
        return false;
    }

    public int lastID() {
        if(alugueis.size() == 0){
            return 0;
        }else{
            return alugueis.get(alugueis.size() - 1).getID();
        }
    }

    public static Alugueis getInstance() {
        if (instance == null) {
			instance = new Alugueis();
        }
        return instance;
    }
  
}
