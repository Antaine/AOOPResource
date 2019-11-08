package ie.gmit.sw;

public interface DerivedTypeator extends Typeator {
	
	public default int execute() {
		return -1;
	};

	public int call();

}
