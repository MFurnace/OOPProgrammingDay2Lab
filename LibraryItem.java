public class LibraryItem {
    String name, autFName, autLName, publisher, IsAvail, IsNotAvail; 
    char AudioBook, EBook;
    int YearOfPub, NumOfPages;
    

    //Constructor
    public LibraryItem (String name, String autFName, String autLName,String publisher, String isAvail, 
    String isNotAvail, char audioBook, char eBook, int yearOfPub, int numOfPages) {
        this.name = name;
        this.autFName = autFName;
        this.autLName = autLName;
        this.publisher = publisher;
        this.IsAvail = isAvail;
        this.IsNotAvail = isNotAvail;
        this.AudioBook = audioBook;
        this.EBook = eBook;
        this.YearOfPub = yearOfPub;
        this.NumOfPages = numOfPages;
    }

    
}