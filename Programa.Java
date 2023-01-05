import java.util.Scanner;
import loja.Produtos;

public class Programa {

  public static void main(String[] args) {
    Scanner tec=new Scanner(System.in);
    
    Produtos p1=new Produtos();
    
    System.out.println("Nome do produto: ");
    p1.produto=tec.next();
    
    System.out.println("Quantidade do produto");
    p1.quantidade=tec.nextDouble();
    
    System.out.println("Insira o preço do produto ");
    p1.preco=tec.nextDouble();
    
   
    p1.setIn_cnpj(1222333778);
     
    System.out.println("O produto: "+p1.produto +"\nA quantidade: "+p1.quantidade+"\nO preço individual é: "+p1.preco+"\nSeu CNPJ é:"+p1.getM_cnpj());
    
    System.out.println("Acrescentou quantos produtos?");
    int estoque=tec.nextInt();
    p1.addProdutos(estoque);
    System.out.println("Atualização:"+p1.produto+"\nEstoque atual:"+p1.quantidade+"\nPreço:"+p1.preco);
    
    
    System.out.println("vendeu quantos produto?");
    estoque=tec.nextInt();
    p1.removerProdutos(estoque);
    
    System.out.println("Foram vendidos: "+estoque + p1.produto);
    
    double sub=p1.quantidade-estoque;
    
    System.out.println("Restaram:"+sub);
    

  }

}
