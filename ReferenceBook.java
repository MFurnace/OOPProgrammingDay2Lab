public class ReferenceBook extends Book{
    //class properties
    private String Almanac;

    public ReferenceBook (String title,String NameOfAut, String publisher, int YearOfPub, String Poetry, String Almanac) {
        super(title, NameOfAut, publisher, YearOfPub, Poetry);

            this.Almanac = Almanac;
    }
    //Getter
    public String getAlmanac(){
        return this.Almanac;
    }
    //Setter
    public void setAlmanac(String Almanac){
        this.Almanac = Almanac;
    }
}