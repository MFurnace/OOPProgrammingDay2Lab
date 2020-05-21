public class Visual extends LibraryItem {
    //Class properties
    private String  videoTape, film;;

    //Constructor 
    public AudioVisual(String videoTape, String film) {
        this.VideoTape = videoTape;
        this.Film = film;
    }
    //Getters
    public String getVideoTape(){
        return videoTape;
    }
    public String getFilm(){
        return film;
    }

    //Setters
    public void setVideoTape (String videotape){
        this.VideoTape =videoTape;
    }
    public void setFilm (String film){
        this.Film = film;
    }
}