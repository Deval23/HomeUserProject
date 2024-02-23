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

/**
 *
 * @author Deval Nayak
 */
public class SearchData implements DBFunctionInterface {
   
    public String searchuser(String X,int y){
        String UID=null,UNAME=null,ULNAM=null,PAN=null,ADHAR=null,CONTACT=null;
        int cas=y;
        switch(cas){
                  case 1:{
                           try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from userdetail where UCONTACT='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UNAME=rs.getString("UFNAME");
                                 ULNAM=rs.getString("ULNAME");
                                 PAN=rs.getString("UPAN");
                                 ADHAR=rs.getString("UADHAR");
                                 CONTACT=rs.getString("UCONTACT");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("UFNAME")+"|"+rs.getString("ULNAME")+"|"+rs.getString("UPAN")+"|"+rs.getString("UADHAR")+"|"+rs.getString("UCONTACT"));
                                 }
                                  return UID+"|"+UNAME+"|"+ULNAM+"|"+PAN+"|"+ADHAR+"|"+CONTACT;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
                           
                         }
                  
                  case 2:{
                           try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from userdetail where UADHAR='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UNAME=rs.getString("UFNAME");
                                 ULNAM=rs.getString("ULNAME");
                                 PAN=rs.getString("UPAN");
                                 ADHAR=rs.getString("UADHAR");
                                 CONTACT=rs.getString("UCONTACT");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("UFNAME")+"|"+rs.getString("ULNAME")+"|"+rs.getString("UPAN")+"|"+rs.getString("UADHAR")+"|"+rs.getString("UCONTACT"));
                                 }
                                  return UID+"|"+UNAME+"|"+ULNAM+"|"+PAN+"|"+ADHAR+"|"+CONTACT;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
                         }
                   case 3:{
                           try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from userdetail where UFNAME='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UNAME=rs.getString("UFNAME");
                                 ULNAM=rs.getString("ULNAME");
                                 PAN=rs.getString("UPAN");
                                 ADHAR=rs.getString("UADHAR");
                                 CONTACT=rs.getString("UCONTACT");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("UFNAME")+"|"+rs.getString("ULNAME")+"|"+rs.getString("UPAN")+"|"+rs.getString("UADHAR")+"|"+rs.getString("UCONTACT"));
                                 }
                                  return UID+"|"+UNAME+"|"+ULNAM+"|"+PAN+"|"+ADHAR+"|"+CONTACT;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
                         }
                   case 4:{
                           try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from userdetail where ULNAME='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UNAME=rs.getString("UFNAME");
                                 ULNAM=rs.getString("ULNAME");
                                 PAN=rs.getString("UPAN");
                                 ADHAR=rs.getString("UADHAR");
                                 CONTACT=rs.getString("UCONTACT");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("UFNAME")+"|"+rs.getString("ULNAME")+"|"+rs.getString("UPAN")+"|"+rs.getString("UADHAR")+"|"+rs.getString("UCONTACT"));
                                 }
                                  return UID+"|"+UNAME+"|"+ULNAM+"|"+PAN+"|"+ADHAR+"|"+CONTACT;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
                         }
                   case 5:{
                           try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from userdetail where UPAN='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UNAME=rs.getString("UFNAME");
                                 ULNAM=rs.getString("ULNAME");
                                 PAN=rs.getString("UPAN");
                                 ADHAR=rs.getString("UADHAR");
                                 CONTACT=rs.getString("UCONTACT");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("UFNAME")+"|"+rs.getString("ULNAME")+"|"+rs.getString("UPAN")+"|"+rs.getString("UADHAR")+"|"+rs.getString("UCONTACT"));
                                 }
                                  return UID+"|"+UNAME+"|"+ULNAM+"|"+PAN+"|"+ADHAR+"|"+CONTACT;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
                         }
                    }
      return "DEFAULTED";
     }
    
    
    
    
     public String searchdocument(String X){
     String UID,UPATH=null;
     try{    
                                 Class.forName("oracle.jdbc.driver.OracleDriver");
                                 Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                                 Statement st=cn.createStatement();
                                 String str="Select * from docpath where USID='"+X+"'";
                                 ResultSet rs=st.executeQuery(str);
                                 while(rs.next()){
                                 UID=rs.getString("USID");
                                 UPATH=rs.getString("FOLDERPATH");
                                 System.out.println(rs.getString("USID")+"|"+rs.getString("FOLDERPATH"));
                                 }
                                  return UPATH;
                              }
                            catch(Exception e){
                                   System.out.println("CONNECT THE ORACLE DB FIRST");
                              } 
               return UPATH;
     
     }
     
     public String searchaccount(String accno){
         String acifsc=null,accbankname=null,acchold=null,acusid=null,debitcard=null,basebranch=null,micrcod=null;
         try{    
                       
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                    Statement st=cn.createStatement();
                    String str="Select * from accountdetail where ACCNO='"+accno+"'";
                    ResultSet rs=st.executeQuery(str);
                    while(rs.next()){
                      acifsc=rs.getString("ACCIFSC");
                      accbankname=rs.getString("BANKNAME");
                      acchold=rs.getString("ACCHOLDER");
                      acusid=rs.getString("USID");
                      debitcard=rs.getString("DEBITCARD");
                      basebranch=rs.getString("BASEBRANCH");
                      micrcod=rs.getString("MICR");
                      System.out.println(accno+"|"+acifsc+"|"+accbankname+"|"+acchold+"|"+acusid+"|"+debitcard+"|"+basebranch+"|"+micrcod);
                      }
                         return accno+"|"+acifsc+"|"+accbankname+"|"+acchold+"|"+acusid+"|"+debitcard+"|"+basebranch+"|"+micrcod;
                    }
                    catch(Exception e){
                        System.out.println("CONNECT THE ORACLE DB FIRST");
                    } 
         return accno+"|"+acifsc+"|"+accbankname+"|"+acchold+"|"+acusid+"|"+debitcard+"|"+basebranch+"|"+micrcod;
         
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
    public int updateuserdetail(String usid, String Fname, String Lname, String PAN, String Adhar, String Usnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateuserfolder(String usid, String Docpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertaccdetail(String accno, String ifsc, String bankname, String USID, String Accountholder, String debitcard, String Basebranch, String mic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateaccdetail(String accno, String ifsc, String bankname, String USID, String Accountholder, String debitcard, String Basebranch, String mic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
