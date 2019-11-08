package ie.gmit.sw;

import java.io.FileWriter;
import java.io.IOException;

public class AlternativeStringWriter {
	private FileWriter fw;
	private int key = 7;

	public void open(String fileName) {
		try {
			fw = new FileWriter(fileName);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public void write(char c) {
		try {
			fw.write((c + key));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			fw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}