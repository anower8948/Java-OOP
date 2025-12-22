package job003day.Encaptulation;

public class Lockedthings {
    
    private String name = "Kuddosh";
    private String age = "25";
    private String Gender = "Male ";

    public String getName(){
        return this.name;
    }

    public String getAge(){
        return this.age;
    }

    public String getGender(){
        return this.Gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

}
