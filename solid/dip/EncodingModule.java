package solid.live.dip;


import net.iharder.Base64;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public void encodeWithFiles() {
        String input = FilesReader.read("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        String encodedString = encoder(input);
        FilesWriter.write(encodedString,"/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
    }

    public void encodeBasedOnNetworkAndDatabase() {
        String input = NetworkReader.read("myfirstappwith.appspot.com");
        String encodedString = encoder(input);
        DatabaseWriter.write(encodedString);
    }

    public String encoder(String inputString){
        String encodedString = Base64.encodeBytes(inputString.getBytes());
        return encodedString;
    }
}

