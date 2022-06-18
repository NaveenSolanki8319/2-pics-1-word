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
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Naveen
 */
public class sign_up extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public sign_up() {
        initComponents();
        setLocation(250,100);
        setResizable(false);
        setIcon();
        setTitle("2 Pics 1 Word");
        invalid.setVisible(false);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        invalid = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        mickey = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        invalif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2pics_small.png"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(500, 410, 290, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        jLabel10.setToolTipText("Click for Back");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 10, 50, 50);

        invalid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        invalid.setForeground(new java.awt.Color(255, 0, 0));
        invalid.setText("*Confirmed Password is Invalid");
        jPanel2.add(invalid);
        invalid.setBounds(640, 260, 220, 20);

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jCheckBox1.setText("View Password ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(580, 310, 160, 27);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(660, 220, 170, 30);

        jPasswordField2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(660, 160, 170, 30);

        mickey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon/5.png"))); // NOI18N
        mickey.setText("jLabel2");
        jPanel2.add(mickey);
        mickey.setBounds(110, 220, 210, 258);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(570, 350, 120, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/confirm_signup.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(350, 220, 300, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/con_signup.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(350, 90, 190, 50);

        contact.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jPanel2.add(contact);
        contact.setBounds(660, 100, 170, 30);

        uname.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        jPanel2.add(uname);
        uname.setBounds(660, 40, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pass_signup.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(350, 160, 160, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_sign.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(350, 30, 170, 50);

        invalif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/imgonline-com-ua-resize-eCiuM6W9dQo7ls.jpg"))); // NOI18N
        jPanel2.add(invalif);
        invalif.setBounds(0, 0, 860, 480);

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        File clip_loc=new File("src\\music\\ques_but.wav");
        playMusic(clip_loc);
        if(jCheckBox1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
            jPasswordField2.setEchoChar((char)0);

        }
        else
        {
            jPasswordField1.setEchoChar('*');
            jPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        File clip_loc=new File("src\\music\\ques_but.wav");
        playMusic(clip_loc);
        dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        String name=uname.getText();
        String con=contact.getText();
        char[] pass1=jPasswordField1.getPassword();
        char[] pass2=jPasswordField2.getPassword();
        String pass="";
        for(char x:pass1)
        {
            pass=pass+x;
        }
        if(name.matches(".*[0-9].*") || name.isBlank()|| name.length()>10)
        {
            File clip_loc=new File("src\\music\\exit.wav");
            playMusic(clip_loc);
            JOptionPane.showMessageDialog(null,"Enter Correct Name");
            uname.setText(null);
        }
        else
        if((!con.matches(".*[0-9].*"))|| con.isBlank() || con.length()!=10)
        {    
            File clip_loc=new File("src\\music\\exit.wav");
            playMusic(clip_loc);
            JOptionPane.showMessageDialog(null,"Enter Correct Contact Number");
            contact.setText(null);
        }
        else
        if(pass1.length>10 ||pass1.equals(' ')||pass2.equals(' ')||pass1.length<0)
        {
            File clip_loc=new File("src\\music\\exit.wav");
            playMusic(clip_loc);
            JOptionPane.showMessageDialog(null,"Enter Correct Password");
            invalid.setVisible(true);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
        }
        else
        if(!Arrays.equals(pass1, pass2))
        {
            File clip_loc=new File("src\\music\\exit.wav");
            playMusic(clip_loc);
            JOptionPane.showMessageDialog(null,"Enter Correct Password");
            invalid.setVisible(true);
            jPasswordField1.setText(null);
            jPasswordField2.setText(null);
        }
        else
        {
           try
           {
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ram?characterEncoding=latin1", "root", "123456");
              Statement stmt=conn.createStatement();
              String sql="insert into user(user_name,contact,password) values(?,?,?);";
              java.sql.PreparedStatement pst=conn.prepareStatement(sql);
              pst.setString(1, uname.getText());
              pst.setString(2, contact.getText());
              pst.setString(3, pass);
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Sign Up Successfully");
              conn.close();
              stmt.close();
              pst.close();
              dispose();
              new login().setVisible(true);
              File clip_loc=new File("src\\music\\submit.wav");
              playMusic(clip_loc);
           }
           catch (Exception exc) 
            {
                File clip_loc=new File("src\\music\\exit.wav");
                playMusic(clip_loc);
                JOptionPane.showMessageDialog(null, exc);
            }        
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        // TODO add your handling code here:
        String name=uname.getText().toUpperCase();
        uname.setText(name);
    }//GEN-LAST:event_unameFocusLost

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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel invalif;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JLabel mickey;
    private javax.swing.JTextField uname;
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
}
