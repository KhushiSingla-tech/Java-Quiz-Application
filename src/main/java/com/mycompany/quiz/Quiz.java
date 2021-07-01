package com.mycompany.quiz;

import java.io.IOException;
import quiz.Loginform;
import quiz.SplashScreen;


public class Quiz 
{   
    public static void main(String[] args) {
        
        SplashScreen splash = new SplashScreen();
      try {
        
         Thread.sleep(10000);
         splash.dispose();
         new Loginform().setVisible(true);
      } catch(Exception e) {
         e.printStackTrace();
      }
      
            try
      {
      Process process = Runtime.getRuntime().exec("C:\\xampp\\mysql\\bin\\mysqld.exe");
      Process pro =Runtime.getRuntime().exec("C:\\xampp\\apache\\bin\\httpd.exe");
      }
      catch(IOException e)
      {
          e.printStackTrace();
      }
    }
}
