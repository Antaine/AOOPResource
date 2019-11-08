package ie.gmit.sw;

public interface TypeatorBuilder {
	
	public default void initialise(int max_size) throws Exception{
		if (max_size < 0 || max_size > Integer.MAX_VALUE) {
			throw new Exception();
		}
	};
	
	public default Typeator[] contruct(TypeatorType e) {
		return null;
	}

}
