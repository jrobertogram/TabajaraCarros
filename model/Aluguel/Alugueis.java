package model.Aluguel;
import java.util.ArrayList;
import java.util.Date;
import model.Carro.Carros;

public class Alugueis{

    private static ArrayList<Aluguel> alugueis;

    public static ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }

    public static void setAlugueis(ArrayList<Aluguel> alugueis) {
        Alugueis.alugueis = alugueis;
    }

    public static Aluguel searchID(int ID) {
        for (Aluguel a: alugueis){
            if(a.getID() == ID){
             return a;
            }
         }
        return null;
    }

    public static Aluguel search(int Cliente, Date dateiincio) {
        for (Aluguel a: alugueis){
            if(a.getDateIincio() == dateiincio & a.getCliente() == Cliente){
             return a;
            }
         }
        return null;
    }

    public static ArrayList<Aluguel> searchList(String status, Date dateIincio, Date dateFinal, int intervalo, int cliente,int car ,int departamento,
    int pagamento) {
        
        ArrayList<Aluguel> output = new ArrayList<Aluguel>();


        if (status != null){
            for (Aluguel c: alugueis){
                if(c.getStatus() == status){
                    output.add(c);
                }
             }
        }else if(dateIincio != null){
            for (Aluguel c: alugueis){
                if(c.getDateIincio() == dateIincio){
                    output.add(c);
                }
             }
        }else if(dateFinal != null){
            for (Aluguel c: alugueis){
                if(c.getDateFinal() == dateFinal){
                    output.add(c);
                }
             }
        }else if(intervalo != 0){
            for (Aluguel c: alugueis){
                if(c.getIntervalo() == intervalo){
                    output.add(c);
                }
             }
        }else if(cliente != 0){
            for (Aluguel c: alugueis){
                if(c.getCliente() == cliente){
                    output.add(c);
                }
             }
        }else if(car != 0){
            for (Aluguel alg: alugueis){
                for (Integer c: alg.getCarros()){
                    if(c == car && Carros.searchID(car) != null){
                       output.add(alg);
                       break;
                    }
                }
             }
        }else if(departamento != 0){
            for (Aluguel c: alugueis){
                if(c.getDepartamento() == departamento){
                    output.add(c);
                }
             }
        }else if(pagamento != 0){
            for (Aluguel c: alugueis){
                if(c.getPagamento() == pagamento){
                    output.add(c);
                }
             }
        }
        return output;
    }

    public static Boolean add(Aluguel alg) {
        alg.setID(lastID() + 1);
        alugueis.add(alg);
        return true;
    }

    public static Boolean remove(int ID) {
        for (Aluguel c: alugueis){
           if(c.getID() == ID){
            alugueis.remove(ID);
            return true;
           }
        }
        return false;
    }

    public static int lastID() {
        return alugueis.size();
    }

    public static Boolean update(Aluguel old, Aluguel now) {
        int index;
        index = alugueis.indexOf(old);
        if (index != -1){
            alugueis.set(index, now);
        }
        return true;
    }
  
}
