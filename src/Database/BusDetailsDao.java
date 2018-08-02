package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BusDetailsDao {

  
public static int save(String callno,String name,String author,String publisher,int quantity, int iquantity, String date,String dtime){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into bus_details(bus_no, source, destination, total_seat, available_seat, booked_seat, updated_date, bus_time) values(?,?,?,?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		ps.setInt(6,iquantity);
		ps.setString(7,date);
		ps.setString(8,dtime);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
