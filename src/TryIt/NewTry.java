package TryIt;

import sun.security.pkcs11.wrapper.CK_SSL3_RANDOM_DATA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class NewTry {
    public static void main(String[] args) throws FileNotFoundException {
        getLineCount("C:\\Users\\Bell\\Desktop\\test.txt");
        //Как обратится к RandomDat.

    }

    public static void getLineCount(String filename) throws FileNotFoundException {
        File file = new File("C:\\\\Users\\\\Bell\\\\Desktop\\\\cars.txt");
        int lines = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {
            lines++;
            String[] array = scanner.nextLine().split(" ");
        }
        System.out.println("Number of lines " + lines);

        scanner.close();
         class randomDate {
             public void RandomDat (String filename)
             {
                 int dayStart=1 ;int dayEnd =30 ;
                 int monthStart=1;int monthEnd=12 ;
                 int year=2018 ;
                 int []mas =new int[]{};
                 File file = new File("C:\\\\Users\\\\Bell\\\\Desktop\\\\cars.txt");
                 try {

                     FileWriter fileWriter=new FileWriter(file);
                     Scanner Sc= new Scanner(filename);

                     for (int s:mas)//шо за строка такая))?
                     {
                         int RandomDay =dayStart+(int)(Math.random()*dayEnd);
                         int RandomMonth=monthStart+(int)(Math.random()*monthEnd);
                         fileWriter.write(RandomDay+" "+RandomMonth+" "+year);
                     }
                     scanner.close();
                 }catch (Exception e){
                     e.printStackTrace();
                 }

             }
        }
    }
}
