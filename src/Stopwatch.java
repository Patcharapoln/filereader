
public class Stopwatch {
	private boolean status = false;
	private long start;
	private long stop;
	private static final double NANOSECONDS = 1.0E-9;

	void start() {
		if(isRunning()) return;
		status = true;
		start = System.nanoTime();
	}

	void stop() {
		if(!isRunning()) return;
		status = false;
		stop = System.nanoTime();
	}

	boolean isRunning() {
		return status;
	}

	double getElapsed() {
		if (status)
			return (System.nanoTime() - this.start)*NANOSECONDS;
		return (this.stop-this.start)*NANOSECONDS;
	}

	public static void main(String[] args) {
		Stopwatch watch = new Stopwatch();
		watch.start();
		watch.stop();
		System.out.println(watch.getElapsed());
	}
}


