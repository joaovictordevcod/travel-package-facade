import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelFacade travelFacade = new TravelFacade();

        // Recebe informações do usuário para a reserva do voo
        System.out.println("Digite a cidade de origem do voo:");
        String origem = scanner.nextLine();

        System.out.println("Digite a cidade de destino do voo:");
        String destino = scanner.nextLine();

        System.out.println("Digite a data do voo (YYYY-MM-DD):");
        String dataVoo = scanner.nextLine();

        // Recebe informações do usuário para a reserva do hotel
        System.out.println("Digite a cidade do hotel:");
        String cidadeHotel = scanner.nextLine();

        System.out.println("Digite a data de check-in do hotel (dia-mes-ano):");
        String dataCheckIn = scanner.nextLine();

        System.out.println("Digite a data de check-out do hotel (dia-mes-ano):");
        String dataCheckOut = scanner.nextLine();

        // Recebe informações do usuário para o aluguel de carro
        System.out.println("Digite a data de início do aluguel de carro (dia-mes-ano):");
        String dataAluguelInicio = scanner.nextLine();

        System.out.println("Digite a data de fim do aluguel de carro (dia-mes-ano):");
        String dataAluguelFim = scanner.nextLine();

        // Fazendo a reserva do pacote de viagem
        travelFacade.reservarPacote(origem, destino, cidadeHotel, dataVoo, dataCheckIn, dataCheckOut, dataAluguelInicio, dataAluguelFim);

        scanner.close(); // Fechar o scanner ao final
    }
}
