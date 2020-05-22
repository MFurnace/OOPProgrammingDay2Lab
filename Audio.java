public class Audio extends LibraryItem {
    //Class properties
    String title, NameOfAut, AudioBook, CompactDisk, Mp3, Record, PolSpeech, publisher;
    int yearOfPub;

    //Constructor 
    public Audio (String title, String NameOfAut, String AudioBook, String CompactDisk, String Mp3, 
    String Record, String PolSpeech, String publisher, int yearOfPub) {
        
        super(title, NameOfAut, publisher, yearOfPub);
            
            this.title = title;
            this.NameOfAut = NameOfAut;
            this.AudioBook = AudioBook;
            this.CompactDisk = CompactDisk;
            this.Mp3 = Mp3;
            this.Record = Record;
            this.PolSpeech = PolSpeech;
            this.publisher = publisher;
            this.yearOfPub =yearOfPub;
    }
    //getters
    public String gettitle(){
        return this.title;
    }
    public String NameOfAut(){
        return this.NameOfAut;
    }
    public String AudioBook(){
        return this.AudioBook;
    }
    public String CompactDisk(){
        return this.CompactDisk;
    }
    public String Mp3(){
        return this.Mp3;
    }
    public String Record(){
        return this.Record;
    }
    public String PolSpeech(){
        return this.PolSpeech;
    }
    public String publisher(){
        return this.publisher;
    }
    public int yearOfPub(){
        return this.yearOfPub;
    }
    //setters

    public void settitle(String title){
        this.title = title;
    }
    public void setNameOfAut(String NameOfAut){
        this.NameOfAut = NameOfAut;
    }
    public void setAudioBook(String AudiBook){
        this.AudioBook = AudiBook;
    }
    public void setCompactDisk(String CompactDisk){
        this.CompactDisk = CompactDisk;
    }
    public void setMp3(String Mp3){
        this.Mp3 = Mp3;
    }
    public void setRecord(String Record){
        this.Record = Record;
    }
    public void setPolSpeech(String PolSpeech){
        this.PolSpeech = PolSpeech;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    public void setyearOfPub(String yearOfPub){
        this.yearOfPub = yearOfPub;
    }
    
}