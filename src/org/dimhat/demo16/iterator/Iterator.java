package org.dimhat.demo16.iterator;

public interface Iterator<E> {

	E next();

	boolean hasNext();

	void remove();

}
