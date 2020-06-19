package top.icdat.sqlbulider;

import top.icdat.sqlbulider.db.SqlServerSqlBuilderFactory;

public class SqlFactory {

    public static SqlServerSqlBuilderFactory sqlServer() {
        return SqlServerSqlBuilderFactory.getFactory();
    }

}
