package ie.gmit.sw;

public class DerivedTypeatorImpl implements DerivedTypeator {

	private Typeator t = new Typeator() {
		
		@Override
		public int execute() {
			return 0;
		}
	};
	
	public DerivedTypeatorImpl(Typeator t) {
		super();
		this.t = t;
	}
	
	@Override
	public int execute() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int invoke() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int call() {
		// TODO Auto-generated method stub
		return 0;
	}
}