import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelFacade travelFacade = new TravelFacade();

        System.out.println("Digite a cidade de origem do voo:");
        String origem = scanner.nextLine();

        System.out.println("Digite a cidade de destino do voo:");
        String destino = scanner.nextLine();

        System.out.println("Digite a data do voo (YYYY-MM-DD):");
        String dataVoo = scanner.nextLine();

        System.out.println("Digite a cidade do hotel:");
        String cidadeHotel = scanner.nextLine();

        System.out.println("Digite a data de check-in do hotel (dia-mes-ano):");
        String dataCheckIn = scanner.nextLine();

        System.out.println("Digite a data de check-out do hotel (dia-mes-ano):");
        String dataCheckOut = scanner.nextLine();

        System.out.println("Digite a data de início do aluguel de carro (dia-mes-ano):");
        String dataAluguelInicio = scanner.nextLine();

        System.out.println("Digite a data de fim do aluguel de carro (dia-mes-ano):");
        String dataAluguelFim = scanner.nextLine();

        travelFacade.reservarPacote(origem, destino, cidadeHotel, dataVoo, dataCheckIn, dataCheckOut, dataAluguelInicio, dataAluguelFim);

        scanner.close();
    }
}
