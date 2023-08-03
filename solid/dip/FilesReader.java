package solid.live.dip;

import java.io.*;

public class FilesReader implements Reader {
    public static String read(String filepath) {
        String output = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                output+=aLine;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }
}
