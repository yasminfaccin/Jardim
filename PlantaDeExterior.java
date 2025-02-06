public class PlantaDeExterior extends Planta {
    public PlantaDeExterior(String nome, String cor, int vezesRegar, int duracaoVida, boolean precisaSol) {
        super(nome, cor, vezesRegar, duracaoVida, precisaSol);
    }

    @Override
    public String tipoPlanta() {
        return "Planta de exterior: " + getNome();
    }
}
