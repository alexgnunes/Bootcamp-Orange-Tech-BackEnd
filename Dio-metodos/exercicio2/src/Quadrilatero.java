
public class Quadrilatero {

    public static void area(Double lado) {
        Double area = lado * lado;
        System.out.println(area);
    }

    public static void area(Double lado1, Double lado2) {
        Double area = lado1 * lado2;
        System.out.println(area);
    }

    public static void area(Double lado1, Double lado2, Double altura) {
        Double area = ((lado1 + lado2) * altura) / 2;
        System.out.println(area);
    }

}
