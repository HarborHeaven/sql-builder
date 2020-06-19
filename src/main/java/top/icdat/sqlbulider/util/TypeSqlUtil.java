package top.icdat.sqlbulider.util;

import top.icdat.sqlbulider.exception.SqlException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeSqlUtil {

    public static String toSqlString(Object o) {
        Class<?> clz = o.getClass();
        if (
                Integer.class.equals(clz)
                || Byte.class.equals(clz)
                || Short.class.equals(clz)
                || Long.class.equals(clz)
                || Float.class.equals(clz)
                || Double.class.equals(clz)
        ) {
            return o.toString();
        } else if (Character.class.equals(clz)) {
            return "'"+o.toString()+"'";
        } else if(String.class.equals(clz)) {
            return "'"+o.toString()+"'";
        } else if(Boolean.class.equals(clz)) {
            return o.toString();
        } else if(Date.class.equals(clz)) {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format((Date)o);
        } else {
            throw new SqlException("Cannot convert type ["+o.getClass().getName()+"] for SQL");
        }
    }

}
