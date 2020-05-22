public class PublishingCompany {
    String Name, Content;

    public PublishingCompany (String Name, String Content) {
        this.Name = Name;
        this.Content = Content;
    }
    public String getName(){
        return this.Name;
    }
    public String getcontent(){
        return this.Content;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setContent(String Content){
        this.Content = Content;
    }
}