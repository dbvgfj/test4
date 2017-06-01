package mysqlDao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;

import model.Guitar;
import model.GuitarSpec;

import model.Inventory;
import util.DBUtil;

public class UserDaoImpl implements UserDao{
	@Override
	//查找吉他
		public  Inventory Inventory()
		{
			Inventory inventory = new Inventory();
			Connection connection = DBUtil.getConnection();
			PreparedStatement pstat;
			ResultSet rs;
			try {
				pstat = connection.prepareStatement("select * from guitar");
				rs = pstat.executeQuery();
				while (rs.next()) {
					GuitarSpec spec = new GuitarSpec( null, null, null, null,null);
					spec.setBuilder(rs.getString("builder"));
					spec.setModel(rs.getString("model"));
					spec.setType(rs.getString("type"));
					spec.setTopWood(rs.getString("topWood"));
					spec.setBackWood(rs.getString("backWood"));
					inventory.addGuitar(rs.getString("serialNumber"), rs.getString("price"), spec);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return inventory;
		}
		
		
	//所有吉他	
		public List<Guitar> getAllGuitars(){
			Connection Conn = DBUtil.getConnection();
			String sql = "select * from Guitar";
			List<Guitar> inventory = new ArrayList<Guitar>();
			try {
				PreparedStatement pstmt = Conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					GuitarSpec spec = new GuitarSpec( null, null, null, null,null);
					spec.setBuilder(rs.getString("builder"));
					spec.setModel(rs.getString("model"));
					spec.setType(rs.getString("type"));
					spec.setTopWood(rs.getString("topWood"));
					spec.setBackWood(rs.getString("backWood"));				
					Guitar guitar = new Guitar(rs.getString("serialNumber"),rs.getString("price"),spec);
					inventory.add(guitar);				
				}			
				rs.close();
				pstmt.close();
				Conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} catch(Exception e){
			    e.printStackTrace();	
			}finally{
				try{
			         if(Conn!=null)
			        	 Conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }
			}
			return inventory;
		}
			
		
		//添加吉他
		public void addGuitar(String serialNumber, String price,
	            GuitarSpec spec) {
			String sql="insert into guitar(serialNumber,builder,price,model,type,backWood,topWood) values(?,?,?,?,?,?,?)";
			Connection conn=DBUtil.getConnection();
			
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setString(1, serialNumber);
				ps.setString(2, spec.getBuilder());
				ps.setString(3, price);
				ps.setString(4,spec.getModel());			
				ps.setString(5, spec.getType());
			    ps.setString(6, spec.getBackWood());	
			    ps.setString(7, spec.getTopWood());			
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
		
		
		//删除吉他
		 public void delGuitar(String serialNumber) {
				// TODO Auto-generated method stub
				String sql="delete from guitar where serialNumber=?";
				Connection conn=DBUtil.getConnection();
				
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, serialNumber);
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		

		
}
