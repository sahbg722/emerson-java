import java.util.Scanner;
public class SDSBG {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.print("digite o valor da compra: R$ ");
     double valorcompra = scanner.nextDouble();
     double frete;
    if (valorcompra > 150) {
         frete = 0;
         System.out.println("Frete Gratis");
    }    else if (valorcompra < 140){
         frete = 10;
         System.out.println("valor do frete: R$ " + frete);
    }   else {
         frete = 20;
         System.out.println("valor do frete R$ " + frete);
        }

        
         double total = valorcompra + frete;
         System.out.println("valor total da compra:R$" + total);

         scanner.close();
    }
}
