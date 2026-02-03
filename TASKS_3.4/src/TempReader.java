import java.io.*;

public class TempReader {
    private final static String FILENAME = "TASKS_3.4/src/temploki.csv";

    public static void main(String[] args) {
        FileReader file;
        BufferedReader bufferedstream = null;
        String line;
        //String[] columnNames = new String[0];
        //boolean header = true;
        String targetDate = "01.01.2023";
        String[] values;
        double sum = 0.0;
        int count = 0;

        try {
            file = new FileReader(FILENAME);
            bufferedstream = new BufferedReader(file);

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    values = line.split(";");
                    if (values[0].startsWith(targetDate)) {
                        System.out.printf("Date: %s, Temp: %s C%n", values[0], values[1]);
                        double temp = Double.parseDouble(values[1].replace(",", "."));
                        sum += temp;
                        count++;
                    }
                }
            }
            while (line != null);
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average temperature on January 1st 2023 was %.2fC", average);
            } else {
                System.out.println("No temperature data found");
            }
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            try {
                if (bufferedstream != null) {
                    bufferedstream.close();
                }
            } catch (Exception e) {
                System.out.println("Error while closing the file " + FILENAME);
            }
        }
    }
}

// Code to read out all the columns, wasn't sure if it was needed

//if (header) {
//columnNames = line.split(";"); // splits based
//header = false;
//String[] columns = line.split(";");
//for (int i = 0; i < columnNames.length; i++) {
//System.out.println(columnNames[i] + ": " + columns[i] + ", ");
//System.out.println();