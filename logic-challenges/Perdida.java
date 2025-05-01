import java.util.Scanner;

public class Perdida {
    // Gerando um vetor para comparação
    public static int[] GerarTodasPecas(int n){
        // Gera um vetor com todas as peças de 1 até n
        int[] todasPecas = new int[n];

        for (int i = 0; i < n; i++){
            todasPecas[i] = i+1;
        }
        return todasPecas;
    }

    // Transformando a entrada em instância
    public static int[] ObterPecas(String vetor, int n){
        // Transforma a String recebida em um vetor de números
        String[] vetorSeparado = vetor.split(" ");
        int[] vetorNumeros = new int[n-1];

        for (int i = 0; i < n-1; i++){
            vetorNumeros[i] = Integer.parseInt(vetorSeparado[i]);
        }
        return vetorNumeros;

    }

    // Algoritmo 1 -> Compara cada elemento de a com cada elemento de b até verificar o que tem em a que não está em b
    // T(n) = O(n^2)
    public static int ObterFaltante(int[] a, int[] b, int n){
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

    // Algoritmo 2 - Soma os números da entrada e do vetor para comparação, subtrai um do outro para obter a peça faltante
    // T(n) = O(n)
    public static int DiferencaVetores(int[] a, int[] b){
        int somaA = 0;
        int somaB = 0;
        for (int i = 0; i < a.length; i++) {
            somaA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            somaB += b[i];
        }
        return somaA - somaB;
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
        System.out.println("Algoritmo 1:");
        System.out.println(faltante);
        System.out.println("Algoritmo 2:");
        System.out.println(DiferencaVetores(a, b));

        scanner.close();
    }
}