package co.com.bancolombia.screenplay.ejemplo.model;

public class SQL {

	private final String sql;
	public String whereq;
	public String typeq;
	
	public SQL(String query, String type, String db, String table, String where) {
		if(where.equals("")) {
			whereq="";
		} else {
			whereq= " WHERE " +where;
		}
		if(type.equals("")) {
			typeq="";
		} else {
			typeq=type;
		}
		sql =  query + " " + typeq + " FROM " + db + "." + table + whereq;
		
	}
	public String getSql() {
		return sql;
	}

}
