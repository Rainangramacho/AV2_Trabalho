import java.net.DatagramSocket;
import java.util.Scanner;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class CorrigirProvasClient {

    public static void main(String[] args) throws Exception{

		DatagramSocket dsocket = new DatagramSocket();
		Scanner input = new Scanner(System.in);

		System.out.print("Informe a quantidade de questoes: ");
		int qntQuestoes = input.nextInt();

		Questoes[] perguntas = new Questoes[qntQuestoes];
		String respostasAlunos = "";

		InetAddress endDst = InetAddress.getByName("localhost");
		int portaDst = 6789;
		int i = 0;


	for(i=0;i<qntQuestoes;i++){

			System.out.printf("Informe o número de alternativas da questao %d: ",i+1);
				perguntas[i] = new Questoes();
				perguntas[i].setQntAlternativas(input.nextInt());

			System.out.print("Informe a resposta:  ");
				perguntas[i].setRespostas(input.next());
				respostasAlunos += i+1 + ";" + perguntas[i].getQntAlternativas() + ";" + perguntas[i].getRespostas();
		}

			System.out.println("Respostas dos Alunos: " + respostasAlunos);
				byte[] respostaBytes = respostasAlunos.getBytes();

	try{

			DatagramPacket pctVai = new DatagramPacket(respostaBytes,respostaBytes.length,endDst,portaDst);

			dsocket.send(pctVai);
			System.out.println("Enviei solicitacao ao Servidor\n");

			byte[] msgVem = new byte[1024];
			DatagramPacket pctVem = new DatagramPacket(msgVem, msgVem.length);
			dsocket.receive(pctVem);

			System.out.println("Recebi resposta do Servidor:\n");
			System.out.println("Chegou: " + new String(pctVem.getData()));

			Thread.sleep(5000);
			dsocket.close();

	}	catch(Exception e){

		}

    }
}