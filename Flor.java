public class Flor extends Planta {
    private String tipoFlor;

    public Flor(String nome, String cor, int vezesRegar, int duracaoVida, boolean precisaSol, String tipoFlor) {
        super(nome, cor, vezesRegar, duracaoVida, precisaSol);
        this.tipoFlor = tipoFlor;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    @Override
    public String tipoPlanta() {
        return "Flor: " + getNome();
    }
}
