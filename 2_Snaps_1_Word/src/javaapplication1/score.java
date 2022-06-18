/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import com.mysql.jdbc.Connection;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Naveen
 */
public class score extends javax.swing.JFrame {

    NewClass nc=new NewClass();
    String name=nc.uname;
    public int score=0,max_score=0;
    
    public score() {
        initComponents();
        setLocation(250,100);
        setResizable(false);
        setIcon();
        setTitle("2 Pics 1 Word");
        int user_score=get_score();
        int total_high_score=get_max_score();
        your_score_label.setText(user_score+"");
        high_score_label.setText(""+total_high_score);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        high_score_label = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        your_score_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/your.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(280, 330, 200, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2pics_small.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(300, 20, 290, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon/7.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(640, 230, 220, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon/2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 210, 250, 256);

        high_score_label.setBackground(new java.awt.Color(255, 153, 255));
        high_score_label.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        high_score_label.setForeground(new java.awt.Color(255, 255, 255));
        high_score_label.setText("100");
        jPanel2.add(high_score_label);
        high_score_label.setBounds(520, 250, 90, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/highest.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(260, 250, 240, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 10, 40, 40);

        your_score_label.setBackground(new java.awt.Color(204, 255, 255));
        your_score_label.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        your_score_label.setForeground(new java.awt.Color(255, 255, 255));
        your_score_label.setText("100");
        jPanel2.add(your_score_label);
        your_score_label.setBounds(520, 330, 90, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quit-button.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(490, 410, 100, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/game_over.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(180, 120, 500, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/continue.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(310, 410, 160, 50);

        jLabel1.setBackground(new java.awt.Color(224, 171, 33));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/login_back.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-30, 0, 890, 480);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/highest.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(230, 140, 240, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        File clip_loc=new File("src\\music\\exit.wav");
        playMusic(clip_loc);
      int input = JOptionPane.showConfirmDialog(null, 
                "Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);

	// 0=yes, 1=no
      if(input == 0) 
      {
          dispose();
      }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        File clip_loc=new File("src\\music\\exit.wav");
        playMusic(clip_loc);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        File clip_loc=new File("src\\music\\Skip.wav");
        playMusic(clip_loc);
      int input = JOptionPane.showConfirmDialog(null, 
                "Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_OPTION);

	// 0=yes, 1=no
      if(input == 0) 
      {
          dispose();
          new home().setVisible(true);
      }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
         jLabel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
         jLabel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
         jLabel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel9MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(score.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new score().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel high_score_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel your_score_label;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/coin.png")));
    }
    public void playMusic(File clip_loc)
    {
        try
        {
            Clip clip=AudioSystem.getClip();
            AudioInputStream audioInput=AudioSystem.getAudioInputStream(clip_loc);
            
            clip.open(audioInput);
            clip.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public int get_score()
    {
        java.sql.PreparedStatement pst=null;
        Connection conn =null;
        java.sql.ResultSet rs = null;
            
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ram?characterEncoding=latin1", "root", "123456");
            String sql="select score from user where user_name=\""+name+"\";";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            { 
                score=rs.getInt("score");
            }
        } 
        catch (Exception exc) 
        {
            JOptionPane.showMessageDialog(null, exc);
        }
        finally
        {
            try 
            {
                conn.close();
                pst.close();
                rs.close();  
            } 
            catch(SQLException ex) {
            }           
        }
        return score;
    }
    public int get_max_score()
    {
        java.sql.PreparedStatement pst=null;
        Connection conn =null;
        java.sql.ResultSet rs = null;
            
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ram?characterEncoding=latin1", "root", "123456");
            String sql="select max(score) from user;";
            pst=conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            { 
                max_score=rs.getInt("max(score)");
            }
        } 
        catch (Exception exc) 
        {
            JOptionPane.showMessageDialog(null, exc);
        }
        finally
        {
            try 
            {
                conn.close();
                pst.close();
                rs.close();  
            } 
            catch(SQLException ex) {
            }           
        }
        return max_score;
    }
}
