package ClasesYObjetos;

public class PeliculaExamen {

       //Crea una clase Pelicula que represente una película en una base de datos de cine.
        //La clase debe tener los siguientes atributos: título, director y duración en minutos.
        //
        //Implementa tres constructores sobrecargados:
        //
        //Un constructor que tome el título y el director de la película.
        //Un constructor que tome el título, el director y la duración en minutos.
        //Un constructor sin parámetros que inicialice el título como "Título desconocido",
        //el director como "Director desconocido", y la duración como 0.
        //Incluye métodos getter (getTitulo(), getDirector(), getDuracion()) para obtener los valores de los
        //atributos.


        private String titulo;
        private String director;
        private int minutos;

        public PeliculaExamen(String titulo, String director){
            this.director = director;
            this.titulo = titulo;
        }

        public PeliculaExamen(String titulo, String director, int minutos){
            this.director = director;
            this.titulo = titulo;
            this.minutos = minutos;
        }

        public PeliculaExamen(){
            this.director = "Director desconocido";
            this.titulo = "Título desconocido";
            this.minutos = 0;
        }

        public String getTitulo(){
            return titulo;
        }

        public String getDirector(){
            return director;
        }

        public int getMinutos(){
            return minutos;
        }






}
