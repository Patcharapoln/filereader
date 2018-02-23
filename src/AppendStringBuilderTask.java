import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Read file 1 char at a time to String.
 * 
 * @author Patcharapol Nirunpornputta.
 *
 */
public class AppendStringBuilderTask implements Runnable {
	private String filename = "";
	private int size;

	/**
	 * Constructor of AppendStringBuilderTask. 
	 * @param filename is directory of file.
	 */
	public AppendStringBuilderTask(String filename) {
		this.filename = filename;
	}

	/**
	 * Read file and append char to String Builder.
	 * @param filename is file directory.
	 * @return data from text file.
	 */
	public static String readFileToStringBuilder(String filename) {
		StringBuilder data = new StringBuilder();
		try {
			InputStream in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data.append((char) c);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return data.toString();
	}

	/**
	 * Run AppendStringBuilder class.
	 */
	@Override
	public void run() {
		String s = readFileToStringBuilder(filename);
		size = s.length();
	}

	/**
	 * @return information of reading file by using this class.
	 */
	@Override
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader append to StringBuilder. \n" + "Read " + size
				+ " chars to string ";
	}
}
