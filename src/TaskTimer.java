/**
 * Compute and print the elapsed time of all tasks.
 * @author Patcharapol Nirunpornputta
 *
 */
public class TaskTimer{
	private final String name = "/Users/mark/Documents/OOP/filereader/Alice_in_wonderland.txt";
	private Stopwatch watch = new Stopwatch();
	
	/**
	 * Run and print information of AppenStringTask class.
	 */
	public void runAppendStringTask() {
		AppendStringTask s = new AppendStringTask(name);
		watch.start();
		s.run();
		watch.stop();
		System.out.printf(s.toString() +"%.6f \n", watch.getElapsed());;
	}
	
	/**
	 * Run and print information of AppenStringBuilderTask class.
	 */
	public void runAppendStringBuilderTask() {
		AppendStringBuilderTask builder = new AppendStringBuilderTask(name);
		watch.start();
		builder.run();
		watch.stop();
		System.out.printf(builder.toString() +"%.6f \n", watch.getElapsed());
	}
	
	/**
	 * Run and print information of BuffferReaderTask class.
	 */
	public void runBufferReaderTask() {
		BufferReaderTask buffer = new BufferReaderTask(name);
		watch.start();
		buffer.run();
		watch.stop();
		System.out.printf(buffer.toString() +"%.6f \n", watch.getElapsed());
	}
	
	public static void main(String[] args) {
		TaskTimer task = new TaskTimer();
		task.runAppendStringTask();
		task.runAppendStringBuilderTask();
		task.runBufferReaderTask();
	}
}
