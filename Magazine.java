public class Magazine extends LibraryItem{//is this extends Periodical or abstract?
    char Autos, Business, ChildMag, Computers, Cooking, Sports;

    public Magazine (String name, String autFName, String autLName,String publisher,String isAvail, 
    String isNotAvail, char audioBook, char eBook, char autos, char business, char childMag, char computers, 
    char cooking, char sports, int yearOfPub, int numOfPages) {
    
    super(name, autFName, autLName, publisher, isAvail, isNotAvail,audioBook, eBook, yearOfPub, numOfPages);
            this.Autos = autos;
            this.Business = business;
            this.ChildMag = childMag;
            this.Computers = computers;
            this.Cooking = cooking;
            this.Sports = sports;
    }

}