package solid.live.dip;

public class DatabaseWriter implements Writer{
    public static void write(String encodedString){
//        String inputString = inputString1.toString();
//        String encodedString = Base64.encodeBytes(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
