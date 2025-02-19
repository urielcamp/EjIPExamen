package StringsEx;

public class EJ1 {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("-----------------Ejercicio 1 --------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");

        //Completar la función validar letras, se debe pasar como parámetro un String que contenga letras, estas letras deben de ser las letras vocales, y el largo del String es valido si el largo es entre 3 y 6 letras. Se debe tomar como letras vocales tanto las minúsculas como las mayúsculas.
        //
        //Se deben cumplir ambas condiciones:
        //
        //La firma de la función es la siguiente:
        //
        //public boolean validarVocal(String palabra)
        //No debes incluir el método main, solo completar la lógica del método.
        //No debes probar el método con llamadas, de eso se encarga CodeRunner, solo completar la lógica del método.
        //
        //Por ejemplo:
        //
        //Prueba	Resultado
        //String palabra="Aei";
        //System.out.println(validarVocal(palabra));
        //true
        //String palabra="aeijk";
        //System.out.println(validarVocal(palabra));
        //false


        boolean estaVocal = validarVocal("aeuo");

        System.out.println(estaVocal);



        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("-----------------Ejercicio 2 --------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");

        //Completa el método para verificar si la palabra tiene solo consonantes (sin vocales)
        //y su longitud es de 4 a 8 caracteres.



        System.out.println(validarConsonantes("pkdd"));


        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("-----------------Ejercicio 3 --------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");


        //Verifica si la palabra tiene solo letras mayúsculas (A-Z) y su longitud es entre 3 y 6 caracteres.

        System.out.println(validarMayusculas("ASDF"));

        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
        System.out.println("-----------------Ejercicio 4 --------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");

        //Un palíndromo es una palabra que se lee igual al derecho y al revés, como "radar" o "ana".
        //El método debe devolver true si la palabra es un palíndromo y false si no lo es.

        System.out.println(esPalindromo("ana"));








    }





















    public static boolean validarVocal (String palabra){

        if(palabra.length() < 3 || palabra.length() > 6){
            return false;
        }

        String vocales = "aeiou";

        for(char c : palabra.toCharArray()){

            char lower = Character.toLowerCase(c);

            if(!vocales.contains(String.valueOf(lower))){
                return false;
            }


        }



        return true;
    }


    public static boolean validarConsonantes(String palabra) {
        // Implementa aquí la lógica

        int n = palabra.length();

        if (n < 4 || n > 8){
            return false;
        }

        String vocales = "aeiou";

        for(char c: palabra.toCharArray()){

            char lower = Character.toLowerCase(c);

            if(vocales.contains(String.valueOf(lower))){
                return false;
            }
        }


        return true;
    }


    public static boolean validarMayusculas(String palabra) {
        // Implementa aquí la lógica

        int n = palabra.length();
        if(n < 3 || n > 6){
            return false;
        }

        String may = palabra.toUpperCase();

        if (may == palabra){
            return true;
        }


        return false;
    }


    public static boolean esPalindromo(String palabra) {
        // Implementa aquí la lógica

        palabra = palabra.toLowerCase();

        String invertida = new StringBuilder(palabra).reverse().toString();





        return palabra.equals(invertida);
    }





}
