public class Magazine extends Periodical implements Reservable {
    private String Autos, Computers, Sports;

    public Magazine (String title,String NameOfAut, String publisher, int yearOfPub,String Scholarly, String Autos, 
    String Computers, String Sports) {

    super(title, NameOfAut, publisher, yearOfPub, Scholarly);
            this.Autos = Autos;
            this.Computers = Computers;
            this.Sports = Sports;
    }
    //Getter
    public String getAutos(){
        return this.Autos;
    }
    public String getComputers(){
        return this.Computers;
    }
    public String getSports(){
        return this.Sports;
    }
    //Setter
    public void setAutos(String Autos){
        this.Autos = Autos;
    }
    public void setNameOfAut(String NameOfAut){
        this.NameOfAut = NameOfAut;
    }
    @Override
    public boolean isReservable(){
        return true;
    }
    @Override
    public int period(){
        return 14;
    }

}