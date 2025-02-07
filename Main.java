public class Main {
    public static void main(String[] args) {
       
        Jardim meuJardim = new Jardim();

        //criando algumas plantas
        Flor rosa = new Flor("Rosa", "Vermelha", 3, 2, true, "Rosa");
        PlantaDeInterior samambaia = new PlantaDeInterior("Samambaia", "Verde", 1, 5, false);
        PlantaDeExterior girassol = new PlantaDeExterior("Girassol", "Amarelo", 2, 1, true);
        Flor orquidea = new Flor("Orquídea", "Roxa", 1, 4, true, "Orquídea");
        PlantaDeExterior aloeVera = new PlantaDeExterior("Aloe Vera", "Verde", 1, 5, true);

        //plantas no jardim
        meuJardim.adicionarPlanta(rosa);
        meuJardim.adicionarPlanta(samambaia);
        meuJardim.adicionarPlanta(girassol);
        meuJardim.adicionarPlanta(orquidea);
        meuJardim.adicionarPlanta(aloeVera);

        meuJardim.listarPlantas();
    }
}

