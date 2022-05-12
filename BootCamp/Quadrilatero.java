public class Quadrilatero {
    
    public static double area(double lado){
        double quadrado = lado * lado;
        return quadrado;
    }

    public static double area(double lado1, double lado2){
        double retangulo = lado1 * lado2;
        return retangulo;
    } 
    
    public static double area(double baseMaior, double baseMenor, double altura){
        double trapezio = (baseMaior+baseMenor)*altura/2;
        return trapezio;
    }
}
