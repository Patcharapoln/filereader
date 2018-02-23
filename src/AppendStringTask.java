import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Reader 1 char at a time to String.
 * 
 * @author Patcharapol Nirunpornputta.
 *
 */
public class AppendStringTask implements Runnable {
	private String filename = "";
	private int size;

	/**
	 * Constructor of AppendStringTask.
	 * 
	 * @param filename
	 *            is directory of file.
	 */
	public AppendStringTask(String filename) {
		this.filename = filename;
	}

	/**
	 * Read file and append char to String.
	 * @param filename is file directory.
	 * @return data from text file.
	 */
	public static String readFileToString(String filename) {
		String data = "";
		try {
			InputStream in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return data;
	}

	/**
	 * Run AppenString Task class.
	 */
	@Override
	public void run() {
		String s = readFileToString(filename);
		size = s.length();
	}

	/**
	 * @return information of reading file by using this class.
	 */
	@Override
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader append to String. \n" + "Read " + size
				+ " chars to string ";
	}
}
