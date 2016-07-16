/*
 * Copyright 2008-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.geequery.springdata.repository.query;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.data.repository.query.Parameters;
import org.springframework.data.repository.query.QueryCreationException;
import org.springframework.data.repository.query.RepositoryQuery;

/**
 * Implementation of {@link RepositoryQuery} based on {@link javax.persistence.NamedQuery}s.
 * 
 * @author Oliver Gierke
 * @author Thomas Darimont
 */
final class NamedQuery extends AbstractGqQuery {

	/**
	 * Creates a new {@link NamedQuery}.
	 */
	private NamedQuery(GqQueryMethod method, EntityManager em) {

		super(method, em);

//		this.queryName = method.getNamedQueryName();
//		this.countQueryName = method.getNamedCountQueryName();
//		this.extractor = method.getQueryExtractor();
//		this.countProjection = method.getCountQueryProjection();
//
//		Parameters<?, ?> parameters = method.getParameters();
//
//		if (parameters.hasSortParameter()) {
//			throw new IllegalStateException(String.format("Finder method %s is backed " + "by a NamedQuery and must "
//					+ "not contain a sort parameter as we cannot modify the query! Use @Query instead!", method));
//		}
//
//		this.namedCountQueryIsPresent = hasNamedQuery(em, countQueryName);
//
//		boolean weNeedToCreateCountQuery = !namedCountQueryIsPresent && method.getParameters().hasPageableParameter();
//		boolean cantExtractQuery = !this.extractor.canExtractQuery();
//
//		if (weNeedToCreateCountQuery && cantExtractQuery) {
//			throw QueryCreationException.create(method, CANNOT_EXTRACT_QUERY);
//		}
//
//		if (parameters.hasPageableParameter()) {
//			LOG.warn("Finder method {} is backed by a NamedQuery" + " but contains a Pageable parameter! Sorting delivered "
//					+ "via this Pageable will not be applied!", method);
//		}
	}

	@Override
	protected Query doCreateQuery(Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Query doCreateCountQuery(Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}


}
