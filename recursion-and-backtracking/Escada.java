import java.util.Scanner;
public class Escada {
    public static int contarPedras(int[] lista){
        int numPedras = 0;
        for (int i = 0; i < lista.length; i++) {
            numPedras += lista[i];
        }
        return numPedras;
    }
    // Escada perfeita é uma PA do número de colunas 1+2+...+n
    public static int determinarEscada(int n){
        return n*(n+1)/2;
    }
    public static int determinarBase(int numPedras, int escada){
        return numPedras - escada;
    }
    public static int determinarMovimentos(int[] colunas, int base, int contador, int i){
        // Caso base
        if (i < 0 || i >= colunas.length) {
            return contador;
        }
        
        // se a diferença for  negativa eu não vou contar
        if((base + (i+1)) >= 0){
            int diferenca = colunas[i] - (base + (i+1));
            if (diferenca > 0) {
                contador += diferenca;
            }
            
        }
        
        return determinarMovimentos(colunas, base, contador, i+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada 
        // n =  número de colunas
        int n = scanner.nextInt();
        // colunas = lista com as colunas
        int[] colunas = new int[n];
        for (int i = 0; i < n; i++) {
            colunas[i] = scanner.nextInt();
        }
        // quantas pedras tem? soma as colunas
        int qtdePedras = contarPedras(colunas);
        // quantas pedras tem a escada? n*(n+1)/2
        int escadaPerfeita = determinarEscada(n);
        // quantas pedras tem a base da escada?
        int base = determinarBase(qtdePedras, escadaPerfeita);

        // se base - quantidade de pedras !=  multiplo de numero de colunas print -1
        if(base % n != 0 || base < 0){
            System.out.println(-1);
        }else{
            // calcular a base por coluna
            base = base/n; 
            // se não calcula a diferença entre a escada que era e a que deveria ser:
            System.out.println(determinarMovimentos(colunas, base, 0, 0));
            
        }
        

        scanner.close();
    }
}
