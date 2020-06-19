package top.icdat.sqlbulider.builder;

import top.icdat.sqlbulider.component.Table;

public interface SqlBuilder {

    String build();

    SqlBuilder table(String table);

}
