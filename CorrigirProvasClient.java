import java.net.DatagramSocket;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CorrigirProvasClient {

    public static void main(String[] args) {
        DatagramSocket socket;
        Scanner input = new Scanner(System.in);
		int numQuestao [];
		int numAlternativas [];
		String respostas [];
		String resposta [];
		
		numQuestao = new int [5]; // 
		numAlternativas = new int [5]; // 
		respostas = new String [5]; // 
		resposta = new String [5];
		
		ArrayList<String> agenda = new ArrayList();
 
		// [ B ] usando o método add() para gravar 4 contatos na agenda
		agenda.add("1;5;VVFFV");
		agenda.add("2;4;VVVV");
		agenda.add("3;5;FFVFF");
		agenda.add("4;3;FFF");
		agenda.add("5;5;VVFVF");
		
		
		int i;
 
		// [ C ] mostrando os "n" contatos da agenda (usando o índice)
		// número de elementos da agenda: método size()
		System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
		int n = agenda.size();
		for (i=0; i<n; i++) {
		  System.out.printf("Posição %d- %s\n", i, agenda.get(i));
		  String[] vetorExibir = agenda.toArray(new String[agenda.size()]);
		  System.out.printf("teste: %s \n",vetorExibir[i]);
		}
		
		
		
		/*
		
		int i = 0;
		int a = 0;
        
        System.out.print("Informe a quantidade de questoes: ");
        int qntQuestoes = input.nextInt();
        
        int[] questoes = new int[qntQuestoes];
		
		for(i=0;i<5;i++){
		System.out.print("Informe o número da questao: ");
		numQuestao[i] = input.nextInt();
		
		System.out.print("Informe o número de alternativas dessa questao ");
		numAlternativas[i] = input.nextInt();
		
		for(a=0;a<numAlternativas[i];a++){
		System.out.println("Informe a resposta:  ");
		respostas = input.nextLine();
		}
		}
        
            TODO: 
            Itera por todas as questões
            Insere a quantidade de alternativas
            Insere as alternativas
            Itera de novo e concatena todo mundo
        */
    }
}