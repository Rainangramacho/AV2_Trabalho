import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class CorrigirProvasThread extends Thread {
    private final DatagramPacket pctVeio;
    byte[] msgVai = new byte [1024];

    public CorrigirProvasThread(DatagramPacket pctVeio) {
        this.pctVeio = pctVeio;
    }
    

    /*
        TODO:
        Implementar método que pega os bytes do pctVeio, e compara com um
        gabarito pré-estabelecido
    */

    @Override
    public void run(){
        DatagramPacket pctVai = new DatagramPacket(
        pctVeio.getData(),
        pctVeio.getLength(),
        pctVeio.getAddress(),
        pctVeio.getPort()
        );

        try {
            DatagramSocket destino = new DatagramSocket();
            destino.send(pctVai);
            destino.close();
        } catch (IOException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
