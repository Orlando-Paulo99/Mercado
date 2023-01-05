public class Produtos {

 public String produto;
 public double quantidade;
 public double preco;
 private int cnpj;
 
 public void addProdutos (int estoque){
 
    this.quantidade+=estoque;
 
   
 }
 
 public void removerProdutos(int estoque){
   this.quantidade-=estoque;
 }
 
 public int getM_cnpj(){
   return this.cnpj;
 }
 
 public void setIn_cnpj(int x){
   this.cnpj=x;
   
 }
 
 
 

}
