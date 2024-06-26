package gr.aueb.cf.ch9;

import java.io.*;

public class ImageBufferedCopyApp {

    public static void main(String[] args) {

        try(BufferedInputStream fis = new BufferedInputStream(new FileInputStream("C:/tmp/kefali.jpg"));
            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("C:/tmp/kefali-out.jpg"))){

            int b =0;
            int count = 0;
            long start;
            long end;
            double elapsedTime = 0.0;
            byte[] buf = new byte[4096];

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;
            System.out.printf("Το αρχείο με μέγεθος %dKB (%d bytes) αντιγράφηκε επιτυχώς", (count / 1024), count);
            System.out.println("Elapsed time: " + elapsedTime + "seconds");

        }catch(IOException e) {
            e.printStackTrace();

        }
    }
}
