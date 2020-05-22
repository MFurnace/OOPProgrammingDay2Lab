public class LibraryItem implements Loanable{
    String title, NameOfAut, publisher; 
    int YearOfPub;
        
    //Constructor
    public LibraryItem (String title,String NameOfAut, String publisher, int YearOfPub) {
        this.title = title;
        this.NameOfAut = NameOfAut;
        this.publisher = publisher;
        this.YearOfPub = YearOfPub;
    }

    //getters
    public String gettitle(){
        return this.title;
    }
    public String NameOfAut(){
        return this.NameOfAut;
    }
    public String publisher(){
        return this.publisher;
    }
    public int YearOfPub(){
        return this.YearOfPub;
    }
    //setters

    public void settitle(String title){
        this.title = title;
    }
    public void setNameOfAut(String NameOfAut){
        this.NameOfAut = NameOfAut;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    public void setYearOfPub(String yearOfPub){
        this.YearOfPub = YearOfPub;
    }
    @Override
    public boolean isLoanable() {
        return true;
    }
    @Override
    public int period(){
        return 14;
    }
    }