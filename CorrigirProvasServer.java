import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;

public class CorrigirProvasServer {

    public static void main(String[] args) {
        int porta = 6789;
        DatagramSocket dsocket;

        try {
            dsocket = new DatagramSocket(porta);

            System.out.printf("Servidor online e aguardando por cliente na porta %d!\n", dsocket.getLocalPort());
            byte[] buffer = new byte[1024];

            ArrayList<CorrigirProvasThread> threads = new ArrayList<>();

            while (true) {
               DatagramPacket pctVeio = new DatagramPacket(buffer,buffer.length);
			   dsocket.receive(pctVeio);

			   System.out.println("Recebi solicitacao do Cliente:" +pctVeio.getAddress());

			   CorrigirProvasThread thread = new CorrigirProvasThread(pctVeio);
			   threads.add(thread);
			   thread.start();

            }

        } catch (SocketException e) {
            System.err.println("Erro no Socket: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro de IO: " + e.getMessage());
        }
    }
}