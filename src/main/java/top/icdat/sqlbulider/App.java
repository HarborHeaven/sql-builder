package top.icdat.sqlbulider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String sql = SqlFactory.sqlServer()
                .insert()
                .table("user")
                .columns("name","id","sex")
                .values("kissli",1,"male")
                .values("kissli",2,"male")
                .build();
        System.out.println(sql);

    }
}
