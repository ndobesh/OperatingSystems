import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class ScheduleSimulator {
    public static void main(String[] args) {


        //        Process Class that handles the data read in from the file

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

            for (String listOfProcess : listOfProcesses) {
                //System.out.println(listOfProcess);
                LinkedList<Integer> proc = new LinkedList<>();
                String[] a = listOfProcess.split(" ");
                System.out.println(a);
                for(int i = 1; i < a.length; i++) {
                    proc.add(Integer.getInteger(a[i]));
                }
            }
        } catch (Exception e) {
            System.out.println("File cannot be found!!");
        }

        //Ready queue implementation



//        List of CPUs - Determined by # of running CPUs
        /*Scanner input = new Scanner(System.in);
        System.out.print("How many CPUs should there be? ");
        int numofCPUs = input.nextInt();
        ArrayList<Queue> CPUtemplate = new ArrayList<>();

        for(int i = 0; i < numofCPUs; i++){*/

        }

//        Queue - Ready to run processes


//        Blocked - Processes blocked by I/O operations


//        While I still have processes to run:


//        - Check for open CPUs


//        - If there is an open CPU


//                - If there is a ready process to run, attach the process


//        - Otherwise, the CPU is idle


//                - Loop over CPUs, decrement run time


//        - If that exec time is zero, remove the process from the cpu and place into blocked queue


//        - Loop over blocked queue, decrement block time


//        - If that block time is zero, place the process into the queue, making it ready for a CPU to pick it up


    }
