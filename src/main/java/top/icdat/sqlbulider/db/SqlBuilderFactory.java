package top.icdat.sqlbulider.db;

import top.icdat.sqlbulider.builder.DeleteSqlBuilder;
import top.icdat.sqlbulider.builder.InsertSqlBuilder;
import top.icdat.sqlbulider.builder.SelectSqlBuilder;
import top.icdat.sqlbulider.builder.UpdateSqlBuilder;

public interface SqlBuilderFactory {

    InsertSqlBuilder insert();

    UpdateSqlBuilder update();

    DeleteSqlBuilder delete();

    SelectSqlBuilder select();

}
