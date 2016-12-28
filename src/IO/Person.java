package IO;

/**
 * Created by nbkf on 28/12/2559.
 */
public class Person  implements java.io.Serializable{
    private String name;
    private String lastname;
    private int age;

    Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
