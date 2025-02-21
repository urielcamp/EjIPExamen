package Series;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");


        //Generar los primeros n términos de la serie de Fibonacci:


        int[] n = new int[10];

        System.out.println(Arrays.toString(fib(n)));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        //Generar los primeros n términos de la serie de Tribonacci:

        System.out.println(Arrays.toString(tribonacci(10)));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        //Calcular el factorial de un número n:

        System.out.println(Arrays.toString(fac(5)));


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");

        //Generar la serie de cuadrados de los primeros n números:

        System.out.println(Arrays.toString(cud(5)));

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 5");
        System.out.println(" ");

        //Genera la serie de padovan:

        System.out.println(Arrays.toString(padovan(10)));







    }


    public static int[] padovan(int n){
        int[] padList = new int[n];

        padList[0] = 1;
        padList[1] = 1;
        padList[2] = 1;

        for (int i = 3; i < padList.length; i++){
            int num = padList[i - 2] + padList[i - 3];
            padList[i] = num;
        }


        return padList;
    }


    public static int[] cud(int n){
        int[] cuadrado = new int[n];

        for (int i = 0; i < cuadrado.length; i++){
            int num = i*i;
            cuadrado[i] = num;
        }

        return cuadrado;
    }



    public static int[] fac(int n){
        int[] facList = new int[n];

        int num = 1;

        for (int i = 0; i < facList.length; i++){
            num *= i + 1;
            facList[i] = num;
        }

        return facList;
    }





    public static int[] tribonacci(int n){
        int[] triboList = new int[n];

        triboList[0] = 0;
        triboList[1] = 0;
        triboList[2] = 1;


        for (int i = 3; i < triboList.length; i++){
            int num = triboList[i - 1] + triboList[i - 2] + triboList[i - 3];
            triboList[i] = num;
        }



        return triboList;
    }


    public static int[] fib(int[] n){

        n[0] = 1;
        n[1] = 1;

        for (int i = 2; i < n.length; i++){
            int num = n[i - 1] + n[i - 2];
            n[i] = num;

        }

        return n;
    }
}
