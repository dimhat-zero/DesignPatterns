package org.dimhat.demo16.iterator;

import org.dimhat.demo16.aggregate.Page;

public class PageItr<E> implements Iterator<E> {
	
	private Page<E> page;
	
	public PageItr(Page<E> page) {
		super();
		this.page = page;
	}

	private int cursor;// 当前

	@Override
	public E next() {
		int i = cursor;
		if (i >= page.size()) {
			return null;
		}
		cursor = i + 1;
		return page.getItem(i);
	}

	@Override
	public boolean hasNext() {
		return cursor < page.size();
	}

	@Override
	public void remove() {
		page.removeItem(cursor);
	}

}
