package YIC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer {
    private String phone;
    private String address;
    private String url;

    public String BufferedReader(){
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/hospitalinfo.txt"))){
            while ((line = bufferedReader.readLine()) != null) {
                return line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
