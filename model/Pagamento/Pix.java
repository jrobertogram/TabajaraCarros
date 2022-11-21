package model.Pagamento;
import java.security.SecureRandom;

public class Pix extends Pagamento {

    String chave;

    public Pix() {
        super.status = "Pendente";
        super.type = "Pix";
        GerarChave();
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
    
    public void GerarChave(){

        int len;
        len = 40;

        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        this.chave =  sb.toString();
    }

    public String getChave() {
        return chave;
    }
    
}
