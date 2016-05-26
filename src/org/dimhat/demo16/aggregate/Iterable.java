package org.dimhat.demo16.aggregate;

import org.dimhat.demo16.iterator.Iterator;


//聚合 
public interface Iterable<T> {

	Iterator<T> iterator();

}
