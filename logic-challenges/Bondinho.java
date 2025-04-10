import java.util.Scanner;
public class Bondinho {
    public static char ehCapaz(int alunos, int monitores){
        int total = alunos + monitores;
        if (total <= 50) {
            return 'S';
        }else{
            return 'N';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada = Numero de Alunos = A e Numero de monitores = B
        int A = scanner.nextInt();
        int M = scanner.nextInt();
        // Saida
        System.out.println(ehCapaz(A, M));
        scanner.close();
    }
}
