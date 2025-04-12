import java.util.Scanner;
public class Domino {
    public static int DeterminarQtdePecas(int n){
        return ((n+1)*(n+2))/2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        int n = scanner.nextInt();
        // Saida
        System.out.println(DeterminarQtdePecas(n));
        scanner.close();

    }
}
