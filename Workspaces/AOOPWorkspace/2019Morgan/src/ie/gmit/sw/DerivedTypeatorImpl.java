package ie.gmit.sw;

public class DerivedTypeatorImpl implements DerivedTypeator{

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
	public int invoke() {
		return t.invoke();
	}

	@Override
	public int execute() {
		return t.execute();
	}

	@Override
	public int call() {
		return t.execute() + 1;
	}

}
