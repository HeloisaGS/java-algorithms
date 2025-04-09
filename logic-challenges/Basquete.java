// Basquete de Robôs OBI 2018
import java.util.Scanner;;
public class Basquete {
    public static int DeterminarPontos(int distancia){
        if(distancia <= 800){
            return 1;
        } else if(distancia <= 1400){
            return 2;
        }else{
            return 3;
        }
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Entrada 
       int D = scanner.nextInt();
       // Saida
       System.out.println(DeterminarPontos(D));
       scanner.close(); 
    }
}
