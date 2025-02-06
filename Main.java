public class Main {
    public static void main(String[] args) {
        Jardim meuJardim = new Jardim();

        // Criando algumas plantas
        Flor rosa = new Flor("Rosa", "Vermelha", 3, 2, true, "Rosa");
        PlantaDeInterior samambaia = new PlantaDeInterior("Samambaia", "Verde", 1, 5, false);
        PlantaDeExterior girassol = new PlantaDeExterior("Girassol", "Amarelo", 2, 1, true);

        // Adicionando plantas ao jardim
        meuJardim.adicionarPlanta(rosa);
        meuJardim.adicionarPlanta(samambaia);
        meuJardim.adicionarPlanta(girassol);

        // Listando as plantas do jardim
        meuJardim.listarPlantas();
    }
}

