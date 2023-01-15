public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        System.out.println("---------------------------------");

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        System.out.println("---------------------------------");

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        System.out.println("---------------------------------");

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        System.out.println("---------------------------------");

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknowObject = Movie.getMovie("C","Airplane");
        if (unknowObject.getClass().getSimpleName() == "Comedy")
        {
            Comedy c = (Comedy) unknowObject;
            c.watchComedy();
        } else if (unknowObject instanceof Adventure){
            ((Adventure) unknowObject).watchAdventure();
        } else if (unknowObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}
