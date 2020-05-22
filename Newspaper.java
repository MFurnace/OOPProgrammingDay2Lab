public class Newspaper extends Periodical{// is this extends Periodical or abstract?

    private int VolNum;

    public Newspaper (String title, String NameOfAut, String publisher, int YearOfPub, String Scholarly, int VolNum) {
       
        super(title, NameOfAut, publisher, YearOfPub, Scholarly);
            this.VolNum = VolNum;
    }

    //Getter
    public int getVolNum(){
        return this.VolNum;
    }
    //Setter
    public void setVolNum(int VolNum){
        this.VolNum = VolNum;
    }
}