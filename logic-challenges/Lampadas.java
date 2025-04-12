// Problema lampadas da OBI 2016
import java.util.Scanner;
public class Lampadas {
    public static String[] SepararSequencia(String sequencia){
        // Inicialmente separamos a string em um array de caracteres 
        String[] sequenciaArray = sequencia.split(" ");

        return sequenciaArray;
    }

    public static int[] LerSequencia(int n, String[] sequenciaArray){
        // As luzes começam apagadas
        int a = 0;
        int b =  0;
        if(n == sequenciaArray.length){
            // Percorre o Array de números e verifica se é 1 ou 2
            for (String item : sequenciaArray ) {
                if(item.equals("1")){
                    a = (a + 1) % 2;
                    
                } else if(item.equals("2")) {
                    a = (a + 1) % 2;
                    b = (b + 1) % 2;
                }
            }
        }
        
        
        return new int[]{a, b};
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        int n = scanner.nextInt();
        scanner.nextLine();

        String sequencia = scanner.nextLine();
        String[] sequenciaSeparada = SepararSequencia(sequencia);
        
        int[] resultado = LerSequencia(n, sequenciaSeparada);

        System.out.println(resultado[0]);
        System.out.println(resultado[1]);
        
        // Saída
        scanner.close();
    }
    
}
