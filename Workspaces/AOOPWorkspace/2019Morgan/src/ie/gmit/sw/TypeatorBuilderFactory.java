package ie.gmit.sw;

/**
 * Singleton factory class
 */
public class TypeatorBuilderFactory {

	public static TypeatorBuilderFactory builderFactory = new TypeatorBuilderFactory();
	public static TypeatorBuilder builder = new TypeatorBuilder() {
	};
	
	private TypeatorBuilderFactory() {
	}

	public static TypeatorBuilderFactory getInstance() {
		return builderFactory;
	}
	
	public static TypeatorBuilder getTypeatorBuilder() {
		return builder;
	}

}
