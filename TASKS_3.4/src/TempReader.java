import java.io.*;
import java.util.ArrayList;

import static java.util.Locale.filter;

public class TempReader {
    private final static String FILENAME = "TASKS_3.4/src/temploki.csv";

    public static void main(String[]args) {
        FileReader file;
        BufferedReader bufferedstream = null;
        String line;
        String[] columnNames = new String[0];
        boolean header = true;



        try{
            file = new FileReader(FILENAME);
            bufferedstream = new BufferedReader(file);

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {
                        columnNames = line.split(";"); // splits based
                        header = false;
                    } else {
                        String[] columns = line.split(";");
                        for (int i = 0; i < columnNames.length; i++) {
                            //System.out.println(columnNames[i] + ": " + columns[i] + ", ");
                            //System.out.println();
                        }
                        String[] first = line.split(",");
                        for (int k = 0; k <= 24; k++ ){
                            System.out.println(columnNames[0] + ": " + columns[0] + "\n" +  columnNames[1] + ": " + columns[1] + "\n" );
                            //int jan1 = Integer.parseInt(columns[1]);
                        }
                    }



                }
            } while (line != null);
        }catch (IOException e) {
            System.err.println(e);
        }finally {
            try {
                if (bufferedstream != null){
                    bufferedstream.close();
                }
            }catch (Exception e) {
                System.out.println("Error while closing the file " + FILENAME);
            }
        }

    }
}