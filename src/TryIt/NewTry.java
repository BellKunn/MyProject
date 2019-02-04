package TryIt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class NewTry {
    public static void main(String[] args) throws FileNotFoundException {
        getLineCount("C:\\Users\\Bell\\Desktop\\test.txt");
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
    }
}
