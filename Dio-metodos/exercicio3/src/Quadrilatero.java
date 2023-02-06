public class Quadrilatero {

    public static Double area(Double lado) {
        return lado * lado;
    }

    public static Double area(Double lado1, Double lado2) {
        return lado1 * lado2;
    }

    public static Double area(Double lado1, Double lado2, Double altura) {
        return ((lado1 + lado2) * altura) / 2;
    }

}