public class Book extends LibraryItem {
    //Class Properties
    private String Poetry; 


    //Constructor
    public Book (String title,String NameOfAut, String publisher, int YearOfPub, String Poetry) {
        super(title, NameOfAut, publisher, YearOfPub);
        this.Poetry = Poetry;
    }
           

    //Getter
    public String getPoetry(){
        return this.Poetry;
    }
    //Setter
    public void setPoetry(String Poetry){
        this.Poetry = Poetry;
    }
}