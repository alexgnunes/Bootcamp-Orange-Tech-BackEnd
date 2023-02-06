
public class Main {
    public static void main(String[] args) throws Exception {
        double areaQuadrado = Quadrilatero.area(2.0);
        double areaRetangulo = Quadrilatero.area(5.0, 5.0);
        double areaTrapezio = Quadrilatero.area(7.0, 8.0, 9.0);

        System.out.println(areaQuadrado);
        System.out.println(areaRetangulo);
        System.out.println(areaTrapezio);       
    }
}
