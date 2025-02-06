public class Planta {
    private String nome;
    private String cor;
    private int vezesRegar;
    private int duracaoVida;
    private boolean precisaSol;

    public Planta(String nome, String cor, int vezesRegar, int duracaoVida, boolean precisaSol) {
        this.nome = nome;
        this.cor = cor;
        this.vezesRegar = vezesRegar;
        this.duracaoVida = duracaoVida;
        this.precisaSol = precisaSol;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVezesRegar() {
        return vezesRegar;
    }

    public void setVezesRegar(int vezesRegar) {
        this.vezesRegar = vezesRegar;
    }

    public int getDuracaoVida() {
        return duracaoVida;
    }

    public void setDuracaoVida(int duracaoVida) {
        this.duracaoVida = duracaoVida;
    }

    public boolean isPrecisaSol() {
        return precisaSol;
    }

    public void setPrecisaSol(boolean precisaSol) {
        this.precisaSol = precisaSol;
    }

    // Método polimórfico
    public String tipoPlanta() {
        return "Planta";
    }

    public String exibirDetalhes() {
        return tipoPlanta() + " - Cor: " + cor + ", Regar " + vezesRegar + " vezes na semana, Precisa de sol: " 
                + (precisaSol ? "Sim" : "Não") + ", Tempo de vida: " + duracaoVida + " anos.";
    }
}
