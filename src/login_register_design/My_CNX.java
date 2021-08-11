package login_register_design;

import com.sun.jdi.connect.spi.Connection;
import com.mysql.cj.jdbc;


public class My_CNX {
    
    private String servername  = "localhost";
    private String username    = "root";
    private String senha       = "";
    private String dbname      = " users_db";
    private Integer portnumber = 3306;
    
    public static Connection getConnection () 
    {
        Connection cnx = null;
        
        MysqlDatasource datasource = new MysqlDatasource();
        
        return cnx;
    }
    
}
