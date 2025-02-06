public class PlantaDeInterior extends Planta {
    public PlantaDeInterior(String nome, String cor, int vezesRegar, int duracaoVida, boolean precisaSol) {
        super(nome, cor, vezesRegar, duracaoVida, precisaSol);
    }

    @Override
    public String tipoPlanta() {
        return "Planta de interior: " + getNome();
    }
}
