import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Append {
   public static void main( String[] args ) {

      try {
         String data = "Karunakar is the best Student /n";
         File f1 = new File("kanna.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
         System.out.println(f1.getName());
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}
