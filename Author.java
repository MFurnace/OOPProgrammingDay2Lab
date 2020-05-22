
public class Author {
    
    String fName, lName, jobTitle, credentials;
    

    //Constructor
    public Author (String fName, String lName, String jobTitle, String credentials) {
    
        this.fName = fName;
        this.lName = lName;
        this.jobTitle = jobTitle;
        this.credentials = credentials;
        }

        //Getters
        public String getfName(){
            return this.fName;
        }
        public String lName(){
            return this.lName;
        }
        public String jobTitle(){
            return this.jobTitle;
        }
        public String credentials(){
            return this.credentials;
        }
        
        //Setters

        public void setfName(String fName){
            this.fName = fName;
        }
        public void setlName(String lName){
            this.lName = lName;
        }
        public void setjobTitle(String jobTitle){
            this.jobTitle = jobTitle;
        }
        public void setcredentials(String credentials){
            this.credentials = credentials;
        }
    }
