package aula1;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {	
		
		System.out.println("Iniciando aqui...");
		
		Scanner entrada = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = entrada.next();
		System.out.println("Digite a matricula do aluno");
		aluno.matricula= entrada.next();
		System.out.println("Digite a idade aluno");
		aluno.idade= entrada.nextShort();
		System.out.println("Digite o genero do aluno");
		aluno.genero= entrada.next();
		aluno.estudar();
		aluno.comer("salada");
		
		
		Aluno nathan = new Aluno();
		nathan.nome="Nathan";
		nathan.matricula="XXXX";
		nathan.idade=99;
		nathan.genero="XXX";
		nathan.estudar();
		nathan.comer("chocolate");
		
		
		Mesa mesa = new Mesa();
		mesa.altura = 100;
		mesa.comprimento = 300;
		mesa.largura = 100;
		mesa.cor="Branco";
		mesa.material="Madeira";
		mesa.apoiar();
		mesa.calcularArea();
		
		System.out.println("Finalizando aqui...");
		
	}

}
