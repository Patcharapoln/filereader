import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read File by buffer reader.
 * @author Patcharapol Nirunpornputta.
 *
 */
public class BufferReaderTask implements Runnable {
	
	private String filename = "";
	private int size;
	
	/**
	 * Constructor of BufferReaderTask. 
	 * @param filename is directory of file.
	 */
	public BufferReaderTask(String filename) {
		this.filename = filename;
	}

	/**
	 * Read file by using buffered reader.
	 * @param filename is directory of file.
	 * @return data from text file.
	 */
	public static String readFileToBufferedReader(String filename) {
		String data = "";
		FileReader reader = null;
		try {
			reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			String line;
			int c;
			while ((line = br.readLine()) != null) {
				data = data + line + '\n';
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return data;
	}
	
	/**
	 * Run BufferReaderTask class.
	 */
	@Override
	public void run() {
		String s = readFileToBufferedReader(filename);
		size = s.length();
	}

	/**
	 * @return information of reading file by using this class.
	 */
	@Override
	public String toString() {
		return "Reading Alice-in-Wonderland.txt using FileReader append lines to String. \n" +"Read " + size + " chars to string ";
	}
}
