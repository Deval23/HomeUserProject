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
      public int searchallkhata(){
  
         
         return 1;
     }
     
     public String searchelecon(String eleconno){
          String eleconnoo=null,eleconname=null,Meternum=null,Location=null,USID=null;
         try{    
                       
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                    Statement st=cn.createStatement();
                    String str="Select * from elecon where ELECON='"+eleconno+"'";
                    ResultSet rs=st.executeQuery(str);
                    while(rs.next()){
                      eleconname=rs.getString("ELECONNAME");
                      Meternum=rs.getString("METERNUM");
                      Location=rs.getString("LOCATION");
                    
                    }
                         return eleconname+"|"+Meternum+"|"+Location;
                    }
                    catch(Exception e){
                        System.out.println("CONNECT THE ORACLE DB FIRST");
                    } 
         return eleconname+"|"+Meternum+"|"+Location;       
         
      }
     
     
     public String searchlink(String institution){
          String WEBLINKS=null;
         try{    
                       
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                    Statement st=cn.createStatement();
                    String str="Select * from links where INSTITUTION='"+institution+"'";
                    ResultSet rs=st.executeQuery(str);
                    while(rs.next()){
                      WEBLINKS=rs.getString("WEBLINK");
                      }
                         return WEBLINKS;
                    }
                    catch(Exception e){
                        System.out.println("CONNECT THE ORACLE DB FIRST");
                    } 
         return WEBLINKS;       
         
      }
     
     public int searchlinkcount(){
         int count=0;
         try{    
                       
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                    Statement st=cn.createStatement();
                    String str="Select count(*) from links";
                    ResultSet rs=st.executeQuery(str);
                    rs.next();
                    count=rs.getInt(1);
                    return count;
                    }
                    catch(Exception e){
                        System.out.println("CONNECT THE ORACLE DB FIRST");
                    } 
         return count;    
     }
    
      public int searchkhatanoSELE(int khatano){
          int seleniumddrno=0;
         try{    
                       
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
                    Statement st=cn.createStatement();
                    String str="Select SELENIUMDDNO from khatano where khatano="+khatano+"";
                    ResultSet rs=st.executeQuery(str);
                    while(rs.next()){
                      seleniumddrno=rs.getInt("SELENIUMDDNO");
                      }
                         return seleniumddrno;
                    }
                    catch(Exception e){
                        System.out.println("CONNECT THE ORACLE DB FIRST");
                    } 
         return seleniumddrno;       
         
      }
      
//   public String searchlink(){
//          String WEBLINKS=null,INSTITUTION=null;
//         try{    
//                       
//                    Class.forName("oracle.jdbc.driver.OracleDriver");
//                    Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","12345");
//                    Statement st=cn.createStatement();
//                    String str="Select * from links";
//                    ResultSet rs=st.executeQuery(str);
//                    while(rs.next()){
//                      INSTITUTION=rs.getString("INSTITUTION");
//                      WEBLINKS=rs.getString("WEBLINK");
//                      }
//                         return INSTITUTION+"|"+WEBLINKS;
//                    }
//                    catch(Exception e){
//                        System.out.println("CONNECT THE ORACLE DB FIRST");
//                    } 
//         return WEBLINKS;       
//         
//      }  

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

    @Override
    public int insertkhata(int khatano) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertelectriccon(String ConnNum, String ConsumerName, String MeterNum, String Location, String USID) {
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

       
}
