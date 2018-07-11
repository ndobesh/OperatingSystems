import java.util.Scanner;

public class ScheduleSimulator {
    public static void main(String args[]) {

        /**
         * Articulate constructor that reads the process data from a file.
         *
         * @param filename
         *            A File object to read data from
         */
        ScheduleSimulator(File filename) {
            activeJob = null;
            Process proc = null;
            String s = null;
            long b = 0, d = 0, p = 0;
            try {
                BufferedReader input = new BufferedReader(new FileReader(filename));
                while ((s = input.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(s);
                    b = Long.parseLong(st.nextToken());
                    d = Long.parseLong(st.nextToken());
                    p = Long.parseLong(st.nextToken());
                    proc = new Process(b, d, p);
                    allProcs.add(proc);
                }

            } catch (FileNotFoundException fnfe) {
            } catch (IOException ioe) {
            }
            LoadJobQueue(allProcs);
        }


    }
}