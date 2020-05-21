public class Book extends LibraryItem {
    //Class Properties
    char GenDrama, GenPoetry, GenProse, GenNonFic, GenMedia; 


    //Constructor
    public Book (String name, String autFName, String autLName,String publisher, String isAvail, 
    String isNotAvail, char audioBook, char genDrama, char genPoetry, char genProse, char genNonFic, char genMedia, 
    char eBook, int yearOfPub, int numOfPages){
        super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook, 
        yearOfPub, numOfPages);
        this.GenDrama = genDrama;
        this.GenPoetry = genPoetry;
        this.GenProse = genProse;
        this.GenNonFic = genNonFic;
    }

    //Getters

    //Setters

}