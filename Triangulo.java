import java.util.Scanner;

public class Triangulo {
public static void main(String[] args) {
    Scanner texto = new Scanner(System.in);
    System.out.println("Digite as medidas do triangulo");
    int altura = texto.nextInt(); 
    int largura = texto.nextInt();
    int valor = 2;
    int area =(altura*largura)/valor;
    System.out.println("A area do triangulo é:" + area);

    texto.close(); 
    }   
}
    

