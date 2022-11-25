package model.Pagamento.variante;

public class Desconto extends Variante{

    private float porcentagem;

    public Desconto(String name, float value, String date) {
        super.Name = name;
        super.Value = value / 100;
        porcentagem = value;
        super.Type = "taxa";
    }

    public boolean Edit(String name, float value, String date) {
        super.Name = name;
        super.Value = value / 100;
        porcentagem = value;
        return true;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    

}
