import java.util.ArrayList;

public class Jardim {
    private ArrayList<Planta> plantas;

    public Jardim() {
        plantas = new ArrayList<>();
    }

    public void adicionarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void listarPlantas() {
        for (Planta planta : plantas) {
            System.out.println(planta.tipoPlanta() + " - Cor: " + planta.getCor() +  " - Regar " + planta.getVezesRegar()
            + " vez/vezes na semana" + " - Precisa tomar sol: " + (planta.isPrecisaSol() ? "Sim!" : "Não!") +  
            " - Tempo de vida: " + planta.getDuracaoVida() + " anos.");
        }
    }
}
