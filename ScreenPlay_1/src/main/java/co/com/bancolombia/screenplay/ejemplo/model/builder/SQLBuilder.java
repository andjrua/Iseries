package co.com.bancolombia.screenplay.ejemplo.model.builder;

import co.com.bancolombia.screenplay.ejemplo.model.SQL;

public class SQLBuilder implements Builder<SQL> {

	private String query;
	private String type;
	private String db;
	private String table;
	private String where;
	
	public SQLBuilder(String query) { 
		this.query = query;
	}

	public static SQLBuilder query(String query) {
		return new SQLBuilder(query);
	}
	
	public SQLBuilder para(String type) {
		this.type = type;
		return this;
	}
	
	public SQLBuilder donde(String where) {
		this.where = where;
		return this;
	}
	
	public SQLBuilder en(String db) {
		this.db = db;
		return this;
	}
	
	public SQLBuilder tabla(String table) {
		this.table = table;
		return this;
	}
	
	@Override
	public SQL build() {
		return new SQL(query, type, db, table, where);
	}

}
