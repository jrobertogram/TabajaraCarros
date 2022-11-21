package model.Pagamento;
import java.lang.Math;

public class Boleto extends Pagamento{

    String Numero;

    public Boleto() {
        super.status = "Pendente";
        super.type = "Boleto";
        GerarNumero();
    }

    public Boolean edit(String status) {
        Pagamento old;
        Pagamento now;
        old = this;
        super.status = status;
        now = this;
        Pagamentos.update(old, now);
        return true;
    }

    public String getNumero() {
        return Numero;
    }

    public void GerarNumero() {
        String numTemp;
        String numero;

        numero = "";
        for (int x = 0; x < 47; x++) {
            numTemp = Integer.toString((int) (Math.random() * (10 - 0 + 1) + 0));
            numero += numTemp;
        }

       this.Numero = numero;
        
    }


    
}
