package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {

    public static void main(String[] args) throws IOException {

        System.out.println(createFile("test.text"));
        System.out.println(writeFile("Hello World, Today we are learning!!"));

        System.out.println(deleteFile());


    }


    public static String createFile(String pthName) throws IOException {

        try{
            File myObj = new File(pthName);
            System.out.println(myObj.createNewFile());
            System.out.println(myObj.getName());
            System.out.println(myObj.getPath());
        }catch(IOException e){
            throw new RuntimeException();
        }
        return pthName;
    }


    public static String writeFile(String name) throws IOException {

        FileWriter writer = new FileWriter("test.txt");
        writer.write(name);
        writer.close();

        return "Successfully wrote to a file " +writer;
    }

    public static boolean deleteFile(){

        File file = new File("test.text");
        file.delete();
        System.out.println("Deleted the file successfully " +file);


        return true;
    }


}
