package top.icdat.sqlbulider.component;

public class Table {

    private String table;

    private Table(String table) {
        this.table = table;
    }

    public static Table of(String table) {
        return new Table(table);
    }



}
