package model.Pagamento;

import model.PagamentosITF;

public class Dinheiro extends Pagamento implements PagamentosITF{
    private float valorRecebido;
    private float valorTroco;

    public Dinheiro() {
        super.status = "Pendente";
        super.type = "Dinheiro";
    }

    @Override
    public String pagar(){
        setStatus("Sucesso");
        return "Dinheiro";
    }

    public Boolean edit(String status) {
        super.status = status;
        return true;
    }

    public float getValorRecebido() {
        return valorRecebido;
    }


    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }


    public float getValorTroco() {
        return valorTroco;
    }


    public void setValorTroco() {
        this.valorTroco = this.valorRecebido - super.valueFinal;
    }

    
}
