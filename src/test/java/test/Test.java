package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		********************
//		*General Information
//		********************
//		服务器类型: PostgreSQL
//		连接名: payment_sit_pg
//		主机名或 IP 地址: 116.62.56.23
//		端口: 54321
//		默认数据库: pg_payment
//		用户名: postgres
//		保存密码: 是
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn= DriverManager.getConnection("jdbc:postgresql://116.62.56.23:54321/pg_payment", "postgres", "pg123456");	
			if(conn!=null) {
				System.out.println("success");
				PreparedStatement ps=	conn.prepareStatement("select string_agg(apply_no,',') from p_log");
				 ResultSet rs=ps.executeQuery();
				 while (rs.next()) {
					System.out.println(rs.getString(1));
				 }
				 rs.close();
				 ps.close();
				 conn.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
