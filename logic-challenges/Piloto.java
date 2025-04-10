// Piloto Automático OBI 2020
import java.util.Scanner;
public class Piloto {
    public static int CalcularDistancia(int x, int y){
        return y - x;
    }
    
    public static int PilotoAutomatico(int d1, int d2){
        if(d2 > d1){
            return 1;
        } else if (d2 == d1){
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada = posições
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int ab = CalcularDistancia(A, B);
        int bc = CalcularDistancia(B, C);
        
        //Saida
        System.out.println(PilotoAutomatico(ab, bc));

        scanner.close();
    }
}
