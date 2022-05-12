public class Sobrecarga{
    public static void main(String[] args) {      
        System.out.println("Exercicio de Quadrilateros.");
        System.out.println("Resultados:");
        double quadrado = Quadrilatero.area(3);
        double retangulo = Quadrilatero.area(5,5);
        double trapezio = Quadrilatero.area(4,5, 3);

        System.out.println(quadrado);
        System.out.println(retangulo);
        System.out.println(trapezio);
       
    }

}