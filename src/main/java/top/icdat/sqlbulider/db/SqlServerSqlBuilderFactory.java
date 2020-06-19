package top.icdat.sqlbulider.db;

import top.icdat.sqlbulider.builder.DeleteSqlBuilder;
import top.icdat.sqlbulider.builder.InsertSqlBuilder;
import top.icdat.sqlbulider.builder.SelectSqlBuilder;
import top.icdat.sqlbulider.builder.UpdateSqlBuilder;
import top.icdat.sqlbulider.builder.sqlserver.SqlServerInsertSqlBuilder;

public class SqlServerSqlBuilderFactory implements SqlBuilderFactory {

    private SqlServerSqlBuilderFactory() {

    }

    public static  SqlServerSqlBuilderFactory getFactory() {
        return SingletonHolder.FACTORY;
    }

    private static class SingletonHolder {

        private static final SqlServerSqlBuilderFactory FACTORY = new SqlServerSqlBuilderFactory();

    }

    @Override
    public SqlServerInsertSqlBuilder insert() {
        return SqlServerInsertSqlBuilder.builder();
    }

    @Override
    public UpdateSqlBuilder update() {
        return null;
    }

    @Override
    public DeleteSqlBuilder delete() {
        return null;
    }

    @Override
    public SelectSqlBuilder select() {
        return null;
    }
}
