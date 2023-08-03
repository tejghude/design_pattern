package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter {
    public static void write(String encodedString,String filepath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
        writer.write(encodedString);
        writer.flush();
        writer.close();
    }
}

