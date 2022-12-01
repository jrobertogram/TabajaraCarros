package model.Pagamento;

import model.PagamentosITF;

public class CartãoCredito  extends Pagamento implements PagamentosITF{

    private String Name;
    private String numero;
    private String Validade;
    private String CVV;


    public CartãoCredito() {
        super.status = "Pendente";
        super.type = "CartãoCredito";
    }
    
    @Override
    public String pagar(){
        setStatus("Sucesso");
        return "CartãoCredito";
    }

    public CartãoCredito(String name, String numero, String validade, String cVV) {
        Name = name;
        this.numero = numero;
        Validade = validade;
        CVV = cVV;
        super.status = "Pendente";
        super.type = "CartãoCredito";
    }


    public Boolean edit(String status) {
        super.status = status;
        return true;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getValidade() {
        return Validade;
    }
    public void setValidade(String validade) {
        Validade = validade;
    }
    public String getCVV() {
        return CVV;
    }
    public void setCVV(String cVV) {
        CVV = cVV;
    }



    
}
