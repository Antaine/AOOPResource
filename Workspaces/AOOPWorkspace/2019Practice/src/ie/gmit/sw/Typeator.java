package ie.gmit.sw;

public interface Typeator {

	public static final int Max = 5;
	public abstract int execute();
	public default int invoke() {
		int num = 0;
		return (execute() + init(num));
	};
	private int init (int num) {
		System.out.println("Num "+ (num + 1));
		return num + 1;
	}
}
