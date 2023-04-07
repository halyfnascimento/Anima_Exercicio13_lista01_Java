import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double h;
        double pesoIdealFem;
        double pesoIdealMas;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        h = teclado.nextDouble();
        teclado.close();
        pesoIdealFem = (62.1 * h) - 44.7;
        pesoIdealMas = (72.7 * h) - 58;

        System.out.println("Se você for do genero feminino, seu peso ideal é: " + pesoIdealFem +
                " Quilogramas. Mas se seu genero for masculino, seu peso ideal sera: " + pesoIdealMas + " Quilogramas");

    }
}