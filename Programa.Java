package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		
	
		
		Funcionario fun=new Funcionario("orlando","pedro braz",92624419,12356788);
		System.out.println("bome:"+fun.getnome());
		System.out.println("endereco:"+fun.getenderco());
		System.out.println("telefone:"+fun.gettelefone());
		System.out.println("cpf:"+fun.getcpf());
		
		String [] mercadoria=new String[2];
		double [] valorM=new double[2];
				
		produtos p=new produtos();
		for (int i=0;  i<mercadoria.length;i++) {
			System.out.println("digite o nome dos produtos"+i);
			mercadoria[i]=tec.next();
			p.nome=mercadoria[i];
			System.out.println("nome do priduto:"+p.nome);
			
		}
		for (int v=0;v<valorM.length;v++) {
			System.out.println("digite o valor dos produtos"+v);
			valorM[v]=tec.nextDouble();
			p.valor=valorM[v];
			System.out.println(p.nome+":"+p.valor);
			
			
			
			
		}
		
		
		
		
	}

}
