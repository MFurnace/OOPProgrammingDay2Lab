public class Newspaper extends LibraryItem{// is this extends Periodical or abstract?

    String VolNum;

    public Newspaper (String name, String autFName, String autLName,String publisher, String volNum, String isAvail, 
    String isNotAvail, char audioBook, char eBook, char referenceBook, char generalBook, int yearOfPub, int numOfPages) {
    
    super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook, yearOfPub, numOfPages);
    this.VolNum = volNum;
    }

}