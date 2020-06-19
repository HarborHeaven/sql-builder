package top.icdat.sqlbulider.builder;

import top.icdat.sqlbulider.component.Table;

public interface TableJoinable {

    SqlBuilder table(Table table);

}
