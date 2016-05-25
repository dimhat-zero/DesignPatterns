package org.dimhat.demo11;

public class SolrSearchEngine extends SearchEngine {

	@Override
	public void search(String keys) {
		System.out.println("search [" + keys + "] in solr");
	}

}
