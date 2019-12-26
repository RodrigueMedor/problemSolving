package projectGFG;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{
	
	private Integer next = null;
	private Iterator<Integer> itr;
	
	
	public PeekingIterator(Iterator<Integer> itr) {
		
		if(itr.hasNext())
			next = itr.next();
		this.itr = itr;
	}

	@Override
	public boolean hasNext() {
		
		return next!=null;
	}

	@Override
	public Integer next() {
		Integer res = next;
		next = itr.hasNext() ? itr.next() : null;
		return res;
	}
	public Integer peek() {
		return next;
	}

}
