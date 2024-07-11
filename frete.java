import java.util.Scanner;
public class frete {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.print("digite o valor da compra: R$ ");
     double valorcompra = scanner.nextDouble();
     
     System.out.print("digite o numero de itens: ");
     int numeroItens = scanner.nextInt();

    if (valorcompra > 150 || numeroItens > 5) {
          System.out.print("voce tem direito a um cupom. ");
     }    else {
         System.out.println("voce nao tem direito a um cupom. " );
     }
    
     scanner.close();

    }
}
