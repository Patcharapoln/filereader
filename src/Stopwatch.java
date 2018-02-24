
/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Patcharapol Nirunpornputta
 */
public class Stopwatch {
	/** true is running , false is stop. **/
	private boolean status = false;
	private long start;
	private long stop;
	private static final double NANOSECONDS = 1.0E-9;

	/**
	 * Start stop watch. If it's not running.
	 */
	public void start() {
		if (isRunning())
			return;
		status = true;
		start = System.nanoTime();
	}

	/**
	 * Stop stop watch. If it's running.
	 */
	public void stop() {
		if (!isRunning())
			return;
		status = false;
		stop = System.nanoTime();
	}

	/**
	 * Check stop watch is running or not.
	 * @return status of stop watch.
	 */
	public boolean isRunning() {
		return status;
	}

	/**
	 * If stop watch is running compute elapsed time from start to this current time.
	 * else compute elapsed time until start to stop.
	 * @return elapsed time in second with decimal.
	 */
	public double getElapsed() {
		if (status)
			return (System.nanoTime() - this.start) * NANOSECONDS;
		return (this.stop - this.start) * NANOSECONDS;
	}
}
