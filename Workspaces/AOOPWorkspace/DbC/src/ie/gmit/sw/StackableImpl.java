package ie.gmit.sw;

import java.util.ArrayList;

public class StackableImpl<E> extends ArrayList<E> implements Stackable<E> {
	
	

	@Override
	public void push(E element) {
		assert element != null;	//Precondition
		super.add(super.size(),element);
		
		assert !isEmpty();	//Post Condition
		assert peek() == element;	//Post Condition
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		assert !isEmpty();	//Precondition
		E s = peek();
		E t = super.remove(super.size()-1);
		
		assert s == t;	//Post Condition
		
		return t;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
