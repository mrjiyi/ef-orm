/*
 * Copyright 2008-2016 the original author or authors.
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
package com.github.geequery.springdata.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.data.annotation.QueryAnnotation;

/**
 * 注解，描述一个查询请求语言
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@QueryAnnotation
@Documented
public @interface Query {

	/**
	 * Defines the GeeQuery query to be executed when the annotated method is called.
	 */
	String value() default "";

	/**
	 * Defines a special count query that shall be used for pagination queries to lookup the total number of elements for
	 * a page. If non is configured we will derive the count query from the method name.
	 */
	String countQuery() default "";

	/**
	 * Defines the projection part of the count query that is generated for pagination. If neither {@link #countQuery()}
	 * not {@link #countProjection()} is configured we will derive the count query from the method name.
	 * 
	 * @return
	 * @since 1.6
	 */
	String countProjection() default "";

	/**
	 * Configures whether the given query is a native one. Defaults to {@literal false}.
	 */
	boolean nativeQuery() default false;

	/**
	 * The named query to be used. If not defined, a {@link javax.persistence.NamedQuery} with name of
	 * {@code $ domainClass}.${queryMethodName}} will be used.
	 */
	String name() default "";

	/**
	 * Returns the name of the {@link javax.persistence.NamedQuery} to be used to execute count queries when pagination is
	 * used. Will default to the named query name configured suffixed by {@code .count}.
	 * 
	 * @see #name()
	 * @return
	 */
	String countName() default "";
}
