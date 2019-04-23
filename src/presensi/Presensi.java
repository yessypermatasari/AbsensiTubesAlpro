/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presensi;

/**
 *
 * @author Yessy
 */
public class Presensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
          splash Splash = new splash();
       Splash.setVisible(true);
       Presensi Start = new Presensi();
       try{
       for(int i=0; i <= 100; i++){
       Thread.sleep(40);
       Splash.loadingnumm.setText(Integer.toString(i) + "%");
       Splash.loadingbar.setValue(i);
       if(i==100){
       Splash.setVisible(false);
        Login A = new Login();
        A.setVisible(true);
       }
       }
       }catch(Exception e){
       }
    }
    
}
