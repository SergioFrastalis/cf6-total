package gr.aueb.cf.ch9;

import java.io.*;

public class HomeworkCh9 {

    public static void main(String[] args) {
        try (BufferedReader bf = new BufferedReader(new FileReader("src/gr/aueb/cf/ch9/locations.txt"))) {
            String line;

            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] parts = line.split(",");
                String location = parts[0];
                double latitude = Double.parseDouble(parts[1]);
                double longitude = Double.parseDouble(parts[2]);

                String formattedLine = String.format(
                        "{ location: '%s', latitude: %.4f, longitude: %.4f }",
                        location, latitude, longitude
                );


                System.out.println(formattedLine);

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
