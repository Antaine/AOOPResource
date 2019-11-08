package ie.gmit.sw;

public class CompArrayStringWriter implements ListWriterable{
	//private SimpleStringWriter ssw = new SimpleStringWriter(); //Adds dependency on Adapter
	private AlternativeStringWriter ssw = new AlternativeStringWriter();
	public void open(String fileName) {
		ssw.open(fileName);
	}

	public void close() {
		ssw.close();
	}

	@Override
	public void write(String[] list) {
		// TODO Auto-generated method stub
		for(String s : list) {
			char[] chars = s.toCharArray();
			for(char c : chars) {
				ssw.write(c);
			}
		}
	}
	

}
