package Java_In_Out;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileInOut {

    public static void main(String[] args) {

      try {
          File file = new File("/Users/kawsar/Desktop/Test/filelist.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader reader = new BufferedReader(fileReader);

        String line = null;

          while ((line = reader.readLine())!= null) {
              System.out.println(line);
          }

      } catch (Exception e){
          e.getMessage();
      }



    }
}
