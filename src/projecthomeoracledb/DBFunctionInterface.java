/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthomeoracledb;

/**
 *
 * @author Deval Nayak
 */
public interface DBFunctionInterface {
   public int insertnewuser(String usid,String Fname,String Lname,String PAN,String Adhar,String Usnumber);
   public int insertuserfolder(String usid,String folderpath);
   public int insertaccdetail(String accno,String ifsc,String bankname,String USID,String Accountholder,String debitcard,String Basebranch,String mic);
    
   public String searchuser(String X,int y);
   public String searchdocument(String X);
    public String searchaccount(String accno);
  
    public int updateuserdetail(String usid,String Fname,String Lname,String PAN,String Adhar,String Usnumber);
   public int updateuserfolder(String usid,String Docpath);
   public int updateaccdetail(String accno,String ifsc,String bankname,String Accountholder,String USID,String debitcard,String Basebranch,String mic);
   
}
