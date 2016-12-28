package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//https://www.tutorialspoint.com/java/java_serialization.htm

public class DeSerializeDemo  {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream in = null;
        Person person = null;
        Person person1 = null;
        ObjectInputStream objectInputStream = null;

        try {

            in = new FileInputStream("person");
            objectInputStream = new ObjectInputStream(in);

            person = (Person)objectInputStream.readObject();

            //System.out.println(person1.getName());


            System.out.println(person.getName());
            System.out.println(person.getLastname());
            System.out.println(person.getAge());



        }finally {
            in.close();
            objectInputStream.close();
        }
    }
}
