/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthomeoracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Deval Nayak
 */
 public class Insertdata implements DBFunctionInterface{
    public int insertnewuser(String usid,String Fname,String Lname,String PAN,String Adhar,String Usnumber){
          try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into Userdetail values('"+usid+"',trim('"+Fname+"'),trim('"+Lname+"'),trim('"+PAN+"'),trim('"+Adhar+"'),trim('"+Usnumber+"'))";
            st.executeUpdate(qr);
            System.out.println("USER DETAILS ENTERED");
            cn.close();
            }
           catch(Exception e){
            System.out.println("USER DETAILS NOT ENTERED "+e.getMessage());
            }
        return 1;
    }
     
    public int insertuserfolder(String usid,String folderpath){
          try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into docpath values('"+usid+"','"+folderpath+"')";
            st.executeUpdate(qr);
            System.out.println("USER DETAILS ENTERED");
            cn.close();
            }
           catch(Exception e){
            System.out.println("USER DETAILS NOT ENTERED "+e.getMessage());
            }
        return 1;
    }
    
    public int insertaccdetail(String accno,String ifsc,String bankname,String USID,String Accountholder,String debitcard,String Basebranch,String mic){
          try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into accountdetail values('"+accno+"','"+ifsc+"','"+bankname+"','"+Accountholder+"','"+USID+"','"+debitcard+"','"+Basebranch+"','"+mic+"')";
            st.executeUpdate(qr);
            System.out.println("USER DETAILS ENTERED");
            }
           catch(Exception e){
            System.out.println("USER DETAILS NOT ENTERED "+e.getMessage());
            }
        return 1;
    }
    
    public int insertkhata(int khatano){
         try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into khata values(khatano="+khatano+")";
            st.executeUpdate(qr);
            System.out.println("KHATA DETAILS ENTERED");
            }
           catch(Exception e){
            System.out.println("KHATA DETAILS NOT ENTERED "+e.getMessage());
            }
        return 1;
    }
    
    public int insertelectriccon(String ConnNum,String ConsumerName,String MeterNum,String Location,String USID){
         try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into elecon values('"+ConnNum+"','"+ConsumerName+"','"+MeterNum+"','"+Location+"','"+USID+"')";
            st.executeUpdate(qr);
            System.out.println("ELECTRIC DETAILS ENTERED");
            }
           catch(Exception e){
            System.out.println("ELECTRIC DETAILS NOT ENTERED "+e.getMessage());
            }
        return 1;
    }
    
      public int insertrelatedlinks(int count,String Bankname,String Relatedlink){
         try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into links values("+count+",'"+Bankname+"','"+Relatedlink+"')";
            st.executeUpdate(qr);
            System.out.println("LINK ENTERED");
            }
           catch(Exception e){
            System.out.println("LINK NOT SUBMITTED "+e.getMessage());
            }
        return 1; 
         
     }
      
      
       public int insertkhatavillage(int khatano,String Village,int Seleddrno){
         try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
            Statement st=cn.createStatement();
            String qr="insert into khatano values("+khatano+",'"+Village+"',"+Seleddrno+")";
            st.executeUpdate(qr);
            System.out.println("KhataNO ENTERED");
            }
           catch(Exception e){
            System.out.println("KhataNO NOT SUBMITTED "+e.getMessage());
            }
        return 1; 
         
     }
  
    @Override
    public String searchuser(String X, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchdocument(String X) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateuserdetail(String usid, String Fname, String Lname, String PAN, String Adhar, String Usnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateuserfolder(String usid, String Docpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchaccount(String accno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateaccdetail(String accno, String ifsc, String bankname, String USID, String Accountholder, String debitcard, String Basebranch, String mic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchallkhata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchelecon(String eleconno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchlink(String institution) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchlinkcount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchkhatanoSELE(int khatano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
 }

