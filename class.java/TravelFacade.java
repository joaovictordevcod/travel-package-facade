// Classe Facade
class TravelFacade {
    private Voo voo;
    private Hotel hotel;
    private Carro carro;

    public TravelFacade() {
        this.voo = new Voo();
        this.hotel = new Hotel();
        this.carro = new Carro();
    }

    public void reservarPacote(String origem, String destino, String cidadeHotel,
                               String dataVoo, String dataCheckIn,
                               String dataCheckOut, String dataAluguelInicio, String dataAluguelFim) {
        System.out.println("Iniciando reserva do pacote de viagem...");

        boolean vooReservado = voo.reservarVoo(origem, destino, dataVoo);
        boolean hotelReservado = hotel.reservarHotel(cidadeHotel, dataCheckIn, dataCheckOut);
        boolean carroReservado = carro.alugarCarro(cidadeHotel, dataAluguelInicio, dataAluguelFim);

        if (vooReservado && hotelReservado && carroReservado) {
            System.out.println("Pacote de viagem reservado com sucesso!");
        } else {
            System.out.println("Falha na reserva do pacote de viagem.");
        }
    }
}
