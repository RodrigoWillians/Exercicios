public class Exercicio4 {
    public static void main(String[] args) {
        double distTotal = 100.0;
        double distCarro = 0.0;
        double distCaminhao = 0.0;
        double tempoPedagios = 0.0;
        double posicaoRelativa;

        tempoPedagios = 2 * 5.0 / 60.0;

        double tempoTotal = distTotal / (110.0 + 80.0);
        distCaminhao = 80.0 * (tempoTotal - tempoPedagios);
        distCarro = 110.0 * tempoTotal;
        posicaoRelativa = distCarro / distTotal;

        if (posicaoRelativa < 0.5) {
            System.out.println("O carro está mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo da cidade de Ribeirão Preto.");
        }
    }
}

// programa simula a viagem do carro e do caminhão na rodovia, considerando a distância entre as cidades de Ribeirão Preto 
// e Franca, a velocidade constante de cada veículo e o tempo adicional que o caminhão leva para passar pelos pedágios.
// Com base nos cálculos de distância percorrida e tempo de viagem, o programa determina em que ponto da rodovia os veículos
// se cruzam e, a partir daí, verifica qual deles está mais próximo da cidade de Ribeirão Preto.No exemplo apresentado,
// o resultado indica que o carro estará mais próximo de Ribeirão Preto quando os veículos se cruzarem.
