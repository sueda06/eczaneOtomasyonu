
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersonelIslemleri {
     private Connection con=null;
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    public void personeliSil(int id){
    String sorgu="Delete from personeller where id=?";
         try {    
             preparedStatement=con.prepareStatement(sorgu);
               preparedStatement.setInt(1, id);
               preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    public void personelGuncelle(int id, String yeniad, String yenisoyad, String yenitc,String yenimaas){
    String sorgu="Update personeller set ad=? , soyad=? , tc=? ,maas=? where id=?";
         try {
             preparedStatement=con.prepareStatement(sorgu);
               preparedStatement.setString(1, yeniad);
               preparedStatement.setString(2, yenisoyad);
               preparedStatement.setString(3, yenitc);
               preparedStatement.setString(4, yenimaas);
               preparedStatement.setInt(5,id);
               preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    public void personelEkle(String ad,String soyad, String tc,String maas){
        String sorgu="Insert Into personeller (ad,soyad,tc,maas) VALUES (?,?,?,?)";
         try {
             preparedStatement=con.prepareStatement(sorgu);
              preparedStatement.setString(1, ad);
              preparedStatement.setString(2, soyad);
              preparedStatement.setString(3, tc);
              preparedStatement.setString(4, maas);
               preparedStatement.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    public ArrayList<Personel> personelleriGetir(){
    ArrayList<Personel> cikti=new ArrayList<Personel>();
        try {
            statement=con.createStatement();
            String sorgu="Select * From personeller";
             ResultSet rs=statement.executeQuery(sorgu); 
             while(rs.next()){
             int id=rs.getInt("id");
             String ad=rs.getString("ad");
             String soyad=rs.getString("soyad");
             String tc=rs.getString("tc");
             String maas=rs.getString("maas");
             cikti.add(new Personel(id,ad,soyad,tc,maas));
             
             }
             return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public ArrayList<İlac> ilaclariGetir(){
    ArrayList<İlac> cikti=new ArrayList<İlac>();
        try {
            statement=con.createStatement();
            String sorgu="Select * From ilaclar";
             ResultSet rs=statement.executeQuery(sorgu); 
             while(rs.next()){
             String ad=rs.getString("ad");
             String turu=rs.getString("turu");
             String sonKul=rs.getString("son kullanma tarihi");
             cikti.add(new İlac(ad,turu,sonKul));
             
             }
             return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public boolean girisYap(String kullanıcıAdi,String parola){
    String sorgu="select * from adminler where username=? and password=?";
        try {
            preparedStatement =con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanıcıAdi);
            preparedStatement.setString(2,parola);
            ResultSet rs=preparedStatement.executeQuery(); 
            if(rs.next()==false){
            return false;
            }
            else 
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public PersonelIslemleri(){
     String url="jdbc:mysql://"+Databases.host+":"+Databases.port+"/"+Databases.dbİsmi+"?useUnicode=true&characterEncodinc=utf8";
    
    try{
    
    Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException ex){
        System.out.println("driver bulunamadıı");
    }
        try {
            con=(Connection) DriverManager.getConnection(url, Databases.kullaniciAdi, Databases.parola);
            System.out.println("baglantı basarılı");
        } catch (SQLException ex) {
            System.out.println("baglantı basarısız");
            //ex.printStackTrace();
        }
    
    }
}
