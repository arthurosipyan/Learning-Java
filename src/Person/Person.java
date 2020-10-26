package Person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String fName){
        this.firstName = fName;
    }

    public void setLastName(String lName){
        this.lastName = lName;
    }

    public void setAge(int newAge){
        if(newAge > 100 || newAge < 0){
            this.age = 0;
        }
        else{
            this.age = newAge;
        }
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}