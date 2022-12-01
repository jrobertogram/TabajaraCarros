package model.Pagamento;
import java.security.SecureRandom;

import model.PagamentosITF;

public class Pix extends Pagamento implements PagamentosITF{

    String chave;

    public Pix() {
        super.status = "Pendente";
        super.type = "Pix";
        GerarChave();
    }

    @Override
    public String pagar(){
        setStatus("Sucesso");
        return "Pix";
    }

    public Boolean edit(String status) {
        super.status = status;
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
