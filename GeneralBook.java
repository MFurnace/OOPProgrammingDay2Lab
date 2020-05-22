public class GeneralBook extends LibraryItem implements Loanable {
    
    String Hardback, Paperback;

    public GeneralBook (String title,String NameOfAut, String publisher, int YearOfPub, 
    String Hardback, String Paperback){

        super(title, NameOfAut, publisher, YearOfPub);

            this.Hardback = Hardback;
            this.Paperback = Paperback;
    }   

    //Getters
    public String Hardback(){
        return this.Hardback;
    }
    public String Paperback(){
        return this.Paperback;
    }
    //setters

    public void setHardback(String Hardback){
        this.Hardback = Hardback;
    }
    public void setPaperback(String Paperback){
        this.Paperback = Paperback;
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