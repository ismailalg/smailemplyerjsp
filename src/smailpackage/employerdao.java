package smailpackage;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.omg.CORBA.Request;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.ListOfArrayDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRException;


public class employerdao {
	
public static Connection conne(){
	Connection con=null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost/studentjsp","root","");
	
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	
	
	
	return con;	
}

public static int insert(employer e){
	Connection con=conne();
	int state=0;
	String sql="INSERT INTO `studentable`( `departement`, `service`, `nom`, `nature`, `panne`, `date`,`datetr`, `etat`, `observation`, `intervenant`) VALUES (?,?,?,?,?,?,?,?,?,?)";
	try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, e.getDepartement());
		pst.setString(2, e.getService());
		pst.setString(3, e.getNom());
		pst.setString(4, e.getNature());
		pst.setString(5, e.getPanne());
		pst.setString(6, e.getDate());
		pst.setString(7, e.getDatetr());
		pst.setString(8, e.getEtat());
		pst.setString(9, e.getObservation());
        pst.setString(10, e.getIntervenant());
		state=pst.executeUpdate();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	return state;
}

public static employer gettableid(int id){
	employer e=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `studentable` where id=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			e=new employer(); 
			e.setId(rs.getInt("id"));
			e.setDepartement(rs.getString("departement"));
			e.setService(rs.getString("service"));
			e.setNom(rs.getString("nom"));
			e.setNature(rs.getString("nature"));
			e.setPanne(rs.getString("panne"));
			e.setDate(rs.getString("Date"));
			e.setDatetr(rs.getString("Datetr"));
			e.setEtat(rs.getString("etat"));
			e.setObservation(rs.getString("observation"));
            e.setIntervenant(rs.getString("intervenant"));
			
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return e;
}
public static employer deletetableid(int id){
	employer e=null;
	
	Connection con=conne();
	//Integer x = JOptionPane.showConfirmDialog(null, "VOUS ETE SUR DE SUPPRIMER.?", "supprime", 0, 3);
   // if(x==0){
	String sql2="delete  FROM `studentable` where id=?";
	PreparedStatement pst;
	
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,id);
		pst.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	//}
    }
	
	
	
	return e;
}

public static List<employer> gettable(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `studentable`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setId(rs.getInt("id"));
			e.setDepartement(rs.getString("departement"));
			e.setService(rs.getString("service"));
			e.setNom(rs.getString("nom"));
			e.setNature(rs.getString("nature"));
			e.setPanne(rs.getString("panne"));
			e.setDate(rs.getString("Date"));
			e.setDatetr(rs.getString("Datetr"));
			e.setEtat(rs.getString("etat"));
			e.setObservation(rs.getString("observation"));
            e.setIntervenant(rs.getString("intervenant"));
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}


public static List<employer> getdepartement(){
	List<employer>lii=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `combo`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setId(rs.getInt("id"));
			e.setNom(rs.getString("nom"));
			
			lii.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return lii;
}

public static int update(employer f){

Connection con=conne();
int stat=0;

try {
	PreparedStatement pst=con.prepareStatement("UPDATE `studentable` SET `datetr`=?,`etat`=?,`observation`=?,`intervenant`=? WHERE id=?");

	pst.setString(1, f.getDatetr());
	pst.setString(2, f.getEtat());
	pst.setString(3, f.getObservation());
	pst.setString(4, f.getIntervenant());
	pst.setInt(5, f.getId());
	stat=pst.executeUpdate();
	
	
	
	} 
catch (Exception e1) {
	// TODO Auto-generated catch block
//	JOptionPane.showMessageDialog(null,"error insert data\n"+e1.getMessage() );
}

return stat;



}
public static List<employer> getdepartementt(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `departement`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setIdepartement(rs.getInt("idepartement"));
			e.setNdepartement(rs.getString("ndepartement"));
			
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}
public static int insertdepartement(employer e){
	Connection con=conne();
	int state=0;
	String sql="INSERT INTO `departement`(`ndepartement`) VALUES (?)";
	try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, e.getNdepartement());
		
		state=pst.executeUpdate();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	return state;
}


public static employer getdepid(int idepartement){
	employer e=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `departement` where idepartement=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idepartement);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			e=new employer(); 
			e.setIdepartement(rs.getInt("idepartement"));
			e.setNdepartement(rs.getString("ndepartement"));
			
			
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return e;
}

public static int updatedep(employer f){

Connection con=conne();
int stat=0;

try {
	PreparedStatement pst=con.prepareStatement("UPDATE `departement` SET `ndepartement`=? WHERE idepartement=?");
	pst.setString(1, f.getNdepartement());
	
	pst.setInt(2, f.getIdepartement());
	stat=pst.executeUpdate();
	//JOptionPane.showMessageDialog(null, +stat);
	//JOptionPane.showMessageDialog(null, " MODIFICATION AVEC SUCCEE");
//	System.out.print("youyou   "+f.getNom());
	} 
catch (Exception e1) {
	// TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null,"error insert data\n"+e1.getMessage() );
}

return stat;



}
public static employer deletedepid(int idepartement){
	employer e=null;
	
	Connection con=conne();
//	Integer x = JOptionPane.showConfirmDialog(null, "VOUS ETE SUR DE SUPPRIMER.?", "supprime", 0, 3);
   // if(x==0){
	String sql2="delete  FROM `departement` where idepartement=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idepartement);
		pst.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
   // }
	
	return e;
}



public static employer getdepn(String ndepartement){
	employer ee=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `departement` where ndepartement=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setString(1,ndepartement);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			ee=new employer(); 
			ee.setIdepartement(rs.getInt("idepartement"));
			ee.setNdepartement(rs.getString("ndepartement"));
			
			
		}
	
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return ee;
}









public static int insertemploye(employer e){
	Connection con=conne();
	int state=0;
	String sql="INSERT INTO `employe`(`nom`,`password`,`fonction`,`email`,`tel`,`type_user`) VALUES (?,?,?,?,?,?)";
	try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, e.getNom());
		pst.setString(2, e.getPassword());
		pst.setString(3, e.getFonction());
		pst.setString(4, e.getEmail());
		pst.setString(5, e.getTel());
		pst.setString(6, e.getType_user());
		state=pst.executeUpdate();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	return state;
}


public static List<employer> getemploye(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `employe`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setIdemploye(rs.getInt("idemploye"));
			e.setNom(rs.getString("nom"));
			e.setPassword(rs.getString("password"));
			e.setFonction(rs.getString("fonction"));
			e.setEmail(rs.getString("email"));
			e.setTel(rs.getString("tel"));
			e.setType_user(rs.getString("type_user"));
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}


public static employer getempid(int idemploye){
	employer e=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `employe` where idemploye=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idemploye);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			e=new employer(); 
			e.setIdemploye(rs.getInt("idemploye"));
			e.setNom(rs.getString("nom"));
			e.setPassword(rs.getString("password"));
			e.setFonction(rs.getString("fonction"));
			e.setEmail(rs.getString("email"));
			e.setTel(rs.getString("tel"));
			e.setType_user(rs.getString("type_user"));
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return e;
}



public static int updatemp(employer ff){

Connection con=conne();
int stat=0;

try {
	PreparedStatement pst=con.prepareStatement("UPDATE `employe` SET `nom`=?,`password`=?,`type_user`=?,`fonction`=?,`email`=?,`tel`=? WHERE idemploye=?");

	pst.setString(1, ff.getNom());
	pst.setString(2, ff.getPassword());
	pst.setString(3, ff.getType_user());
	pst.setString(4, ff.getFonction());
	pst.setString(5, ff.getEmail());
	pst.setString(6, ff.getTel());
	pst.setInt(7, ff.getIdemploye());
	stat=pst.executeUpdate();
	//JOptionPane.showMessageDialog(null, +stat);
	//JOptionPane.showMessageDialog(null, " MODIFICATION AVEC SUCCEE");
//	System.out.print("youyou   "+f.getNom());
	} 
catch (Exception e1) {
	// TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null,"error insert data\n"+e1.getMessage() );
}

return stat;



}



public static employer deletempid(int idemploye){
	employer e=null;
	
	Connection con=conne();
	//Integer x = JOptionPane.showConfirmDialog(null, "VOUS ETE SUR DE SUPPRIMER.?", "supprime", 0, 3);
    //if(x==0){
	String sql2="delete  FROM `employe` where idemploye=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idemploye);
		pst.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

 //   }
	
	
	return e;
}

public static List<employer> getservice(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `service`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setIdservice(rs.getInt("idservice"));
			e.setNservice(rs.getString("nservice"));
			e.setIdepartement(rs.getInt("Idepartement"));
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}

public static employer getserid(int idservice){
	employer e=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `service` where idservice=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idservice);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			e=new employer(); 
			e.setIdservice(rs.getInt("idservice"));
			e.setNservice(rs.getString("nservice"));
			
			
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return e;
}


public static employer deleteserid(int idservice){
	employer e=null;
	
	Connection con=conne();
	//Integer x = JOptionPane.showConfirmDialog(null, "VOUS ETE SUR DE SUPPRIMER.?", "supprime", 0, 3);
   // if(x==0){
	String sql2="delete  FROM `service` where idservice=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,idservice);
		
		pst.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	//}

	
    }
	
	return e;
}




public static int updateser(employer f){

	Connection con=conne();
	int stat=0;

	try {
		PreparedStatement pst=con.prepareStatement("UPDATE `service` SET `nservice`=? WHERE idservice=?");
		pst.setString(1, f.getNservice());
		
		pst.setInt(2, f.getIdservice());
		stat=pst.executeUpdate();
		
		//JOptionPane.showMessageDialog(null, " MODIFICATION AVEC SUCCEE");
//		System.out.print("youyou   "+f.getNom());
		} 
	catch (Exception e1) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null,"error insert data\n"+e1.getMessage() );
	}

	return stat;



	}
public static int insertservice(employer e){

	int stat=0;
	try { 
		
		Connection con=conne();
		String sql="INSERT INTO `service`(`idservice`, `nservice`,`idepartement`) VALUES (?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		
		
		pst.setInt(1, e.getIdservice());
		pst.setString(2, e.getNservice());
		String fff=e.getNdepartement();
		employer ee=employerdao.getdepn(fff);
		pst.setInt(3, ee.getIdepartement());
		
		stat=pst.executeUpdate();	
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}





	return stat;
	}

public static List<employer>gettabledate(employer ee){
	
 List<employer> l=new ArrayList<employer>(); 
 
	try {
		Connection con=conne();
		String sql="SELECT `id`, `departement`, `service`, `nom`, `nature`, `panne`, `date`, `datetr`, `etat`, `observation` FROM `studentable` WHERE date between ? and ? ";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, ee.getDate());
		pst.setString(2, ee.getDate2());
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
		employer eee=new employer()	;
		eee.setId(rs.getInt("id"));	
		eee.setDepartement(rs.getString("departement"));
		eee.setService(rs.getString("service"));
		eee.setNom(rs.getString("nom"));
		eee.setNature(rs.getString("nature" ));
		eee.setPanne(rs.getString("panne"));
		eee.setDate(rs.getString("date"));
		eee.setDatetr(rs.getString("datetr"));
		eee.setEtat(rs.getString("etat"));
		eee.setObservation(rs.getString("observation"));
		
		l.add(eee);	
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return l;	
}

public static int insertnature(employer e){
	int stat=0;
	Connection con=conne();
	String sql="INSERT INTO `nature`(`id_nature`, `type_nature`) VALUES (?,?)";
try {
	PreparedStatement pst=con.prepareStatement(sql);
	
	pst.setInt(1, e.getId_nature());
	pst.setString(2, e.getType_nature());
	stat=pst.executeUpdate();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}




	
	
	return stat;
}

public static List<employer> getnature(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `nature`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setId_nature(rs.getInt("id_nature"));
			e.setType_nature(rs.getString("type_nature"));
			
			
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}
public static int insertpanne(employer f){
	int stat=0;
	Connection con=conne();
	String sql="INSERT INTO `panne`(`id_panne`, `type_panne`) VALUES (?,?)";
try {
	PreparedStatement pst=con.prepareStatement(sql);
	
	pst.setInt(1,f.getId_panne());
	pst.setString(2, f.getType_panne());
	stat=pst.executeUpdate();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}




	
	
	return stat;
}

public static List<employer> getpanne(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `panne`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setId_panne(rs.getInt("id_panne"));
			e.setType_panne(rs.getString("type_panne"));
			
			
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}


public static List<employer>gettablenom(employer ee){
	
	 List<employer> l=new ArrayList<employer>(); 
	 
		try {
			Connection con=conne();
			String sql="SELECT `id`, `departement`, `service`, `nom`, `nature`, `panne`, `date`, `datetr`, `etat`, `observation` FROM `studentable` WHERE nom=? ";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, ee.getNom());
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
			employer eee=new employer()	;
			eee.setId(rs.getInt("id"));	
			eee.setDepartement(rs.getString("departement"));
			eee.setService(rs.getString("service"));
			eee.setNom(rs.getString("nom"));
			eee.setNature(rs.getString("nature" ));
			eee.setPanne(rs.getString("panne"));
			eee.setDate(rs.getString("date"));
			eee.setDatetr(rs.getString("datetr"));
			eee.setEtat(rs.getString("etat"));
			eee.setObservation(rs.getString("observation"));
			
			l.add(eee);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return l;	
	}

public static employer getnatureid(int id){
employer e=null;
	Connection con=conne();
	try {
		
		String sql="SELECT * FROM `nature` WHERE id_nature=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			
		 e=new employer();
		e.setId_nature(rs.getInt("id_nature"));
		e.setType_nature(rs.getString("type_nature"));
			
			
		}
	} catch (SQLException ee) {
		// TODO Auto-generated catch block
		ee.printStackTrace();
	}
	
	return e;
	
}




public static int updatenat(employer tt){
	int st=0;
	try {
		Connection con=conne();
		String sql="UPDATE `nature` SET `type_nature`=? WHERE id_nature=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, tt.getType_nature());
		pst.setInt(2, tt.getId_nature());
		st=pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return st;	
}
public static int deletenature(int id){
	int st=0;
	Connection con=conne();
	try {
		String sql="DELETE FROM `nature` WHERE id_nature=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		st=pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	return st;
}

public static employer getpanneid(int id){
employer e=null;
	Connection con=conne();
	try {
		
		String sql="SELECT * FROM `panne` WHERE id_panne=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			
		 e=new employer();
		e.setId_panne(rs.getInt("id_panne"));
		e.setType_panne(rs.getString("type_panne"));
			
			
		}
	} catch (SQLException ee) {
		// TODO Auto-generated catch block
		ee.printStackTrace();
	}
	
	return e;
	
}
public static int updatepanne(employer tt){
	int st=0;
	try {
		Connection con=conne();
		String sql="UPDATE `panne` SET `type_panne`=? WHERE id_panne=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, tt.getType_panne());
		pst.setInt(2, tt.getId_panne());
		st=pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return st;	
}
public static int deletepanne(int id){
	int st=0;
	Connection con=conne();
	try {
		String sql="DELETE FROM `panne` WHERE id_panne=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, id);
		st=pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	return st;
}


public static int connectuser(employer g){
	String ss=(String)g.getNom();
	String pass=(String)g.getPassword();
	String usertype=(String)g.getType_user();
	
	int st=0;
	Connection con=conne();
	try {
		String sql="select* from employe ";
		PreparedStatement pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
			
		while(rs.next()){
			if(ss.equals(rs.getString("nom")) & pass.equals(rs.getString("password"))){
				
				//  usertype.equals(rs.getString("admin"))
				//JOptionPane.showMessageDialog(null, "good admin");
				
				if(rs.getString("type_user").equalsIgnoreCase("admin")){
				//JOptionPane.showMessageDialog(null, "good admin");	
				st=10;
				rs.close();
				}
			
				else {
					if(rs.getString("type_user").equalsIgnoreCase("user")) 
					st=20;
					rs.close();
				}
			  
			  
				//if(ss.equals(rs.getString("nom")) & pass.equals(rs.getString("password"))& usertype.equals((rs.getString("type_user").equals("user")))){
				
			//	JOptionPane.showMessageDialog(null, "good user");	
				
			
			}
			
			
		}
		st=30;
		
		//JOptionPane.showMessageDialog(null, "user ou password incorrect");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	return st;
	
}

public static int insertintervenant(employer e){
	Connection con=conne();
	int state=0;
	String sql="INSERT INTO `table_intervenant`(`intervenant`,`fonction_inter`,`email_inter`,`tel_inter`) VALUES (?,?,?,?)";
	try {
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, e.getIntervenant());
		
		pst.setString(2, e.getFonction_inter());
		pst.setString(3, e.getEmail_inter());
		pst.setString(4, e.getTel_inter());
		
		state=pst.executeUpdate();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	return state;
}


public static List<employer> getintervenant(){
	List<employer>li=new ArrayList<employer>();
	Connection con=conne();
	String sql1="SELECT * FROM `table_intervenant`";
	try {
		PreparedStatement pst1=con.prepareStatement(sql1);
		ResultSet rs=pst1.executeQuery();
		while(rs.next()){
			employer e=new employer();
			e.setId_inter(rs.getInt("id_inter"));
			e.setIntervenant(rs.getString("intervenant"));
		    e.setFonction_inter(rs.getString("fonction_inter"));
			e.setEmail_inter(rs.getString("email_inter"));
			e.setTel_inter(rs.getString("tel_inter"));
		
			li.add(e);
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	return li;
}


public static employer getinterid(int id_inter){
	employer e=null;
	
	Connection con=conne();
	String sql2="SELECT * FROM `table_intervenant` where id_inter=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,id_inter);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			e=new employer(); 
			e.setId_inter(rs.getInt("id_inter"));
			e.setIntervenant(rs.getString("intervenant"));
			
			e.setFonction_inter(rs.getString("fonction_inter"));
			e.setEmail_inter(rs.getString("email_inter"));
			e.setTel_inter(rs.getString("tel_inter"));
			
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	
	
	
	return e;
}



public static int updatinter(employer f){
	
Connection con=conne();
int stat=0;

try {
	PreparedStatement pst=con.prepareStatement("UPDATE `table_intervenant` SET `intervenant`=?,`fonction_inter`=?,`email_inter`=?,`tel_inter`=? WHERE id_inter=?");
	
	
	pst.setString(1, f.getIntervenant());
	pst.setString(2, f.getFonction_inter());
	pst.setString(3, f.getEmail_inter());
	pst.setString(4, f.getTel_inter());
    pst.setInt(5, f.getId_inter());
    
    stat=pst.executeUpdate();
   // JOptionPane.showMessageDialog(null, " MODIFICATION AVEC SUCCEE");
	//JOptionPane.showMessageDialog(null, " MODIFICATION AVEC SUCCEE");

	} 
catch (Exception e1) {
	// TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null,"error insert data\n"+e1.getMessage() );
}

return stat;



}



public static employer deletinterid(int id_inter){
	employer e=null;
	
	Connection con=conne();
//	Integer x = JOptionPane.showConfirmDialog(null, "VOUS ETE SUR DE SUPPRIMER.?", "supprime", 0, 3);
  //  if(x==0){
	String sql2="delete  FROM `table_intervenant` where id_inter=?";
	PreparedStatement pst;
	try {
		pst = con.prepareStatement(sql2);
		pst.setInt(1,id_inter);
		pst.execute();
		
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

  //  }
	
	
	return e;
}

public static void rapport(int ff){
	
	Connection con=conne();
    try{   
       JasperDesign jsr=JRXmlLoader.load("d://report2.jrxml ");
    String sql="SELECT * FROM `studentable`,`table_intervenant`,`employe` WHERE"+
" employe.nom=studentable.nom and table_intervenant.intervenant=studentable.intervenant and  id='"+ff+"'";
    JRDesignQuery  newQuery=new JRDesignQuery();
    newQuery.setText(sql);
    jsr.setQuery(newQuery);
    JasperReport jasp=JasperCompileManager.compileReport(jsr);
    JasperPrint jp=JasperFillManager.fillReport(jasp,null, con);
    //JasperViewer.viewReport(jp);
    JRViewer jv=new JRViewer(jp);
JFrame jf=new JFrame();
jf.getContentPane().add(jv);
jf.validate();
jf.setVisible(true);
jf.setSize(new Dimension(1000,500) );
jf.setLocation(300,100);
jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//System.out.print("good");
}                                       
catch(JRException e){
JOptionPane.showMessageDialog(null, "verifier votre champs");
} 
	
	}
	 
	
	public static employer nbr_intervention(String g,String d,String dtr){
	employer ee=new employer();
		int sum=0;
		Connection con=conne();
		String sql="select count(*) as koko from studentable where intervenant='"+g+"'and date between'"+d+"'and'"+dtr+"'";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				
			 sum=Integer.parseInt(rs.getString("koko"));
				String sql2="update table_intervenant set nbr_intervention='"+sum+"'  where intervenant='"+g+"'";
				PreparedStatement pst2=con.prepareStatement(sql2);
				sum=pst2.executeUpdate();
				//System.out.print(sum);
				//JOptionPane.showMessageDialog(null, rs.getInt(sum));
		

				String ff="select* from table_intervenant where intervenant='"+g+"'";
				PreparedStatement pst3=con.prepareStatement(ff);
				ResultSet rs3=pst3.executeQuery();
			
				while(rs3.next()){
					
					
					ee.setNbr_intervention(rs3.getInt("nbr_intervention"));
					ee.setIntervenant(rs3.getString("intervenant"));
					
				    System.out.print(ee.getNbr_intervention());
				    System.out.print(ee.getIntervenant());
				
				}
				
			
			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	return ee;
		
		
	}
	


	public static List<employer> consult_all(String d,String dtr){
		List<employer>l=new ArrayList<employer>();
		employer ee=new employer();
			int sum=0;
			Connection con=conne();
			String ss="select* from table_intervenant";
			
			try {
				PreparedStatement pst=con.prepareStatement(ss);
				ResultSet rs=pst.executeQuery();
				while(rs.next()){
				
					String sql="select count(*) as koko from studentable where intervenant='"+rs.getString("intervenant")+"'and date between'"+d+"'and '"+dtr+"' ";
					PreparedStatement pst1=con.prepareStatement(sql);
					ResultSet rs1=pst1.executeQuery();
					if(rs1.next()){
					sum=Integer.parseInt(rs1.getString("koko"));
				//	System.out.println(""+sum);
					
					String sql2="update table_intervenant set nbr_intervention='"+sum+"'  where intervenant='"+rs.getString("intervenant")+"'";
					PreparedStatement pst2=con.prepareStatement(sql2);
					sum=pst2.executeUpdate();
					//System.out.print(sum);
					//JOptionPane.showMessageDialog(null, rs.getInt(sum));
			
					}
					String ff="select* from table_intervenant where intervenant='"+rs.getString("intervenant")+"'";
					PreparedStatement pst3=con.prepareStatement(ff);
					ResultSet rs3=pst3.executeQuery();
				
					while(rs3.next()){
						
						employer eee=new employer();
						eee.setNbr_intervention(rs3.getInt("nbr_intervention"));
						eee.setIntervenant(rs3.getString("intervenant"));
						
					  //  System.out.print(ee.getNbr_intervention());
					  //System.out.println("----"+ee.getIntervenant());
						l.add(eee);
					}
				
				
				
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		return l;
			
			
		}
			

	public static void stat_intervenant(){
		
	Connection con=conne();
	    try{   
	       JasperDesign jsr=JRXmlLoader.load("C:\\report1.jrxml");
	    String sql="SELECT * FROM table_intervenant ";
	    JRDesignQuery  newQuery=new JRDesignQuery();
	    newQuery.setText(sql);
	    jsr.setQuery(newQuery);
	    JasperReport jasp=JasperCompileManager.compileReport(jsr);
	    JasperPrint jp=JasperFillManager.fillReport(jasp,null, con);
	    //JasperViewer.viewReport(jp);
	    JRViewer jv=new JRViewer(jp);
	JFrame jf=new JFrame();
	jf.getContentPane().add(jv);
	jf.validate();
	jf.setVisible(true);
	jf.setSize(new Dimension(1000,500) );
	jf.setLocation(300,100);
	jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	System.out.print("good");
	}                                       
	catch(JRException e){
	JOptionPane.showMessageDialog(null, "no report");
	} 
		
		}
		 
}
