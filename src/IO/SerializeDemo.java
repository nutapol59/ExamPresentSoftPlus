package IO;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo { //การเขียน Object ลง ในไฟล์
    public static void main(String [] args) throws IOException {
       Person person = new Person();
       person.setName("Nutapol");
       person.setLastname("Khemayothin");
       person.setAge(22);
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;

        try {

            fileOut = new FileOutputStream("person");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(person);

            System.out.printf("Serialized data is saved");

        }finally {
            out.close();
            fileOut.close();
        }
    }
}
