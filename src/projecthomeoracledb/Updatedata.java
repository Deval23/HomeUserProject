/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthomeoracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Deval Nayak
 */
public class Updatedata implements DBFunctionInterface{
    public int updateuserdetail(String usid,String Fname,String Lname,String PAN,String Adhar,String Usnumber){
         try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
            Statement st=cn.createStatement();
            String qr="update Userdetail set UFNAME=trim('"+Fname+"'),ULNAME=trim('"+Lname+"'),UPAN=trim('"+PAN+"'),UADHAR=trim('"+Adhar+"'),UCONTACT=trim('"+Usnumber+"') where USID='"+usid+"'";
            st.executeUpdate(qr);
            cn.close();
        }
        catch(Exception e){
            
        }
        return 1;
    }
    
    public int updateuserfolder(String usid,String Docpath){
         try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
            Statement st=cn.createStatement();
            String qr="update docpath set FOLDERPATH='"+Docpath+"' where USID='"+usid+"'";
            st.executeUpdate(qr);
            cn.close();
        }
        catch(Exception e){
            
        }
        return 1;
    }

    
    public int updateaccdetail(String accno,String ifsc,String bankname,String Accountholder,String USID,String debitcard,String Basebranch,String mic){
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
            Statement st=cn.createStatement();
            String qr="update accountdetail set ACCIFSC='"+ifsc+"',BANKNAME='"+bankname+"',ACCHOLDER='"+Accountholder+"',USID='"+USID+"',DEBITCARD='"+debitcard+"',BASEBRANCH='"+Basebranch+"',MICR='"+mic+"' where ACCNO='"+accno+"'";
            st.executeUpdate(qr);
            cn.close();
        }
        catch(Exception e){
            
        }
        
        return 1;
    }
    
    @Override
    public int insertnewuser(String usid, String Fname, String Lname, String PAN, String Adhar, String Usnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertuserfolder(String usid, String folderpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public int insertaccdetail(String accno, String ifsc, String bankname, String USID, String Accountholder, String debitcard, String Basebranch, String mic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchaccount(String accno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertkhata(int khatano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchallkhata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertelectriccon(String ConnNum, String ConsumerName, String MeterNum, String Location, String USID) {
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
    public int insertrelatedlinks(int count, String Bankname, String Relatedlink) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertkhatavillage(int khatano, String Village, int Seleddrno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchkhatanoSELE(int khatano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
