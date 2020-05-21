public class ReferenceBook extends LibraryItem{
    //class properties
    char LangDict, Encyc, Bio, YearBook, Almanac;

    public ReferenceBook (String name, String autFName, String autLName,String publisher, String isAvail, 
    String isNotAvail, char audioBook, char eBook, char langDict, char encyc, char bio, 
    char yearBook, char alamanac, int yearOfPub, int numOfPages){
        super(name, autFName, autLName, publisher, isAvail, isNotAvail, audioBook, eBook,  yearOfPub, numOfPages);

            this.LangDict = langDict;
            this.Encyc = encyc;
            this.Bio = bio;
            this.YearBook = yearBook;
            this.Almanac = alamanac;
    }
}