package top.icdat.sqlbulider.builder;

public interface InsertSqlBuilder extends SqlBuilder {

    String INSERT = "INSERT INTO ";

    String VALUES = "VALUES";

    InsertSqlBuilder columns(String...columns);

    InsertSqlBuilder values(Object...values);

}
