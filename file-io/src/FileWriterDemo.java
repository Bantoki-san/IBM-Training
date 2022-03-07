import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path = "src\\amazing.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write("Pantsu misete moratte yoroshii desu ga");
			writer.newLine();
			writer.write("Yohohohoho");
			writer.newLine();
			writer.write("Watashi wa Burukkuu desuu");
			System.out.println("Writing to files complete");
			
			} catch (IOException e) {
			e.printStackTrace();
			
			}finally {
				try {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}
}
