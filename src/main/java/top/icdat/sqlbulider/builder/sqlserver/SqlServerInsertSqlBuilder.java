package top.icdat.sqlbulider.builder.sqlserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.icdat.sqlbulider.builder.InsertSqlBuilder;
import top.icdat.sqlbulider.db.SqlServerSqlBuilderFactory;
import top.icdat.sqlbulider.exception.SqlException;
import top.icdat.sqlbulider.util.TypeSqlUtil;

import java.util.ArrayList;
import java.util.List;

public class SqlServerInsertSqlBuilder implements InsertSqlBuilder {

    private Logger log = LoggerFactory.getLogger(SqlServerSqlBuilderFactory.class);

    private String table;

    private String[] columns;

    private final List<Object[]> values = new ArrayList<>();

    private SqlServerInsertSqlBuilder() {
    }

    public static SqlServerInsertSqlBuilder builder() {
        return new SqlServerInsertSqlBuilder();
    }

    @Override
    public String build() {
        StringBuilder sb = new StringBuilder(INSERT);
        sb.append(table).append("(");
        for(String column: columns) {
            sb.append(column);
        }
        sb.append(") ");
        values.forEach(objects -> {
            if (objects.length!=columns.length) {
                log.error("插入的列数与值数不匹配");
                throw new SqlException("The count of columns cannot match the count of values.");
            } else {
                sb.append(VALUES).append("(");
                for(Object value: objects) {
                    sb.append(TypeSqlUtil.toSqlString(value)).append(",");
                }
                sb.deleteCharAt(sb.length()-1).append(")").append(",");
            }
        });
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    @Override
    public SqlServerInsertSqlBuilder table(String table) {
        this.table = table;
        return this;
    }

    @Override
    public SqlServerInsertSqlBuilder columns(String... columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public SqlServerInsertSqlBuilder values(Object... values) {
        this.values.add(values);
        return this;
    }
}
