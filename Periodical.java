public class Periodical extends LibraryItem implements Loanable{
    //Class Properties
    String Scholarly;
    
    //Constructor
    public Periodical (String title, String NameOfAut, String publisher, int YearOfPub, String Scholarly) {
    super(title, NameOfAut, publisher, YearOfPub);

    this.Scholarly = Scholarly;
}
    //Getter
    public String getScholarly(){
        return this.Scholarly;
    }
    //Setter
    public void setScholarly(String Scholarly){
        this.Scholarly = Scholarly;

    }
    @Override
    public boolean isLoanable(){
        return true;
    }
    @Override
    public int period(){
        return 14;
    }
}