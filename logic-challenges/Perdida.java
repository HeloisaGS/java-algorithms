import java.util.Scanner;

public class Perdida {
    public static int[] GerarTodasPecas(int n){
        // Gera um vetor com todas as peças de 1 até n
        int[] todasPecas = new int[n];

        for (int i = 0; i < n; i++){
            todasPecas[i] = i+1;
        }
        return todasPecas;
    }

    public static int[] ObterPecas(String vetor, int n){
        // Transforma a String recebida em um vetor de números
        String[] vetorSeparado = vetor.split(" ");
        int[] vetorNumeros = new int[n-1];

        for (int i = 0; i < n-1; i++){
            vetorNumeros[i] = Integer.parseInt(vetorSeparado[i]);
        }
        return vetorNumeros;

    }

    public static int ObterFaltante(int[] a, int[] b, int n){
        // Compara cada elemento de a com cada elemento de b até verificar o que tem em a que não está em b
        for (int i = 0; i < n; i++){
            boolean encontrado = false;
            for (int j = 0; j < n-1; j++){
                if(a[i] == b[j]){
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                return a[i];
                
            }
            
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        // o número de peças
        int n = scanner.nextInt();
        scanner.nextLine();
        // valores das peças
        String vetor = scanner.nextLine();

        int[] a = GerarTodasPecas(n);
        int[] b = ObterPecas(vetor, n);
        int faltante = ObterFaltante(a, b, n);

        // Saida = elemento faltante
        System.out.println(faltante);
        

        scanner.close();
    }
}