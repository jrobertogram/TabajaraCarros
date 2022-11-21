package model.Pagamento;

public class CartãoCredito  extends Pagamento{

    private String Name;
    private String numero;
    private String Validade;
    private String CVV;


    public CartãoCredito() {
        super.status = "Pendente";
        super.type = "CartãoCredito";
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
        Pagamento old;
        Pagamento now;
        old = this;
        super.status = status;
        now = this;
        Pagamentos.update(old, now);
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
