package org.dimhat.demo11;

import java.util.Hashtable;

//FlyweightFactory
public class SearchEngineFactory {
	private Hashtable<String, SearchEngine> searchEngines = new Hashtable<>();
	
	public SearchEngine getSearchEngine(String name) {
		SearchEngine searchEngine = searchEngines.get(name);
		if (searchEngine == null) {
			if ("mysql".equals(name)) {
				searchEngine = new MysqlSearchEngine();
				searchEngines.put(name, searchEngine);
			} else if ("solr".equals(name)) {
				searchEngine = new SolrSearchEngine();
				searchEngines.put(name, searchEngine);
			} else if ("es".equals(name)) {
				searchEngine = new EsSearchEngine();
				searchEngines.put(name, searchEngine);
			}
		}
		return searchEngine;
	}
}
