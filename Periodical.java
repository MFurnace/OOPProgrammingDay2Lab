public class Periodical extends LibraryItem{
    //Class Properties
    char Scholarly, Trade, Popular;
    

    //Constructor
    public Periodical (String name, String autFName, String autLName,String publisher, char scholarly, char trade, char popular, 
    String isAvail, String isNotAvail, char audioBook, char eBook, char referenceBook, char generalBook, int yearOfPub, int numOfPages) {
    
    super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook, yearOfPub, numOfPages);

    this.Scholarly = scholarly;
    this.Trade = trade;
    this.Popular = popular;
}
}