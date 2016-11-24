package library;

import org.omg.CORBA.Object;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vladimir on 24.11.2016.
 */
public class Users_realization {

   private TreeMap Users= new TreeMap();
   private String Name = null;
   private String Key = null;
   private String FilePath = "Users.dat";

RandomAccessFile file = new RandomAccessFile(FilePath,"rw");

    public Users_realization() throws FileNotFoundException {
    }



    public void writeFile(String name,String key){
    byte[] bytes = name.getBytes();
        try {
            file.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    byte[] bytes1 = key.getBytes();

        try {
            file.write(bytes1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setUsers(String key,String value){

        int length = key.length();
        stringTo(key,length);

        length = value.length();
        stringTo(value,length);

        Users.put(key,value);
    }


    private void stringTo(String s,int i){
     for (int k = i;k<20;k++){
      s=s+" ";
     }
    }

    public static void main(String[] args) {
        Users_realization aa = null;
        try {
            aa = new Users_realization();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        aa.setUsers("Ura","NET");


        aa.writeFile("","NET");
    }

}
