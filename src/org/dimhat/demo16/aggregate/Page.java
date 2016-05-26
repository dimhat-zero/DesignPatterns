package org.dimhat.demo16.aggregate;

import java.util.List;

import org.dimhat.demo16.iterator.Iterator;
import org.dimhat.demo16.iterator.PageItr;

public class Page<E> implements Iterable<E> {

	private List<E> list;

	public void setList(List<E> list) {
		this.list = list;
	}

	@Override
	public Iterator<E> iterator() {
		return new PageItr<E>(this);
	}

	public int size() {
		return list.size();
	}

	public E getItem(int i) {
		return list.get(i);
	}

	public void removeItem(int i) {
		list.remove(i);
	}

}
