package H071211014.Pertemuan_2;
public class Person {
    public String name;
    public  int age;
    public  boolean isMale;

    public  void setName(String name){
        this.name = name;
    }
    
    public  String getName(){
        return name;
    }

    public  void setAge(int age){
       this.age = age;
    }

    public  int getAge(){
        return age;
    }

    public  void setGender(Boolean isMale){
        this.isMale = isMale;
    }
    
  public String getGender(){
       if(isMale){
        return "male";
       } else{
        return "female";
       }
    }
}
