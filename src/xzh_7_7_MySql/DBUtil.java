package xzh_7_7_MySql;
import java.sql.*;
public class DBUtil{
   public static final String DBDRIVER="org.gjt.mm.mysql.Driver";
   public static final String DBURL="jdbc:mysql://localhost:3306/thirdproject?characterEncoding=utf-8";
   public static final String DBUSER="root";
   public static final String DBPASS="xzhxzh";
   private static Connection conn=null;
   static{  try{
       Class.forName(DBDRIVER);
       conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        
            }catch(Exception e){}
     }
   /*public DBUtil(){
          try{
                Class.forName(DBDRIVER);
                this.conn=DriverManager.getConnection(DBURL,DBUSER,DBPASS);
                 
          }catch(Exception e){}
   } */
   public static Connection getConnection(){
           return conn;
      }
   
	   
	   
	   
	   
   
   public void close(){
     if(conn!=null){
       try{  conn.close();

         }catch(Exception e){}

       }
   }
}