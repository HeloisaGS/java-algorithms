import java.util.Scanner;
public class Idade {
    public static int idadeCamila(int a, int b, int c){
        if((c > a && b < a) || (b > a && c < a)){
            return a;
        } else if((c > b && a < b) || (a > b && c < b)){
            return b;
        } else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Saída
        System.out.println(idadeCamila(a, b, c));
        scanner.close();
    }
}
