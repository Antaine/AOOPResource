package ie.gmit.sw;

import java.util.Date;

public class TypeatorFactory {
	
	private TypeatorFactory() {
		
		// TODO Auto-generated constructor stub
	}
	
	private static TypeatorFactory tf = new TypeatorFactory();
	
	public static TypeatorFactory GetInstance()
	{
		return  tf;
	}
	
	public Typeator newTypeator(String s,Date d)
	{
		return new DefaultTypeator(s,d);
	}
	
	public Typeator newTypeator()
	{
		return new DefaultTypeator(null, null);
	}

	@Override
	public String toString() {
		return this.getClass().getName();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this.toString() + "about to be GC'd");
	}

}
