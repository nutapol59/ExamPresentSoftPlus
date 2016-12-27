package IO;

import java.io.*;

public class TestIO {
    public static void main(String[] args) throws IOException{
        byteStream();
        charStream();
        charStreamWrite();
        bufferedStream();

    }

    public static void byteStream() throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/nbkf/MyProject/ExTest/src/IO/input.txt");
            out = new FileOutputStream("/home/nbkf/MyProject/ExTest/src/IO/output.txt");

            int c;
            byte[] b = new byte[1024];
            int count=0;
            while ((c = in.read(b)) != -1) {
                count++;
                System.out.println(c);
                out.write(b,0,c);

//                out.write(c);
            }
            System.out.println(count);

        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void charStream() throws IOException{ //read each 1 character
        Reader reader = null;
        try {
            reader = new FileReader("/home/nbkf/MyProject/ExTest/src/IO/input.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.println("char --> " + (char) data);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }

    public static void charStreamWrite() throws IOException {
        Writer writer = null;
        Reader reader=null;
        try {
            reader = new FileReader("/home/nbkf/MyProject/ExTest/src/IO/input.txt");
            writer = new FileWriter("/home/nbkf/MyProject/ExTest/src/IO/outputChar.txt",true);

            int data;
            while ((data = reader.read()) != -1){
                writer.append((char) data);
            }

        } finally {
            if (reader != null){
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }

    }

    public static void bufferedStream() throws IOException{
        BufferedReader bufferedReader = null;
        Reader reader = null;

        BufferedWriter bufferedWriter = null;
        Writer writer = null;
        try {
            reader = new FileReader("/home/nbkf/MyProject/ExTest/src/IO/inputBuffered.txt");
            writer = new FileWriter("/home/nbkf/MyProject/ExTest/src/IO/outputBuffered.txt");

            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);

            String data;

            while ((data = bufferedReader.readLine()) != null){
                System.out.println("String : --> : " + data);
               bufferedWriter.write(data);

                bufferedWriter.append('\n'); //append new line
            }

        } finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }

            if(bufferedWriter != null){
                bufferedWriter.close();
            }

            if(reader != null){
                reader.close();
            }

            if(writer != null){
                writer.close();
            }
        }
    }
}
