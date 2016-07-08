///*
// * Copyright 2016 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.github.geequery.springdata.provider;
//
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.List;
//
//import org.hibernate.Query;
//import org.springframework.util.ClassUtils;
//import org.springframework.util.ReflectionUtils;
//
///**
// * Utility functions to work with Hibernate. Mostly using reflection to make sure common functionality can be executed
// * against all the Hibernate version we support.
// * 
// * @since 1.10.2
// * @soundtrack Benny Greb - Soulfood (Live, https://www.youtube.com/watch?v=9_ErMa_CtSw)
// */
//@SuppressWarnings({ "deprecation", "rawtypes" })
//public abstract class HibernateUtils {
//
//	private static final List<String> TYPES = Arrays.asList("org.hibernate.jpa.HibernateQuery",
//			"org.hibernate.ejb.HibernateQuery");
//	private static final Method GET_HIBERNATE_QUERY;
//
//	private HibernateUtils() {}
//
//	static {
//
//		Class<?> type = null;
//		Method method = null;
//
//		for (String typeName : TYPES) {
//			try {
//				type = ClassUtils.forName(typeName, HibernateUtils.class.getClassLoader());
//				method = type.getMethod("getHibernateQuery");
//			} catch (Exception o_O) {}
//		}
//
//		GET_HIBERNATE_QUERY = method;
//	}
//
//	/**
//	 * Return the query string of the underlying native Hibernate query.
//	 * 
//	 * @param query
//	 * @return
//	 */
//	public static String getHibernateQuery(Object query) {
//		return ((Query) ReflectionUtils.invokeMethod(GET_HIBERNATE_QUERY, query)).getQueryString();
//	}
//}
