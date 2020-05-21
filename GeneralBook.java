public class GeneralBook extends LibraryItem {
    char Children, Horror, Romance, Suspense, Thriller;

    public GeneralBook (String name, String autFName, String autLName,String publisher, String isAvail, 
    String isNotAvail, char audioBook, char eBook, char referenceBook, char generalBook, char children, char horror, char romance, 
    char suspense, char thriller, int yearOfPub, int numOfPages) {
    super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook, children, horror);

    this.Children = children;
    this.Horror = horror;
    this.Romance = romance;
    this.Suspense = suspense;
    this.Thriller = thriller;
    }   
}