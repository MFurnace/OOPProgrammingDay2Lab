public class Audio extends LibraryItem {
    //Class properties
    char AudioBooks, CompactDisk, Mp3, Record, PolSpeech;

    //Constructor 
    public Audio (String name, String autFName, String autLName,String publisher, char audioBook, char compactDisk, char mp3, 
    char record, char polSpeech, String isAvail, String isNotAvail, char eBook, char referenceBook, char generalBook, int yearOfPub, int numOfPages) {
    
    super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook, yearOfPub, numOfPages);
        this.AudioBooks = audioBook;
        this.CompactDisk = compactDisk;
        this.Mp3 = mp3;
        this.Record = record;
        this.PolSpeech = polSpeech;
    }
    
}