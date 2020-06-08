
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
   Burak ÇAKIR 
*/

public class deneme extends javax.swing.JFrame {

    char [] xyz = {'a','b','c','d','e','f','g','h','ı','j','k','l','m','n','o','p','r','s','t','v','y','z'};
    
    String sonuc = "π = { ";
    
    int islem = 0;
    
    int x ;
    int y;
    JButton[][] buttons;
    JLabel numaraX[], numaraY[];
    
    
    public deneme() {
        initComponents();
        this.setTitle("Kapsama Algoritmalarının Kodlanması");
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        satirsayisiLabel = new javax.swing.JLabel();
        sütunsayisiLabel = new javax.swing.JLabel();
        xsatirText = new javax.swing.JTextField();
        ysütunText = new javax.swing.JTextField();
        olusturButton = new javax.swing.JButton();
        sonucText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hesaplaButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ciktiText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        satirsayisiLabel.setText("Satır Sayısı (X) : ");

        sütunsayisiLabel.setText("Sütun Sayısı (Y) : ");

        xsatirText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsatirTextActionPerformed(evt);
            }
        });

        ysütunText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ysütunTextActionPerformed(evt);
            }
        });

        olusturButton.setText("Oluştur");
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        sonucText.setEditable(false);
        sonucText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Sonuç :");

        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        restartButton.setText("Sıfırla");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        ciktiText.setEditable(false);
        ciktiText.setColumns(20);
        ciktiText.setRows(5);
        jScrollPane1.setViewportView(ciktiText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(olusturButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(satirsayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sütunsayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ysütunText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xsatirText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hesaplaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonucText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(satirsayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sonucText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ysütunText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sütunsayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(xsatirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(hesaplaButton)))
                        .addGap(18, 18, 18)
                        .addComponent(olusturButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(restartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xsatirTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsatirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xsatirTextActionPerformed

    private void ysütunTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ysütunTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ysütunTextActionPerformed

    private void sonucTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonucTextActionPerformed

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        
        x = Integer.parseInt(xsatirText.getText());
        y = Integer.parseInt(ysütunText.getText());
        
        numaraX = new JLabel[x];
        numaraY = new JLabel[y];
        buttons = new JButton[y][x];
        Action action = new Action();
        
        //x satır uzunluğu yazdırma.
        
        for (int i = 0; i < x; i++) 
        {
            numaraX[i] = new JLabel();
            numaraX[i].setText(String.valueOf(i + 1)); 
            numaraX[i].setForeground(Color.BLUE);
            numaraX[i].setBounds(95 + i * 40, 200, 15, 15); // 95 + i * 40, 200, 15, 15
            numaraX[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            this.add(numaraX[i]);
        }
        
        // y sütun uzunluğunu yazdırma.
        
        for (int i = 0; i < y; i++) 
        {
            numaraY[i] = new JLabel();
            numaraY[i].setText(String.valueOf(xyz[i])); // satır isimlerini harf olarak yazdık.
            numaraY[i].setForeground(Color.BLUE);
            numaraY[i].setBounds(50, i * 40 + 240, 15, 15); // 50, i * 40 + 240, 15, 15
            numaraY[i].setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            this.add(numaraY[i]);
        }        
        
        //matrisin değerini değişterecek butonlar.
        
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {
                buttons[i][j] = new JButton();
                buttons[i][j].setText(String.valueOf("0"));
                buttons[i][j].setBounds(83 + j * 40, i * 40 + 230, 35, 35);
                buttons[i][j].addActionListener(action);
                this.add(buttons[i][j]);
            }
        }
       
        this.update(this.getGraphics());
        
        olusturButton.setVisible(false);
        
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        
        hesaplaButton.setText("İlerle");
        
        GenelKapsamaAlgoritması();
        
        
        //butonlara tekrar tıklanılması engellendi
        
        for (int i = 0; i < y; i++) 
        {
            for (int j = 0; j < x; j++) 
            {                                
                buttons[i][j].setEnabled(false);
                buttons[i][j].invalidate();                
            }
        }               

        sonucText.setText(sonuc + " }");
        
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    private void GenelKapsamaAlgoritması() {
        
        // Mutlak satır bulma 
        for (int i = 0; i < x; i++) 
        {
            if (numaraX[i].getForeground() == Color.RED)
                continue;

            int mutlak = 0;
            int tempJ = 0;

            for (int j = 0; j < y; j++)
            {
                if (numaraY[j].getForeground() == Color.RED)
                    continue;

                String buton = (buttons[j][i].getText());
                if (buton.equals("1"))
                {
                    mutlak++;
                    tempJ = j;
                }
            }

            if (mutlak == 1) {
                numaraY[tempJ].setForeground(Color.RED);

                for (int k = 0;k < x;k++) {
                    String buton = (buttons[tempJ][k].getText());
                    if (buton.equals("1")) {
                        numaraX[k].setForeground(Color.RED);
                    }
                }

                sonuc += (tempJ + 1) + " ,";
                ciktiText.setText("Mutlak satır : " + xyz[tempJ]);
                return;
            }
        }

        // Satır kapsamalarını bulup silme (boyama)
        

        for (int i = 0; i < y; i++) 
        {
            if (numaraY[i].getForeground() == Color.RED)
                continue;

            int kapsayanSyc = 0;

            for (int t = 0; t < x; t++) 
            {
                if (numaraX[t].getForeground() == Color.RED)
                    continue;

                if (buttons[i][t].getText().equals("1")) 
                {
                    kapsayanSyc++;
                }
            }
            for (int j = 0; j < y; j++) 
            {
                int test = 0;
                if (i == j || numaraY[j].getForeground() == Color.RED)
                    continue;

                int kapsananSyc = 0, syc = 0;
                
                if (kapsayanSyc > 0) 
                {
                    for (int k = 0; k < x; k++) 
                    {
                        if (numaraX[k].getForeground() == Color.RED)
                            continue;

                        if (buttons[i][k].getText().equals("0") && buttons[j][k].getText().equals("1")) 
                        {
                            syc++;
                        }
                        if (buttons[j][k].getText().equals("1") && buttons[i][k].getText().equals("1")) 
                        {
                            kapsananSyc++;
                        }
                    }
                    if (syc > 0)
                    {
                        kapsananSyc = 0;
                        syc = 0;
                        continue;
                    }
                    if (kapsayanSyc >= kapsananSyc && kapsananSyc != 0) 
                    {
                        numaraY[j].setForeground(Color.RED);
                        ciktiText.setText("Kapsanan satır : " + xyz[j]);
                        return;
                    }
                    kapsananSyc = 0;
                }
            }
            kapsayanSyc = 0;
        }

        // Sütun kapsamalarını bulup silme (boyama)
 
        for (int i = 0; i < x; i++) 
        {
            if (numaraX[i].getForeground() == Color.RED)
                continue;

            int kapsayanSyc = 0;

            for (int t = 0; t < y; t++) 
            {
                if (buttons[t][i].getText().equals("1")) 
                {
                    kapsayanSyc++;
                }
            }
            for (int j = 0; j < x; j++) 
            {
                if (i == j || numaraX[j].getForeground() == Color.RED)
                    continue;

                int kapsananSyc = 0, syc = 0;
                
                if (kapsayanSyc > 0) 
                {
                    for (int k = 0; k < y; k++) 
                    {
                        if (numaraY[k].getForeground() == Color.RED)
                            continue;

                        if (buttons[k][i].getText().equals("0") && buttons[k][j].getText().equals("1")) 
                        {
                            syc++;
                        }
                        if (buttons[k][j].getText().equals("1") && buttons[k][i].getText().equals("1")) 
                        {
                            kapsananSyc++;
                        }
                    }
                    if (syc > 0) 
                    {
                        kapsananSyc = 0;
                        syc = 0;
                        continue;
                    }
                    if (kapsayanSyc >= kapsananSyc && kapsananSyc != 0) 
                    {
                        numaraX[i].setForeground(Color.RED);
                        ciktiText.setText("Kapsanan sütun : " + (i + 1));
                        return;
                    }
                    kapsananSyc = 0;
                }
            }
            kapsayanSyc = 0;
        }

        // Rota algoritmasına geçiş 
        
        ArrayList<Integer> minWeight = new ArrayList<>();
        
        int minWeightSum = 0;        
        
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                if ((buttons[j][i].getText().equals("1")) && numaraY[j].getForeground() != Color.RED && numaraX[i].getForeground() != Color.RED) 
                {
                    minWeightSum++;
                }
            }
            minWeight.add(minWeightSum);
            minWeightSum = 0;
        }

        ArrayList<Integer> yedek = new ArrayList<>();
        
        for (int i : minWeight) 
        {
            if (i == 0)
                continue;

            yedek.add(i);
        }
        
        Collections.sort(yedek);
        int labelYrowSize = 0;

        for (int i = 0; i < y; i++) 
        {
            if (numaraY[i].getForeground() != Color.RED) 
            {
                labelYrowSize++;
            }
        }

        float Stoplam = 0;
        
        ArrayList<Float> Sarr = new ArrayList<>();
        ArrayList<Integer> SarrIndexi = new ArrayList<>();

        for (int i = 0; i < minWeight.size(); i++) 
        {
            if (Objects.equals(minWeight.get(i), yedek.get(0))) 
            {
                // kücüğü bul
                for (int k = 0; k < y; k++) 
                {
                    if (buttons[k][i].getText().equals("1")) 
                    {
                        for (int j = 0; j < x; j++) 
                        {
                            if (numaraY[k].getForeground() != Color.RED && numaraX[j].getForeground() != Color.RED && buttons[k][j].getText().equals("1")) 
                            {
                                Stoplam += ((float) 1 / (float) minWeight.get(j));
                            }
                        }
                    }
                    if (buttons[k][i].getText().equals("1")) 
                    {
                        Sarr.add(((float) Stoplam * (float) labelYrowSize));
                        SarrIndexi.add(k);
                        Stoplam = 0;
                    }
                }
            }
        }

        float tempSmaxsize = 0;
        int tempSmaxsizeIndex = 0;

        ArrayList<Float> yedek2 = new ArrayList<>();
        for (float i : Sarr) 
        {
            if (i == 0)
                continue;

            yedek2.add(i);
        }
        Collections.sort(yedek2);

        int tempMinIndex = 0;
        for (int i = 0; i < Sarr.size(); i++) 
        {
            if (Sarr.get(i).equals(yedek2.get(0))) 
            {
                tempMinIndex = i;
            }
        }

        int asilIndex = SarrIndexi.get(tempMinIndex);
        numaraY[asilIndex].setForeground(Color.RED);
        ciktiText.setText("ROTA : " + (asilIndex + 1));
    }
    
    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
       
        
    //programı yeniden başlatma tuşu 
        
    if(evt.getSource() == restartButton)
    {
        dispose();
        deneme game = new deneme();
        game.setVisible(true);
    }
        
    }//GEN-LAST:event_restartButtonActionPerformed

    class Action implements ActionListener {    
        public void actionPerformed(ActionEvent e) 
        {
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (e.getSource() == buttons[i][j]) {
                        if (buttons[i][j].getText().equals("1")) {
                            buttons[i][j].setText("0");
                        } else {
                            buttons[i][j].setText("1");
                        }
                    }
                }
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deneme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ciktiText;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel satirsayisiLabel;
    private javax.swing.JTextField sonucText;
    private javax.swing.JLabel sütunsayisiLabel;
    private javax.swing.JTextField xsatirText;
    private javax.swing.JTextField ysütunText;
    // End of variables declaration//GEN-END:variables
}
