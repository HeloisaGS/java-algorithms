import java.util.Scanner;
public class Secreta {
    public static int maximoCirculos(int[] vetor, int n){
        int contador = 1; // Inicio um contador com 1 por que o primeiro do vetor sempre vai ser contado
        int ultimo = vetor[0]; // A variável ultimo eu preencho com o valor do primeiro do vetor
        for(int i = 1; i < n; i++){
            if(vetor[i] != ultimo){
                ultimo = vetor[i];
                contador += 1;
                // System.err.println("ultimo: " + ultimo + ", contador: "+ contador);
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        // Saida
        System.out.println(maximoCirculos(vetor, n));
        sc.close();
    }
}
