package jef.database.meta;

/**
 * 三种不同的实体和表的映射方式。
 * 
 * {@value NATIVE}<br>
 * {@value TUPLE}<br>
 * {@value POJO}<br>
 * @author jiyi
 *
 */
public enum EntityType {
	/**
	 * 原生的EF-ORM对象和表的映射方式。
	 */
	NATIVE,
	/**
	 * 动态的表映射方式。
	 */
	TUPLE,
	/**
	 * 没有实现IQueryableEntity接口的类和表的映射方式
	 */
	POJO
}
