package org.dimhat.demo11;

/**
 * 享元
 * <p>
 * 共享相同对象
 * </p>
 * 
 * @author dimhat
 * @date 2016年5月25日 下午3:48:18
 */
public class Main {

	public static void main(String[] args) {
		SearchEngineFactory factory = new SearchEngineFactory();
		SearchEngine searchEngine1 = factory.getSearchEngine("mysql");
		searchEngine1.search("关键词");
		SearchEngine searchEngine2 = factory.getSearchEngine("solr");
		searchEngine2.search("关键词");
		SearchEngine searchEngine3 = factory.getSearchEngine("es");
		searchEngine3.search("关键词");
		SearchEngine searchEngine4 = factory.getSearchEngine("solr");
		searchEngine4.search("关键词");

		System.out.println(searchEngine1.equals(searchEngine4));
		System.out.println(searchEngine2.equals(searchEngine4));

	}

}
