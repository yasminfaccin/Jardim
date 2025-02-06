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
            System.out.println(planta.exibirDetalhes());
        }
    }
}
