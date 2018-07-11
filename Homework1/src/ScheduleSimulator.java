import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ScheduleSimulator {
    public static void main(String[] args) {


        /*Read from file code from:
        https://stackoverflow.com/questions/34832203/how-to-print-multiple-lines-from-text-files-in-java */

        BufferedReader reader;

        File file = new File("C:/Users/Nahtan/Desktop/data3");

        try {
            reader = new BufferedReader(new FileReader(file));

            /*read the file*/
            String processPicker;


            List<String> listOfProcesses = new ArrayList<>();
            while ((processPicker = reader.readLine()) != null) {
                listOfProcesses.add(processPicker);
            }
            reader.close();

            /*for debugging purposes*/
            for (String listOfProcess : listOfProcesses) {
                System.out.println(listOfProcess);
            }
        } catch (Exception e) {
            System.out.println("File cannot be found!!");
        }
    }
}