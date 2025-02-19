package Series;

public class Padovan {
    public static void main(String[] args) {
        //Completar la función padovanNo, donde la función cada termino es la suma de los terminos tres y dos lugares anteriores. Los primeros terminos de la serie de Padovan son : 1 1 1 2 2 3 4 5 7 9
        //
        //PNo = P(n-2) + P(n-3)
        //
        //Se debe devolver un array con los terminos de la serie solicitada, en el caso de n=10 se debe devolver 1 1 1 2 2 3 4 5 7 9
        //
        //en caso que n sea menor o igual a cero se debe devolver el array vacio.
        //
        //La firma de la función es la siguiente:
        //
        //public int[] padovan(int n)
        //No debes incluir el método main, solo completar la lógica del método.
        //No debes probar el método con llamadas, de eso se encarga CodeRunner, solo completar la lógica del método.
        //
        //Por ejemplo:
        //
        //Prueba	Resultado
        //int n = 10; // Número de términos a generar
        //        int[] padovanSeries = padovan(n);
        //
        //        // Imprimir los términos de la serie de Padovan
        //        for (int i = 0; i < padovanSeries.length; i++) {
        //            System.out.print(padovanSeries[i] + " ");
        //        }
        //1 1 1 2 2 3 4 5 7 9
        //int n = 0; // Número de términos a generar
        //        int[] padovanSeries = padovan(n);
        //
        //        // Imprimir los términos de la serie de Padovan
        //        for (int i = 0; i < padovanSeries.length; i++) {
        //            System.out.print(padovanSeries[i] + " ");
        //        }
    }

}
