package org.chenile.samples.issue.bdd.store;

import java.util.HashMap;
import java.util.Map;

import org.chenile.utils.entity.service.EntityStore;
import org.chenile.samples.issue.model.Issue;

/**
 * Instantiation of a dummy entity store for the purpose of testing.
 * Uses In Memory Hash maps to store the data.
 * This store is instantiated only for unit testing purposes
 * @author 
 *
 */
public class DummyIssueEntityStore implements EntityStore<Issue>{
	private Map<String, Issue> theStore = new HashMap<>();
	/**
	 *  predictable ID to use in a unit test case
	 */
	public static final String ID = "dummy";
	@Override
	public void store(Issue entity) {
		if (entity.getId() == null) {
			entity.setId(ID);
		}
		theStore.put(entity.getId(), entity);		
	}

	@Override
	public Issue retrieve(String id) {
		return theStore.get(id);
	}

}
