public class Visual extends LibraryItem implements Audio {
    //Class properties
    String  VideoTape, film;

    //Constructor 
    public Visual (String title, String NameOfAut, String AudioBook, String CompactDisk, String Mp3, 
    String Record, String PolSpeech, String publisher, int yearOfPub, String VideoTape, String film) {

        super(title, NameOfAut, publisher, yearOfPub);
            this.VideoTape = VideoTape;
            this.film = film;
    }
    //Getters
    public String getVideoTape(){
        return VideoTape;
    }
    public String getfilm(){
        return film;
    }

    //Setters
    public void setVideoTape (String Videotape){
        this.VideoTape = VideoTape;
    }
    public void setfilm (String film){
        this.film = film;
    }
}