package ie.gmit.sw;

public class TypeatorBuilderImpl implements TypeatorBuilder{
	
	private int max_value;
	
	// No arg constructor
	public TypeatorBuilderImpl() {
		super();
	}

	// Single arg constructor
	public TypeatorBuilderImpl(int max_value) {
		super();
		this.max_value = max_value;
	}
	
	public int getMax_value() {
		return max_value;
	}

	public void setMax_value(int max_value) {
		this.max_value = max_value;
	}

	/**
	 * Supertype method
	 * @throws Exception 
	 */
	@Override
	public void initialise(int max_size) throws Exception {
		TypeatorBuilder.super.initialise(max_size);
	}

	@Override
	public Typeator[] contruct(TypeatorType e) {
		// return a typeator filled with max size 
		// instances of Typeatortype type
		return TypeatorBuilder.super.contruct(e); // Unsure of this one 
	}

}
