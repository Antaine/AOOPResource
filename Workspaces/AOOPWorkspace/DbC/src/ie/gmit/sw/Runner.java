package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackable<String> s = new StackableImpl<String>();
		s.push("John");
		s.pop();
		s.push("Paul");
		s.push(null);
		s.pop();
		s.pop();
	//	s.pop();
	}

}
