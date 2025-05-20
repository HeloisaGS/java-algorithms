import java.util.Scanner;
public class Arquivos{
    public static int mimizarArquivos(int[] lista, int b, int i, int contador, int pastaAtual){
        if (i >= lista.length) {
            if (pastaAtual != 0) {
                contador+=1;
            }
            return contador; // verificar se vai somar ainda com alguma pasta 
        }
        // quando ultrapassa o tamanho da pasta (B)
        if (pastaAtual + lista[i] >b) {
            return mimizarArquivos(lista, b, i+1, contador+1, lista[i]);
        }else{
            // quando menor ou igual
            return mimizarArquivos(lista, b, i+1, contador, pastaAtual+lista[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrada
        // n = número de arquivos e b = Tamanho em bytes que uma pasta suporta
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        // Array de tamanho de n arquivos
        int[] listaTamanhos = new int[n];
        for (int i = 0; i < n; i++) {
            listaTamanhos[i] = scanner.nextInt();
        }
        // cada arquivo é b
        // verificar se listaTamanhos[i] preenche o arquivo
        // incrementar em um contador se preencher
        // Saída = Mínimo de arquivos necessários
        System.out.println(mimizarArquivos(listaTamanhos, b, 0, 0, 0));

        scanner.close();
    }
}