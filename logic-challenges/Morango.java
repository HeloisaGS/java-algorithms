// Plantação de Morangos OBI 2016
import java.util.Scanner;
public class Morango {
    public static int CalculaArea(int comprimento, int largura){
        return largura * comprimento;
    }
    public static int MaiorValor(int a, int b){
        if(a >=b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        int comprimento1 = scanner.nextInt();
        int largura1 = scanner.nextInt();
        int comprimento2 = scanner.nextInt();
        int largura2 = scanner.nextInt();
        
        int area1 = CalculaArea(comprimento1, largura1);
        int area2 = CalculaArea(comprimento2, largura2);

        // Saída
        System.out.println(MaiorValor(area1, area2));
        scanner.close();
        
    }
}
