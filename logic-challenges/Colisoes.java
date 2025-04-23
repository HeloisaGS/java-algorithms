import java.util.Scanner;
public class Colisoes {
    public static int[] TransformaEntrada(String entrada){
        String[] entradaSeparada = entrada.split(" ");
        int[] entradaNumeros = new int[entradaSeparada.length];

        for(int i = 0; i < entradaSeparada.length; i++){
            entradaNumeros[i] = Integer.parseInt(entradaSeparada[i]);
        }

        return entradaNumeros;
    }

    public static int DetectaColisao(int[] a, int[] b){
        
        if(a[2] < b[0] || a[0] > b[2] || a[3] < b[1] || a[1] > b[3]){
            return 0;
        } 
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        String blocoA = scanner.nextLine();
        String blocoB= scanner.nextLine();

        int[] a = TransformaEntrada(blocoA);
        int[] b = TransformaEntrada(blocoB);

        // Saida

        System.out.println(DetectaColisao(a, b));

        scanner.close();
    }
}
