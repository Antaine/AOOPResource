package ie.gmit.sw;

import java.util.Date;

public class DefaultTypeator implements Typeator{
	
	private String s;
	private Date d;
	

	public DefaultTypeator(String s, Date d) {
		super();
		this.s = s;
		setDate(d);
	}

	@Override
	public void setName(String s) {
		// TODO Auto-generated method stub
		this.s = s;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
		return this.s;
		
	}

	@Override
	public void setDate(Date d) {
		// TODO Auto-generated method stub
		this.d = copyDate(d);
		
	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return copyDate(this.d);
	}

	private Date copyDate(Date date)
	{
		return new Date(date.getTime()) ;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DefaultTypeator other = (DefaultTypeator) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
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