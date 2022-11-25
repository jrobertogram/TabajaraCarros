package model.Aluguel;
import model.Carro.Carro;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aluguel {

    private int ID;
    private String status; //using//returned//error//unfinished
    private Date DateIincio;
    private Date DateFinal;
    private int Intervalo;
    private int Cliente;
    private static ArrayList<Carro> carros = new ArrayList<Carro>();  
    private int Departamento;
    private int Pagamento;


    public Aluguel(String Status, Date dateIincio, Date dateFinal, int intervalo) {
        status = Status;
        DateIincio = dateIincio;
        DateFinal = dateFinal;
        Intervalo = setIntervalo(dateFinal, dateIincio);
    }


    public Aluguel(String Status, Date dateIincio, Date dateFinal, int intervalo, int cliente, ArrayList<Carro> Carros, int departamento,
            int pagamento) {
        status = Status;
        DateIincio = dateIincio;
        DateFinal = dateFinal;
        Intervalo = setIntervalo(dateFinal, dateIincio);
        Cliente = cliente;
        carros = Carros;
        Departamento = departamento;
        Pagamento = pagamento;
    }


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public Date getDateIincio() {
        return DateIincio;
    }


    public void setDateIincio(Date dateIincio) {
        DateIincio = dateIincio;
    }


    public Date getDateFinal() {
        return DateFinal;
    }


    public void setDateFinal(Date dateFinal) {
        DateFinal = dateFinal;
    }


    public int getIntervalo() {
        return Intervalo;
    }


    public int setIntervalo(Date dateFinal, Date dateIincio) {
        long elapsedms = dateFinal.getTime() - dateIincio.getTime();
        long diff = TimeUnit.DAYS.convert(elapsedms, TimeUnit.MILLISECONDS);
        System.out.println(diff);
        int i=(int)diff;
        return i;
    }


    public int getCliente() {
        return Cliente;
    }


    public void setCliente(int cliente) {
        Cliente = cliente;
    }


    public ArrayList<Carro> getCarros() {
        return carros;
    }


    public void setCarros(ArrayList<Carro> Carros) {
        carros = Carros;
    }


    public int getDepartamento() {
        return Departamento;
    }


    public void setDepartamento(int departamento) {
        Departamento = departamento;
    }


    public int getPagamento() {
        return Pagamento;
    }


    public void setPagamento(int pagamento) {
        Pagamento = pagamento;
    }

    public Boolean addCarro(Carro car) {
        carros.add(car);
        return true;
    }

    public  Boolean removeCarro(Carro carr) {
        for (Carro car: carros){
           if(car == carr){
            carros.remove(carr);
            return true;
           }
        }
        return false;
    }

 
}
