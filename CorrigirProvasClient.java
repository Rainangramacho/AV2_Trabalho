import java.net.DatagramSocket;
import java.util.Scanner;

public class CorrigirProvasClient {

    public static void main(String[] args) throws Exception{
		
        DatagramSocket dsocket = new DatagramSocket();
        Scanner input = new Scanner(System.in);
		
			//int numQuestao [];
			//int numAlternativas [];
			//String respostas [];
			//numQuestao = new int [5];
			//numAlternativas = new int [5]; 
			//respostas = new String [10];
			//int[] questoes = new int[qntQuestoes];
			//int [] x = new int x;
        
	
			int i = 0;
				
			System.out.print("Informe a quantidade de questoes: ");
			int qntQuestoes = input.nextInt();
			Questoes[] perguntas = new Questoes[qntQuestoes];
			String respostasAlunos = "";
			
		for(i=0;i<qntQuestoes;i++){
			//System.out.print("Informe o número da questao: ");
			//numQuestao[i] = input.nextInt();
				
			System.out.printf("Informe o número de alternativas da questao %d: ",i+1);
				perguntas[i] = new Questoes();            
				perguntas[i].setQntAlternativas(input.nextInt());
				//numAlternativas[i] = input.nextInt();
			
			
			System.out.print("Informe a resposta:  ");
				perguntas[i].setRespostas(input.next());
				respostasAlunos += i+1 + ";" + perguntas[i].getQntAlternativas() + ";" + perguntas[i].getRespostas();
				//respostas = new String [numAlternativas[i]]; 
				//respostas[i] = input.next();
		
		
			//System.out.printf("Teste:%s",respostas[i]);
			
		}
		 System.out.println("Respostas dos Alunos: " + respostasAlunos);
		
    }
}