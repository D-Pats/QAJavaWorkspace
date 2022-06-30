package inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOmethods {

	public static void writeFile(String a) {
		try {
			FileOutputStream outputStream = new FileOutputStream(
					"F:\\uploadnotes\\QAJavaWorkspace\\InputOutput\\OutputData.txt");
			byte b[] = a.getBytes();
			outputStream.write(b);
			outputStream.flush();
			outputStream.close();

			System.out.println("Success - Writing");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		try {
			FileInputStream inputStream = new FileInputStream(
					"F:\\uploadnotes\\QAJavaWorkspace\\InputOutput\\OutputData.txt");
			int i;
			while ((i = inputStream.read()) != -1) {
				System.out.println((char) i);
			}
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
