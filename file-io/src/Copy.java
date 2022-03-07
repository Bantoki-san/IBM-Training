import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		try {
			inFile = new FileInputStream("C:/Users/HP/Downloads/numb.mp4");
			outFile = new FileOutputStream("C:/Users/HP/Downloads/n2.mp4");
			System.out.println("Copying Files...!");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while (true) {
				ch = inFile.read(); // reading a byte from the stream
				if (ch == -1)
					break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File Copied successfully in " + (ms2 - ms1) + " ms");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inFile.close();
				outFile.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
