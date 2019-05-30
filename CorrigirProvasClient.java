import java.net.DatagramSocket;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class CorrigirProvasClient {

    public static void main(String[] args) throws Exception{
        DatagramSocket socket;
        Scanner input = new Scanner(System.in);
		int numQuestao [];
		int numAlternativas [];
		String respostas [];
		String resposta [];
		
		numQuestao = new int [5]; // 
		numAlternativas = new int [5]; // 
		
		resposta = new String [5];
		respostas = new String [10]; 
		ArrayList<String> agenda = new ArrayList();
 
		// [ B ] usando o método add() para gravar 4 contatos na agenda
		agenda.add("1;5;VVFFV");
		agenda.add("2;4;VVVV");
		agenda.add("3;5;FFVFF");
		agenda.add("4;3;FFF");
		agenda.add("5;5;VVFVF");
		
		
		//int i;
 /*
		// [ C ] mostrando os "n" contatos da agenda (usando o índice)
		// número de elementos da agenda: método size()
		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
		int n = agenda.size();
		
		for (i=0; i<n; i++) {
		  System.out.printf("Posição %d- %s\n", i, agenda.get(i));
		  String[] vetorExibir = agenda.toArray(new String[agenda.size()]);
		  System.out.printf("teste: %s \n",vetorExibir[i]);
		}
 */
		
		int i = 0;
		int a = 0;
		//int [] x = new int x;
        
        System.out.print("Informe a quantidade de questoes: ");
			int qntQuestoes = input.nextInt();
			int[] questoes = new int[qntQuestoes];
			
		
		for(i=0;i<qntQuestoes;i++){
			System.out.print("Informe o número da questao: ");
				numQuestao[i] = input.nextInt();
			
			System.out.printf("Informe o número de alternativas da questao %d: ",numQuestao[i]);
				numAlternativas[i] = input.nextInt();
			
			System.out.print("Informe a resposta:  ");
				//respostas = new String [numAlternativas[i]]; 
				respostas[i] = input.next();
		
			System.out.printf("Teste:%s",respostas[i]);
			
		}
        
        
    }
}