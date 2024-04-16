package dbSample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    //データべース接続と結果取得のための変数
    private static Connection con;
    
    public static Connection getConnection()throws SQLException,ClassNotFoundException {
    //1.ドライバのクラスをjava上で読み込む
    Class.forName("com.mysql.cj.jdbc.Driver");
    //DBと接続する
    con=DriverManager.getConnection(
        "jdbc:mysql://localhost/world?useSSL=false&allowPublickeyRetrieval=true",
        "root",
        "Jlca7209@mt5sdw"
        );
     return con;
    }
    public static void close() {
        //7.接続を閉じる
        if(con !=null) {
            try {
                con.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
