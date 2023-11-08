/**
 * Clase que nos da las soluciones de una ecuación de segundo grado
 * @author manuel
 * @version 1.0.0
 */
public class EcuacionSegundoGrado {
    /**
     * Método que te dice si la ecuación se puede resolver o no
     * @param a coeficiente que acompaña a x²
     * @param b coeficiente que acompaña a x
     * @param c coeficiente independiente
     * @return si es resoluble o no.
     */
    public static boolean esResoluble (double a, double b, double c) {

        return b * b - 4 * a * c >= 0 ;
    }

    /**
     * Método que nos calcula una de las soluciones
     * @param a coeficiente que acompaña a x²
     * @param b coeficiente que acompaña a x
     * @param c coeficiente independiente
     * @return el resultado.
     */
    public static double calcularX1 (double a, double b, double c) {

        return -b + Math.sqrt(b * b - 4 * a * c) / (2 * a);
    }

    /**
     * Método que nos calcula una de las soluciones
     * @param a coeficiente que acompaña a x²
     * @param b coeficiente que acompaña a x
     * @param c coeficiente independiente
     * @return el resultado.
     */
    public static double calcularX2 (double a, double b, double c) {

        return -b - Math.sqrt(b * b - 4 * a * c) / (2 * a);
    }
}
