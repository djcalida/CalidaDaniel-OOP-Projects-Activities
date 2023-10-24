package Student;

class Student{
   String first_name = "";
   String middle_name = "";
   String last_name = "";
   String suffix = "";
   
   //Getters
   public String getFirstName(){
      return first_name;
    }
    public String getMiddleName(){
      return middle_name;
    }
    public String getLastName(){
      return last_name;
    }
    public String getSuffix(){
      return suffix;
    }
    //public String getFullName(){
      //return full_name;
    //}
    
    //Setters
    public void setFirstName(String fName){
         first_name = fName;
    }
    public void setMiddleName(String mName){
         middle_name = mName;
    }
    public void setLastName(String lName){
         last_name = lName;
    }
    public void setSuffix(String Suffix){
         suffix = Suffix;
    } 
   }
    