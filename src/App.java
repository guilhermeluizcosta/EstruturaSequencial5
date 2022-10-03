import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos metros sao: ");
        double metros= entrada.nextDouble();
        double centimetros = metros * 100;
        System.out.println("Sao " + centimetros + " centimetros");
    }
}
