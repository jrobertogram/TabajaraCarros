package model.Pagamento.variante;

public class Taxa extends Variante {

    public Taxa(String name, float value) {
        super.Name = name;
        super.Value = value * -1;
        super.Type = "taxa";
    }

    public boolean Edit(String name, float value) {
        super.Name = name;
        super.Value = value * -1;
        return true;
    }

}
