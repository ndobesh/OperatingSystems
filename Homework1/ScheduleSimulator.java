import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleSimulator {
    public static void main(String[] args) throws IOException {


        /*Read from file code from:
        https://stackoverflow.com/questions/5343689/java-reading-a-file-into-an-arraylist */
        Scanner scan = new Scanner(new File("C:/Users/Administrator/Desktop/data0"));
        ArrayList<String> list = new ArrayList<>();
        while (scan.hasNext()) {
            list.add(scan.next());
        }

        System.out.println(list);
        scan.close();

    }
}