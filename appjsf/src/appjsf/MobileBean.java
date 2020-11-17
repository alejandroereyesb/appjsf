package appjsf;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mobilerecords", eager = true)
@SessionScoped
public class MobileBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public ArrayList<Mobile> getMobiles() throws ClassNotFoundException, SQLException {
		
		Connection connect = null;
		String url = "jdbc:mysql://localhost:3306/bbdd";
		String username = "root";
		String password = "";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url, username, password);
		} catch (SQLException ex) {
			System.out.println("in exec");
			System.out.println(ex.getMessage());
		}
		
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		
		PreparedStatement pstmt = connect
				.prepareStatement("select cname,model,color,quantity,price,url from Mobile");
		ResultSet rs = pstmt.executeQuery();
	
		while (rs.next()) {
			Mobile m = new Mobile();
			m.setCompanyname(rs.getString("cname"));
			m.setModelnumber(rs.getString("model"));
			m.setColor(rs.getString("color"));
			m.setQuantity(rs.getInt("quantity"));
			m.setPrice(rs.getInt("price"));
			m.setUrl(rs.getString("url"));
	
			mobiles.add(m);
		}
		// close resources
		rs.close();
		pstmt.close();
		connect.close();
	
		return mobiles;
	}
}
