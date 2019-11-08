package ie.gmit.sw;

public class ListClient {

	public static void main(String[] args)
	{
		String[] names = {"John", "Paul", "Mary", "Anne", "Alan", "Barbara"};
		ListWriterable writer = new ArrayStringWriter(); //We do not have a conforming class yet}
		writer.open("stuff.txt");
		writer.write(names);
		writer.close();
		
		CompArrayStringWriter cosw = (CompArrayStringWriter)writer;
		
		
	//	SimpleStringWriter asw = (ArrayStringWriter) writer;
	//	asw.write("Hello");
	}
}