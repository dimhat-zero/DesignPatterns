package org.dimhat.demo11;

public class EsSearchEngine extends SearchEngine {

	@Override
	public void search(String keys) {
		System.out.println("search [" + keys + "] in es");
	}

}
