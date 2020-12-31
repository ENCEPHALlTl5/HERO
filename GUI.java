/**
 *
 * @author f_hack
 * 
 * 
 * HardHack Entertainment Roleplay Organizer (H.E.R.O)
 *                              2020
 * 
 *      Fabian Hack
 * 
 *   toss some coins via Paypal!
 * 
 */

package CDTOOL;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;




public class GUI extends javax.swing.JFrame implements FocusListener {

    int mouseX;     //Mausposition
    int mouseY;
    int ww = 500;   //Fenstergröße
    int wh = 750; 
    int ext = 300;  //Erweiterungsgröße
    
    ImageIcon b1 = new ImageIcon("src/CDTOOL/DATA/bild (1).png", "1");
    ImageIcon b2 = new ImageIcon("src/CDTOOL/DATA/bild (2).png", "2");
    ImageIcon b3 = new ImageIcon("src/CDTOOL/DATA/bild (3).png", "3");
    ImageIcon b4 = new ImageIcon("src/CDTOOL/DATA/bild (4).png", "4");
    ImageIcon b5 = new ImageIcon("src/CDTOOL/DATA/bild (5).png", "5");
    ImageIcon b6 = new ImageIcon("src/CDTOOL/DATA/bild (6).png", "6");
    ImageIcon b7 = new ImageIcon("src/CDTOOL/DATA/bild (7).png", "7");
    ImageIcon b8 = new ImageIcon("src/CDTOOL/DATA/bild (8).png", "8");
    ImageIcon b9 = new ImageIcon("src/CDTOOL/DATA/bild (9).png", "9");
    ImageIcon b10 = new ImageIcon("src/CDTOOL/DATA/bild (10).png", "10");
    ImageIcon b11 = new ImageIcon("src/CDTOOL/DATA/bild (11).png", "11");
    ImageIcon b12 = new ImageIcon("src/CDTOOL/DATA/bild (12).png", "12");
    ImageIcon b13 = new ImageIcon("src/CDTOOL/DATA/bild (13).png", "13");
    ImageIcon b14 = new ImageIcon("src/CDTOOL/DATA/bild (14).png", "14");
    ImageIcon b15 = new ImageIcon("src/CDTOOL/DATA/bild (15).png", "15");
    ImageIcon b16 = new ImageIcon("src/CDTOOL/DATA/bild (16).png", "16");
    ImageIcon b17 = new ImageIcon("src/CDTOOL/DATA/bild (17).png", "17");
    ImageIcon b18 = new ImageIcon("src/CDTOOL/DATA/bild (18).png", "18");
    ImageIcon b19 = new ImageIcon("src/CDTOOL/DATA/bild (19).png", "19");
    ImageIcon b20 = new ImageIcon("src/CDTOOL/DATA/bild (20).png", "20");
    
    ImageIcon back = new ImageIcon("src/CDTOOL/DATA/front.png", "20");
    
    UIManager UIManager = new UIManager();
    

    
    /**
     * Creates new form GUI
     */
    public GUI() {
        
        initComponents();

        Verwaltung.boot();
        
        pnlR.setVisible(false);
        pnlL.setVisible(false);
        txfWürfel.setText("w"+String.valueOf(sliderRNG.getValue()));
        lblPortrait.setIcon(b1);
        lblPortrait1.setIcon(b1);
        lblPortrait4.setIcon(b1);
        
        PopupMenu.addTo(txaWaffen);
        PopupMenu.addTo(txaZauber);
        PopupMenu.addTo(txaRucksack);
        PopupMenu.addTo(txaNotizen);
        
        PopupMenu.addTo(txaWaffen1);
        PopupMenu.addTo(txaZauber1);
        PopupMenu.addTo(txaRucksack1);
        PopupMenu.addTo(txaNotizen1);
        
        PopupMenu.addTo(txaWaffen2);
        PopupMenu.addTo(txaZauber2);
        PopupMenu.addTo(txaRucksack2);
        PopupMenu.addTo(txaNotizen2);
        
        UIManager.put("OptionPane.background", Color.black);
        UIManager.put("OptionPane.foreground", Color.black);

        
        
        
        write1();
        write2();
        write3();
        setHWS1();
        setHWS2();
        setHWS3();
           
    }
   
    
    public void write1() {
        
        int slide = jSlider1.getValue();
        txfSlider.setText(String.valueOf(slide));
        
        if (Verwaltung.name1 != null) {
            txfName.setText(Verwaltung.writename1());
            txfGeschlecht.setText(Verwaltung.writegeschlecht1());
            txfAlter.setText(Verwaltung.writealter1());
            txfRasse.setText(Verwaltung.writerasse1());
            txfHeimat.setText(Verwaltung.writeheimat1());
            txfBeruf.setText(Verwaltung.writeberuf1());
            txfStatur.setText(Verwaltung.writestatur1());
            jSlider1.setValue(Verwaltung.life1);
            txfH1.setText(Verwaltung.writeh1());
            txfH2.setText(Verwaltung.writeh2());
            txfH3.setText(Verwaltung.writeh3());
            txfH4.setText(Verwaltung.writeh4());
            txfH5.setText(Verwaltung.writeh5());
            txfH6.setText(Verwaltung.writeh6());
            txfH7.setText(Verwaltung.writeh7());
            txfH8.setText(Verwaltung.writeh8());
            txfH9.setText(Verwaltung.writeh9());
            txfH10.setText(Verwaltung.writeh10());
            txfHP1.setText(Verwaltung.writehp1());
            txfHP2.setText(Verwaltung.writehp2());
            txfHP3.setText(Verwaltung.writehp3());
            txfHP4.setText(Verwaltung.writehp4());
            txfHP5.setText(Verwaltung.writehp5());
            txfHP6.setText(Verwaltung.writehp6());
            txfHP7.setText(Verwaltung.writehp7());
            txfHP8.setText(Verwaltung.writehp8());
            txfHP9.setText(Verwaltung.writehp9());
            txfHP10.setText(Verwaltung.writehp10());
            txfW1.setText(Verwaltung.writew1());
            txfW2.setText(Verwaltung.writew2());
            txfW3.setText(Verwaltung.writew3());
            txfW4.setText(Verwaltung.writew4());
            txfW5.setText(Verwaltung.writew5());
            txfW6.setText(Verwaltung.writew6());
            txfW7.setText(Verwaltung.writew7());
            txfW8.setText(Verwaltung.writew8());
            txfW9.setText(Verwaltung.writew9());
            txfW10.setText(Verwaltung.writew10());
            txfWP1.setText(Verwaltung.writewp1());
            txfWP2.setText(Verwaltung.writewp2());
            txfWP3.setText(Verwaltung.writewp3());
            txfWP4.setText(Verwaltung.writewp4());
            txfWP5.setText(Verwaltung.writewp5());
            txfWP6.setText(Verwaltung.writewp6());
            txfWP7.setText(Verwaltung.writewp7());
            txfWP8.setText(Verwaltung.writewp8());
            txfWP9.setText(Verwaltung.writewp9());
            txfWP10.setText(Verwaltung.writewp10());
            txfS1.setText(Verwaltung.writes1());
            txfS2.setText(Verwaltung.writes2());
            txfS3.setText(Verwaltung.writes3());
            txfS4.setText(Verwaltung.writes4());
            txfS5.setText(Verwaltung.writes5());
            txfS6.setText(Verwaltung.writes6());
            txfS7.setText(Verwaltung.writes7());
            txfS8.setText(Verwaltung.writes8());
            txfS9.setText(Verwaltung.writes9());
            txfS10.setText(Verwaltung.writes10());
            txfSP1.setText(Verwaltung.writesp1());
            txfSP2.setText(Verwaltung.writesp2());
            txfSP3.setText(Verwaltung.writesp3());
            txfSP4.setText(Verwaltung.writesp4());
            txfSP5.setText(Verwaltung.writesp5());
            txfSP6.setText(Verwaltung.writesp6());
            txfSP7.setText(Verwaltung.writesp7());
            txfSP8.setText(Verwaltung.writesp8());
            txfSP9.setText(Verwaltung.writesp9());
            txfSP10.setText(Verwaltung.writesp10());
            
            txaWaffen.setText(Verwaltung.waffen1());
            txaZauber.setText(Verwaltung.zauber1());
            txaRucksack.setText(Verwaltung.rucksack1());
            txaNotizen.setText(Verwaltung.notizen1());
            
            lblPortrait.setIcon(Verwaltung.image1());
            
            txfName.setEditable(false);
            txfGeschlecht.setEditable(false);
            txfAlter.setEditable(false);
            txfRasse.setEditable(false);
            txfHeimat.setEditable(false);
            txfBeruf.setEditable(false);
            txfStatur.setEditable(false);
            btnNext.setVisible(false);
        } else {           
        }
    }
    
    public void write2() {
        
        int slide = jSlider2.getValue();
        txfSlider2.setText(String.valueOf(slide));
        
        if (Verwaltung.name2 != null) {
            txfName1.setText(Verwaltung.writename2());
            txfGeschlecht1.setText(Verwaltung.writegeschlecht2());
            txfAlter1.setText(Verwaltung.writealter2());
            txfRasse1.setText(Verwaltung.writerasse2());
            txfHeimat1.setText(Verwaltung.writeheimat2());
            txfBeruf1.setText(Verwaltung.writeberuf2());
            txfStatur1.setText(Verwaltung.writestatur2());
            jSlider2.setValue(Verwaltung.life2);
            txfH11.setText(Verwaltung.writeh11());
            txfH12.setText(Verwaltung.writeh12());
            txfH13.setText(Verwaltung.writeh13());
            txfH14.setText(Verwaltung.writeh14());
            txfH15.setText(Verwaltung.writeh15());
            txfH16.setText(Verwaltung.writeh16());
            txfH17.setText(Verwaltung.writeh17());
            txfH18.setText(Verwaltung.writeh18());
            txfH19.setText(Verwaltung.writeh19());
            txfH20.setText(Verwaltung.writeh20());
            txfHP11.setText(Verwaltung.writehp11());
            txfHP12.setText(Verwaltung.writehp12());
            txfHP13.setText(Verwaltung.writehp13());
            txfHP14.setText(Verwaltung.writehp14());
            txfHP15.setText(Verwaltung.writehp15());
            txfHP16.setText(Verwaltung.writehp16());
            txfHP17.setText(Verwaltung.writehp17());
            txfHP18.setText(Verwaltung.writehp18());
            txfHP19.setText(Verwaltung.writehp19());
            txfHP20.setText(Verwaltung.writehp20());
            txfW11.setText(Verwaltung.writew11());
            txfW12.setText(Verwaltung.writew12());
            txfW13.setText(Verwaltung.writew13());
            txfW14.setText(Verwaltung.writew14());
            txfW15.setText(Verwaltung.writew15());
            txfW16.setText(Verwaltung.writew16());
            txfW17.setText(Verwaltung.writew17());
            txfW18.setText(Verwaltung.writew18());
            txfW19.setText(Verwaltung.writew19());
            txfW20.setText(Verwaltung.writew20());
            txfWP11.setText(Verwaltung.writewp11());
            txfWP12.setText(Verwaltung.writewp12());
            txfWP13.setText(Verwaltung.writewp13());
            txfWP14.setText(Verwaltung.writewp14());
            txfWP15.setText(Verwaltung.writewp15());
            txfWP16.setText(Verwaltung.writewp16());
            txfWP17.setText(Verwaltung.writewp17());
            txfWP18.setText(Verwaltung.writewp18());
            txfWP19.setText(Verwaltung.writewp19());
            txfWP20.setText(Verwaltung.writewp20());
            txfS11.setText(Verwaltung.writes11());
            txfS12.setText(Verwaltung.writes12());
            txfS13.setText(Verwaltung.writes13());
            txfS14.setText(Verwaltung.writes14());
            txfS15.setText(Verwaltung.writes15());
            txfS16.setText(Verwaltung.writes16());
            txfS17.setText(Verwaltung.writes17());
            txfS18.setText(Verwaltung.writes18());
            txfS19.setText(Verwaltung.writes19());
            txfS20.setText(Verwaltung.writes20());
            txfSP11.setText(Verwaltung.writesp11());
            txfSP12.setText(Verwaltung.writesp12());
            txfSP13.setText(Verwaltung.writesp13());
            txfSP14.setText(Verwaltung.writesp14());
            txfSP15.setText(Verwaltung.writesp15());
            txfSP16.setText(Verwaltung.writesp16());
            txfSP17.setText(Verwaltung.writesp17());
            txfSP18.setText(Verwaltung.writesp18());
            txfSP19.setText(Verwaltung.writesp19());
            txfSP20.setText(Verwaltung.writesp20());
            
            txaWaffen1.setText(Verwaltung.waffen2());
            txaZauber1.setText(Verwaltung.zauber2());
            txaRucksack1.setText(Verwaltung.rucksack2());
            txaNotizen1.setText(Verwaltung.notizen2());
            
            lblPortrait1.setIcon(Verwaltung.image2());
            
            txfName1.setEditable(false);
            txfGeschlecht1.setEditable(false);
            txfAlter1.setEditable(false);
            txfRasse1.setEditable(false);
            txfHeimat1.setEditable(false);
            txfBeruf1.setEditable(false);
            txfStatur1.setEditable(false);
            btnNext1.setVisible(false);
        } else {           
        }
    }
    
    public void write3() {
        
        int slide = jSlider5.getValue();
        txfSlider4.setText(String.valueOf(slide));
        
        if (Verwaltung.name3 != null) {
            txfName4.setText(Verwaltung.writename3());
            txfGeschlecht4.setText(Verwaltung.writegeschlecht3());
            txfAlter4.setText(Verwaltung.writealter3());
            txfRasse4.setText(Verwaltung.writerasse3());
            txfHeimat4.setText(Verwaltung.writeheimat3());
            txfBeruf4.setText(Verwaltung.writeberuf3());
            txfStatur4.setText(Verwaltung.writestatur3());
            jSlider5.setValue(Verwaltung.life3);
            txfH41.setText(Verwaltung.writeh41());
            txfH42.setText(Verwaltung.writeh42());
            txfH43.setText(Verwaltung.writeh43());
            txfH44.setText(Verwaltung.writeh44());
            txfH45.setText(Verwaltung.writeh45());
            txfH46.setText(Verwaltung.writeh46());
            txfH47.setText(Verwaltung.writeh47());
            txfH48.setText(Verwaltung.writeh48());
            txfH49.setText(Verwaltung.writeh49());
            txfH50.setText(Verwaltung.writeh50());
            txfHP41.setText(Verwaltung.writehp41());
            txfHP42.setText(Verwaltung.writehp42());
            txfHP43.setText(Verwaltung.writehp43());
            txfHP44.setText(Verwaltung.writehp44());
            txfHP45.setText(Verwaltung.writehp45());
            txfHP46.setText(Verwaltung.writehp46());
            txfHP47.setText(Verwaltung.writehp47());
            txfHP48.setText(Verwaltung.writehp48());
            txfHP49.setText(Verwaltung.writehp49());
            txfHP50.setText(Verwaltung.writehp50());
            txfW41.setText(Verwaltung.writew41());
            txfW42.setText(Verwaltung.writew42());
            txfW43.setText(Verwaltung.writew43());
            txfW44.setText(Verwaltung.writew44());
            txfW45.setText(Verwaltung.writew45());
            txfW46.setText(Verwaltung.writew46());
            txfW47.setText(Verwaltung.writew47());
            txfW48.setText(Verwaltung.writew48());
            txfW49.setText(Verwaltung.writew49());
            txfW50.setText(Verwaltung.writew50());
            txfWP41.setText(Verwaltung.writewp41());
            txfWP42.setText(Verwaltung.writewp42());
            txfWP43.setText(Verwaltung.writewp43());
            txfWP44.setText(Verwaltung.writewp44());
            txfWP45.setText(Verwaltung.writewp45());
            txfWP46.setText(Verwaltung.writewp46());
            txfWP47.setText(Verwaltung.writewp47());
            txfWP48.setText(Verwaltung.writewp48());
            txfWP49.setText(Verwaltung.writewp49());
            txfWP50.setText(Verwaltung.writewp50());
            txfS41.setText(Verwaltung.writes41());
            txfS42.setText(Verwaltung.writes42());
            txfS43.setText(Verwaltung.writes43());
            txfS44.setText(Verwaltung.writes44());
            txfS45.setText(Verwaltung.writes45());
            txfS46.setText(Verwaltung.writes46());
            txfS47.setText(Verwaltung.writes47());
            txfS48.setText(Verwaltung.writes48());
            txfS49.setText(Verwaltung.writes49());
            txfS50.setText(Verwaltung.writes50());
            txfSP41.setText(Verwaltung.writesp41());
            txfSP42.setText(Verwaltung.writesp42());
            txfSP43.setText(Verwaltung.writesp43());
            txfSP44.setText(Verwaltung.writesp44());
            txfSP45.setText(Verwaltung.writesp45());
            txfSP46.setText(Verwaltung.writesp46());
            txfSP47.setText(Verwaltung.writesp47());
            txfSP48.setText(Verwaltung.writesp48());
            txfSP49.setText(Verwaltung.writesp49());
            txfSP50.setText(Verwaltung.writesp50());
            
            txaWaffen2.setText(Verwaltung.waffen3());
            txaZauber2.setText(Verwaltung.zauber3());
            txaRucksack2.setText(Verwaltung.rucksack3());
            txaNotizen2.setText(Verwaltung.notizen3());
            
            lblPortrait4.setIcon(Verwaltung.image2());
            
            txfName4.setEditable(false);
            txfGeschlecht4.setEditable(false);
            txfAlter4.setEditable(false);
            txfRasse4.setEditable(false);
            txfHeimat4.setEditable(false);
            txfBeruf4.setEditable(false);
            txfStatur4.setEditable(false);
            btnNext4.setVisible(false);
        } else {           
        }
    }
    
    public void setHWS() {       
        if (tabb1.isVisible()){
            setHWS1();
        }
        if (tabb2.isVisible()){
            setHWS2();
        }
        if (tabb3.isVisible()){
            setHWS3();
        }    
    }
    
    public void setHWS1() {
        
        int hp1 = 0;
        int hp2 = 0;
        int hp3 = 0;
        int hp4 = 0;
        int hp5 = 0;
        int hp6 = 0;
        int hp7 = 0;
        int hp8 = 0;
        int hp9 = 0;
        int hp10 = 0;
        int HX = 0;
        
        int wp1 = 0;
        int wp2 = 0;
        int wp3 = 0;
        int wp4 = 0;
        int wp5 = 0;
        int wp6 = 0;
        int wp7 = 0;
        int wp8 = 0;
        int wp9 = 0;
        int wp10 = 0;
        int WX = 0;
        
        int sp1 = 0;
        int sp2 = 0;
        int sp3 = 0;
        int sp4 = 0;
        int sp5 = 0;
        int sp6 = 0;
        int sp7 = 0;
        int sp8 = 0;
        int sp9 = 0;
        int sp10 = 0;
        int SX = 0;
        

        if (!"".equals(txfHP1.getText()))   
        hp1 = Integer.parseInt(txfHP1.getText());
        if (!"".equals(txfHP2.getText())) 
        hp2 = Integer.parseInt(txfHP2.getText());
        if (!"".equals(txfHP3.getText())) 
        hp3 = Integer.parseInt(txfHP3.getText());
        if (!"".equals(txfHP4.getText())) 
        hp4 = Integer.parseInt(txfHP4.getText());
        if (!"".equals(txfHP5.getText())) 
        hp5 = Integer.parseInt(txfHP5.getText());
        if (!"".equals(txfHP6.getText())) 
        hp6 = Integer.parseInt(txfHP6.getText());
        if (!"".equals(txfHP7.getText())) 
        hp7 = Integer.parseInt(txfHP7.getText());
        if (!"".equals(txfHP8.getText())) 
        hp8 = Integer.parseInt(txfHP8.getText());
        if (!"".equals(txfHP9.getText())) 
        hp9 = Integer.parseInt(txfHP9.getText());
        if (!"".equals(txfHP10.getText())) 
        hp10 = Integer.parseInt(txfHP10.getText());
        
        if (!"".equals(txfWP1.getText()))   
        wp1 = Integer.parseInt(txfWP1.getText());
        if (!"".equals(txfWP2.getText())) 
        wp2 = Integer.parseInt(txfWP2.getText());
        if (!"".equals(txfWP3.getText())) 
        wp3 = Integer.parseInt(txfWP3.getText());
        if (!"".equals(txfWP4.getText())) 
        wp4 = Integer.parseInt(txfWP4.getText());
        if (!"".equals(txfWP5.getText())) 
        wp5 = Integer.parseInt(txfWP5.getText());
        if (!"".equals(txfWP6.getText())) 
        wp6 = Integer.parseInt(txfWP6.getText());
        if (!"".equals(txfWP7.getText())) 
        wp7 = Integer.parseInt(txfWP7.getText());
        if (!"".equals(txfWP8.getText())) 
        wp8 = Integer.parseInt(txfWP8.getText());
        if (!"".equals(txfWP9.getText())) 
        wp9 = Integer.parseInt(txfWP9.getText());
        if (!"".equals(txfWP10.getText())) 
        wp10 = Integer.parseInt(txfWP10.getText());
        
        if (!"".equals(txfSP1.getText()))   
        sp1 = Integer.parseInt(txfSP1.getText());
        if (!"".equals(txfSP2.getText())) 
        sp2 = Integer.parseInt(txfSP2.getText());
        if (!"".equals(txfSP3.getText())) 
        sp3 = Integer.parseInt(txfSP3.getText());
        if (!"".equals(txfSP4.getText())) 
        sp4 = Integer.parseInt(txfSP4.getText());
        if (!"".equals(txfSP5.getText())) 
        sp5 = Integer.parseInt(txfSP5.getText());
        if (!"".equals(txfSP6.getText())) 
        sp6 = Integer.parseInt(txfSP6.getText());
        if (!"".equals(txfSP7.getText())) 
        sp7 = Integer.parseInt(txfSP7.getText());
        if (!"".equals(txfSP8.getText())) 
        sp8 = Integer.parseInt(txfSP8.getText());
        if (!"".equals(txfSP9.getText())) 
        sp9 = Integer.parseInt(txfSP9.getText());
        if (!"".equals(txfSP10.getText())) 
        sp10 = Integer.parseInt(txfSP10.getText());
        
        
        HX = ((hp1 + hp2 + hp3 + hp4 + hp5 + hp6 + hp7 + hp8 + hp9 + hp10) + (10 / 2)) / 10;
        txfHandel.setText(String.valueOf(HX));
        int gbh = (HX + (10 / 2)) / 10;
        txfGBH.setText(String.valueOf(gbh));
        WX = ((wp1 + wp2 + wp3 + wp4 + wp5 + wp6 + wp7 + wp8 + wp9 + wp10) + (10 / 2)) / 10;
        txfWissen.setText(String.valueOf(WX));
        int gbw = (WX + (10 / 2)) / 10;
        txfGBW.setText(String.valueOf(gbw));
        SX = ((sp1 + sp2 + sp3 + sp4 + sp5 + sp6 + sp7 + sp8 + sp9 + sp10) + (10 / 2)) / 10;
        txfSoziales.setText(String.valueOf(SX));  
        int gbs = (SX + (10 / 2)) / 10;
        txfGBS.setText(String.valueOf(gbs));
    }
    
    public void setHWS2() {
       
        int hp1 = 0;
        int hp2 = 0;
        int hp3 = 0;
        int hp4 = 0;
        int hp5 = 0;
        int hp6 = 0;
        int hp7 = 0;
        int hp8 = 0;
        int hp9 = 0;
        int hp10 = 0;
        int HX = 0;
        
        int wp1 = 0;
        int wp2 = 0;
        int wp3 = 0;
        int wp4 = 0;
        int wp5 = 0;
        int wp6 = 0;
        int wp7 = 0;
        int wp8 = 0;
        int wp9 = 0;
        int wp10 = 0;
        int WX = 0;
        
        int sp1 = 0;
        int sp2 = 0;
        int sp3 = 0;
        int sp4 = 0;
        int sp5 = 0;
        int sp6 = 0;
        int sp7 = 0;
        int sp8 = 0;
        int sp9 = 0;
        int sp10 = 0;
        int SX = 0;
        

        if (!"".equals(txfHP11.getText()))   
        hp1 = Integer.parseInt(txfHP11.getText());
        if (!"".equals(txfHP12.getText())) 
        hp2 = Integer.parseInt(txfHP12.getText());
        if (!"".equals(txfHP13.getText())) 
        hp3 = Integer.parseInt(txfHP13.getText());
        if (!"".equals(txfHP14.getText())) 
        hp4 = Integer.parseInt(txfHP14.getText());
        if (!"".equals(txfHP15.getText())) 
        hp5 = Integer.parseInt(txfHP15.getText());
        if (!"".equals(txfHP16.getText())) 
        hp6 = Integer.parseInt(txfHP16.getText());
        if (!"".equals(txfHP17.getText())) 
        hp7 = Integer.parseInt(txfHP17.getText());
        if (!"".equals(txfHP18.getText())) 
        hp8 = Integer.parseInt(txfHP18.getText());
        if (!"".equals(txfHP19.getText())) 
        hp9 = Integer.parseInt(txfHP19.getText());
        if (!"".equals(txfHP20.getText())) 
        hp10 = Integer.parseInt(txfHP20.getText());
        
        if (!"".equals(txfWP11.getText()))   
        wp1 = Integer.parseInt(txfWP11.getText());
        if (!"".equals(txfWP12.getText())) 
        wp2 = Integer.parseInt(txfWP12.getText());
        if (!"".equals(txfWP13.getText())) 
        wp3 = Integer.parseInt(txfWP13.getText());
        if (!"".equals(txfWP14.getText())) 
        wp4 = Integer.parseInt(txfWP14.getText());
        if (!"".equals(txfWP15.getText())) 
        wp5 = Integer.parseInt(txfWP15.getText());
        if (!"".equals(txfWP16.getText())) 
        wp6 = Integer.parseInt(txfWP16.getText());
        if (!"".equals(txfWP17.getText())) 
        wp7 = Integer.parseInt(txfWP17.getText());
        if (!"".equals(txfWP18.getText())) 
        wp8 = Integer.parseInt(txfWP18.getText());
        if (!"".equals(txfWP19.getText())) 
        wp9 = Integer.parseInt(txfWP19.getText());
        if (!"".equals(txfWP20.getText())) 
        wp10 = Integer.parseInt(txfWP20.getText());
        
        if (!"".equals(txfSP11.getText()))   
        sp1 = Integer.parseInt(txfSP11.getText());
        if (!"".equals(txfSP12.getText())) 
        sp2 = Integer.parseInt(txfSP12.getText());
        if (!"".equals(txfSP13.getText())) 
        sp3 = Integer.parseInt(txfSP13.getText());
        if (!"".equals(txfSP14.getText())) 
        sp4 = Integer.parseInt(txfSP14.getText());
        if (!"".equals(txfSP15.getText())) 
        sp5 = Integer.parseInt(txfSP15.getText());
        if (!"".equals(txfSP16.getText())) 
        sp6 = Integer.parseInt(txfSP16.getText());
        if (!"".equals(txfSP17.getText())) 
        sp7 = Integer.parseInt(txfSP17.getText());
        if (!"".equals(txfSP18.getText())) 
        sp8 = Integer.parseInt(txfSP18.getText());
        if (!"".equals(txfSP19.getText())) 
        sp9 = Integer.parseInt(txfSP19.getText());
        if (!"".equals(txfSP20.getText())) 
        sp10 = Integer.parseInt(txfSP20.getText());
        
        
        HX = ((hp1 + hp2 + hp3 + hp4 + hp5 + hp6 + hp7 + hp8 + hp9 + hp10) + (10 / 2)) / 10;
        txfHandel1.setText(String.valueOf(HX));
        int gbh = (HX + (10 / 2)) / 10;
        txfGBH1.setText(String.valueOf(gbh));
        WX = ((wp1 + wp2 + wp3 + wp4 + wp5 + wp6 + wp7 + wp8 + wp9 + wp10) + (10 / 2)) / 10;
        txfWissen1.setText(String.valueOf(WX));
        int gbw = (WX + (10 / 2)) / 10;
        txfGBW1.setText(String.valueOf(gbw));
        SX = ((sp1 + sp2 + sp3 + sp4 + sp5 + sp6 + sp7 + sp8 + sp9 + sp10) + (10 / 2)) / 10;
        txfSoziales1.setText(String.valueOf(SX));
        int gbs = (SX + (10 / 2)) / 10;
        txfGBS1.setText(String.valueOf(gbs));
    }
    
    public void setHWS3() {
         
        int hp1 = 0;
        int hp2 = 0;
        int hp3 = 0;
        int hp4 = 0;
        int hp5 = 0;
        int hp6 = 0;
        int hp7 = 0;
        int hp8 = 0;
        int hp9 = 0;
        int hp10 = 0;
        int HX = 0;
        
        int wp1 = 0;
        int wp2 = 0;
        int wp3 = 0;
        int wp4 = 0;
        int wp5 = 0;
        int wp6 = 0;
        int wp7 = 0;
        int wp8 = 0;
        int wp9 = 0;
        int wp10 = 0;
        int WX = 0;
        
        int sp1 = 0;
        int sp2 = 0;
        int sp3 = 0;
        int sp4 = 0;
        int sp5 = 0;
        int sp6 = 0;
        int sp7 = 0;
        int sp8 = 0;
        int sp9 = 0;
        int sp10 = 0;
        int SX = 0;
        

        if (!"".equals(txfHP41.getText()))   
        hp1 = Integer.parseInt(txfHP41.getText());
        if (!"".equals(txfHP42.getText())) 
        hp2 = Integer.parseInt(txfHP42.getText());
        if (!"".equals(txfHP43.getText())) 
        hp3 = Integer.parseInt(txfHP43.getText());
        if (!"".equals(txfHP44.getText())) 
        hp4 = Integer.parseInt(txfHP44.getText());
        if (!"".equals(txfHP45.getText())) 
        hp5 = Integer.parseInt(txfHP45.getText());
        if (!"".equals(txfHP46.getText())) 
        hp6 = Integer.parseInt(txfHP46.getText());
        if (!"".equals(txfHP47.getText())) 
        hp7 = Integer.parseInt(txfHP47.getText());
        if (!"".equals(txfHP48.getText())) 
        hp8 = Integer.parseInt(txfHP48.getText());
        if (!"".equals(txfHP49.getText())) 
        hp9 = Integer.parseInt(txfHP49.getText());
        if (!"".equals(txfHP50.getText())) 
        hp10 = Integer.parseInt(txfHP50.getText());
        
        if (!"".equals(txfWP41.getText()))   
        wp1 = Integer.parseInt(txfWP41.getText());
        if (!"".equals(txfWP42.getText())) 
        wp2 = Integer.parseInt(txfWP42.getText());
        if (!"".equals(txfWP43.getText())) 
        wp3 = Integer.parseInt(txfWP43.getText());
        if (!"".equals(txfWP44.getText())) 
        wp4 = Integer.parseInt(txfWP44.getText());
        if (!"".equals(txfWP45.getText())) 
        wp5 = Integer.parseInt(txfWP45.getText());
        if (!"".equals(txfWP46.getText())) 
        wp6 = Integer.parseInt(txfWP46.getText());
        if (!"".equals(txfWP47.getText())) 
        wp7 = Integer.parseInt(txfWP47.getText());
        if (!"".equals(txfWP48.getText())) 
        wp8 = Integer.parseInt(txfWP48.getText());
        if (!"".equals(txfWP49.getText())) 
        wp9 = Integer.parseInt(txfWP49.getText());
        if (!"".equals(txfWP50.getText())) 
        wp10 = Integer.parseInt(txfWP50.getText());
        
        if (!"".equals(txfSP41.getText()))   
        sp1 = Integer.parseInt(txfSP41.getText());
        if (!"".equals(txfSP42.getText())) 
        sp2 = Integer.parseInt(txfSP42.getText());
        if (!"".equals(txfSP43.getText())) 
        sp3 = Integer.parseInt(txfSP43.getText());
        if (!"".equals(txfSP44.getText())) 
        sp4 = Integer.parseInt(txfSP44.getText());
        if (!"".equals(txfSP45.getText())) 
        sp5 = Integer.parseInt(txfSP45.getText());
        if (!"".equals(txfSP46.getText())) 
        sp6 = Integer.parseInt(txfSP46.getText());
        if (!"".equals(txfSP47.getText())) 
        sp7 = Integer.parseInt(txfSP47.getText());
        if (!"".equals(txfSP48.getText())) 
        sp8 = Integer.parseInt(txfSP48.getText());
        if (!"".equals(txfSP49.getText())) 
        sp9 = Integer.parseInt(txfSP49.getText());
        if (!"".equals(txfSP50.getText())) 
        sp10 = Integer.parseInt(txfSP50.getText());
        
        
        HX = ((hp1 + hp2 + hp3 + hp4 + hp5 + hp6 + hp7 + hp8 + hp9 + hp10) + (10 / 2)) / 10;
        txfHandel4.setText(String.valueOf(HX));
        int gbh = (HX + (10 / 2)) / 10;
        txfGBH4.setText(String.valueOf(gbh));
        WX = ((wp1 + wp2 + wp3 + wp4 + wp5 + wp6 + wp7 + wp8 + wp9 + wp10) + (10 / 2)) / 10;
        txfWissen4.setText(String.valueOf(WX));
        int gbw = (WX + (10 / 2)) / 10;
        txfGBW4.setText(String.valueOf(gbw));
        SX = ((sp1 + sp2 + sp3 + sp4 + sp5 + sp6 + sp7 + sp8 + sp9 + sp10) + (10 / 2)) / 10;
        txfSoziales4.setText(String.valueOf(SX)); 
        int gbs = (SX + (10 / 2)) / 10;
        txfGBS4.setText(String.valueOf(gbs));
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblmain = new javax.swing.JLabel();
        tglbtnL = new javax.swing.JToggleButton();
        tglbtnR = new javax.swing.JToggleButton();
        btnClose = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblHandelX = new javax.swing.JLabel();
        lblWissenX = new javax.swing.JLabel();
        lblSozialesX = new javax.swing.JLabel();
        lblGBW = new javax.swing.JLabel();
        lblGBH = new javax.swing.JLabel();
        lblGBS = new javax.swing.JLabel();
        lblFront = new javax.swing.JLabel();
        tabbMain = new javax.swing.JTabbedPane();
        tabb1 = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        lblAlter = new javax.swing.JLabel();
        txfAlter = new javax.swing.JTextField();
        lblGeschlecht = new javax.swing.JLabel();
        txfGeschlecht = new javax.swing.JTextField();
        lblRasse = new javax.swing.JLabel();
        txfRasse = new javax.swing.JTextField();
        lblBeruf = new javax.swing.JLabel();
        txfBeruf = new javax.swing.JTextField();
        lblStatur = new javax.swing.JLabel();
        txfStatur = new javax.swing.JTextField();
        lblHeimat = new javax.swing.JLabel();
        txfHeimat = new javax.swing.JTextField();
        lblPortrait = new javax.swing.JLabel();
        txfSlider = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jPanelStats = new javax.swing.JPanel();
        txfHandel = new javax.swing.JTextField();
        txfGBH = new javax.swing.JTextField();
        txfWissen = new javax.swing.JTextField();
        txfGBW = new javax.swing.JTextField();
        txfSoziales = new javax.swing.JTextField();
        txfGBS = new javax.swing.JTextField();
        txfH1 = new javax.swing.JTextField();
        txfHP1 = new javax.swing.JTextField();
        txfW1 = new javax.swing.JTextField();
        txfWP1 = new javax.swing.JTextField();
        txfS1 = new javax.swing.JTextField();
        txfSP1 = new javax.swing.JTextField();
        txfH2 = new javax.swing.JTextField();
        txfHP2 = new javax.swing.JTextField();
        txfW2 = new javax.swing.JTextField();
        txfWP2 = new javax.swing.JTextField();
        txfS2 = new javax.swing.JTextField();
        txfSP2 = new javax.swing.JTextField();
        txfH3 = new javax.swing.JTextField();
        txfHP3 = new javax.swing.JTextField();
        txfW3 = new javax.swing.JTextField();
        txfWP3 = new javax.swing.JTextField();
        txfS3 = new javax.swing.JTextField();
        txfSP3 = new javax.swing.JTextField();
        txfH4 = new javax.swing.JTextField();
        txfHP4 = new javax.swing.JTextField();
        txfW4 = new javax.swing.JTextField();
        txfWP4 = new javax.swing.JTextField();
        txfS4 = new javax.swing.JTextField();
        txfSP4 = new javax.swing.JTextField();
        txfH5 = new javax.swing.JTextField();
        txfHP5 = new javax.swing.JTextField();
        txfW5 = new javax.swing.JTextField();
        txfWP5 = new javax.swing.JTextField();
        txfS5 = new javax.swing.JTextField();
        txfSP5 = new javax.swing.JTextField();
        txfH6 = new javax.swing.JTextField();
        txfHP6 = new javax.swing.JTextField();
        txfW6 = new javax.swing.JTextField();
        txfWP6 = new javax.swing.JTextField();
        txfS6 = new javax.swing.JTextField();
        txfSP6 = new javax.swing.JTextField();
        txfH7 = new javax.swing.JTextField();
        txfHP7 = new javax.swing.JTextField();
        txfW7 = new javax.swing.JTextField();
        txfWP7 = new javax.swing.JTextField();
        txfS7 = new javax.swing.JTextField();
        txfSP7 = new javax.swing.JTextField();
        txfH8 = new javax.swing.JTextField();
        txfHP8 = new javax.swing.JTextField();
        txfW8 = new javax.swing.JTextField();
        txfWP8 = new javax.swing.JTextField();
        txfS8 = new javax.swing.JTextField();
        txfSP8 = new javax.swing.JTextField();
        txfH9 = new javax.swing.JTextField();
        txfHP9 = new javax.swing.JTextField();
        txfW9 = new javax.swing.JTextField();
        txfWP9 = new javax.swing.JTextField();
        txfS9 = new javax.swing.JTextField();
        txfSP9 = new javax.swing.JTextField();
        txfH10 = new javax.swing.JTextField();
        txfHP10 = new javax.swing.JTextField();
        txfW10 = new javax.swing.JTextField();
        txfWP10 = new javax.swing.JTextField();
        txfS10 = new javax.swing.JTextField();
        txfSP10 = new javax.swing.JTextField();
        tabb2 = new javax.swing.JPanel();
        panelMain1 = new javax.swing.JPanel();
        btnNext1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txfName1 = new javax.swing.JTextField();
        lblAlter1 = new javax.swing.JLabel();
        txfAlter1 = new javax.swing.JTextField();
        lblGeschlecht1 = new javax.swing.JLabel();
        txfGeschlecht1 = new javax.swing.JTextField();
        lblRasse1 = new javax.swing.JLabel();
        txfRasse1 = new javax.swing.JTextField();
        lblBeruf1 = new javax.swing.JLabel();
        txfBeruf1 = new javax.swing.JTextField();
        lblStatur1 = new javax.swing.JLabel();
        txfStatur1 = new javax.swing.JTextField();
        lblHeimat1 = new javax.swing.JLabel();
        txfHeimat1 = new javax.swing.JTextField();
        lblPortrait1 = new javax.swing.JLabel();
        txfSlider2 = new javax.swing.JTextField();
        jSlider2 = new javax.swing.JSlider();
        jPanelStats1 = new javax.swing.JPanel();
        txfHandel1 = new javax.swing.JTextField();
        txfGBH1 = new javax.swing.JTextField();
        txfWissen1 = new javax.swing.JTextField();
        txfGBW1 = new javax.swing.JTextField();
        txfSoziales1 = new javax.swing.JTextField();
        txfGBS1 = new javax.swing.JTextField();
        txfH11 = new javax.swing.JTextField();
        txfHP11 = new javax.swing.JTextField();
        txfW11 = new javax.swing.JTextField();
        txfWP11 = new javax.swing.JTextField();
        txfS11 = new javax.swing.JTextField();
        txfSP11 = new javax.swing.JTextField();
        txfH12 = new javax.swing.JTextField();
        txfHP12 = new javax.swing.JTextField();
        txfW12 = new javax.swing.JTextField();
        txfWP12 = new javax.swing.JTextField();
        txfS12 = new javax.swing.JTextField();
        txfSP12 = new javax.swing.JTextField();
        txfH13 = new javax.swing.JTextField();
        txfHP13 = new javax.swing.JTextField();
        txfW13 = new javax.swing.JTextField();
        txfWP13 = new javax.swing.JTextField();
        txfS13 = new javax.swing.JTextField();
        txfSP13 = new javax.swing.JTextField();
        txfH14 = new javax.swing.JTextField();
        txfHP14 = new javax.swing.JTextField();
        txfW14 = new javax.swing.JTextField();
        txfWP14 = new javax.swing.JTextField();
        txfS14 = new javax.swing.JTextField();
        txfSP14 = new javax.swing.JTextField();
        txfH15 = new javax.swing.JTextField();
        txfHP15 = new javax.swing.JTextField();
        txfW15 = new javax.swing.JTextField();
        txfWP15 = new javax.swing.JTextField();
        txfS15 = new javax.swing.JTextField();
        txfSP15 = new javax.swing.JTextField();
        txfH16 = new javax.swing.JTextField();
        txfHP16 = new javax.swing.JTextField();
        txfW16 = new javax.swing.JTextField();
        txfWP16 = new javax.swing.JTextField();
        txfS16 = new javax.swing.JTextField();
        txfSP16 = new javax.swing.JTextField();
        txfH17 = new javax.swing.JTextField();
        txfHP17 = new javax.swing.JTextField();
        txfW17 = new javax.swing.JTextField();
        txfWP17 = new javax.swing.JTextField();
        txfS17 = new javax.swing.JTextField();
        txfSP17 = new javax.swing.JTextField();
        txfH18 = new javax.swing.JTextField();
        txfHP18 = new javax.swing.JTextField();
        txfW18 = new javax.swing.JTextField();
        txfWP18 = new javax.swing.JTextField();
        txfS18 = new javax.swing.JTextField();
        txfSP18 = new javax.swing.JTextField();
        txfH19 = new javax.swing.JTextField();
        txfHP19 = new javax.swing.JTextField();
        txfW19 = new javax.swing.JTextField();
        txfWP19 = new javax.swing.JTextField();
        txfS19 = new javax.swing.JTextField();
        txfSP19 = new javax.swing.JTextField();
        txfH20 = new javax.swing.JTextField();
        txfHP20 = new javax.swing.JTextField();
        txfW20 = new javax.swing.JTextField();
        txfWP20 = new javax.swing.JTextField();
        txfS20 = new javax.swing.JTextField();
        txfSP20 = new javax.swing.JTextField();
        tabb3 = new javax.swing.JPanel();
        panelMain4 = new javax.swing.JPanel();
        btnNext4 = new javax.swing.JButton();
        btnDelete4 = new javax.swing.JButton();
        lblName4 = new javax.swing.JLabel();
        txfName4 = new javax.swing.JTextField();
        lblAlter4 = new javax.swing.JLabel();
        txfAlter4 = new javax.swing.JTextField();
        lblGeschlecht4 = new javax.swing.JLabel();
        txfGeschlecht4 = new javax.swing.JTextField();
        lblRasse4 = new javax.swing.JLabel();
        txfRasse4 = new javax.swing.JTextField();
        lblBeruf4 = new javax.swing.JLabel();
        txfBeruf4 = new javax.swing.JTextField();
        lblStatur4 = new javax.swing.JLabel();
        txfStatur4 = new javax.swing.JTextField();
        lblHeimat4 = new javax.swing.JLabel();
        txfHeimat4 = new javax.swing.JTextField();
        lblPortrait4 = new javax.swing.JLabel();
        txfSlider4 = new javax.swing.JTextField();
        jSlider5 = new javax.swing.JSlider();
        jPanelStats4 = new javax.swing.JPanel();
        txfHandel4 = new javax.swing.JTextField();
        txfGBH4 = new javax.swing.JTextField();
        txfWissen4 = new javax.swing.JTextField();
        txfGBW4 = new javax.swing.JTextField();
        txfSoziales4 = new javax.swing.JTextField();
        txfGBS4 = new javax.swing.JTextField();
        txfH41 = new javax.swing.JTextField();
        txfHP41 = new javax.swing.JTextField();
        txfW41 = new javax.swing.JTextField();
        txfWP41 = new javax.swing.JTextField();
        txfS41 = new javax.swing.JTextField();
        txfSP41 = new javax.swing.JTextField();
        txfH42 = new javax.swing.JTextField();
        txfHP42 = new javax.swing.JTextField();
        txfW42 = new javax.swing.JTextField();
        txfWP42 = new javax.swing.JTextField();
        txfS42 = new javax.swing.JTextField();
        txfSP42 = new javax.swing.JTextField();
        txfH43 = new javax.swing.JTextField();
        txfHP43 = new javax.swing.JTextField();
        txfW43 = new javax.swing.JTextField();
        txfWP43 = new javax.swing.JTextField();
        txfS43 = new javax.swing.JTextField();
        txfSP43 = new javax.swing.JTextField();
        txfH44 = new javax.swing.JTextField();
        txfHP44 = new javax.swing.JTextField();
        txfW44 = new javax.swing.JTextField();
        txfWP44 = new javax.swing.JTextField();
        txfS44 = new javax.swing.JTextField();
        txfSP44 = new javax.swing.JTextField();
        txfH45 = new javax.swing.JTextField();
        txfHP45 = new javax.swing.JTextField();
        txfW45 = new javax.swing.JTextField();
        txfWP45 = new javax.swing.JTextField();
        txfS45 = new javax.swing.JTextField();
        txfSP45 = new javax.swing.JTextField();
        txfH46 = new javax.swing.JTextField();
        txfHP46 = new javax.swing.JTextField();
        txfW46 = new javax.swing.JTextField();
        txfWP46 = new javax.swing.JTextField();
        txfS46 = new javax.swing.JTextField();
        txfSP46 = new javax.swing.JTextField();
        txfH47 = new javax.swing.JTextField();
        txfHP47 = new javax.swing.JTextField();
        txfW47 = new javax.swing.JTextField();
        txfWP47 = new javax.swing.JTextField();
        txfS47 = new javax.swing.JTextField();
        txfSP47 = new javax.swing.JTextField();
        txfH48 = new javax.swing.JTextField();
        txfHP48 = new javax.swing.JTextField();
        txfW48 = new javax.swing.JTextField();
        txfWP48 = new javax.swing.JTextField();
        txfS48 = new javax.swing.JTextField();
        txfSP48 = new javax.swing.JTextField();
        txfH49 = new javax.swing.JTextField();
        txfHP49 = new javax.swing.JTextField();
        txfW49 = new javax.swing.JTextField();
        txfWP49 = new javax.swing.JTextField();
        txfS49 = new javax.swing.JTextField();
        txfSP49 = new javax.swing.JTextField();
        txfH50 = new javax.swing.JTextField();
        txfHP50 = new javax.swing.JTextField();
        txfW50 = new javax.swing.JTextField();
        txfWP50 = new javax.swing.JTextField();
        txfS50 = new javax.swing.JTextField();
        txfSP50 = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        pnlR = new javax.swing.JPanel();
        btnRules = new javax.swing.JButton();
        lblFrontR = new javax.swing.JLabel();
        pnlRmain = new javax.swing.JPanel();
        scrpWaffen = new javax.swing.JScrollPane();
        txaWaffen = new javax.swing.JTextArea();
        lblWaffen = new javax.swing.JLabel();
        scrpZauber = new javax.swing.JScrollPane();
        txaZauber = new javax.swing.JTextArea();
        lblZauber = new javax.swing.JLabel();
        scrpRucksack = new javax.swing.JScrollPane();
        txaRucksack = new javax.swing.JTextArea();
        lblRucksack = new javax.swing.JLabel();
        lblRucksackb = new javax.swing.JLabel();
        pnlRmain1 = new javax.swing.JPanel();
        scrpWaffen1 = new javax.swing.JScrollPane();
        txaWaffen1 = new javax.swing.JTextArea();
        lblWaffen1 = new javax.swing.JLabel();
        scrpZauber1 = new javax.swing.JScrollPane();
        txaZauber1 = new javax.swing.JTextArea();
        lblZauber1 = new javax.swing.JLabel();
        scrpRucksack1 = new javax.swing.JScrollPane();
        txaRucksack1 = new javax.swing.JTextArea();
        lblRucksack1 = new javax.swing.JLabel();
        lblRucksackb1 = new javax.swing.JLabel();
        pnlRmain2 = new javax.swing.JPanel();
        scrpWaffen2 = new javax.swing.JScrollPane();
        txaWaffen2 = new javax.swing.JTextArea();
        lblWaffen2 = new javax.swing.JLabel();
        scrpZauber2 = new javax.swing.JScrollPane();
        txaZauber2 = new javax.swing.JTextArea();
        lblZauber2 = new javax.swing.JLabel();
        scrpRucksack2 = new javax.swing.JScrollPane();
        txaRucksack2 = new javax.swing.JTextArea();
        lblRucksack2 = new javax.swing.JLabel();
        lblRucksackb2 = new javax.swing.JLabel();
        lblRback = new javax.swing.JLabel();
        pnlL = new javax.swing.JPanel();
        tfxRNG = new javax.swing.JTextField();
        btnRNG = new javax.swing.JButton();
        txfWürfel = new javax.swing.JTextField();
        sliderRNG = new javax.swing.JSlider();
        lblFrontL = new javax.swing.JLabel();
        pnlLmain = new javax.swing.JPanel();
        scrpNotizen = new javax.swing.JScrollPane();
        txaNotizen = new javax.swing.JTextArea();
        lblNotizen = new javax.swing.JLabel();
        pnlLmain1 = new javax.swing.JPanel();
        scrpNotizen1 = new javax.swing.JScrollPane();
        txaNotizen1 = new javax.swing.JTextArea();
        lblNotizen1 = new javax.swing.JLabel();
        pnlLmain2 = new javax.swing.JPanel();
        scrpNotizen2 = new javax.swing.JScrollPane();
        txaNotizen2 = new javax.swing.JTextArea();
        lblNotizen2 = new javax.swing.JLabel();
        lblLback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 750));
        setMinimumSize(new java.awt.Dimension(500, 750));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 750));
        getContentPane().setLayout(null);

        pnlMain.setMaximumSize(new java.awt.Dimension(500, 750));
        pnlMain.setMinimumSize(new java.awt.Dimension(500, 750));
        pnlMain.setPreferredSize(new java.awt.Dimension(500, 750));
        pnlMain.setLayout(null);

        lblmain.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        lblmain.setForeground(new java.awt.Color(0, 0, 0));
        lblmain.setText("H.E.R.O.");
        lblmain.setToolTipText("HardHack Entertainment Roleplay Organizer");
        pnlMain.add(lblmain);
        lblmain.setBounds(10, 30, 140, 29);

        tglbtnL.setBackground(new java.awt.Color(153, 153, 153));
        tglbtnL.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        tglbtnL.setForeground(new java.awt.Color(0, 0, 0));
        tglbtnL.setText("<   ");
        tglbtnL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tglbtnL.setFocusable(false);
        tglbtnL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tglbtnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglbtnLActionPerformed(evt);
            }
        });
        pnlMain.add(tglbtnL);
        tglbtnL.setBounds(5, 353, 50, 25);

        tglbtnR.setBackground(new java.awt.Color(153, 153, 153));
        tglbtnR.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        tglbtnR.setForeground(new java.awt.Color(0, 0, 0));
        tglbtnR.setText(">");
        tglbtnR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tglbtnR.setFocusable(false);
        tglbtnR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tglbtnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglbtnRActionPerformed(evt);
            }
        });
        pnlMain.add(tglbtnR);
        tglbtnR.setBounds(445, 353, 50, 25);
        tglbtnR.getAccessibleContext().setAccessibleName(" >");

        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/closebtn.png"))); // NOI18N
        btnClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClose.setBorderPainted(false);
        btnClose.setFocusable(false);
        btnClose.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnClose.setMaximumSize(new java.awt.Dimension(100, 100));
        btnClose.setMinimumSize(new java.awt.Dimension(100, 100));
        btnClose.setPreferredSize(new java.awt.Dimension(100, 100));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlMain.add(btnClose);
        btnClose.setBounds(450, 3, 48, 48);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/safe.png"))); // NOI18N
        btnEdit.setToolTipText("Speichern");
        btnEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 153)));
        btnEdit.setFocusable(false);
        btnEdit.setMargin(new java.awt.Insets(1, 10, 2, 10));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlMain.add(btnEdit);
        btnEdit.setBounds(382, 320, 50, 25);

        lblHandelX.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 50)); // NOI18N
        lblHandelX.setForeground(new java.awt.Color(0, 0, 0));
        lblHandelX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/Hlbl.png"))); // NOI18N
        lblHandelX.setToolTipText("Handel");
        lblHandelX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(lblHandelX);
        lblHandelX.setBounds(10, 390, 51, 53);

        lblWissenX.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        lblWissenX.setForeground(new java.awt.Color(0, 0, 0));
        lblWissenX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/Wlbl.png"))); // NOI18N
        lblWissenX.setToolTipText("Wissen");
        lblWissenX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(lblWissenX);
        lblWissenX.setBounds(170, 389, 51, 53);

        lblSozialesX.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 48)); // NOI18N
        lblSozialesX.setForeground(new java.awt.Color(0, 0, 0));
        lblSozialesX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/Slbl.png"))); // NOI18N
        lblSozialesX.setToolTipText("Soziales");
        lblSozialesX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMain.add(lblSozialesX);
        lblSozialesX.setBounds(330, 390, 51, 53);

        lblGBW.setFont(new java.awt.Font("Algerian", 0, 20)); // NOI18N
        lblGBW.setForeground(new java.awt.Color(0, 51, 204));
        lblGBW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/GBWlbl.png"))); // NOI18N
        pnlMain.add(lblGBW);
        lblGBW.setBounds(290, 390, 26, 25);

        lblGBH.setFont(new java.awt.Font("Algerian", 0, 20)); // NOI18N
        lblGBH.setForeground(new java.awt.Color(204, 153, 0));
        lblGBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/GBHlbl.png"))); // NOI18N
        pnlMain.add(lblGBH);
        lblGBH.setBounds(130, 390, 25, 25);

        lblGBS.setFont(new java.awt.Font("Algerian", 0, 20)); // NOI18N
        lblGBS.setForeground(new java.awt.Color(0, 0, 0));
        lblGBS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/GBSlbl.png"))); // NOI18N
        pnlMain.add(lblGBS);
        lblGBS.setBounds(450, 390, 25, 25);

        lblFront.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/front.png"))); // NOI18N
        pnlMain.add(lblFront);
        lblFront.setBounds(0, 0, 500, 750);

        tabbMain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabbMain.setForeground(new java.awt.Color(51, 51, 51));
        tabbMain.setFocusable(false);
        tabbMain.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        tabbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MouseClicker(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseClicker(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MouseClicker(evt);
            }
        });

        tabb1.setLayout(null);

        panelMain.setMaximumSize(new java.awt.Dimension(500, 750));
        panelMain.setMinimumSize(new java.awt.Dimension(500, 750));
        panelMain.setPreferredSize(new java.awt.Dimension(500, 750));
        panelMain.setLayout(null);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/next.png"))); // NOI18N
        btnNext.setBorder(null);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panelMain.add(btnNext);
        btnNext.setBounds(437, 192, 40, 20);

        btnDelete.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/deletebtn.png"))); // NOI18N
        btnDelete.setToolTipText("Löschen");
        btnDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelMain.add(btnDelete);
        btnDelete.setBounds(440, 10, 25, 25);

        lblName.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 0, 0));
        lblName.setText("Name:");
        panelMain.add(lblName);
        lblName.setBounds(5, 10, 80, 25);

        txfName.setBackground(new java.awt.Color(153, 153, 153));
        txfName.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfName.setForeground(new java.awt.Color(0, 0, 0));
        txfName.setText("?");
        txfName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfName);
        txfName.setBounds(100, 10, 340, 25);

        lblAlter.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblAlter.setForeground(new java.awt.Color(102, 0, 0));
        lblAlter.setText("Alter:");
        panelMain.add(lblAlter);
        lblAlter.setBounds(188, 50, 65, 25);

        txfAlter.setBackground(new java.awt.Color(153, 153, 153));
        txfAlter.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfAlter.setForeground(new java.awt.Color(0, 0, 0));
        txfAlter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlter.setText("?");
        txfAlter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfAlter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfAlter);
        txfAlter.setBounds(250, 50, 50, 25);

        lblGeschlecht.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblGeschlecht.setForeground(new java.awt.Color(102, 0, 0));
        lblGeschlecht.setText("Geschlecht:");
        panelMain.add(lblGeschlecht);
        lblGeschlecht.setBounds(5, 50, 120, 25);

        txfGeschlecht.setBackground(new java.awt.Color(153, 153, 153));
        txfGeschlecht.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfGeschlecht.setForeground(new java.awt.Color(0, 0, 0));
        txfGeschlecht.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfGeschlecht.setText("?");
        txfGeschlecht.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGeschlecht.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfGeschlecht);
        txfGeschlecht.setBounds(120, 50, 45, 25);

        lblRasse.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblRasse.setForeground(new java.awt.Color(102, 0, 0));
        lblRasse.setText("Rasse:");
        panelMain.add(lblRasse);
        lblRasse.setBounds(15, 90, 75, 25);

        txfRasse.setBackground(new java.awt.Color(153, 153, 153));
        txfRasse.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfRasse.setForeground(new java.awt.Color(0, 0, 0));
        txfRasse.setText("?");
        txfRasse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfRasse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfRasse);
        txfRasse.setBounds(120, 90, 180, 25);

        lblBeruf.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblBeruf.setForeground(new java.awt.Color(102, 0, 0));
        lblBeruf.setText("Beruf:");
        panelMain.add(lblBeruf);
        lblBeruf.setBounds(15, 150, 75, 25);

        txfBeruf.setBackground(new java.awt.Color(153, 153, 153));
        txfBeruf.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfBeruf.setForeground(new java.awt.Color(0, 0, 0));
        txfBeruf.setText("?");
        txfBeruf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfBeruf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfBeruf);
        txfBeruf.setBounds(120, 150, 180, 25);

        lblStatur.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblStatur.setForeground(new java.awt.Color(102, 0, 0));
        lblStatur.setText("Statur:");
        panelMain.add(lblStatur);
        lblStatur.setBounds(15, 180, 75, 25);

        txfStatur.setBackground(new java.awt.Color(153, 153, 153));
        txfStatur.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfStatur.setForeground(new java.awt.Color(0, 0, 0));
        txfStatur.setText("?");
        txfStatur.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfStatur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfStatur);
        txfStatur.setBounds(120, 180, 180, 25);

        lblHeimat.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblHeimat.setForeground(new java.awt.Color(102, 0, 0));
        lblHeimat.setText("HeiMaT:");
        panelMain.add(lblHeimat);
        lblHeimat.setBounds(15, 120, 75, 25);

        txfHeimat.setBackground(new java.awt.Color(153, 153, 153));
        txfHeimat.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfHeimat.setForeground(new java.awt.Color(0, 0, 0));
        txfHeimat.setText("?");
        txfHeimat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHeimat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain.add(txfHeimat);
        txfHeimat.setBounds(120, 120, 180, 25);

        lblPortrait.setBackground(new java.awt.Color(0, 0, 0));
        lblPortrait.setForeground(new java.awt.Color(0, 0, 0));
        lblPortrait.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelMain.add(lblPortrait);
        lblPortrait.setBounds(330, 50, 150, 165);

        txfSlider.setBackground(new java.awt.Color(51, 0, 0));
        txfSlider.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        txfSlider.setForeground(new java.awt.Color(153, 0, 0));
        txfSlider.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSlider.setText("00");
        txfSlider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSlider.setCaretColor(new java.awt.Color(51, 0, 0));
        txfSlider.setFocusable(false);
        txfSlider.setHighlighter(null);
        txfSlider.setMargin(new java.awt.Insets(30, 5, 0, 5));
        panelMain.add(txfSlider);
        txfSlider.setBounds(212, 212, 64, 35);

        jSlider1.setBackground(new java.awt.Color(153, 153, 153));
        jSlider1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(51, 51, 51));
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jSlider1.setFocusable(false);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        panelMain.add(jSlider1);
        jSlider1.setBounds(80, 250, 340, 20);

        jPanelStats.setLayout(null);

        txfHandel.setBackground(new java.awt.Color(102, 102, 102));
        txfHandel.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfHandel.setForeground(new java.awt.Color(0, 0, 0));
        txfHandel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfHandel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHandel.setFocusable(false);
        txfHandel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfHandel);
        txfHandel.setBounds(60, 12, 60, 35);

        txfGBH.setBackground(new java.awt.Color(102, 102, 102));
        txfGBH.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBH.setForeground(new java.awt.Color(255, 255, 255));
        txfGBH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBH.setFocusable(false);
        txfGBH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfGBH);
        txfGBH.setBounds(130, 30, 30, 25);

        txfWissen.setBackground(new java.awt.Color(102, 102, 102));
        txfWissen.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfWissen.setForeground(new java.awt.Color(0, 0, 0));
        txfWissen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfWissen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWissen.setFocusable(false);
        txfWissen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfWissen);
        txfWissen.setBounds(220, 12, 60, 35);

        txfGBW.setBackground(new java.awt.Color(102, 102, 102));
        txfGBW.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBW.setForeground(new java.awt.Color(255, 255, 255));
        txfGBW.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBW.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBW.setFocusable(false);
        txfGBW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfGBW);
        txfGBW.setBounds(290, 30, 30, 25);

        txfSoziales.setBackground(new java.awt.Color(102, 102, 102));
        txfSoziales.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfSoziales.setForeground(new java.awt.Color(0, 0, 0));
        txfSoziales.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSoziales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSoziales.setFocusable(false);
        txfSoziales.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfSoziales);
        txfSoziales.setBounds(380, 12, 60, 35);

        txfGBS.setBackground(new java.awt.Color(102, 102, 102));
        txfGBS.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBS.setForeground(new java.awt.Color(255, 255, 255));
        txfGBS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBS.setFocusable(false);
        txfGBS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfGBS);
        txfGBS.setBounds(450, 30, 30, 25);

        txfH1.setBackground(new java.awt.Color(153, 153, 153));
        txfH1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH1.setForeground(new java.awt.Color(0, 0, 0));
        txfH1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH1.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH1.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH1.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH1);
        txfH1.setBounds(10, 60, 125, 25);

        txfHP1.setBackground(new java.awt.Color(153, 153, 153));
        txfHP1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP1.setForeground(new java.awt.Color(0, 0, 0));
        txfHP1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP1);
        txfHP1.setBounds(135, 60, 30, 25);

        txfW1.setBackground(new java.awt.Color(153, 153, 153));
        txfW1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW1.setForeground(new java.awt.Color(0, 0, 0));
        txfW1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW1.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW1.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW1.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW1);
        txfW1.setBounds(170, 60, 125, 25);

        txfWP1.setBackground(new java.awt.Color(153, 153, 153));
        txfWP1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP1.setForeground(new java.awt.Color(0, 0, 0));
        txfWP1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP1);
        txfWP1.setBounds(295, 60, 30, 25);

        txfS1.setBackground(new java.awt.Color(153, 153, 153));
        txfS1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS1.setForeground(new java.awt.Color(0, 0, 0));
        txfS1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS1.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS1.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS1.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS1);
        txfS1.setBounds(330, 60, 125, 25);

        txfSP1.setBackground(new java.awt.Color(153, 153, 153));
        txfSP1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP1.setForeground(new java.awt.Color(0, 0, 0));
        txfSP1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP1.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP1);
        txfSP1.setBounds(455, 60, 30, 25);

        txfH2.setBackground(new java.awt.Color(153, 153, 153));
        txfH2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH2.setForeground(new java.awt.Color(0, 0, 0));
        txfH2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH2.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH2.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH2.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH2);
        txfH2.setBounds(10, 90, 125, 25);

        txfHP2.setBackground(new java.awt.Color(153, 153, 153));
        txfHP2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP2.setForeground(new java.awt.Color(0, 0, 0));
        txfHP2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP2);
        txfHP2.setBounds(135, 90, 30, 25);

        txfW2.setBackground(new java.awt.Color(153, 153, 153));
        txfW2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW2.setForeground(new java.awt.Color(0, 0, 0));
        txfW2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW2.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW2.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW2.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW2);
        txfW2.setBounds(170, 90, 125, 25);

        txfWP2.setBackground(new java.awt.Color(153, 153, 153));
        txfWP2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP2.setForeground(new java.awt.Color(0, 0, 0));
        txfWP2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP2);
        txfWP2.setBounds(295, 90, 30, 25);

        txfS2.setBackground(new java.awt.Color(153, 153, 153));
        txfS2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS2.setForeground(new java.awt.Color(0, 0, 0));
        txfS2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS2.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS2.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS2.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS2);
        txfS2.setBounds(330, 90, 125, 25);

        txfSP2.setBackground(new java.awt.Color(153, 153, 153));
        txfSP2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP2.setForeground(new java.awt.Color(0, 0, 0));
        txfSP2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP2.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP2);
        txfSP2.setBounds(455, 90, 30, 25);

        txfH3.setBackground(new java.awt.Color(153, 153, 153));
        txfH3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH3.setForeground(new java.awt.Color(0, 0, 0));
        txfH3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH3.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH3.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH3.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH3);
        txfH3.setBounds(10, 120, 125, 25);

        txfHP3.setBackground(new java.awt.Color(153, 153, 153));
        txfHP3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP3.setForeground(new java.awt.Color(0, 0, 0));
        txfHP3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP3);
        txfHP3.setBounds(135, 120, 30, 25);

        txfW3.setBackground(new java.awt.Color(153, 153, 153));
        txfW3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW3.setForeground(new java.awt.Color(0, 0, 0));
        txfW3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW3.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW3.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW3.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW3);
        txfW3.setBounds(170, 120, 125, 25);

        txfWP3.setBackground(new java.awt.Color(153, 153, 153));
        txfWP3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP3.setForeground(new java.awt.Color(0, 0, 0));
        txfWP3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP3);
        txfWP3.setBounds(295, 120, 30, 25);

        txfS3.setBackground(new java.awt.Color(153, 153, 153));
        txfS3.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS3.setForeground(new java.awt.Color(0, 0, 0));
        txfS3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS3.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS3.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS3.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS3);
        txfS3.setBounds(330, 120, 125, 25);

        txfSP3.setBackground(new java.awt.Color(153, 153, 153));
        txfSP3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP3.setForeground(new java.awt.Color(0, 0, 0));
        txfSP3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP3.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP3);
        txfSP3.setBounds(455, 120, 30, 25);

        txfH4.setBackground(new java.awt.Color(153, 153, 153));
        txfH4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH4.setForeground(new java.awt.Color(0, 0, 0));
        txfH4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH4.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH4.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH4.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH4);
        txfH4.setBounds(10, 150, 125, 25);

        txfHP4.setBackground(new java.awt.Color(153, 153, 153));
        txfHP4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP4.setForeground(new java.awt.Color(0, 0, 0));
        txfHP4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP4);
        txfHP4.setBounds(135, 150, 30, 25);

        txfW4.setBackground(new java.awt.Color(153, 153, 153));
        txfW4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW4.setForeground(new java.awt.Color(0, 0, 0));
        txfW4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW4.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW4.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW4.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW4);
        txfW4.setBounds(170, 150, 125, 25);

        txfWP4.setBackground(new java.awt.Color(153, 153, 153));
        txfWP4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP4.setForeground(new java.awt.Color(0, 0, 0));
        txfWP4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP4);
        txfWP4.setBounds(295, 150, 30, 25);

        txfS4.setBackground(new java.awt.Color(153, 153, 153));
        txfS4.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS4.setForeground(new java.awt.Color(0, 0, 0));
        txfS4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS4.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS4.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS4.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS4);
        txfS4.setBounds(330, 150, 125, 25);

        txfSP4.setBackground(new java.awt.Color(153, 153, 153));
        txfSP4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP4.setForeground(new java.awt.Color(0, 0, 0));
        txfSP4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP4.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP4);
        txfSP4.setBounds(455, 150, 30, 25);

        txfH5.setBackground(new java.awt.Color(153, 153, 153));
        txfH5.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH5.setForeground(new java.awt.Color(0, 0, 0));
        txfH5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH5.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH5.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH5.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH5);
        txfH5.setBounds(10, 180, 125, 25);

        txfHP5.setBackground(new java.awt.Color(153, 153, 153));
        txfHP5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP5.setForeground(new java.awt.Color(0, 0, 0));
        txfHP5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP5);
        txfHP5.setBounds(135, 180, 30, 25);

        txfW5.setBackground(new java.awt.Color(153, 153, 153));
        txfW5.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW5.setForeground(new java.awt.Color(0, 0, 0));
        txfW5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW5.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW5.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW5.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW5);
        txfW5.setBounds(170, 180, 125, 25);

        txfWP5.setBackground(new java.awt.Color(153, 153, 153));
        txfWP5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP5.setForeground(new java.awt.Color(0, 0, 0));
        txfWP5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP5);
        txfWP5.setBounds(295, 180, 30, 25);

        txfS5.setBackground(new java.awt.Color(153, 153, 153));
        txfS5.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS5.setForeground(new java.awt.Color(0, 0, 0));
        txfS5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS5.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS5.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS5.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS5);
        txfS5.setBounds(330, 180, 125, 25);

        txfSP5.setBackground(new java.awt.Color(153, 153, 153));
        txfSP5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP5.setForeground(new java.awt.Color(0, 0, 0));
        txfSP5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP5.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP5);
        txfSP5.setBounds(455, 180, 30, 25);

        txfH6.setBackground(new java.awt.Color(153, 153, 153));
        txfH6.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH6.setForeground(new java.awt.Color(0, 0, 0));
        txfH6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH6.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH6.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH6.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH6);
        txfH6.setBounds(10, 210, 125, 25);

        txfHP6.setBackground(new java.awt.Color(153, 153, 153));
        txfHP6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP6.setForeground(new java.awt.Color(0, 0, 0));
        txfHP6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP6);
        txfHP6.setBounds(135, 210, 30, 25);

        txfW6.setBackground(new java.awt.Color(153, 153, 153));
        txfW6.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW6.setForeground(new java.awt.Color(0, 0, 0));
        txfW6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW6.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW6.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW6.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW6);
        txfW6.setBounds(170, 210, 125, 25);

        txfWP6.setBackground(new java.awt.Color(153, 153, 153));
        txfWP6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP6.setForeground(new java.awt.Color(0, 0, 0));
        txfWP6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP6);
        txfWP6.setBounds(295, 210, 30, 25);

        txfS6.setBackground(new java.awt.Color(153, 153, 153));
        txfS6.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS6.setForeground(new java.awt.Color(0, 0, 0));
        txfS6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS6.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS6.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS6.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS6);
        txfS6.setBounds(330, 210, 125, 25);

        txfSP6.setBackground(new java.awt.Color(153, 153, 153));
        txfSP6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP6.setForeground(new java.awt.Color(0, 0, 0));
        txfSP6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP6.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP6);
        txfSP6.setBounds(455, 210, 30, 25);

        txfH7.setBackground(new java.awt.Color(153, 153, 153));
        txfH7.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH7.setForeground(new java.awt.Color(0, 0, 0));
        txfH7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH7.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH7.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH7.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH7);
        txfH7.setBounds(10, 240, 125, 25);

        txfHP7.setBackground(new java.awt.Color(153, 153, 153));
        txfHP7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP7.setForeground(new java.awt.Color(0, 0, 0));
        txfHP7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP7);
        txfHP7.setBounds(135, 240, 30, 25);

        txfW7.setBackground(new java.awt.Color(153, 153, 153));
        txfW7.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW7.setForeground(new java.awt.Color(0, 0, 0));
        txfW7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW7.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW7.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW7.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW7);
        txfW7.setBounds(170, 240, 125, 25);

        txfWP7.setBackground(new java.awt.Color(153, 153, 153));
        txfWP7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP7.setForeground(new java.awt.Color(0, 0, 0));
        txfWP7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP7);
        txfWP7.setBounds(295, 240, 30, 25);

        txfS7.setBackground(new java.awt.Color(153, 153, 153));
        txfS7.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS7.setForeground(new java.awt.Color(0, 0, 0));
        txfS7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS7.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS7.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS7.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS7);
        txfS7.setBounds(330, 240, 125, 25);

        txfSP7.setBackground(new java.awt.Color(153, 153, 153));
        txfSP7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP7.setForeground(new java.awt.Color(0, 0, 0));
        txfSP7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP7.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP7);
        txfSP7.setBounds(455, 240, 30, 25);

        txfH8.setBackground(new java.awt.Color(153, 153, 153));
        txfH8.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH8.setForeground(new java.awt.Color(0, 0, 0));
        txfH8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH8.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH8.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH8.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH8);
        txfH8.setBounds(10, 270, 125, 25);

        txfHP8.setBackground(new java.awt.Color(153, 153, 153));
        txfHP8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP8.setForeground(new java.awt.Color(0, 0, 0));
        txfHP8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP8);
        txfHP8.setBounds(135, 270, 30, 25);

        txfW8.setBackground(new java.awt.Color(153, 153, 153));
        txfW8.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW8.setForeground(new java.awt.Color(0, 0, 0));
        txfW8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW8.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW8.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW8.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW8);
        txfW8.setBounds(170, 270, 125, 25);

        txfWP8.setBackground(new java.awt.Color(153, 153, 153));
        txfWP8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP8.setForeground(new java.awt.Color(0, 0, 0));
        txfWP8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP8);
        txfWP8.setBounds(295, 270, 30, 25);

        txfS8.setBackground(new java.awt.Color(153, 153, 153));
        txfS8.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS8.setForeground(new java.awt.Color(0, 0, 0));
        txfS8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS8.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS8.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS8.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS8);
        txfS8.setBounds(330, 270, 125, 25);

        txfSP8.setBackground(new java.awt.Color(153, 153, 153));
        txfSP8.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP8.setForeground(new java.awt.Color(0, 0, 0));
        txfSP8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP8.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP8);
        txfSP8.setBounds(455, 270, 30, 25);

        txfH9.setBackground(new java.awt.Color(153, 153, 153));
        txfH9.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH9.setForeground(new java.awt.Color(0, 0, 0));
        txfH9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH9.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH9.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH9.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH9);
        txfH9.setBounds(10, 300, 125, 25);

        txfHP9.setBackground(new java.awt.Color(153, 153, 153));
        txfHP9.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP9.setForeground(new java.awt.Color(0, 0, 0));
        txfHP9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP9);
        txfHP9.setBounds(135, 300, 30, 25);

        txfW9.setBackground(new java.awt.Color(153, 153, 153));
        txfW9.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW9.setForeground(new java.awt.Color(0, 0, 0));
        txfW9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW9.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW9.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW9.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW9);
        txfW9.setBounds(170, 300, 125, 25);

        txfWP9.setBackground(new java.awt.Color(153, 153, 153));
        txfWP9.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP9.setForeground(new java.awt.Color(0, 0, 0));
        txfWP9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP9);
        txfWP9.setBounds(295, 300, 30, 25);

        txfS9.setBackground(new java.awt.Color(153, 153, 153));
        txfS9.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS9.setForeground(new java.awt.Color(0, 0, 0));
        txfS9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS9.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS9.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS9.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS9);
        txfS9.setBounds(330, 300, 125, 25);

        txfSP9.setBackground(new java.awt.Color(153, 153, 153));
        txfSP9.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP9.setForeground(new java.awt.Color(0, 0, 0));
        txfSP9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP9.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP9);
        txfSP9.setBounds(455, 300, 30, 25);

        txfH10.setBackground(new java.awt.Color(153, 153, 153));
        txfH10.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH10.setForeground(new java.awt.Color(0, 0, 0));
        txfH10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH10.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH10.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH10.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfH10);
        txfH10.setBounds(10, 330, 125, 25);

        txfHP10.setBackground(new java.awt.Color(153, 153, 153));
        txfHP10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP10.setForeground(new java.awt.Color(0, 0, 0));
        txfHP10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfHP10);
        txfHP10.setBounds(135, 330, 30, 25);

        txfW10.setBackground(new java.awt.Color(153, 153, 153));
        txfW10.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW10.setForeground(new java.awt.Color(0, 0, 0));
        txfW10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW10.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW10.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW10.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfW10);
        txfW10.setBounds(170, 330, 125, 25);

        txfWP10.setBackground(new java.awt.Color(153, 153, 153));
        txfWP10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP10.setForeground(new java.awt.Color(0, 0, 0));
        txfWP10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfWP10);
        txfWP10.setBounds(295, 330, 30, 25);

        txfS10.setBackground(new java.awt.Color(153, 153, 153));
        txfS10.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS10.setForeground(new java.awt.Color(0, 0, 0));
        txfS10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS10.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS10.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS10.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats.add(txfS10);
        txfS10.setBounds(330, 330, 125, 25);

        txfSP10.setBackground(new java.awt.Color(153, 153, 153));
        txfSP10.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP10.setForeground(new java.awt.Color(0, 0, 0));
        txfSP10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP10.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats.add(txfSP10);
        txfSP10.setBounds(455, 330, 30, 25);

        panelMain.add(jPanelStats);
        jPanelStats.setBounds(0, 280, 500, 370);

        tabb1.add(panelMain);
        panelMain.setBounds(0, 0, 500, 750);

        tabbMain.addTab("< 1 >", tabb1);

        tabb2.setLayout(null);

        panelMain1.setMaximumSize(new java.awt.Dimension(500, 750));
        panelMain1.setMinimumSize(new java.awt.Dimension(500, 750));
        panelMain1.setLayout(null);

        btnNext1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/next.png"))); // NOI18N
        btnNext1.setBorder(null);
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });
        panelMain1.add(btnNext1);
        btnNext1.setBounds(437, 192, 40, 20);

        btnDelete1.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(102, 0, 0));
        btnDelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/deletebtn.png"))); // NOI18N
        btnDelete1.setToolTipText("Löschen");
        btnDelete1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDelete1.setFocusable(false);
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        panelMain1.add(btnDelete1);
        btnDelete1.setBounds(440, 10, 25, 25);

        lblName1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(102, 0, 0));
        lblName1.setText("Name:");
        lblName1.setFocusable(false);
        panelMain1.add(lblName1);
        lblName1.setBounds(5, 10, 80, 25);

        txfName1.setBackground(new java.awt.Color(153, 153, 153));
        txfName1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfName1.setForeground(new java.awt.Color(0, 0, 0));
        txfName1.setText("?");
        txfName1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfName1);
        txfName1.setBounds(100, 10, 340, 25);

        lblAlter1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblAlter1.setForeground(new java.awt.Color(102, 0, 0));
        lblAlter1.setText("Alter:");
        lblAlter1.setFocusable(false);
        panelMain1.add(lblAlter1);
        lblAlter1.setBounds(188, 50, 65, 25);

        txfAlter1.setBackground(new java.awt.Color(153, 153, 153));
        txfAlter1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfAlter1.setForeground(new java.awt.Color(0, 0, 0));
        txfAlter1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlter1.setText("?");
        txfAlter1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfAlter1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfAlter1);
        txfAlter1.setBounds(250, 50, 50, 25);

        lblGeschlecht1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblGeschlecht1.setForeground(new java.awt.Color(102, 0, 0));
        lblGeschlecht1.setText("Geschlecht:");
        lblGeschlecht1.setFocusable(false);
        panelMain1.add(lblGeschlecht1);
        lblGeschlecht1.setBounds(5, 50, 120, 25);

        txfGeschlecht1.setBackground(new java.awt.Color(153, 153, 153));
        txfGeschlecht1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfGeschlecht1.setForeground(new java.awt.Color(0, 0, 0));
        txfGeschlecht1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfGeschlecht1.setText("?");
        txfGeschlecht1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGeschlecht1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfGeschlecht1);
        txfGeschlecht1.setBounds(120, 50, 45, 25);

        lblRasse1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblRasse1.setForeground(new java.awt.Color(102, 0, 0));
        lblRasse1.setText("Rasse:");
        lblRasse1.setFocusable(false);
        panelMain1.add(lblRasse1);
        lblRasse1.setBounds(15, 90, 75, 25);

        txfRasse1.setBackground(new java.awt.Color(153, 153, 153));
        txfRasse1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfRasse1.setForeground(new java.awt.Color(0, 0, 0));
        txfRasse1.setText("?");
        txfRasse1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfRasse1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfRasse1);
        txfRasse1.setBounds(120, 90, 180, 25);

        lblBeruf1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblBeruf1.setForeground(new java.awt.Color(102, 0, 0));
        lblBeruf1.setText("Beruf:");
        lblBeruf1.setFocusable(false);
        panelMain1.add(lblBeruf1);
        lblBeruf1.setBounds(15, 150, 75, 25);

        txfBeruf1.setBackground(new java.awt.Color(153, 153, 153));
        txfBeruf1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfBeruf1.setForeground(new java.awt.Color(0, 0, 0));
        txfBeruf1.setText("?");
        txfBeruf1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfBeruf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfBeruf1);
        txfBeruf1.setBounds(120, 150, 180, 25);

        lblStatur1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblStatur1.setForeground(new java.awt.Color(102, 0, 0));
        lblStatur1.setText("Statur:");
        lblStatur1.setFocusable(false);
        panelMain1.add(lblStatur1);
        lblStatur1.setBounds(15, 180, 75, 25);

        txfStatur1.setBackground(new java.awt.Color(153, 153, 153));
        txfStatur1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfStatur1.setForeground(new java.awt.Color(0, 0, 0));
        txfStatur1.setText("?");
        txfStatur1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfStatur1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfStatur1);
        txfStatur1.setBounds(120, 180, 180, 25);

        lblHeimat1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblHeimat1.setForeground(new java.awt.Color(102, 0, 0));
        lblHeimat1.setText("HeiMaT:");
        lblHeimat1.setFocusable(false);
        panelMain1.add(lblHeimat1);
        lblHeimat1.setBounds(15, 120, 75, 25);

        txfHeimat1.setBackground(new java.awt.Color(153, 153, 153));
        txfHeimat1.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfHeimat1.setForeground(new java.awt.Color(0, 0, 0));
        txfHeimat1.setText("?");
        txfHeimat1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHeimat1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain1.add(txfHeimat1);
        txfHeimat1.setBounds(120, 120, 180, 25);

        lblPortrait1.setBackground(new java.awt.Color(0, 0, 0));
        lblPortrait1.setForeground(new java.awt.Color(0, 0, 0));
        lblPortrait1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblPortrait1.setFocusable(false);
        panelMain1.add(lblPortrait1);
        lblPortrait1.setBounds(330, 50, 150, 165);

        txfSlider2.setBackground(new java.awt.Color(51, 0, 0));
        txfSlider2.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        txfSlider2.setForeground(new java.awt.Color(153, 0, 0));
        txfSlider2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSlider2.setText("00");
        txfSlider2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSlider2.setCaretColor(new java.awt.Color(51, 0, 0));
        txfSlider2.setFocusable(false);
        txfSlider2.setMargin(new java.awt.Insets(30, 5, 0, 5));
        panelMain1.add(txfSlider2);
        txfSlider2.setBounds(212, 212, 64, 35);

        jSlider2.setBackground(new java.awt.Color(153, 153, 153));
        jSlider2.setForeground(new java.awt.Color(51, 51, 51));
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(0);
        jSlider2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jSlider2.setFocusable(false);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });
        panelMain1.add(jSlider2);
        jSlider2.setBounds(80, 250, 340, 20);

        jPanelStats1.setLayout(null);

        txfHandel1.setBackground(new java.awt.Color(102, 102, 102));
        txfHandel1.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfHandel1.setForeground(new java.awt.Color(0, 0, 0));
        txfHandel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfHandel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHandel1.setFocusable(false);
        txfHandel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfHandel1);
        txfHandel1.setBounds(60, 12, 60, 35);

        txfGBH1.setBackground(new java.awt.Color(102, 102, 102));
        txfGBH1.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBH1.setForeground(new java.awt.Color(255, 255, 255));
        txfGBH1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBH1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBH1.setFocusable(false);
        txfGBH1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfGBH1);
        txfGBH1.setBounds(130, 30, 30, 25);

        txfWissen1.setBackground(new java.awt.Color(102, 102, 102));
        txfWissen1.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfWissen1.setForeground(new java.awt.Color(0, 0, 0));
        txfWissen1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfWissen1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWissen1.setFocusable(false);
        txfWissen1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfWissen1);
        txfWissen1.setBounds(220, 12, 60, 35);

        txfGBW1.setBackground(new java.awt.Color(102, 102, 102));
        txfGBW1.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBW1.setForeground(new java.awt.Color(255, 255, 255));
        txfGBW1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBW1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBW1.setFocusable(false);
        txfGBW1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfGBW1);
        txfGBW1.setBounds(290, 30, 30, 25);

        txfSoziales1.setBackground(new java.awt.Color(102, 102, 102));
        txfSoziales1.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfSoziales1.setForeground(new java.awt.Color(0, 0, 0));
        txfSoziales1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSoziales1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSoziales1.setFocusable(false);
        txfSoziales1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfSoziales1);
        txfSoziales1.setBounds(380, 12, 60, 35);

        txfGBS1.setBackground(new java.awt.Color(102, 102, 102));
        txfGBS1.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBS1.setForeground(new java.awt.Color(255, 255, 255));
        txfGBS1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBS1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBS1.setFocusable(false);
        txfGBS1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfGBS1);
        txfGBS1.setBounds(450, 30, 30, 25);

        txfH11.setBackground(new java.awt.Color(153, 153, 153));
        txfH11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH11.setForeground(new java.awt.Color(0, 0, 0));
        txfH11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH11.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH11.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH11.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH11);
        txfH11.setBounds(10, 60, 125, 25);

        txfHP11.setBackground(new java.awt.Color(153, 153, 153));
        txfHP11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP11.setForeground(new java.awt.Color(0, 0, 0));
        txfHP11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP11);
        txfHP11.setBounds(135, 60, 30, 25);

        txfW11.setBackground(new java.awt.Color(153, 153, 153));
        txfW11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW11.setForeground(new java.awt.Color(0, 0, 0));
        txfW11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW11.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW11.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW11.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW11);
        txfW11.setBounds(170, 60, 125, 25);

        txfWP11.setBackground(new java.awt.Color(153, 153, 153));
        txfWP11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP11.setForeground(new java.awt.Color(0, 0, 0));
        txfWP11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP11);
        txfWP11.setBounds(295, 60, 30, 25);

        txfS11.setBackground(new java.awt.Color(153, 153, 153));
        txfS11.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS11.setForeground(new java.awt.Color(0, 0, 0));
        txfS11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS11.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS11.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS11.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS11);
        txfS11.setBounds(330, 60, 125, 25);

        txfSP11.setBackground(new java.awt.Color(153, 153, 153));
        txfSP11.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP11.setForeground(new java.awt.Color(0, 0, 0));
        txfSP11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP11.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP11);
        txfSP11.setBounds(455, 60, 30, 25);

        txfH12.setBackground(new java.awt.Color(153, 153, 153));
        txfH12.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH12.setForeground(new java.awt.Color(0, 0, 0));
        txfH12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH12.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH12.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH12.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH12);
        txfH12.setBounds(10, 90, 125, 25);

        txfHP12.setBackground(new java.awt.Color(153, 153, 153));
        txfHP12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP12.setForeground(new java.awt.Color(0, 0, 0));
        txfHP12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP12);
        txfHP12.setBounds(135, 90, 30, 25);

        txfW12.setBackground(new java.awt.Color(153, 153, 153));
        txfW12.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW12.setForeground(new java.awt.Color(0, 0, 0));
        txfW12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW12.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW12.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW12.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW12);
        txfW12.setBounds(170, 90, 125, 25);

        txfWP12.setBackground(new java.awt.Color(153, 153, 153));
        txfWP12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP12.setForeground(new java.awt.Color(0, 0, 0));
        txfWP12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP12);
        txfWP12.setBounds(295, 90, 30, 25);

        txfS12.setBackground(new java.awt.Color(153, 153, 153));
        txfS12.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS12.setForeground(new java.awt.Color(0, 0, 0));
        txfS12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS12.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS12.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS12.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS12);
        txfS12.setBounds(330, 90, 125, 25);

        txfSP12.setBackground(new java.awt.Color(153, 153, 153));
        txfSP12.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP12.setForeground(new java.awt.Color(0, 0, 0));
        txfSP12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP12.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP12);
        txfSP12.setBounds(455, 90, 30, 25);

        txfH13.setBackground(new java.awt.Color(153, 153, 153));
        txfH13.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH13.setForeground(new java.awt.Color(0, 0, 0));
        txfH13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH13.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH13.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH13.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH13);
        txfH13.setBounds(10, 120, 125, 25);

        txfHP13.setBackground(new java.awt.Color(153, 153, 153));
        txfHP13.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP13.setForeground(new java.awt.Color(0, 0, 0));
        txfHP13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP13);
        txfHP13.setBounds(135, 120, 30, 25);

        txfW13.setBackground(new java.awt.Color(153, 153, 153));
        txfW13.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW13.setForeground(new java.awt.Color(0, 0, 0));
        txfW13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW13.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW13.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW13.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW13);
        txfW13.setBounds(170, 120, 125, 25);

        txfWP13.setBackground(new java.awt.Color(153, 153, 153));
        txfWP13.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP13.setForeground(new java.awt.Color(0, 0, 0));
        txfWP13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP13);
        txfWP13.setBounds(295, 120, 30, 25);

        txfS13.setBackground(new java.awt.Color(153, 153, 153));
        txfS13.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS13.setForeground(new java.awt.Color(0, 0, 0));
        txfS13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS13.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS13.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS13.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS13);
        txfS13.setBounds(330, 120, 125, 25);

        txfSP13.setBackground(new java.awt.Color(153, 153, 153));
        txfSP13.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP13.setForeground(new java.awt.Color(0, 0, 0));
        txfSP13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP13.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP13);
        txfSP13.setBounds(455, 120, 30, 25);

        txfH14.setBackground(new java.awt.Color(153, 153, 153));
        txfH14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH14.setForeground(new java.awt.Color(0, 0, 0));
        txfH14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH14.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH14.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH14.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH14);
        txfH14.setBounds(10, 150, 125, 25);

        txfHP14.setBackground(new java.awt.Color(153, 153, 153));
        txfHP14.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP14.setForeground(new java.awt.Color(0, 0, 0));
        txfHP14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP14);
        txfHP14.setBounds(135, 150, 30, 25);

        txfW14.setBackground(new java.awt.Color(153, 153, 153));
        txfW14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW14.setForeground(new java.awt.Color(0, 0, 0));
        txfW14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW14.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW14.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW14.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW14);
        txfW14.setBounds(170, 150, 125, 25);

        txfWP14.setBackground(new java.awt.Color(153, 153, 153));
        txfWP14.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP14.setForeground(new java.awt.Color(0, 0, 0));
        txfWP14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP14);
        txfWP14.setBounds(295, 150, 30, 25);

        txfS14.setBackground(new java.awt.Color(153, 153, 153));
        txfS14.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS14.setForeground(new java.awt.Color(0, 0, 0));
        txfS14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS14.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS14.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS14.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS14);
        txfS14.setBounds(330, 150, 125, 25);

        txfSP14.setBackground(new java.awt.Color(153, 153, 153));
        txfSP14.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP14.setForeground(new java.awt.Color(0, 0, 0));
        txfSP14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP14.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP14);
        txfSP14.setBounds(455, 150, 30, 25);

        txfH15.setBackground(new java.awt.Color(153, 153, 153));
        txfH15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH15.setForeground(new java.awt.Color(0, 0, 0));
        txfH15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH15.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH15.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH15.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH15);
        txfH15.setBounds(10, 180, 125, 25);

        txfHP15.setBackground(new java.awt.Color(153, 153, 153));
        txfHP15.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP15.setForeground(new java.awt.Color(0, 0, 0));
        txfHP15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP15);
        txfHP15.setBounds(135, 180, 30, 25);

        txfW15.setBackground(new java.awt.Color(153, 153, 153));
        txfW15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW15.setForeground(new java.awt.Color(0, 0, 0));
        txfW15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW15.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW15.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW15.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW15);
        txfW15.setBounds(170, 180, 125, 25);

        txfWP15.setBackground(new java.awt.Color(153, 153, 153));
        txfWP15.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP15.setForeground(new java.awt.Color(0, 0, 0));
        txfWP15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP15);
        txfWP15.setBounds(295, 180, 30, 25);

        txfS15.setBackground(new java.awt.Color(153, 153, 153));
        txfS15.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS15.setForeground(new java.awt.Color(0, 0, 0));
        txfS15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS15.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS15.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS15.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS15);
        txfS15.setBounds(330, 180, 125, 25);

        txfSP15.setBackground(new java.awt.Color(153, 153, 153));
        txfSP15.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP15.setForeground(new java.awt.Color(0, 0, 0));
        txfSP15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP15.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP15);
        txfSP15.setBounds(455, 180, 30, 25);

        txfH16.setBackground(new java.awt.Color(153, 153, 153));
        txfH16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH16.setForeground(new java.awt.Color(0, 0, 0));
        txfH16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH16.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH16.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH16.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH16);
        txfH16.setBounds(10, 210, 125, 25);

        txfHP16.setBackground(new java.awt.Color(153, 153, 153));
        txfHP16.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP16.setForeground(new java.awt.Color(0, 0, 0));
        txfHP16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP16);
        txfHP16.setBounds(135, 210, 30, 25);

        txfW16.setBackground(new java.awt.Color(153, 153, 153));
        txfW16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW16.setForeground(new java.awt.Color(0, 0, 0));
        txfW16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW16.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW16.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW16.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW16);
        txfW16.setBounds(170, 210, 125, 25);

        txfWP16.setBackground(new java.awt.Color(153, 153, 153));
        txfWP16.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP16.setForeground(new java.awt.Color(0, 0, 0));
        txfWP16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP16);
        txfWP16.setBounds(295, 210, 30, 25);

        txfS16.setBackground(new java.awt.Color(153, 153, 153));
        txfS16.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS16.setForeground(new java.awt.Color(0, 0, 0));
        txfS16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS16.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS16.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS16.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS16);
        txfS16.setBounds(330, 210, 125, 25);

        txfSP16.setBackground(new java.awt.Color(153, 153, 153));
        txfSP16.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP16.setForeground(new java.awt.Color(0, 0, 0));
        txfSP16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP16.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP16);
        txfSP16.setBounds(455, 210, 30, 25);

        txfH17.setBackground(new java.awt.Color(153, 153, 153));
        txfH17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH17.setForeground(new java.awt.Color(0, 0, 0));
        txfH17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH17.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH17.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH17.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH17);
        txfH17.setBounds(10, 240, 125, 25);

        txfHP17.setBackground(new java.awt.Color(153, 153, 153));
        txfHP17.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP17.setForeground(new java.awt.Color(0, 0, 0));
        txfHP17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP17);
        txfHP17.setBounds(135, 240, 30, 25);

        txfW17.setBackground(new java.awt.Color(153, 153, 153));
        txfW17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW17.setForeground(new java.awt.Color(0, 0, 0));
        txfW17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW17.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW17.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW17.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW17);
        txfW17.setBounds(170, 240, 125, 25);

        txfWP17.setBackground(new java.awt.Color(153, 153, 153));
        txfWP17.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP17.setForeground(new java.awt.Color(0, 0, 0));
        txfWP17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP17);
        txfWP17.setBounds(295, 240, 30, 25);

        txfS17.setBackground(new java.awt.Color(153, 153, 153));
        txfS17.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS17.setForeground(new java.awt.Color(0, 0, 0));
        txfS17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS17.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS17.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS17.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS17);
        txfS17.setBounds(330, 240, 125, 25);

        txfSP17.setBackground(new java.awt.Color(153, 153, 153));
        txfSP17.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP17.setForeground(new java.awt.Color(0, 0, 0));
        txfSP17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP17.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP17);
        txfSP17.setBounds(455, 240, 30, 25);

        txfH18.setBackground(new java.awt.Color(153, 153, 153));
        txfH18.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH18.setForeground(new java.awt.Color(0, 0, 0));
        txfH18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH18.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH18.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH18.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH18);
        txfH18.setBounds(10, 270, 125, 25);

        txfHP18.setBackground(new java.awt.Color(153, 153, 153));
        txfHP18.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP18.setForeground(new java.awt.Color(0, 0, 0));
        txfHP18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP18);
        txfHP18.setBounds(135, 270, 30, 25);

        txfW18.setBackground(new java.awt.Color(153, 153, 153));
        txfW18.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW18.setForeground(new java.awt.Color(0, 0, 0));
        txfW18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW18.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW18.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW18.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW18);
        txfW18.setBounds(170, 270, 125, 25);

        txfWP18.setBackground(new java.awt.Color(153, 153, 153));
        txfWP18.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP18.setForeground(new java.awt.Color(0, 0, 0));
        txfWP18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP18);
        txfWP18.setBounds(295, 270, 30, 25);

        txfS18.setBackground(new java.awt.Color(153, 153, 153));
        txfS18.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS18.setForeground(new java.awt.Color(0, 0, 0));
        txfS18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS18.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS18.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS18.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS18);
        txfS18.setBounds(330, 270, 125, 25);

        txfSP18.setBackground(new java.awt.Color(153, 153, 153));
        txfSP18.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP18.setForeground(new java.awt.Color(0, 0, 0));
        txfSP18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP18.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP18);
        txfSP18.setBounds(455, 270, 30, 25);

        txfH19.setBackground(new java.awt.Color(153, 153, 153));
        txfH19.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH19.setForeground(new java.awt.Color(0, 0, 0));
        txfH19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH19.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH19.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH19.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH19);
        txfH19.setBounds(10, 300, 125, 25);

        txfHP19.setBackground(new java.awt.Color(153, 153, 153));
        txfHP19.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP19.setForeground(new java.awt.Color(0, 0, 0));
        txfHP19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP19);
        txfHP19.setBounds(135, 300, 30, 25);

        txfW19.setBackground(new java.awt.Color(153, 153, 153));
        txfW19.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW19.setForeground(new java.awt.Color(0, 0, 0));
        txfW19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW19.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW19.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW19.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW19);
        txfW19.setBounds(170, 300, 125, 25);

        txfWP19.setBackground(new java.awt.Color(153, 153, 153));
        txfWP19.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP19.setForeground(new java.awt.Color(0, 0, 0));
        txfWP19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP19);
        txfWP19.setBounds(295, 300, 30, 25);

        txfS19.setBackground(new java.awt.Color(153, 153, 153));
        txfS19.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS19.setForeground(new java.awt.Color(0, 0, 0));
        txfS19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS19.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS19.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS19.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS19);
        txfS19.setBounds(330, 300, 125, 25);

        txfSP19.setBackground(new java.awt.Color(153, 153, 153));
        txfSP19.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP19.setForeground(new java.awt.Color(0, 0, 0));
        txfSP19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP19.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP19);
        txfSP19.setBounds(455, 300, 30, 25);

        txfH20.setBackground(new java.awt.Color(153, 153, 153));
        txfH20.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH20.setForeground(new java.awt.Color(0, 0, 0));
        txfH20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH20.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH20.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH20.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfH20);
        txfH20.setBounds(10, 330, 125, 25);

        txfHP20.setBackground(new java.awt.Color(153, 153, 153));
        txfHP20.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP20.setForeground(new java.awt.Color(0, 0, 0));
        txfHP20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfHP20);
        txfHP20.setBounds(135, 330, 30, 25);

        txfW20.setBackground(new java.awt.Color(153, 153, 153));
        txfW20.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW20.setForeground(new java.awt.Color(0, 0, 0));
        txfW20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW20.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW20.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW20.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfW20);
        txfW20.setBounds(170, 330, 125, 25);

        txfWP20.setBackground(new java.awt.Color(153, 153, 153));
        txfWP20.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP20.setForeground(new java.awt.Color(0, 0, 0));
        txfWP20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfWP20);
        txfWP20.setBounds(295, 330, 30, 25);

        txfS20.setBackground(new java.awt.Color(153, 153, 153));
        txfS20.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS20.setForeground(new java.awt.Color(0, 0, 0));
        txfS20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS20.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS20.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS20.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats1.add(txfS20);
        txfS20.setBounds(330, 330, 125, 25);

        txfSP20.setBackground(new java.awt.Color(153, 153, 153));
        txfSP20.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP20.setForeground(new java.awt.Color(0, 0, 0));
        txfSP20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP20.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats1.add(txfSP20);
        txfSP20.setBounds(455, 330, 30, 25);

        panelMain1.add(jPanelStats1);
        jPanelStats1.setBounds(0, 280, 500, 370);

        tabb2.add(panelMain1);
        panelMain1.setBounds(0, 0, 500, 750);

        tabbMain.addTab("< 2 >", tabb2);

        tabb3.setLayout(null);

        panelMain4.setMaximumSize(new java.awt.Dimension(500, 750));
        panelMain4.setMinimumSize(new java.awt.Dimension(500, 750));
        panelMain4.setLayout(null);

        btnNext4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/next.png"))); // NOI18N
        btnNext4.setBorder(null);
        btnNext4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext4ActionPerformed(evt);
            }
        });
        panelMain4.add(btnNext4);
        btnNext4.setBounds(437, 192, 40, 20);

        btnDelete4.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        btnDelete4.setForeground(new java.awt.Color(102, 0, 0));
        btnDelete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/deletebtn.png"))); // NOI18N
        btnDelete4.setToolTipText("Löschen");
        btnDelete4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDelete4.setFocusable(false);
        btnDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete4ActionPerformed(evt);
            }
        });
        panelMain4.add(btnDelete4);
        btnDelete4.setBounds(440, 10, 25, 25);

        lblName4.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        lblName4.setForeground(new java.awt.Color(102, 0, 0));
        lblName4.setText("Name:");
        lblName4.setFocusable(false);
        panelMain4.add(lblName4);
        lblName4.setBounds(5, 10, 80, 25);

        txfName4.setBackground(new java.awt.Color(153, 153, 153));
        txfName4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfName4.setForeground(new java.awt.Color(0, 0, 0));
        txfName4.setText("?");
        txfName4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfName4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfName4);
        txfName4.setBounds(100, 10, 340, 25);

        lblAlter4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblAlter4.setForeground(new java.awt.Color(102, 0, 0));
        lblAlter4.setText("Alter:");
        lblAlter4.setFocusable(false);
        panelMain4.add(lblAlter4);
        lblAlter4.setBounds(188, 50, 65, 25);

        txfAlter4.setBackground(new java.awt.Color(153, 153, 153));
        txfAlter4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfAlter4.setForeground(new java.awt.Color(0, 0, 0));
        txfAlter4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfAlter4.setText("?");
        txfAlter4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfAlter4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfAlter4);
        txfAlter4.setBounds(250, 50, 50, 25);

        lblGeschlecht4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblGeschlecht4.setForeground(new java.awt.Color(102, 0, 0));
        lblGeschlecht4.setText("Geschlecht:");
        lblGeschlecht4.setFocusable(false);
        panelMain4.add(lblGeschlecht4);
        lblGeschlecht4.setBounds(5, 50, 120, 25);

        txfGeschlecht4.setBackground(new java.awt.Color(153, 153, 153));
        txfGeschlecht4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfGeschlecht4.setForeground(new java.awt.Color(0, 0, 0));
        txfGeschlecht4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfGeschlecht4.setText("?");
        txfGeschlecht4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGeschlecht4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfGeschlecht4);
        txfGeschlecht4.setBounds(120, 50, 45, 25);

        lblRasse4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblRasse4.setForeground(new java.awt.Color(102, 0, 0));
        lblRasse4.setText("Rasse:");
        lblRasse4.setFocusable(false);
        panelMain4.add(lblRasse4);
        lblRasse4.setBounds(15, 90, 75, 25);

        txfRasse4.setBackground(new java.awt.Color(153, 153, 153));
        txfRasse4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfRasse4.setForeground(new java.awt.Color(0, 0, 0));
        txfRasse4.setText("?");
        txfRasse4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfRasse4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfRasse4);
        txfRasse4.setBounds(120, 90, 180, 25);

        lblBeruf4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblBeruf4.setForeground(new java.awt.Color(102, 0, 0));
        lblBeruf4.setText("Beruf:");
        lblBeruf4.setFocusable(false);
        panelMain4.add(lblBeruf4);
        lblBeruf4.setBounds(15, 150, 75, 25);

        txfBeruf4.setBackground(new java.awt.Color(153, 153, 153));
        txfBeruf4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfBeruf4.setForeground(new java.awt.Color(0, 0, 0));
        txfBeruf4.setText("?");
        txfBeruf4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfBeruf4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfBeruf4);
        txfBeruf4.setBounds(120, 150, 180, 25);

        lblStatur4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblStatur4.setForeground(new java.awt.Color(102, 0, 0));
        lblStatur4.setText("Statur:");
        lblStatur4.setFocusable(false);
        panelMain4.add(lblStatur4);
        lblStatur4.setBounds(15, 180, 75, 25);

        txfStatur4.setBackground(new java.awt.Color(153, 153, 153));
        txfStatur4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfStatur4.setForeground(new java.awt.Color(0, 0, 0));
        txfStatur4.setText("?");
        txfStatur4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfStatur4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfStatur4);
        txfStatur4.setBounds(120, 180, 180, 25);

        lblHeimat4.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        lblHeimat4.setForeground(new java.awt.Color(102, 0, 0));
        lblHeimat4.setText("HeiMaT:");
        lblHeimat4.setFocusable(false);
        panelMain4.add(lblHeimat4);
        lblHeimat4.setBounds(15, 120, 75, 25);

        txfHeimat4.setBackground(new java.awt.Color(153, 153, 153));
        txfHeimat4.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        txfHeimat4.setForeground(new java.awt.Color(0, 0, 0));
        txfHeimat4.setText("?");
        txfHeimat4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHeimat4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FocusLost(evt);
            }
        });
        panelMain4.add(txfHeimat4);
        txfHeimat4.setBounds(120, 120, 180, 25);

        lblPortrait4.setBackground(new java.awt.Color(0, 0, 0));
        lblPortrait4.setForeground(new java.awt.Color(0, 0, 0));
        lblPortrait4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lblPortrait4.setFocusable(false);
        panelMain4.add(lblPortrait4);
        lblPortrait4.setBounds(330, 50, 150, 165);

        txfSlider4.setBackground(new java.awt.Color(51, 0, 0));
        txfSlider4.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        txfSlider4.setForeground(new java.awt.Color(153, 0, 0));
        txfSlider4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSlider4.setText("00");
        txfSlider4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSlider4.setCaretColor(new java.awt.Color(51, 0, 0));
        txfSlider4.setFocusable(false);
        txfSlider4.setMargin(new java.awt.Insets(30, 5, 0, 5));
        panelMain4.add(txfSlider4);
        txfSlider4.setBounds(212, 212, 64, 35);

        jSlider5.setBackground(new java.awt.Color(153, 153, 153));
        jSlider5.setForeground(new java.awt.Color(51, 51, 51));
        jSlider5.setSnapToTicks(true);
        jSlider5.setValue(0);
        jSlider5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jSlider5.setFocusable(false);
        jSlider5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider5StateChanged(evt);
            }
        });
        panelMain4.add(jSlider5);
        jSlider5.setBounds(80, 250, 340, 20);

        jPanelStats4.setLayout(null);

        txfHandel4.setBackground(new java.awt.Color(102, 102, 102));
        txfHandel4.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfHandel4.setForeground(new java.awt.Color(0, 0, 0));
        txfHandel4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfHandel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHandel4.setFocusable(false);
        txfHandel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfHandel4);
        txfHandel4.setBounds(60, 12, 60, 35);

        txfGBH4.setBackground(new java.awt.Color(102, 102, 102));
        txfGBH4.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBH4.setForeground(new java.awt.Color(255, 255, 255));
        txfGBH4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBH4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBH4.setFocusable(false);
        txfGBH4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfGBH4);
        txfGBH4.setBounds(130, 30, 30, 25);

        txfWissen4.setBackground(new java.awt.Color(102, 102, 102));
        txfWissen4.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfWissen4.setForeground(new java.awt.Color(0, 0, 0));
        txfWissen4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfWissen4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWissen4.setFocusable(false);
        txfWissen4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfWissen4);
        txfWissen4.setBounds(220, 12, 60, 35);

        txfGBW4.setBackground(new java.awt.Color(102, 102, 102));
        txfGBW4.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBW4.setForeground(new java.awt.Color(255, 255, 255));
        txfGBW4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBW4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBW4.setFocusable(false);
        txfGBW4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfGBW4);
        txfGBW4.setBounds(290, 30, 30, 25);

        txfSoziales4.setBackground(new java.awt.Color(102, 102, 102));
        txfSoziales4.setFont(new java.awt.Font("Engravers MT", 0, 23)); // NOI18N
        txfSoziales4.setForeground(new java.awt.Color(0, 0, 0));
        txfSoziales4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfSoziales4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSoziales4.setFocusable(false);
        txfSoziales4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfSoziales4);
        txfSoziales4.setBounds(380, 12, 60, 35);

        txfGBS4.setBackground(new java.awt.Color(102, 102, 102));
        txfGBS4.setFont(new java.awt.Font("Engravers MT", 1, 16)); // NOI18N
        txfGBS4.setForeground(new java.awt.Color(255, 255, 255));
        txfGBS4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfGBS4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfGBS4.setFocusable(false);
        txfGBS4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfGBS4);
        txfGBS4.setBounds(450, 30, 30, 25);

        txfH41.setBackground(new java.awt.Color(153, 153, 153));
        txfH41.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH41.setForeground(new java.awt.Color(0, 0, 0));
        txfH41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH41.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH41.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH41.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH41);
        txfH41.setBounds(10, 60, 125, 25);

        txfHP41.setBackground(new java.awt.Color(153, 153, 153));
        txfHP41.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP41.setForeground(new java.awt.Color(0, 0, 0));
        txfHP41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP41);
        txfHP41.setBounds(135, 60, 30, 25);

        txfW41.setBackground(new java.awt.Color(153, 153, 153));
        txfW41.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW41.setForeground(new java.awt.Color(0, 0, 0));
        txfW41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW41.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW41.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW41.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW41);
        txfW41.setBounds(170, 60, 125, 25);

        txfWP41.setBackground(new java.awt.Color(153, 153, 153));
        txfWP41.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP41.setForeground(new java.awt.Color(0, 0, 0));
        txfWP41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP41);
        txfWP41.setBounds(295, 60, 30, 25);

        txfS41.setBackground(new java.awt.Color(153, 153, 153));
        txfS41.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS41.setForeground(new java.awt.Color(0, 0, 0));
        txfS41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS41.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS41.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS41.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS41);
        txfS41.setBounds(330, 60, 125, 25);

        txfSP41.setBackground(new java.awt.Color(153, 153, 153));
        txfSP41.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP41.setForeground(new java.awt.Color(0, 0, 0));
        txfSP41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP41.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP41);
        txfSP41.setBounds(455, 60, 30, 25);

        txfH42.setBackground(new java.awt.Color(153, 153, 153));
        txfH42.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH42.setForeground(new java.awt.Color(0, 0, 0));
        txfH42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH42.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH42.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH42.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH42);
        txfH42.setBounds(10, 90, 125, 25);

        txfHP42.setBackground(new java.awt.Color(153, 153, 153));
        txfHP42.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP42.setForeground(new java.awt.Color(0, 0, 0));
        txfHP42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP42);
        txfHP42.setBounds(135, 90, 30, 25);

        txfW42.setBackground(new java.awt.Color(153, 153, 153));
        txfW42.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW42.setForeground(new java.awt.Color(0, 0, 0));
        txfW42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW42.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW42.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW42.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW42);
        txfW42.setBounds(170, 90, 125, 25);

        txfWP42.setBackground(new java.awt.Color(153, 153, 153));
        txfWP42.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP42.setForeground(new java.awt.Color(0, 0, 0));
        txfWP42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP42);
        txfWP42.setBounds(295, 90, 30, 25);

        txfS42.setBackground(new java.awt.Color(153, 153, 153));
        txfS42.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS42.setForeground(new java.awt.Color(0, 0, 0));
        txfS42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS42.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS42.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS42.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS42);
        txfS42.setBounds(330, 90, 125, 25);

        txfSP42.setBackground(new java.awt.Color(153, 153, 153));
        txfSP42.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP42.setForeground(new java.awt.Color(0, 0, 0));
        txfSP42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP42.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP42);
        txfSP42.setBounds(455, 90, 30, 25);

        txfH43.setBackground(new java.awt.Color(153, 153, 153));
        txfH43.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH43.setForeground(new java.awt.Color(0, 0, 0));
        txfH43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH43.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH43.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH43.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH43);
        txfH43.setBounds(10, 120, 125, 25);

        txfHP43.setBackground(new java.awt.Color(153, 153, 153));
        txfHP43.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP43.setForeground(new java.awt.Color(0, 0, 0));
        txfHP43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP43);
        txfHP43.setBounds(135, 120, 30, 25);

        txfW43.setBackground(new java.awt.Color(153, 153, 153));
        txfW43.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW43.setForeground(new java.awt.Color(0, 0, 0));
        txfW43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW43.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW43.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW43.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW43);
        txfW43.setBounds(170, 120, 125, 25);

        txfWP43.setBackground(new java.awt.Color(153, 153, 153));
        txfWP43.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP43.setForeground(new java.awt.Color(0, 0, 0));
        txfWP43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP43);
        txfWP43.setBounds(295, 120, 30, 25);

        txfS43.setBackground(new java.awt.Color(153, 153, 153));
        txfS43.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS43.setForeground(new java.awt.Color(0, 0, 0));
        txfS43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS43.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS43.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS43.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS43);
        txfS43.setBounds(330, 120, 125, 25);

        txfSP43.setBackground(new java.awt.Color(153, 153, 153));
        txfSP43.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP43.setForeground(new java.awt.Color(0, 0, 0));
        txfSP43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP43.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP43);
        txfSP43.setBounds(455, 120, 30, 25);

        txfH44.setBackground(new java.awt.Color(153, 153, 153));
        txfH44.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH44.setForeground(new java.awt.Color(0, 0, 0));
        txfH44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH44.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH44.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH44.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH44);
        txfH44.setBounds(10, 150, 125, 25);

        txfHP44.setBackground(new java.awt.Color(153, 153, 153));
        txfHP44.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP44.setForeground(new java.awt.Color(0, 0, 0));
        txfHP44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP44);
        txfHP44.setBounds(135, 150, 30, 25);

        txfW44.setBackground(new java.awt.Color(153, 153, 153));
        txfW44.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW44.setForeground(new java.awt.Color(0, 0, 0));
        txfW44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW44.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW44.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW44.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW44);
        txfW44.setBounds(170, 150, 125, 25);

        txfWP44.setBackground(new java.awt.Color(153, 153, 153));
        txfWP44.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP44.setForeground(new java.awt.Color(0, 0, 0));
        txfWP44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP44);
        txfWP44.setBounds(295, 150, 30, 25);

        txfS44.setBackground(new java.awt.Color(153, 153, 153));
        txfS44.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS44.setForeground(new java.awt.Color(0, 0, 0));
        txfS44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS44.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS44.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS44.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS44);
        txfS44.setBounds(330, 150, 125, 25);

        txfSP44.setBackground(new java.awt.Color(153, 153, 153));
        txfSP44.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP44.setForeground(new java.awt.Color(0, 0, 0));
        txfSP44.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP44.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP44);
        txfSP44.setBounds(455, 150, 30, 25);

        txfH45.setBackground(new java.awt.Color(153, 153, 153));
        txfH45.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH45.setForeground(new java.awt.Color(0, 0, 0));
        txfH45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH45.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH45.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH45.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH45);
        txfH45.setBounds(10, 180, 125, 25);

        txfHP45.setBackground(new java.awt.Color(153, 153, 153));
        txfHP45.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP45.setForeground(new java.awt.Color(0, 0, 0));
        txfHP45.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP45);
        txfHP45.setBounds(135, 180, 30, 25);

        txfW45.setBackground(new java.awt.Color(153, 153, 153));
        txfW45.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW45.setForeground(new java.awt.Color(0, 0, 0));
        txfW45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW45.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW45.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW45.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW45);
        txfW45.setBounds(170, 180, 125, 25);

        txfWP45.setBackground(new java.awt.Color(153, 153, 153));
        txfWP45.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP45.setForeground(new java.awt.Color(0, 0, 0));
        txfWP45.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP45);
        txfWP45.setBounds(295, 180, 30, 25);

        txfS45.setBackground(new java.awt.Color(153, 153, 153));
        txfS45.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS45.setForeground(new java.awt.Color(0, 0, 0));
        txfS45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS45.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS45.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS45.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS45);
        txfS45.setBounds(330, 180, 125, 25);

        txfSP45.setBackground(new java.awt.Color(153, 153, 153));
        txfSP45.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP45.setForeground(new java.awt.Color(0, 0, 0));
        txfSP45.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP45.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP45);
        txfSP45.setBounds(455, 180, 30, 25);

        txfH46.setBackground(new java.awt.Color(153, 153, 153));
        txfH46.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH46.setForeground(new java.awt.Color(0, 0, 0));
        txfH46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH46.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH46.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH46.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH46);
        txfH46.setBounds(10, 210, 125, 25);

        txfHP46.setBackground(new java.awt.Color(153, 153, 153));
        txfHP46.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP46.setForeground(new java.awt.Color(0, 0, 0));
        txfHP46.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP46);
        txfHP46.setBounds(135, 210, 30, 25);

        txfW46.setBackground(new java.awt.Color(153, 153, 153));
        txfW46.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW46.setForeground(new java.awt.Color(0, 0, 0));
        txfW46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW46.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW46.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW46.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW46);
        txfW46.setBounds(170, 210, 125, 25);

        txfWP46.setBackground(new java.awt.Color(153, 153, 153));
        txfWP46.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP46.setForeground(new java.awt.Color(0, 0, 0));
        txfWP46.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP46);
        txfWP46.setBounds(295, 210, 30, 25);

        txfS46.setBackground(new java.awt.Color(153, 153, 153));
        txfS46.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS46.setForeground(new java.awt.Color(0, 0, 0));
        txfS46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS46.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS46.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS46.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS46);
        txfS46.setBounds(330, 210, 125, 25);

        txfSP46.setBackground(new java.awt.Color(153, 153, 153));
        txfSP46.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP46.setForeground(new java.awt.Color(0, 0, 0));
        txfSP46.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP46.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP46.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP46.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP46);
        txfSP46.setBounds(455, 210, 30, 25);

        txfH47.setBackground(new java.awt.Color(153, 153, 153));
        txfH47.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH47.setForeground(new java.awt.Color(0, 0, 0));
        txfH47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH47.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH47.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH47.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH47);
        txfH47.setBounds(10, 240, 125, 25);

        txfHP47.setBackground(new java.awt.Color(153, 153, 153));
        txfHP47.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP47.setForeground(new java.awt.Color(0, 0, 0));
        txfHP47.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP47);
        txfHP47.setBounds(135, 240, 30, 25);

        txfW47.setBackground(new java.awt.Color(153, 153, 153));
        txfW47.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW47.setForeground(new java.awt.Color(0, 0, 0));
        txfW47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW47.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW47.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW47.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW47);
        txfW47.setBounds(170, 240, 125, 25);

        txfWP47.setBackground(new java.awt.Color(153, 153, 153));
        txfWP47.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP47.setForeground(new java.awt.Color(0, 0, 0));
        txfWP47.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP47);
        txfWP47.setBounds(295, 240, 30, 25);

        txfS47.setBackground(new java.awt.Color(153, 153, 153));
        txfS47.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS47.setForeground(new java.awt.Color(0, 0, 0));
        txfS47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS47.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS47.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS47.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS47);
        txfS47.setBounds(330, 240, 125, 25);

        txfSP47.setBackground(new java.awt.Color(153, 153, 153));
        txfSP47.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP47.setForeground(new java.awt.Color(0, 0, 0));
        txfSP47.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP47.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP47.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP47);
        txfSP47.setBounds(455, 240, 30, 25);

        txfH48.setBackground(new java.awt.Color(153, 153, 153));
        txfH48.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH48.setForeground(new java.awt.Color(0, 0, 0));
        txfH48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH48.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH48.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH48.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH48);
        txfH48.setBounds(10, 270, 125, 25);

        txfHP48.setBackground(new java.awt.Color(153, 153, 153));
        txfHP48.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP48.setForeground(new java.awt.Color(0, 0, 0));
        txfHP48.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP48);
        txfHP48.setBounds(135, 270, 30, 25);

        txfW48.setBackground(new java.awt.Color(153, 153, 153));
        txfW48.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW48.setForeground(new java.awt.Color(0, 0, 0));
        txfW48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW48.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW48.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW48.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW48);
        txfW48.setBounds(170, 270, 125, 25);

        txfWP48.setBackground(new java.awt.Color(153, 153, 153));
        txfWP48.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP48.setForeground(new java.awt.Color(0, 0, 0));
        txfWP48.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP48);
        txfWP48.setBounds(295, 270, 30, 25);

        txfS48.setBackground(new java.awt.Color(153, 153, 153));
        txfS48.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS48.setForeground(new java.awt.Color(0, 0, 0));
        txfS48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS48.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS48.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS48.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS48);
        txfS48.setBounds(330, 270, 125, 25);

        txfSP48.setBackground(new java.awt.Color(153, 153, 153));
        txfSP48.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP48.setForeground(new java.awt.Color(0, 0, 0));
        txfSP48.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP48.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP48.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP48.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP48);
        txfSP48.setBounds(455, 270, 30, 25);

        txfH49.setBackground(new java.awt.Color(153, 153, 153));
        txfH49.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH49.setForeground(new java.awt.Color(0, 0, 0));
        txfH49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH49.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH49.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH49.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH49);
        txfH49.setBounds(10, 300, 125, 25);

        txfHP49.setBackground(new java.awt.Color(153, 153, 153));
        txfHP49.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP49.setForeground(new java.awt.Color(0, 0, 0));
        txfHP49.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP49);
        txfHP49.setBounds(135, 300, 30, 25);

        txfW49.setBackground(new java.awt.Color(153, 153, 153));
        txfW49.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW49.setForeground(new java.awt.Color(0, 0, 0));
        txfW49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW49.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW49.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW49.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW49);
        txfW49.setBounds(170, 300, 125, 25);

        txfWP49.setBackground(new java.awt.Color(153, 153, 153));
        txfWP49.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP49.setForeground(new java.awt.Color(0, 0, 0));
        txfWP49.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP49);
        txfWP49.setBounds(295, 300, 30, 25);

        txfS49.setBackground(new java.awt.Color(153, 153, 153));
        txfS49.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS49.setForeground(new java.awt.Color(0, 0, 0));
        txfS49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS49.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS49.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS49.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS49);
        txfS49.setBounds(330, 300, 125, 25);

        txfSP49.setBackground(new java.awt.Color(153, 153, 153));
        txfSP49.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP49.setForeground(new java.awt.Color(0, 0, 0));
        txfSP49.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP49.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP49.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP49.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP49);
        txfSP49.setBounds(455, 300, 30, 25);

        txfH50.setBackground(new java.awt.Color(153, 153, 153));
        txfH50.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfH50.setForeground(new java.awt.Color(0, 0, 0));
        txfH50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfH50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfH50.setMaximumSize(new java.awt.Dimension(200, 25));
        txfH50.setMinimumSize(new java.awt.Dimension(200, 25));
        txfH50.setPreferredSize(new java.awt.Dimension(200, 25));
        txfH50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfH50);
        txfH50.setBounds(10, 330, 125, 25);

        txfHP50.setBackground(new java.awt.Color(153, 153, 153));
        txfHP50.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfHP50.setForeground(new java.awt.Color(0, 0, 0));
        txfHP50.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHP50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfHP50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfHP50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfHP50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfHP50);
        txfHP50.setBounds(135, 330, 30, 25);

        txfW50.setBackground(new java.awt.Color(153, 153, 153));
        txfW50.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfW50.setForeground(new java.awt.Color(0, 0, 0));
        txfW50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfW50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfW50.setMaximumSize(new java.awt.Dimension(200, 25));
        txfW50.setMinimumSize(new java.awt.Dimension(200, 25));
        txfW50.setPreferredSize(new java.awt.Dimension(200, 25));
        txfW50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfW50);
        txfW50.setBounds(170, 330, 125, 25);

        txfWP50.setBackground(new java.awt.Color(153, 153, 153));
        txfWP50.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfWP50.setForeground(new java.awt.Color(0, 0, 0));
        txfWP50.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfWP50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfWP50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfWP50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfWP50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfWP50);
        txfWP50.setBounds(295, 330, 30, 25);

        txfS50.setBackground(new java.awt.Color(153, 153, 153));
        txfS50.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txfS50.setForeground(new java.awt.Color(0, 0, 0));
        txfS50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfS50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfS50.setMaximumSize(new java.awt.Dimension(200, 25));
        txfS50.setMinimumSize(new java.awt.Dimension(200, 25));
        txfS50.setPreferredSize(new java.awt.Dimension(200, 25));
        txfS50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        jPanelStats4.add(txfS50);
        txfS50.setBounds(330, 330, 125, 25);

        txfSP50.setBackground(new java.awt.Color(153, 153, 153));
        txfSP50.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        txfSP50.setForeground(new java.awt.Color(0, 0, 0));
        txfSP50.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfSP50.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txfSP50.setMargin(new java.awt.Insets(2, 5, 2, 5));
        txfSP50.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TableFocusGained(evt);
            }
        });
        txfSP50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKey(evt);
            }
        });
        jPanelStats4.add(txfSP50);
        txfSP50.setBounds(455, 330, 30, 25);

        panelMain4.add(jPanelStats4);
        jPanelStats4.setBounds(0, 280, 500, 370);

        tabb3.add(panelMain4);
        panelMain4.setBounds(0, 0, 500, 750);

        tabbMain.addTab("< 3 >", tabb3);

        pnlMain.add(tabbMain);
        tabbMain.setBounds(0, 70, 500, 680);

        lblBack.setBackground(new java.awt.Color(0, 0, 0));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/back.png"))); // NOI18N
        lblBack.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBackMouseDragged(evt);
            }
        });
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBackMousePressed(evt);
            }
        });
        pnlMain.add(lblBack);
        lblBack.setBounds(0, 0, 500, 750);

        getContentPane().add(pnlMain);
        pnlMain.setBounds(0, 0, 500, 750);

        pnlR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlR.setLayout(null);

        btnRules.setForeground(new java.awt.Color(0, 0, 0));
        btnRules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/rules.png"))); // NOI18N
        btnRules.setBorder(null);
        btnRules.setBorderPainted(false);
        btnRules.setFocusable(false);
        btnRules.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRules.setMaximumSize(new java.awt.Dimension(100, 100));
        btnRules.setMinimumSize(new java.awt.Dimension(100, 100));
        btnRules.setPreferredSize(new java.awt.Dimension(100, 100));
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });
        pnlR.add(btnRules);
        btnRules.setBounds(250, 3, 48, 48);

        lblFrontR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/frontR.png"))); // NOI18N
        pnlR.add(lblFrontR);
        lblFrontR.setBounds(0, 0, 500, 750);

        pnlRmain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlRmain.setLayout(null);

        scrpWaffen.setBackground(new java.awt.Color(102, 102, 102));
        scrpWaffen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpWaffen.setForeground(new java.awt.Color(0, 0, 0));
        scrpWaffen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpWaffen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaWaffen.setBackground(new java.awt.Color(153, 153, 153));
        txaWaffen.setColumns(27);
        txaWaffen.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaWaffen.setForeground(new java.awt.Color(0, 0, 0));
        txaWaffen.setLineWrap(true);
        txaWaffen.setRows(6);
        txaWaffen.setWrapStyleWord(true);
        txaWaffen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpWaffen.setViewportView(txaWaffen);

        pnlRmain.add(scrpWaffen);
        scrpWaffen.setBounds(20, 35, 260, 112);

        lblWaffen.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblWaffen.setForeground(new java.awt.Color(51, 0, 0));
        lblWaffen.setText("Waffen:");
        pnlRmain.add(lblWaffen);
        lblWaffen.setBounds(10, 13, 110, 25);

        scrpZauber.setBackground(new java.awt.Color(102, 102, 102));
        scrpZauber.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpZauber.setForeground(new java.awt.Color(0, 0, 0));
        scrpZauber.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpZauber.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaZauber.setBackground(new java.awt.Color(153, 153, 153));
        txaZauber.setColumns(27);
        txaZauber.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaZauber.setForeground(new java.awt.Color(0, 0, 0));
        txaZauber.setLineWrap(true);
        txaZauber.setRows(6);
        txaZauber.setWrapStyleWord(true);
        txaZauber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpZauber.setViewportView(txaZauber);

        pnlRmain.add(scrpZauber);
        scrpZauber.setBounds(20, 178, 260, 112);

        lblZauber.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblZauber.setForeground(new java.awt.Color(51, 0, 0));
        lblZauber.setText("Zauber:");
        pnlRmain.add(lblZauber);
        lblZauber.setBounds(10, 155, 120, 25);

        scrpRucksack.setBackground(new java.awt.Color(102, 102, 102));
        scrpRucksack.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpRucksack.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpRucksack.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaRucksack.setBackground(new java.awt.Color(153, 153, 153));
        txaRucksack.setColumns(17);
        txaRucksack.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaRucksack.setForeground(new java.awt.Color(0, 0, 0));
        txaRucksack.setLineWrap(true);
        txaRucksack.setRows(7);
        txaRucksack.setWrapStyleWord(true);
        txaRucksack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpRucksack.setViewportView(txaRucksack);

        pnlRmain.add(scrpRucksack);
        scrpRucksack.setBounds(20, 330, 260, 305);

        lblRucksack.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblRucksack.setForeground(new java.awt.Color(51, 0, 0));
        lblRucksack.setText("Rucksack:");
        pnlRmain.add(lblRucksack);
        lblRucksack.setBounds(10, 310, 140, 25);

        lblRucksackb.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        pnlRmain.add(lblRucksackb);
        lblRucksackb.setBounds(18, 290, 0, 0);

        pnlR.add(pnlRmain);
        pnlRmain.setBounds(0, 105, 300, 645);

        pnlRmain1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlRmain1.setLayout(null);

        scrpWaffen1.setBackground(new java.awt.Color(102, 102, 102));
        scrpWaffen1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpWaffen1.setForeground(new java.awt.Color(51, 0, 0));
        scrpWaffen1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpWaffen1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaWaffen1.setBackground(new java.awt.Color(153, 153, 153));
        txaWaffen1.setColumns(27);
        txaWaffen1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaWaffen1.setForeground(new java.awt.Color(0, 0, 0));
        txaWaffen1.setLineWrap(true);
        txaWaffen1.setRows(6);
        txaWaffen1.setWrapStyleWord(true);
        txaWaffen1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpWaffen1.setViewportView(txaWaffen1);

        pnlRmain1.add(scrpWaffen1);
        scrpWaffen1.setBounds(20, 35, 260, 112);

        lblWaffen1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblWaffen1.setForeground(new java.awt.Color(51, 0, 0));
        lblWaffen1.setText("Waffen:");
        pnlRmain1.add(lblWaffen1);
        lblWaffen1.setBounds(10, 13, 110, 25);

        scrpZauber1.setBackground(new java.awt.Color(102, 102, 102));
        scrpZauber1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpZauber1.setForeground(new java.awt.Color(51, 0, 0));
        scrpZauber1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpZauber1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaZauber1.setBackground(new java.awt.Color(153, 153, 153));
        txaZauber1.setColumns(27);
        txaZauber1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaZauber1.setForeground(new java.awt.Color(0, 0, 0));
        txaZauber1.setLineWrap(true);
        txaZauber1.setRows(6);
        txaZauber1.setWrapStyleWord(true);
        txaZauber1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpZauber1.setViewportView(txaZauber1);

        pnlRmain1.add(scrpZauber1);
        scrpZauber1.setBounds(20, 178, 260, 112);

        lblZauber1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblZauber1.setForeground(new java.awt.Color(51, 0, 0));
        lblZauber1.setText("Zauber:");
        pnlRmain1.add(lblZauber1);
        lblZauber1.setBounds(10, 155, 120, 25);

        scrpRucksack1.setBackground(new java.awt.Color(102, 102, 102));
        scrpRucksack1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpRucksack1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpRucksack1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaRucksack1.setBackground(new java.awt.Color(153, 153, 153));
        txaRucksack1.setColumns(17);
        txaRucksack1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaRucksack1.setForeground(new java.awt.Color(0, 0, 0));
        txaRucksack1.setLineWrap(true);
        txaRucksack1.setRows(7);
        txaRucksack1.setWrapStyleWord(true);
        txaRucksack1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpRucksack1.setViewportView(txaRucksack1);

        pnlRmain1.add(scrpRucksack1);
        scrpRucksack1.setBounds(20, 330, 260, 305);

        lblRucksack1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblRucksack1.setForeground(new java.awt.Color(51, 0, 0));
        lblRucksack1.setText("Rucksack:");
        pnlRmain1.add(lblRucksack1);
        lblRucksack1.setBounds(10, 310, 140, 25);

        lblRucksackb1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        pnlRmain1.add(lblRucksackb1);
        lblRucksackb1.setBounds(18, 290, 0, 0);

        pnlR.add(pnlRmain1);
        pnlRmain1.setBounds(0, 105, 300, 645);

        pnlRmain2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlRmain2.setLayout(null);

        scrpWaffen2.setBackground(new java.awt.Color(102, 102, 102));
        scrpWaffen2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpWaffen2.setForeground(new java.awt.Color(0, 0, 0));
        scrpWaffen2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpWaffen2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaWaffen2.setBackground(new java.awt.Color(153, 153, 153));
        txaWaffen2.setColumns(27);
        txaWaffen2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaWaffen2.setForeground(new java.awt.Color(0, 0, 0));
        txaWaffen2.setLineWrap(true);
        txaWaffen2.setRows(6);
        txaWaffen2.setWrapStyleWord(true);
        txaWaffen2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpWaffen2.setViewportView(txaWaffen2);

        pnlRmain2.add(scrpWaffen2);
        scrpWaffen2.setBounds(20, 35, 260, 112);

        lblWaffen2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblWaffen2.setForeground(new java.awt.Color(51, 0, 0));
        lblWaffen2.setText("Waffen:");
        pnlRmain2.add(lblWaffen2);
        lblWaffen2.setBounds(10, 13, 110, 25);

        scrpZauber2.setBackground(new java.awt.Color(102, 102, 102));
        scrpZauber2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpZauber2.setForeground(new java.awt.Color(0, 0, 0));
        scrpZauber2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpZauber2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaZauber2.setBackground(new java.awt.Color(153, 153, 153));
        txaZauber2.setColumns(27);
        txaZauber2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaZauber2.setForeground(new java.awt.Color(0, 0, 0));
        txaZauber2.setLineWrap(true);
        txaZauber2.setRows(6);
        txaZauber2.setWrapStyleWord(true);
        txaZauber2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpZauber2.setViewportView(txaZauber2);

        pnlRmain2.add(scrpZauber2);
        scrpZauber2.setBounds(20, 178, 260, 112);

        lblZauber2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblZauber2.setForeground(new java.awt.Color(51, 0, 0));
        lblZauber2.setText("Zauber:");
        pnlRmain2.add(lblZauber2);
        lblZauber2.setBounds(10, 155, 120, 25);

        scrpRucksack2.setBackground(new java.awt.Color(102, 102, 102));
        scrpRucksack2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpRucksack2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpRucksack2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txaRucksack2.setBackground(new java.awt.Color(153, 153, 153));
        txaRucksack2.setColumns(17);
        txaRucksack2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaRucksack2.setForeground(new java.awt.Color(0, 0, 0));
        txaRucksack2.setLineWrap(true);
        txaRucksack2.setRows(7);
        txaRucksack2.setWrapStyleWord(true);
        txaRucksack2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpRucksack2.setViewportView(txaRucksack2);

        pnlRmain2.add(scrpRucksack2);
        scrpRucksack2.setBounds(20, 330, 260, 305);

        lblRucksack2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblRucksack2.setForeground(new java.awt.Color(51, 0, 0));
        lblRucksack2.setText("Rucksack:");
        pnlRmain2.add(lblRucksack2);
        lblRucksack2.setBounds(10, 310, 140, 25);

        lblRucksackb2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        pnlRmain2.add(lblRucksackb2);
        lblRucksackb2.setBounds(18, 290, 0, 0);

        pnlR.add(pnlRmain2);
        pnlRmain2.setBounds(0, 105, 300, 645);

        lblRback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/backR.png"))); // NOI18N
        pnlR.add(lblRback);
        lblRback.setBounds(0, 0, 300, 750);

        getContentPane().add(pnlR);
        pnlR.setBounds(500, 0, 300, 750);

        pnlL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlL.setLayout(null);

        tfxRNG.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        tfxRNG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlL.add(tfxRNG);
        tfxRNG.setBounds(180, 625, 55, 50);

        btnRNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/rngbtn.png"))); // NOI18N
        btnRNG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNGActionPerformed(evt);
            }
        });
        pnlL.add(btnRNG);
        btnRNG.setBounds(80, 600, 106, 106);

        txfWürfel.setFont(new java.awt.Font("Engravers MT", 0, 10)); // NOI18N
        txfWürfel.setText("jTextField1");
        pnlL.add(txfWürfel);
        txfWürfel.setBounds(190, 675, 32, 17);

        sliderRNG.setForeground(new java.awt.Color(102, 102, 102));
        sliderRNG.setMajorTickSpacing(1);
        sliderRNG.setMaximum(20);
        sliderRNG.setMinimum(6);
        sliderRNG.setMinorTickSpacing(1);
        sliderRNG.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderRNG.setPaintTrack(false);
        sliderRNG.setSnapToTicks(true);
        sliderRNG.setToolTipText("Seitenzahl");
        sliderRNG.setValue(10);
        sliderRNG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sliderRNG.setOpaque(true);
        sliderRNG.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRNGStateChanged(evt);
            }
        });
        pnlL.add(sliderRNG);
        sliderRNG.setBounds(40, 601, 10, 100);

        lblFrontL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/frontL.png"))); // NOI18N
        pnlL.add(lblFrontL);
        lblFrontL.setBounds(0, 0, 500, 750);

        pnlLmain.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlLmain.setLayout(null);

        scrpNotizen.setBackground(new java.awt.Color(102, 102, 102));
        scrpNotizen.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpNotizen.setForeground(new java.awt.Color(0, 0, 0));
        scrpNotizen.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpNotizen.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaNotizen.setBackground(new java.awt.Color(153, 153, 153));
        txaNotizen.setColumns(27);
        txaNotizen.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaNotizen.setForeground(new java.awt.Color(0, 0, 0));
        txaNotizen.setLineWrap(true);
        txaNotizen.setRows(6);
        txaNotizen.setWrapStyleWord(true);
        txaNotizen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpNotizen.setViewportView(txaNotizen);

        pnlLmain.add(scrpNotizen);
        scrpNotizen.setBounds(18, 35, 260, 400);

        lblNotizen.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblNotizen.setForeground(new java.awt.Color(51, 0, 0));
        lblNotizen.setText("Notizen:");
        pnlLmain.add(lblNotizen);
        lblNotizen.setBounds(10, 13, 110, 25);

        pnlL.add(pnlLmain);
        pnlLmain.setBounds(0, 105, 300, 645);

        pnlLmain1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlLmain1.setLayout(null);

        scrpNotizen1.setBackground(new java.awt.Color(102, 102, 102));
        scrpNotizen1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpNotizen1.setForeground(new java.awt.Color(0, 0, 0));
        scrpNotizen1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpNotizen1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaNotizen1.setBackground(new java.awt.Color(153, 153, 153));
        txaNotizen1.setColumns(27);
        txaNotizen1.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaNotizen1.setForeground(new java.awt.Color(0, 0, 0));
        txaNotizen1.setLineWrap(true);
        txaNotizen1.setRows(6);
        txaNotizen1.setWrapStyleWord(true);
        txaNotizen1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpNotizen1.setViewportView(txaNotizen1);

        pnlLmain1.add(scrpNotizen1);
        scrpNotizen1.setBounds(18, 35, 260, 400);

        lblNotizen1.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblNotizen1.setForeground(new java.awt.Color(51, 0, 0));
        lblNotizen1.setText("Notizen:");
        pnlLmain1.add(lblNotizen1);
        lblNotizen1.setBounds(10, 13, 110, 25);

        pnlL.add(pnlLmain1);
        pnlLmain1.setBounds(0, 105, 300, 645);

        pnlLmain2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        pnlLmain2.setLayout(null);

        scrpNotizen2.setBackground(new java.awt.Color(102, 102, 102));
        scrpNotizen2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        scrpNotizen2.setForeground(new java.awt.Color(0, 0, 0));
        scrpNotizen2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrpNotizen2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaNotizen2.setBackground(new java.awt.Color(153, 153, 153));
        txaNotizen2.setColumns(27);
        txaNotizen2.setFont(new java.awt.Font("Engravers MT", 0, 12)); // NOI18N
        txaNotizen2.setForeground(new java.awt.Color(0, 0, 0));
        txaNotizen2.setLineWrap(true);
        txaNotizen2.setRows(6);
        txaNotizen2.setWrapStyleWord(true);
        txaNotizen2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrpNotizen2.setViewportView(txaNotizen2);

        pnlLmain2.add(scrpNotizen2);
        scrpNotizen2.setBounds(18, 35, 260, 400);

        lblNotizen2.setFont(new java.awt.Font("Engravers MT", 0, 16)); // NOI18N
        lblNotizen2.setForeground(new java.awt.Color(51, 0, 0));
        lblNotizen2.setText("Notizen:");
        pnlLmain2.add(lblNotizen2);
        lblNotizen2.setBounds(10, 13, 110, 25);

        pnlL.add(pnlLmain2);
        pnlLmain2.setBounds(0, 105, 300, 645);

        lblLback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CDTOOL/DATA/backL.png"))); // NOI18N
        pnlL.add(lblLback);
        lblLback.setBounds(0, 0, 300, 750);

        getContentPane().add(pnlL);
        pnlL.setBounds(0, 0, 400, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void lblBackMouseDragged(java.awt.event.MouseEvent evt) {                                     
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen(); 
        if (tglbtnL.isSelected()){
            this.setLocation(posX-mouseX-ext,posY-mouseY);
        } else {
            this.setLocation(posX-mouseX,posY-mouseY);
        }
    }                                    

    private void lblBackMousePressed(java.awt.event.MouseEvent evt) {                                     
        mouseX = evt.getX();
        mouseY = evt.getY();
    }                                    

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {                                         
                
        if (!"?".equals(txfName.getText()) & !"?".equals(txfGeschlecht.getText()) & !"?".equals(txfAlter.getText()) & !"?".equals(txfRasse.getText()) & !"?".equals(txfHeimat.getText()) & !"?".equals(txfBeruf.getText()) & !"?".equals(txfStatur.getText())) {    
                
                String name = txfName.getText();
                String geschlecht = txfGeschlecht.getText();
                String alter = txfAlter.getText();
                String rasse = txfRasse.getText();
                String heimat = txfHeimat.getText();
                String beruf = txfBeruf.getText();
                String statur = txfStatur.getText();
                int life = jSlider1.getValue();
                String h1 = txfH1.getText();
                String h2 = txfH2.getText();
                String h3 = txfH3.getText();
                String h4 = txfH4.getText();
                String h5 = txfH5.getText();
                String h6 = txfH6.getText();
                String h7 = txfH7.getText();
                String h8 = txfH8.getText();
                String h9 = txfH9.getText();
                String h0 = txfH10.getText();
                String hp1 = txfHP1.getText();
                String hp2 = txfHP2.getText();
                String hp3 = txfHP3.getText();
                String hp4 = txfHP4.getText();
                String hp5 = txfHP5.getText();
                String hp6 = txfHP6.getText();
                String hp7 = txfHP7.getText();
                String hp8 = txfHP8.getText();
                String hp9 = txfHP9.getText();
                String hp0 = txfHP10.getText();
                String w1 = txfW1.getText();
                String w2 = txfW2.getText();
                String w3 = txfW3.getText();
                String w4 = txfW4.getText();
                String w5 = txfW5.getText();
                String w6 = txfW6.getText();
                String w7 = txfW7.getText();
                String w8 = txfW8.getText();
                String w9 = txfW9.getText();
                String w0 = txfW10.getText();
                String wp1 = txfWP1.getText();
                String wp2 = txfWP2.getText();
                String wp3 = txfWP3.getText();
                String wp4 = txfWP4.getText();
                String wp5 = txfWP5.getText();
                String wp6 = txfWP6.getText();
                String wp7 = txfWP7.getText();
                String wp8 = txfWP8.getText();
                String wp9 = txfWP9.getText();
                String wp0 = txfWP10.getText();
                String s1 = txfS1.getText();
                String s2 = txfS2.getText();
                String s3 = txfS3.getText();
                String s4 = txfS4.getText();
                String s5 = txfS5.getText();
                String s6 = txfS6.getText();
                String s7 = txfS7.getText();
                String s8 = txfS8.getText();
                String s9 = txfS9.getText();
                String s0 = txfS10.getText();
                String sp1 = txfSP1.getText();
                String sp2 = txfSP2.getText();
                String sp3 = txfSP3.getText();
                String sp4 = txfSP4.getText();
                String sp5 = txfSP5.getText();
                String sp6 = txfSP6.getText();
                String sp7 = txfSP7.getText();
                String sp8 = txfSP8.getText();
                String sp9 = txfSP9.getText();
                String sp0 = txfSP10.getText();
                
                String waffen = txaWaffen.getText();
                String zauber = txaZauber.getText();
                String rucksack = txaRucksack.getText();
                String notizen = txaNotizen.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait.getIcon();
                 
                try {  
                    Verwaltung.addChar1(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
        if (!"?".equals(txfName1.getText()) & !"?".equals(txfGeschlecht1.getText()) & !"?".equals(txfAlter1.getText()) & !"?".equals(txfRasse1.getText()) & !"?".equals(txfHeimat1.getText()) & !"?".equals(txfBeruf1.getText()) & !"?".equals(txfStatur1.getText())) {    
                
                String name = txfName1.getText();
                String geschlecht = txfGeschlecht1.getText();
                String alter = txfAlter1.getText();
                String rasse = txfRasse1.getText();
                String heimat = txfHeimat1.getText();
                String beruf = txfBeruf1.getText();
                String statur = txfStatur1.getText();
                int life = jSlider2.getValue();
                String h1 = txfH11.getText();
                String h2 = txfH12.getText();
                String h3 = txfH13.getText();
                String h4 = txfH14.getText();
                String h5 = txfH15.getText();
                String h6 = txfH16.getText();
                String h7 = txfH17.getText();
                String h8 = txfH18.getText();
                String h9 = txfH19.getText();
                String h0 = txfH20.getText();
                String hp1 = txfHP11.getText();
                String hp2 = txfHP12.getText();
                String hp3 = txfHP13.getText();
                String hp4 = txfHP14.getText();
                String hp5 = txfHP15.getText();
                String hp6 = txfHP16.getText();
                String hp7 = txfHP17.getText();
                String hp8 = txfHP18.getText();
                String hp9 = txfHP19.getText();
                String hp0 = txfHP20.getText();
                String w1 = txfW11.getText();
                String w2 = txfW12.getText();
                String w3 = txfW13.getText();
                String w4 = txfW14.getText();
                String w5 = txfW15.getText();
                String w6 = txfW16.getText();
                String w7 = txfW17.getText();
                String w8 = txfW18.getText();
                String w9 = txfW19.getText();
                String w0 = txfW20.getText();
                String wp1 = txfWP11.getText();
                String wp2 = txfWP12.getText();
                String wp3 = txfWP13.getText();
                String wp4 = txfWP14.getText();
                String wp5 = txfWP15.getText();
                String wp6 = txfWP16.getText();
                String wp7 = txfWP17.getText();
                String wp8 = txfWP18.getText();
                String wp9 = txfWP19.getText();
                String wp0 = txfWP20.getText();
                String s1 = txfS11.getText();
                String s2 = txfS12.getText();
                String s3 = txfS13.getText();
                String s4 = txfS14.getText();
                String s5 = txfS15.getText();
                String s6 = txfS16.getText();
                String s7 = txfS17.getText();
                String s8 = txfS18.getText();
                String s9 = txfS19.getText();
                String s0 = txfS20.getText();
                String sp1 = txfSP11.getText();
                String sp2 = txfSP12.getText();
                String sp3 = txfSP13.getText();
                String sp4 = txfSP14.getText();
                String sp5 = txfSP15.getText();
                String sp6 = txfSP16.getText();
                String sp7 = txfSP17.getText();
                String sp8 = txfSP18.getText();
                String sp9 = txfSP19.getText();
                String sp0 = txfSP20.getText();
                
                String waffen = txaWaffen1.getText();
                String zauber = txaZauber1.getText();
                String rucksack = txaRucksack1.getText();
                String notizen = txaNotizen1.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait1.getIcon();
                
                try {  
                    Verwaltung.addChar2(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        if (!"?".equals(txfName4.getText()) & !"?".equals(txfGeschlecht4.getText()) & !"?".equals(txfAlter4.getText()) & !"?".equals(txfRasse4.getText()) & !"?".equals(txfHeimat4.getText()) & !"?".equals(txfBeruf4.getText()) & !"?".equals(txfStatur4.getText())) {    
                
                String name = txfName4.getText();
                String geschlecht = txfGeschlecht4.getText();
                String alter = txfAlter4.getText();
                String rasse = txfRasse4.getText();
                String heimat = txfHeimat4.getText();
                String beruf = txfBeruf4.getText();
                String statur = txfStatur4.getText();
                int life = jSlider5.getValue();
                String h1 = txfH41.getText();
                String h2 = txfH42.getText();
                String h3 = txfH43.getText();
                String h4 = txfH44.getText();
                String h5 = txfH45.getText();
                String h6 = txfH46.getText();
                String h7 = txfH47.getText();
                String h8 = txfH48.getText();
                String h9 = txfH49.getText();
                String h0 = txfH50.getText();
                String hp1 = txfHP41.getText();
                String hp2 = txfHP42.getText();
                String hp3 = txfHP43.getText();
                String hp4 = txfHP44.getText();
                String hp5 = txfHP45.getText();
                String hp6 = txfHP46.getText();
                String hp7 = txfHP47.getText();
                String hp8 = txfHP48.getText();
                String hp9 = txfHP49.getText();
                String hp0 = txfHP50.getText();
                String w1 = txfW41.getText();
                String w2 = txfW42.getText();
                String w3 = txfW43.getText();
                String w4 = txfW44.getText();
                String w5 = txfW45.getText();
                String w6 = txfW46.getText();
                String w7 = txfW47.getText();
                String w8 = txfW48.getText();
                String w9 = txfW49.getText();
                String w0 = txfW50.getText();
                String wp1 = txfWP41.getText();
                String wp2 = txfWP42.getText();
                String wp3 = txfWP43.getText();
                String wp4 = txfWP44.getText();
                String wp5 = txfWP45.getText();
                String wp6 = txfWP46.getText();
                String wp7 = txfWP47.getText();
                String wp8 = txfWP48.getText();
                String wp9 = txfWP49.getText();
                String wp0 = txfWP50.getText();
                String s1 = txfS41.getText();
                String s2 = txfS42.getText();
                String s3 = txfS43.getText();
                String s4 = txfS44.getText();
                String s5 = txfS45.getText();
                String s6 = txfS46.getText();
                String s7 = txfS47.getText();
                String s8 = txfS48.getText();
                String s9 = txfS49.getText();
                String s0 = txfS50.getText();
                String sp1 = txfSP41.getText();
                String sp2 = txfSP42.getText();
                String sp3 = txfSP43.getText();
                String sp4 = txfSP44.getText();
                String sp5 = txfSP45.getText();
                String sp6 = txfSP46.getText();
                String sp7 = txfSP47.getText();
                String sp8 = txfSP48.getText();
                String sp9 = txfSP49.getText();
                String sp0 = txfSP50.getText();
                
                String waffen = txaWaffen2.getText();
                String zauber = txaZauber2.getText();
                String rucksack = txaRucksack2.getText();
                String notizen = txaNotizen2.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait4.getIcon();
                
                try {  
                    Verwaltung.addChar3(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        System.exit(0); 
        
    }                                        

    private void tglbtnRActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (tglbtnR.isSelected()){       
            if (tglbtnL.isSelected()){
                this.setSize(ww+ext+ext,wh);
                pnlR.setVisible(true);
            } else {
                this.setSize(ww+ext,wh);
                pnlR.setVisible(true);
            }       
        } else {
            if (tglbtnL.isSelected()){
                this.setSize(ww+ext,wh); 
                pnlR.setVisible(false);
            } else {
                this.setSize(ww,wh); 
                pnlR.setVisible(false);
            }           
        }       
    }                                       

    private void tglbtnLActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (tglbtnL.isSelected()){ 
            if (tglbtnR.isSelected()) {  
                this.setSize(ww+(ext*2),wh);
                this.setLocation(this.getX()-ext,this.getY());
                pnlMain.setLocation(pnlMain.getX()+ext,pnlMain.getY());
                pnlR.setLocation(pnlR.getX()+ext,pnlR.getY());
                pnlL.setVisible(true);
            } else {
                this.setSize(ww+ext,wh);
                this.setLocation(this.getX()-ext,this.getY());
                pnlMain.setLocation(pnlMain.getX()+ext,pnlMain.getY());
                pnlR.setLocation(pnlR.getX()+ext,pnlR.getY());
                pnlL.setVisible(true);
            }
        } else { 
            if (tglbtnR.isSelected()) { 
                this.setSize(ww+ext,wh);
                this.setLocation(this.getX()+ext,this.getY());
                pnlMain.setLocation(pnlMain.getX()-ext,pnlMain.getY());
                pnlR.setLocation(pnlR.getX()-ext,pnlR.getY());
                pnlL.setVisible(false);
            } else {
                this.setSize(ww,wh);
                this.setLocation(this.getX()+ext,this.getY());
                pnlMain.setLocation(pnlMain.getX()-ext,pnlMain.getY());
                pnlR.setLocation(pnlR.getX()-ext,pnlR.getY());
                pnlL.setVisible(false);
            }
        }
    }                                       

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {                                        
                  
        if (tabb1.isVisible()){

            if (!"?".equals(txfName.getText()) & !"?".equals(txfGeschlecht.getText()) & !"?".equals(txfAlter.getText()) & !"?".equals(txfRasse.getText()) & !"?".equals(txfHeimat.getText()) & !"?".equals(txfBeruf.getText()) & !"?".equals(txfStatur.getText())) {    
                
                String name = txfName.getText();
                String geschlecht = txfGeschlecht.getText();
                String alter = txfAlter.getText();
                String rasse = txfRasse.getText();
                String heimat = txfHeimat.getText();
                String beruf = txfBeruf.getText();
                String statur = txfStatur.getText();
                int life = jSlider1.getValue();
                String h1 = txfH1.getText();
                String h2 = txfH2.getText();
                String h3 = txfH3.getText();
                String h4 = txfH4.getText();
                String h5 = txfH5.getText();
                String h6 = txfH6.getText();
                String h7 = txfH7.getText();
                String h8 = txfH8.getText();
                String h9 = txfH9.getText();
                String h0 = txfH10.getText();
                String hp1 = txfHP1.getText();
                String hp2 = txfHP2.getText();
                String hp3 = txfHP3.getText();
                String hp4 = txfHP4.getText();
                String hp5 = txfHP5.getText();
                String hp6 = txfHP6.getText();
                String hp7 = txfHP7.getText();
                String hp8 = txfHP8.getText();
                String hp9 = txfHP9.getText();
                String hp0 = txfHP10.getText();
                String w1 = txfW1.getText();
                String w2 = txfW2.getText();
                String w3 = txfW3.getText();
                String w4 = txfW4.getText();
                String w5 = txfW5.getText();
                String w6 = txfW6.getText();
                String w7 = txfW7.getText();
                String w8 = txfW8.getText();
                String w9 = txfW9.getText();
                String w0 = txfW10.getText();
                String wp1 = txfWP1.getText();
                String wp2 = txfWP2.getText();
                String wp3 = txfWP3.getText();
                String wp4 = txfWP4.getText();
                String wp5 = txfWP5.getText();
                String wp6 = txfWP6.getText();
                String wp7 = txfWP7.getText();
                String wp8 = txfWP8.getText();
                String wp9 = txfWP9.getText();
                String wp0 = txfWP10.getText();
                String s1 = txfS1.getText();
                String s2 = txfS2.getText();
                String s3 = txfS3.getText();
                String s4 = txfS4.getText();
                String s5 = txfS5.getText();
                String s6 = txfS6.getText();
                String s7 = txfS7.getText();
                String s8 = txfS8.getText();
                String s9 = txfS9.getText();
                String s0 = txfS10.getText();
                String sp1 = txfSP1.getText();
                String sp2 = txfSP2.getText();
                String sp3 = txfSP3.getText();
                String sp4 = txfSP4.getText();
                String sp5 = txfSP5.getText();
                String sp6 = txfSP6.getText();
                String sp7 = txfSP7.getText();
                String sp8 = txfSP8.getText();
                String sp9 = txfSP9.getText();
                String sp0 = txfSP10.getText();
                
                String waffen = txaWaffen.getText();
                String zauber = txaZauber.getText();
                String rucksack = txaRucksack.getText();
                String notizen = txaNotizen.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait.getIcon();
                
                try {  
                    Verwaltung.addChar1(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName.setEditable(false);
                txfGeschlecht.setEditable(false);
                txfAlter.setEditable(false);
                txfRasse.setEditable(false);
                txfHeimat.setEditable(false);
                txfBeruf.setEditable(false);
                txfStatur.setEditable(false);
                btnNext.setVisible(false);
            }  else  {
                JOptionPane.showMessageDialog(null, "Zum Speichern müssen alle Felder mit Fragezeichen ausgefüllt sein", "ACHTUNG", JOptionPane.DEFAULT_OPTION);
            }    
        }
            
        if (tabb2.isVisible()){

            if (!"?".equals(txfName1.getText()) & !"?".equals(txfGeschlecht1.getText()) & !"?".equals(txfAlter1.getText()) & !"?".equals(txfRasse1.getText()) & !"?".equals(txfHeimat1.getText()) & !"?".equals(txfBeruf1.getText()) & !"?".equals(txfStatur1.getText())) {    
                
                String name = txfName1.getText();
                String geschlecht = txfGeschlecht1.getText();
                String alter = txfAlter1.getText();
                String rasse = txfRasse1.getText();
                String heimat = txfHeimat1.getText();
                String beruf = txfBeruf1.getText();
                String statur = txfStatur1.getText();
                int life = jSlider2.getValue();
                String h1 = txfH11.getText();
                String h2 = txfH12.getText();
                String h3 = txfH13.getText();
                String h4 = txfH14.getText();
                String h5 = txfH15.getText();
                String h6 = txfH16.getText();
                String h7 = txfH17.getText();
                String h8 = txfH18.getText();
                String h9 = txfH19.getText();
                String h0 = txfH20.getText();
                String hp1 = txfHP11.getText();
                String hp2 = txfHP12.getText();
                String hp3 = txfHP13.getText();
                String hp4 = txfHP14.getText();
                String hp5 = txfHP15.getText();
                String hp6 = txfHP16.getText();
                String hp7 = txfHP17.getText();
                String hp8 = txfHP18.getText();
                String hp9 = txfHP19.getText();
                String hp0 = txfHP20.getText();
                String w1 = txfW11.getText();
                String w2 = txfW12.getText();
                String w3 = txfW13.getText();
                String w4 = txfW14.getText();
                String w5 = txfW15.getText();
                String w6 = txfW16.getText();
                String w7 = txfW17.getText();
                String w8 = txfW18.getText();
                String w9 = txfW19.getText();
                String w0 = txfW20.getText();
                String wp1 = txfWP11.getText();
                String wp2 = txfWP12.getText();
                String wp3 = txfWP13.getText();
                String wp4 = txfWP14.getText();
                String wp5 = txfWP15.getText();
                String wp6 = txfWP16.getText();
                String wp7 = txfWP17.getText();
                String wp8 = txfWP18.getText();
                String wp9 = txfWP19.getText();
                String wp0 = txfWP20.getText();
                String s1 = txfS11.getText();
                String s2 = txfS12.getText();
                String s3 = txfS13.getText();
                String s4 = txfS14.getText();
                String s5 = txfS15.getText();
                String s6 = txfS16.getText();
                String s7 = txfS17.getText();
                String s8 = txfS18.getText();
                String s9 = txfS19.getText();
                String s0 = txfS20.getText();
                String sp1 = txfSP11.getText();
                String sp2 = txfSP12.getText();
                String sp3 = txfSP13.getText();
                String sp4 = txfSP14.getText();
                String sp5 = txfSP15.getText();
                String sp6 = txfSP16.getText();
                String sp7 = txfSP17.getText();
                String sp8 = txfSP18.getText();
                String sp9 = txfSP19.getText();
                String sp0 = txfSP20.getText();
                
                String waffen = txaWaffen2.getText();
                String zauber = txaZauber2.getText();
                String rucksack = txaRucksack2.getText();
                String notizen = txaNotizen2.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait1.getIcon();
                
                try {  
                    Verwaltung.addChar2(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName1.setEditable(false);
                txfGeschlecht1.setEditable(false);
                txfAlter1.setEditable(false);
                txfRasse1.setEditable(false);
                txfHeimat1.setEditable(false);
                txfBeruf1.setEditable(false);
                txfStatur1.setEditable(false);
                btnNext1.setVisible(false);
            }  else  {
                JOptionPane.showMessageDialog(null, "Zum Speichern müssen alle Felder mit Fragezeichen ausgefüllt sein", "ACHTUNG", JOptionPane.DEFAULT_OPTION);
            }     
        }
                
            if (tabb3.isVisible()){

            if (!"?".equals(txfName4.getText()) & !"?".equals(txfGeschlecht4.getText()) & !"?".equals(txfAlter4.getText()) & !"?".equals(txfRasse4.getText()) & !"?".equals(txfHeimat4.getText()) & !"?".equals(txfBeruf4.getText()) & !"?".equals(txfStatur4.getText())) {    
                
                String name = txfName4.getText();
                String geschlecht = txfGeschlecht4.getText();
                String alter = txfAlter4.getText();
                String rasse = txfRasse4.getText();
                String heimat = txfHeimat4.getText();
                String beruf = txfBeruf4.getText();
                String statur = txfStatur4.getText();
                int life = jSlider5.getValue();
                String h1 = txfH41.getText();
                String h2 = txfH42.getText();
                String h3 = txfH43.getText();
                String h4 = txfH44.getText();
                String h5 = txfH45.getText();
                String h6 = txfH46.getText();
                String h7 = txfH47.getText();
                String h8 = txfH48.getText();
                String h9 = txfH49.getText();
                String h0 = txfH50.getText();
                String hp1 = txfHP41.getText();
                String hp2 = txfHP42.getText();
                String hp3 = txfHP43.getText();
                String hp4 = txfHP44.getText();
                String hp5 = txfHP45.getText();
                String hp6 = txfHP46.getText();
                String hp7 = txfHP47.getText();
                String hp8 = txfHP48.getText();
                String hp9 = txfHP49.getText();
                String hp0 = txfHP50.getText();
                String w1 = txfW41.getText();
                String w2 = txfW42.getText();
                String w3 = txfW43.getText();
                String w4 = txfW44.getText();
                String w5 = txfW45.getText();
                String w6 = txfW46.getText();
                String w7 = txfW47.getText();
                String w8 = txfW48.getText();
                String w9 = txfW49.getText();
                String w0 = txfW50.getText();
                String wp1 = txfWP41.getText();
                String wp2 = txfWP42.getText();
                String wp3 = txfWP43.getText();
                String wp4 = txfWP44.getText();
                String wp5 = txfWP45.getText();
                String wp6 = txfWP46.getText();
                String wp7 = txfWP47.getText();
                String wp8 = txfWP48.getText();
                String wp9 = txfWP49.getText();
                String wp0 = txfWP50.getText();
                String s1 = txfS41.getText();
                String s2 = txfS42.getText();
                String s3 = txfS43.getText();
                String s4 = txfS44.getText();
                String s5 = txfS45.getText();
                String s6 = txfS46.getText();
                String s7 = txfS47.getText();
                String s8 = txfS48.getText();
                String s9 = txfS49.getText();
                String s0 = txfS50.getText();
                String sp1 = txfSP41.getText();
                String sp2 = txfSP42.getText();
                String sp3 = txfSP43.getText();
                String sp4 = txfSP44.getText();
                String sp5 = txfSP45.getText();
                String sp6 = txfSP46.getText();
                String sp7 = txfSP47.getText();
                String sp8 = txfSP48.getText();
                String sp9 = txfSP49.getText();
                String sp0 = txfSP50.getText();
                
                String waffen = txaWaffen2.getText();
                String zauber = txaZauber2.getText();
                String rucksack = txaRucksack2.getText();
                String notizen = txaNotizen2.getText();
                
                ImageIcon image = (ImageIcon) lblPortrait4.getIcon();
                
                try {  
                    Verwaltung.addChar3(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName4.setEditable(false);
                txfGeschlecht4.setEditable(false);
                txfAlter4.setEditable(false);
                txfRasse4.setEditable(false);
                txfHeimat4.setEditable(false);
                txfBeruf4.setEditable(false);
                txfStatur4.setEditable(false); 
                btnNext4.setVisible(false);
            }  else  {
                JOptionPane.showMessageDialog(null, "Zum Speichern müssen alle Felder mit Fragezeichen ausgefüllt sein", "ACHTUNG", JOptionPane.DEFAULT_OPTION);
            }     
        }   
            
            
            pnlMain.repaint();
            
    }                                       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        txfName.setText("?");
        txfName.setEditable(true);
        txfGeschlecht.setText("?");
        txfGeschlecht.setEditable(true);
        txfAlter.setText("?");
        txfAlter.setEditable(true);
        txfRasse.setText("?");
        txfRasse.setEditable(true);
        txfHeimat.setText("?");
        txfHeimat.setEditable(true);
        txfBeruf.setText("?");
        txfBeruf.setEditable(true);
        txfStatur.setText("?");
        txfStatur.setEditable(true);
        jSlider1.setValue(0);
        btnNext.setVisible(true);
        lblPortrait.setIcon(b1);
        txfH1.setText("");
        txfH2.setText("");
        txfH3.setText("");
        txfH4.setText("");
        txfH5.setText("");
        txfH6.setText("");
        txfH7.setText("");
        txfH8.setText("");
        txfH9.setText("");
        txfH10.setText("");
        txfHP1.setText("");
        txfHP2.setText("");
        txfHP3.setText("");
        txfHP4.setText("");
        txfHP5.setText("");
        txfHP6.setText("");
        txfHP7.setText("");
        txfHP8.setText("");
        txfHP9.setText("");
        txfHP10.setText("");
        txfW1.setText("");
        txfW2.setText("");
        txfW3.setText("");
        txfW4.setText("");
        txfW5.setText("");
        txfW6.setText("");
        txfW7.setText("");
        txfW8.setText("");
        txfW9.setText("");
        txfW10.setText("");
        txfWP1.setText("");
        txfWP2.setText("");
        txfWP3.setText("");
        txfWP4.setText("");
        txfWP5.setText("");
        txfWP6.setText("");
        txfWP7.setText("");
        txfWP8.setText("");
        txfWP9.setText("");
        txfWP10.setText("");
        txfS1.setText("");
        txfS2.setText("");
        txfS3.setText("");
        txfS4.setText("");
        txfS5.setText("");
        txfS6.setText("");
        txfS7.setText("");
        txfS8.setText("");
        txfS9.setText("");
        txfS10.setText("");
        txfSP1.setText("");
        txfSP2.setText("");
        txfSP3.setText("");
        txfSP4.setText("");
        txfSP5.setText("");
        txfSP6.setText("");
        txfSP7.setText("");
        txfSP8.setText("");
        txfSP9.setText("");
        txfSP10.setText("");
        txaWaffen.setText("");
        txaZauber.setText("");
        txaRucksack.setText("");
        txaNotizen.setText("");
        pnlMain.repaint();
    }                                         

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txfName1.setText("?");
        txfName1.setEditable(true);
        txfGeschlecht1.setText("?");
        txfGeschlecht1.setEditable(true);
        txfAlter1.setText("?");
        txfAlter1.setEditable(true);
        txfRasse1.setText("?");
        txfRasse1.setEditable(true);
        txfHeimat1.setText("?");
        txfHeimat1.setEditable(true);
        txfBeruf1.setText("?");
        txfBeruf1.setEditable(true);
        txfStatur1.setText("?");
        txfStatur1.setEditable(true);
        jSlider2.setValue(0);
        btnNext1.setVisible(true);
        lblPortrait1.setIcon(b1);
        txfH11.setText("");
        txfH12.setText("");
        txfH13.setText("");
        txfH14.setText("");
        txfH15.setText("");
        txfH16.setText("");
        txfH17.setText("");
        txfH18.setText("");
        txfH19.setText("");
        txfH20.setText("");
        txfHP11.setText("");
        txfHP12.setText("");
        txfHP13.setText("");
        txfHP14.setText("");
        txfHP15.setText("");
        txfHP16.setText("");
        txfHP17.setText("");
        txfHP18.setText("");
        txfHP19.setText("");
        txfHP20.setText("");
        txfW11.setText("");
        txfW12.setText("");
        txfW13.setText("");
        txfW14.setText("");
        txfW15.setText("");
        txfW16.setText("");
        txfW17.setText("");
        txfW18.setText("");
        txfW19.setText("");
        txfW20.setText("");
        txfWP11.setText("");
        txfWP12.setText("");
        txfWP13.setText("");
        txfWP14.setText("");
        txfWP15.setText("");
        txfWP16.setText("");
        txfWP17.setText("");
        txfWP18.setText("");
        txfWP19.setText("");
        txfWP20.setText("");
        txfS11.setText("");
        txfS12.setText("");
        txfS13.setText("");
        txfS14.setText("");
        txfS15.setText("");
        txfS16.setText("");
        txfS17.setText("");
        txfS18.setText("");
        txfS19.setText("");
        txfS20.setText("");
        txfSP11.setText("");
        txfSP12.setText("");
        txfSP13.setText("");
        txfSP14.setText("");
        txfSP15.setText("");
        txfSP16.setText("");
        txfSP17.setText("");
        txfSP18.setText("");
        txfSP19.setText("");
        txfSP20.setText("");
        txaWaffen1.setText("");
        txaZauber1.setText("");
        txaRucksack1.setText("");
        txaNotizen1.setText("");
        pnlMain.repaint();
    }                                          

    private void btnDelete4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txfName4.setText("?");
        txfName4.setEditable(true);
        txfGeschlecht4.setText("?");
        txfGeschlecht4.setEditable(true);
        txfAlter4.setText("?");
        txfAlter4.setEditable(true);
        txfRasse4.setText("?");
        txfRasse4.setEditable(true);
        txfHeimat4.setText("?");
        txfHeimat4.setEditable(true);
        txfBeruf4.setText("?");
        txfBeruf4.setEditable(true);
        txfStatur4.setText("?");
        txfStatur4.setEditable(true);
        jSlider5.setValue(0);
        btnNext4.setVisible(true);
        lblPortrait4.setIcon(b1);
        txfH41.setText("");
        txfH42.setText("");
        txfH43.setText("");
        txfH44.setText("");
        txfH45.setText("");
        txfH46.setText("");
        txfH47.setText("");
        txfH48.setText("");
        txfH49.setText("");
        txfH50.setText("");
        txfHP41.setText("");
        txfHP42.setText("");
        txfHP43.setText("");
        txfHP44.setText("");
        txfHP45.setText("");
        txfHP46.setText("");
        txfHP47.setText("");
        txfHP48.setText("");
        txfHP49.setText("");
        txfHP50.setText("");
        txfW41.setText("");
        txfW42.setText("");
        txfW43.setText("");
        txfW44.setText("");
        txfW45.setText("");
        txfW46.setText("");
        txfW47.setText("");
        txfW48.setText("");
        txfW49.setText("");
        txfW50.setText("");
        txfWP41.setText("");
        txfWP42.setText("");
        txfWP43.setText("");
        txfWP44.setText("");
        txfWP45.setText("");
        txfWP46.setText("");
        txfWP47.setText("");
        txfWP48.setText("");
        txfWP49.setText("");
        txfWP50.setText("");
        txfS41.setText("");
        txfS42.setText("");
        txfS43.setText("");
        txfS44.setText("");
        txfS45.setText("");
        txfS46.setText("");
        txfS47.setText("");
        txfS48.setText("");
        txfS49.setText("");
        txfS50.setText("");
        txfSP41.setText("");
        txfSP42.setText("");
        txfSP43.setText("");
        txfSP44.setText("");
        txfSP45.setText("");
        txfSP46.setText("");
        txfSP47.setText("");
        txfSP48.setText("");
        txfSP49.setText("");
        txfSP50.setText("");
        txaWaffen2.setText("");
        txaZauber2.setText("");
        txaRucksack2.setText("");
        txaNotizen2.setText("");
        pnlMain.repaint();
    }                                          

    private void FocusGained(java.awt.event.FocusEvent evt) {                             
        
        if(txfName.hasFocus())
        if(txfName.getText().equals("?")) 
            txfName.setText("");
         
        if(txfGeschlecht.hasFocus())
        if(txfGeschlecht.getText().equals("?")) 
            txfGeschlecht.setText("");
        
        if(txfAlter.hasFocus())
        if(txfAlter.getText().equals("?")) 
            txfAlter.setText("");
        
        if(txfRasse.hasFocus())
        if(txfRasse.getText().equals("?")) 
            txfRasse.setText("");
        
        if(txfHeimat.hasFocus())
        if(txfHeimat.getText().equals("?")) 
            txfHeimat.setText("");
        
        if(txfBeruf.hasFocus())
        if(txfBeruf.getText().equals("?")) 
            txfBeruf.setText("");
        
        if(txfStatur.hasFocus())
        if(txfStatur.getText().equals("?")) 
            txfStatur.setText("");
        
        if(txfName1.hasFocus())
        if(txfName1.getText().equals("?")) 
            txfName1.setText("");
         
        if(txfGeschlecht1.hasFocus())
        if(txfGeschlecht1.getText().equals("?")) 
            txfGeschlecht1.setText("");
        
        if(txfAlter1.hasFocus())
        if(txfAlter1.getText().equals("?")) 
            txfAlter1.setText("");
        
        if(txfRasse1.hasFocus())
        if(txfRasse1.getText().equals("?")) 
            txfRasse1.setText("");
        
        if(txfHeimat1.hasFocus())
        if(txfHeimat1.getText().equals("?")) 
            txfHeimat1.setText("");
        
        if(txfBeruf1.hasFocus())
        if(txfBeruf1.getText().equals("?")) 
            txfBeruf1.setText("");
        
        if(txfStatur1.hasFocus())
        if(txfStatur1.getText().equals("?")) 
            txfStatur1.setText("");    
        
        if(txfName4.hasFocus())
        if(txfName4.getText().equals("?")) 
            txfName4.setText("");
         
        if(txfGeschlecht4.hasFocus())
        if(txfGeschlecht4.getText().equals("?")) 
            txfGeschlecht4.setText("");
        
        if(txfAlter4.hasFocus())
        if(txfAlter4.getText().equals("?")) 
            txfAlter4.setText("");
        
        if(txfRasse4.hasFocus())
        if(txfRasse4.getText().equals("?")) 
            txfRasse4.setText("");
        
        if(txfHeimat4.hasFocus())
        if(txfHeimat4.getText().equals("?")) 
            txfHeimat4.setText("");
        
        if(txfBeruf4.hasFocus())
        if(txfBeruf4.getText().equals("?")) 
            txfBeruf4.setText("");
        
        if(txfStatur4.hasFocus())
        if(txfStatur4.getText().equals("?")) 
            txfStatur4.setText("");    
        
    }                            

    private void FocusLost(java.awt.event.FocusEvent evt) {                           
        
        if(txfName.getText().equals("")) 
            txfName.setText("?");
         
        if(txfGeschlecht.getText().equals("")) 
            txfGeschlecht.setText("?");
        
        if(txfAlter.getText().equals("")) 
            txfAlter.setText("?");
        
        if(txfRasse.getText().equals("")) 
            txfRasse.setText("?");
        
        if(txfHeimat.getText().equals("")) 
            txfHeimat.setText("?");
        
        if(txfBeruf.getText().equals("")) 
            txfBeruf.setText("?");
        
        if(txfStatur.getText().equals("")) 
            txfStatur.setText("?");
        
        if(txfName1.getText().equals("")) 
            txfName1.setText("?");
         
        if(txfGeschlecht1.getText().equals("")) 
            txfGeschlecht1.setText("?");
        
        if(txfAlter1.getText().equals("")) 
            txfAlter1.setText("?");
        
        if(txfRasse1.getText().equals("")) 
            txfRasse1.setText("?");
        
        if(txfHeimat1.getText().equals("")) 
            txfHeimat1.setText("?");
        
        if(txfBeruf1.getText().equals("")) 
            txfBeruf1.setText("?");
        
        if(txfStatur1.getText().equals("")) 
            txfStatur1.setText("?");    
        
        if(txfName4.getText().equals("")) 
            txfName4.setText("?");
         
        if(txfGeschlecht4.getText().equals("")) 
            txfGeschlecht4.setText("?");
        
        if(txfAlter4.getText().equals("")) 
            txfAlter4.setText("?");
        
        if(txfRasse4.getText().equals("")) 
            txfRasse4.setText("?");
        
        if(txfHeimat4.getText().equals("")) 
            txfHeimat4.setText("?");
        
        if(txfBeruf4.getText().equals("")) 
            txfBeruf4.setText("?");
        
        if(txfStatur4.getText().equals("")) 
            txfStatur4.setText("?");  
        
    }                          

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        
        if (!"?".equals(txfName.getText()) & !"?".equals(txfGeschlecht.getText()) & !"?".equals(txfAlter.getText()) & !"?".equals(txfRasse.getText()) & !"?".equals(txfHeimat.getText()) & !"?".equals(txfBeruf.getText()) & !"?".equals(txfStatur.getText())) {    
                
                String name = txfName.getText();
                String geschlecht = txfGeschlecht.getText();
                String alter = txfAlter.getText();
                String rasse = txfRasse.getText();
                String heimat = txfHeimat.getText();
                String beruf = txfBeruf.getText();
                String statur = txfStatur.getText();
                int life = jSlider1.getValue();
                String h1 = txfH1.getText();
                String h2 = txfH2.getText();
                String h3 = txfH3.getText();
                String h4 = txfH4.getText();
                String h5 = txfH5.getText();
                String h6 = txfH6.getText();
                String h7 = txfH7.getText();
                String h8 = txfH8.getText();
                String h9 = txfH9.getText();
                String h0 = txfH10.getText();
                String hp1 = txfHP1.getText();
                String hp2 = txfHP2.getText();
                String hp3 = txfHP3.getText();
                String hp4 = txfHP4.getText();
                String hp5 = txfHP5.getText();
                String hp6 = txfHP6.getText();
                String hp7 = txfHP7.getText();
                String hp8 = txfHP8.getText();
                String hp9 = txfHP9.getText();
                String hp0 = txfHP10.getText();
                String w1 = txfW1.getText();
                String w2 = txfW2.getText();
                String w3 = txfW3.getText();
                String w4 = txfW4.getText();
                String w5 = txfW5.getText();
                String w6 = txfW6.getText();
                String w7 = txfW7.getText();
                String w8 = txfW8.getText();
                String w9 = txfW9.getText();
                String w0 = txfW10.getText();
                String wp1 = txfWP1.getText();
                String wp2 = txfWP2.getText();
                String wp3 = txfWP3.getText();
                String wp4 = txfWP4.getText();
                String wp5 = txfWP5.getText();
                String wp6 = txfWP6.getText();
                String wp7 = txfWP7.getText();
                String wp8 = txfWP8.getText();
                String wp9 = txfWP9.getText();
                String wp0 = txfWP10.getText();
                String s1 = txfS1.getText();
                String s2 = txfS2.getText();
                String s3 = txfS3.getText();
                String s4 = txfS4.getText();
                String s5 = txfS5.getText();
                String s6 = txfS6.getText();
                String s7 = txfS7.getText();
                String s8 = txfS8.getText();
                String s9 = txfS9.getText();
                String s0 = txfS10.getText();
                String sp1 = txfSP1.getText();
                String sp2 = txfSP2.getText();
                String sp3 = txfSP3.getText();
                String sp4 = txfSP4.getText();
                String sp5 = txfSP5.getText();
                String sp6 = txfSP6.getText();
                String sp7 = txfSP7.getText();
                String sp8 = txfSP8.getText();
                String sp9 = txfSP9.getText();
                String sp0 = txfSP10.getText();
                ImageIcon image = (ImageIcon) lblPortrait.getIcon();
                String waffen = txaWaffen.getText();
                String zauber = txaZauber.getText();
                String rucksack = txaRucksack.getText();
                String notizen = txaNotizen.getText();
                
                try {  
                    Verwaltung.addChar1(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName.setEditable(false);
                txfGeschlecht.setEditable(false);
                txfAlter.setEditable(false);
                txfRasse.setEditable(false);
                txfHeimat.setEditable(false);
                txfBeruf.setEditable(false);
                txfStatur.setEditable(false);
                jSlider1.setValue(life);
            }  
        
        int slide = jSlider1.getValue();
        txfSlider.setText(String.valueOf(slide));
        
    }                                     

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {                                      
        
        if (!"?".equals(txfName1.getText()) & !"?".equals(txfGeschlecht1.getText()) & !"?".equals(txfAlter1.getText()) & !"?".equals(txfRasse1.getText()) & !"?".equals(txfHeimat1.getText()) & !"?".equals(txfBeruf1.getText()) & !"?".equals(txfStatur1.getText())) {    
                
                String name = txfName1.getText();
                String geschlecht = txfGeschlecht1.getText();
                String alter = txfAlter1.getText();
                String rasse = txfRasse1.getText();
                String heimat = txfHeimat1.getText();
                String beruf = txfBeruf1.getText();
                String statur = txfStatur1.getText();
                int life = jSlider2.getValue();
                String h1 = txfH11.getText();
                String h2 = txfH12.getText();
                String h3 = txfH13.getText();
                String h4 = txfH14.getText();
                String h5 = txfH15.getText();
                String h6 = txfH16.getText();
                String h7 = txfH17.getText();
                String h8 = txfH18.getText();
                String h9 = txfH19.getText();
                String h0 = txfH20.getText();
                String hp1 = txfHP11.getText();
                String hp2 = txfHP12.getText();
                String hp3 = txfHP13.getText();
                String hp4 = txfHP14.getText();
                String hp5 = txfHP15.getText();
                String hp6 = txfHP16.getText();
                String hp7 = txfHP17.getText();
                String hp8 = txfHP18.getText();
                String hp9 = txfHP19.getText();
                String hp0 = txfHP20.getText();
                String w1 = txfW11.getText();
                String w2 = txfW12.getText();
                String w3 = txfW13.getText();
                String w4 = txfW14.getText();
                String w5 = txfW15.getText();
                String w6 = txfW16.getText();
                String w7 = txfW17.getText();
                String w8 = txfW18.getText();
                String w9 = txfW19.getText();
                String w0 = txfW20.getText();
                String wp1 = txfWP11.getText();
                String wp2 = txfWP12.getText();
                String wp3 = txfWP13.getText();
                String wp4 = txfWP14.getText();
                String wp5 = txfWP15.getText();
                String wp6 = txfWP16.getText();
                String wp7 = txfWP17.getText();
                String wp8 = txfWP18.getText();
                String wp9 = txfWP19.getText();
                String wp0 = txfWP20.getText();
                String s1 = txfS11.getText();
                String s2 = txfS12.getText();
                String s3 = txfS13.getText();
                String s4 = txfS14.getText();
                String s5 = txfS15.getText();
                String s6 = txfS16.getText();
                String s7 = txfS17.getText();
                String s8 = txfS18.getText();
                String s9 = txfS19.getText();
                String s0 = txfS20.getText();
                String sp1 = txfSP11.getText();
                String sp2 = txfSP12.getText();
                String sp3 = txfSP13.getText();
                String sp4 = txfSP14.getText();
                String sp5 = txfSP15.getText();
                String sp6 = txfSP16.getText();
                String sp7 = txfSP17.getText();
                String sp8 = txfSP18.getText();
                String sp9 = txfSP19.getText();
                String sp0 = txfSP20.getText();
                ImageIcon image = (ImageIcon) lblPortrait1.getIcon();
                String waffen = txaWaffen1.getText();
                String zauber = txaZauber1.getText();
                String rucksack = txaRucksack1.getText();
                String notizen = txaNotizen1.getText();
                
                try {  
                    Verwaltung.addChar2(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName1.setEditable(false);
                txfGeschlecht1.setEditable(false);
                txfAlter1.setEditable(false);
                txfRasse1.setEditable(false);
                txfHeimat1.setEditable(false);
                txfBeruf1.setEditable(false);
                txfStatur1.setEditable(false);
                jSlider2.setValue(life);
            }  
        
        int slide = jSlider2.getValue();
        txfSlider2.setText(String.valueOf(slide));
        
    }                                     

    private void jSlider5StateChanged(javax.swing.event.ChangeEvent evt) {                                      

        if (!"?".equals(txfName4.getText()) & !"?".equals(txfGeschlecht4.getText()) & !"?".equals(txfAlter4.getText()) & !"?".equals(txfRasse4.getText()) & !"?".equals(txfHeimat4.getText()) & !"?".equals(txfBeruf4.getText()) & !"?".equals(txfStatur4.getText())) {    
                
                String name = txfName4.getText();
                String geschlecht = txfGeschlecht4.getText();
                String alter = txfAlter4.getText();
                String rasse = txfRasse4.getText();
                String heimat = txfHeimat4.getText();
                String beruf = txfBeruf4.getText();
                String statur = txfStatur4.getText();
                int life = jSlider5.getValue();
                String h1 = txfH41.getText();
                String h2 = txfH42.getText();
                String h3 = txfH43.getText();
                String h4 = txfH44.getText();
                String h5 = txfH45.getText();
                String h6 = txfH46.getText();
                String h7 = txfH47.getText();
                String h8 = txfH48.getText();
                String h9 = txfH49.getText();
                String h0 = txfH50.getText();
                String hp1 = txfHP41.getText();
                String hp2 = txfHP42.getText();
                String hp3 = txfHP43.getText();
                String hp4 = txfHP44.getText();
                String hp5 = txfHP45.getText();
                String hp6 = txfHP46.getText();
                String hp7 = txfHP47.getText();
                String hp8 = txfHP48.getText();
                String hp9 = txfHP49.getText();
                String hp0 = txfHP50.getText();
                String w1 = txfW41.getText();
                String w2 = txfW42.getText();
                String w3 = txfW43.getText();
                String w4 = txfW44.getText();
                String w5 = txfW45.getText();
                String w6 = txfW46.getText();
                String w7 = txfW47.getText();
                String w8 = txfW48.getText();
                String w9 = txfW49.getText();
                String w0 = txfW50.getText();
                String wp1 = txfWP41.getText();
                String wp2 = txfWP42.getText();
                String wp3 = txfWP43.getText();
                String wp4 = txfWP44.getText();
                String wp5 = txfWP45.getText();
                String wp6 = txfWP46.getText();
                String wp7 = txfWP47.getText();
                String wp8 = txfWP48.getText();
                String wp9 = txfWP49.getText();
                String wp0 = txfWP50.getText();
                String s1 = txfS41.getText();
                String s2 = txfS42.getText();
                String s3 = txfS43.getText();
                String s4 = txfS44.getText();
                String s5 = txfS45.getText();
                String s6 = txfS46.getText();
                String s7 = txfS47.getText();
                String s8 = txfS48.getText();
                String s9 = txfS49.getText();
                String s0 = txfS50.getText();
                String sp1 = txfSP41.getText();
                String sp2 = txfSP42.getText();
                String sp3 = txfSP43.getText();
                String sp4 = txfSP44.getText();
                String sp5 = txfSP45.getText();
                String sp6 = txfSP46.getText();
                String sp7 = txfSP47.getText();
                String sp8 = txfSP48.getText();
                String sp9 = txfSP49.getText();
                String sp0 = txfSP50.getText();
                ImageIcon image = (ImageIcon) lblPortrait4.getIcon();
                String waffen = txaWaffen2.getText();
                String zauber = txaZauber2.getText();
                String rucksack = txaRucksack2.getText();
                String notizen = txaNotizen2.getText();
                
                try {  
                    Verwaltung.addChar3(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                txfName4.setEditable(false);
                txfGeschlecht4.setEditable(false);
                txfAlter4.setEditable(false);
                txfRasse4.setEditable(false);
                txfHeimat4.setEditable(false);
                txfBeruf4.setEditable(false);
                txfStatur4.setEditable(false); 
                jSlider5.setValue(life);
            }   
        
        int slide = jSlider5.getValue();
        txfSlider4.setText(String.valueOf(slide));
        
    }                                     

    private void TableFocusGained(java.awt.event.FocusEvent evt) {                                  
        
        if (!"?".equals(txfName.getText()) & !"?".equals(txfGeschlecht.getText()) & !"?".equals(txfAlter.getText()) & !"?".equals(txfRasse.getText()) & !"?".equals(txfHeimat.getText()) & !"?".equals(txfBeruf.getText()) & !"?".equals(txfStatur.getText())) {    
                
                String name = txfName.getText();
                String geschlecht = txfGeschlecht.getText();
                String alter = txfAlter.getText();
                String rasse = txfRasse.getText();
                String heimat = txfHeimat.getText();
                String beruf = txfBeruf.getText();
                String statur = txfStatur.getText();
                int life = jSlider1.getValue();
                String h1 = txfH1.getText();
                String h2 = txfH2.getText();
                String h3 = txfH3.getText();
                String h4 = txfH4.getText();
                String h5 = txfH5.getText();
                String h6 = txfH6.getText();
                String h7 = txfH7.getText();
                String h8 = txfH8.getText();
                String h9 = txfH9.getText();
                String h0 = txfH10.getText();
                String hp1 = txfHP1.getText();
                String hp2 = txfHP2.getText();
                String hp3 = txfHP3.getText();
                String hp4 = txfHP4.getText();
                String hp5 = txfHP5.getText();
                String hp6 = txfHP6.getText();
                String hp7 = txfHP7.getText();
                String hp8 = txfHP8.getText();
                String hp9 = txfHP9.getText();
                String hp0 = txfHP10.getText();
                String w1 = txfW1.getText();
                String w2 = txfW2.getText();
                String w3 = txfW3.getText();
                String w4 = txfW4.getText();
                String w5 = txfW5.getText();
                String w6 = txfW6.getText();
                String w7 = txfW7.getText();
                String w8 = txfW8.getText();
                String w9 = txfW9.getText();
                String w0 = txfW10.getText();
                String wp1 = txfWP1.getText();
                String wp2 = txfWP2.getText();
                String wp3 = txfWP3.getText();
                String wp4 = txfWP4.getText();
                String wp5 = txfWP5.getText();
                String wp6 = txfWP6.getText();
                String wp7 = txfWP7.getText();
                String wp8 = txfWP8.getText();
                String wp9 = txfWP9.getText();
                String wp0 = txfWP10.getText();
                String s1 = txfS1.getText();
                String s2 = txfS2.getText();
                String s3 = txfS3.getText();
                String s4 = txfS4.getText();
                String s5 = txfS5.getText();
                String s6 = txfS6.getText();
                String s7 = txfS7.getText();
                String s8 = txfS8.getText();
                String s9 = txfS9.getText();
                String s0 = txfS10.getText();
                String sp1 = txfSP1.getText();
                String sp2 = txfSP2.getText();
                String sp3 = txfSP3.getText();
                String sp4 = txfSP4.getText();
                String sp5 = txfSP5.getText();
                String sp6 = txfSP6.getText();
                String sp7 = txfSP7.getText();
                String sp8 = txfSP8.getText();
                String sp9 = txfSP9.getText();
                String sp0 = txfSP10.getText();
                ImageIcon image = (ImageIcon) lblPortrait.getIcon();
                String waffen = txaWaffen.getText();
                String zauber = txaZauber.getText();
                String rucksack = txaRucksack.getText();
                String notizen = txaNotizen.getText();
                
                try {  
                    Verwaltung.addChar1(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                jSlider1.setValue(life);
            }
        
        
        if (!"?".equals(txfName1.getText()) & !"?".equals(txfGeschlecht1.getText()) & !"?".equals(txfAlter1.getText()) & !"?".equals(txfRasse1.getText()) & !"?".equals(txfHeimat1.getText()) & !"?".equals(txfBeruf1.getText()) & !"?".equals(txfStatur1.getText())) {    
                
                String name = txfName1.getText();
                String geschlecht = txfGeschlecht1.getText();
                String alter = txfAlter1.getText();
                String rasse = txfRasse1.getText();
                String heimat = txfHeimat1.getText();
                String beruf = txfBeruf1.getText();
                String statur = txfStatur1.getText();
                int life = jSlider2.getValue();
                String h1 = txfH11.getText();
                String h2 = txfH12.getText();
                String h3 = txfH13.getText();
                String h4 = txfH14.getText();
                String h5 = txfH15.getText();
                String h6 = txfH16.getText();
                String h7 = txfH17.getText();
                String h8 = txfH18.getText();
                String h9 = txfH19.getText();
                String h0 = txfH20.getText();
                String hp1 = txfHP11.getText();
                String hp2 = txfHP12.getText();
                String hp3 = txfHP13.getText();
                String hp4 = txfHP14.getText();
                String hp5 = txfHP15.getText();
                String hp6 = txfHP16.getText();
                String hp7 = txfHP17.getText();
                String hp8 = txfHP18.getText();
                String hp9 = txfHP19.getText();
                String hp0 = txfHP20.getText();
                String w1 = txfW11.getText();
                String w2 = txfW12.getText();
                String w3 = txfW13.getText();
                String w4 = txfW14.getText();
                String w5 = txfW15.getText();
                String w6 = txfW16.getText();
                String w7 = txfW17.getText();
                String w8 = txfW18.getText();
                String w9 = txfW19.getText();
                String w0 = txfW20.getText();
                String wp1 = txfWP11.getText();
                String wp2 = txfWP12.getText();
                String wp3 = txfWP13.getText();
                String wp4 = txfWP14.getText();
                String wp5 = txfWP15.getText();
                String wp6 = txfWP16.getText();
                String wp7 = txfWP17.getText();
                String wp8 = txfWP18.getText();
                String wp9 = txfWP19.getText();
                String wp0 = txfWP20.getText();
                String s1 = txfS11.getText();
                String s2 = txfS12.getText();
                String s3 = txfS13.getText();
                String s4 = txfS14.getText();
                String s5 = txfS15.getText();
                String s6 = txfS16.getText();
                String s7 = txfS17.getText();
                String s8 = txfS18.getText();
                String s9 = txfS19.getText();
                String s0 = txfS20.getText();
                String sp1 = txfSP11.getText();
                String sp2 = txfSP12.getText();
                String sp3 = txfSP13.getText();
                String sp4 = txfSP14.getText();
                String sp5 = txfSP15.getText();
                String sp6 = txfSP16.getText();
                String sp7 = txfSP17.getText();
                String sp8 = txfSP18.getText();
                String sp9 = txfSP19.getText();
                String sp0 = txfSP20.getText();
                ImageIcon image = (ImageIcon) lblPortrait1.getIcon();
                String waffen = txaWaffen1.getText();
                String zauber = txaZauber1.getText();
                String rucksack = txaRucksack1.getText();
                String notizen = txaNotizen1.getText();
                
                try {  
                    Verwaltung.addChar2(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                jSlider2.setValue(life);
            }
        
        
        if (!"?".equals(txfName4.getText()) & !"?".equals(txfGeschlecht4.getText()) & !"?".equals(txfAlter4.getText()) & !"?".equals(txfRasse4.getText()) & !"?".equals(txfHeimat4.getText()) & !"?".equals(txfBeruf4.getText()) & !"?".equals(txfStatur4.getText())) {    
                
                String name = txfName4.getText();
                String geschlecht = txfGeschlecht4.getText();
                String alter = txfAlter4.getText();
                String rasse = txfRasse4.getText();
                String heimat = txfHeimat4.getText();
                String beruf = txfBeruf4.getText();
                String statur = txfStatur4.getText();
                int life = jSlider5.getValue();
                String h1 = txfH41.getText();
                String h2 = txfH42.getText();
                String h3 = txfH43.getText();
                String h4 = txfH44.getText();
                String h5 = txfH45.getText();
                String h6 = txfH46.getText();
                String h7 = txfH47.getText();
                String h8 = txfH48.getText();
                String h9 = txfH49.getText();
                String h0 = txfH50.getText();
                String hp1 = txfHP41.getText();
                String hp2 = txfHP42.getText();
                String hp3 = txfHP43.getText();
                String hp4 = txfHP44.getText();
                String hp5 = txfHP45.getText();
                String hp6 = txfHP46.getText();
                String hp7 = txfHP47.getText();
                String hp8 = txfHP48.getText();
                String hp9 = txfHP49.getText();
                String hp0 = txfHP50.getText();
                String w1 = txfW41.getText();
                String w2 = txfW42.getText();
                String w3 = txfW43.getText();
                String w4 = txfW44.getText();
                String w5 = txfW45.getText();
                String w6 = txfW46.getText();
                String w7 = txfW47.getText();
                String w8 = txfW48.getText();
                String w9 = txfW49.getText();
                String w0 = txfW50.getText();
                String wp1 = txfWP41.getText();
                String wp2 = txfWP42.getText();
                String wp3 = txfWP43.getText();
                String wp4 = txfWP44.getText();
                String wp5 = txfWP45.getText();
                String wp6 = txfWP46.getText();
                String wp7 = txfWP47.getText();
                String wp8 = txfWP48.getText();
                String wp9 = txfWP49.getText();
                String wp0 = txfWP50.getText();
                String s1 = txfS41.getText();
                String s2 = txfS42.getText();
                String s3 = txfS43.getText();
                String s4 = txfS44.getText();
                String s5 = txfS45.getText();
                String s6 = txfS46.getText();
                String s7 = txfS47.getText();
                String s8 = txfS48.getText();
                String s9 = txfS49.getText();
                String s0 = txfS50.getText();
                String sp1 = txfSP41.getText();
                String sp2 = txfSP42.getText();
                String sp3 = txfSP43.getText();
                String sp4 = txfSP44.getText();
                String sp5 = txfSP45.getText();
                String sp6 = txfSP46.getText();
                String sp7 = txfSP47.getText();
                String sp8 = txfSP48.getText();
                String sp9 = txfSP49.getText();
                String sp0 = txfSP50.getText();
                ImageIcon image = (ImageIcon) lblPortrait4.getIcon();
                String waffen = txaWaffen2.getText();
                String zauber = txaZauber2.getText();
                String rucksack = txaRucksack2.getText();
                String notizen = txaNotizen2.getText();
                
                try {  
                    Verwaltung.addChar3(name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                jSlider5.setValue(life);
            }
    }                                 

    private void TableKey(java.awt.event.KeyEvent evt) {                          
        setHWS();
    }                         

    private void MouseClicker(java.awt.event.MouseEvent evt) {                              
        
        if (tabb1.isVisible()){
            pnlRmain.setVisible(true);
            pnlLmain.setVisible(true);
            pnlRmain1.setVisible(false);
            pnlLmain1.setVisible(false);
            pnlRmain2.setVisible(false);
            pnlLmain2.setVisible(false);
        }
        
        if (tabb2.isVisible()){
            pnlRmain.setVisible(false);
            pnlLmain.setVisible(false);
            pnlRmain1.setVisible(true);
            pnlLmain1.setVisible(true);
            pnlRmain2.setVisible(false);
            pnlLmain2.setVisible(false);
        }
        if (tabb3.isVisible()){
            pnlRmain.setVisible(false);
            pnlLmain.setVisible(false);
            pnlRmain1.setVisible(false);
            pnlLmain1.setVisible(false);
            pnlRmain2.setVisible(true);
            pnlLmain2.setVisible(true);
        }
    }                             

    private void btnRNGActionPerformed(java.awt.event.ActionEvent evt) {                                       
   
        int würfel = sliderRNG.getValue();
        int rng = (int)(Math.random() * würfel + 1);
        
        tfxRNG.setText(String.valueOf(rng));
    }                                      

    private void sliderRNGStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        
        txfWürfel.setText("W"+String.valueOf(sliderRNG.getValue()));
        
    }                                      

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {                                        

        if (lblPortrait.getIcon() == b1){
        lblPortrait.setIcon(b2);
        }else
        if (lblPortrait.getIcon() == b2){
        lblPortrait.setIcon(b3);
        }else
        if (lblPortrait.getIcon() == b3){
        lblPortrait.setIcon(b4);
        }else
        if (lblPortrait.getIcon() == b4){
        lblPortrait.setIcon(b5);
        }else
        if (lblPortrait.getIcon() == b5){
        lblPortrait.setIcon(b6);
        }else
        if (lblPortrait.getIcon() == b6){
        lblPortrait.setIcon(b7);
        }else
        if (lblPortrait.getIcon() == b7){
        lblPortrait.setIcon(b8);
        }else
        if (lblPortrait.getIcon() == b8){
        lblPortrait.setIcon(b9);
        }else
        if (lblPortrait.getIcon() == b9){
        lblPortrait.setIcon(b10);
        }else
        if (lblPortrait.getIcon() == b10){
        lblPortrait.setIcon(b11);
        }else
        if (lblPortrait.getIcon() == b11){
        lblPortrait.setIcon(b12);
        }else
        if (lblPortrait.getIcon() == b12){
        lblPortrait.setIcon(b13);
        }else
        if (lblPortrait.getIcon() == b13){
        lblPortrait.setIcon(b14);
        }else
        if (lblPortrait.getIcon() == b14){
        lblPortrait.setIcon(b15);
        }else
        if (lblPortrait.getIcon() == b15){
        lblPortrait.setIcon(b16);
        }else
        if (lblPortrait.getIcon() == b16){
        lblPortrait.setIcon(b17);
        }else
        if (lblPortrait.getIcon() == b17){
        lblPortrait.setIcon(b18);
        }else
        if (lblPortrait.getIcon() == b18){
        lblPortrait.setIcon(b19);
        }else
        if (lblPortrait.getIcon() == b19){
        lblPortrait.setIcon(b20);
        }else
        if (lblPortrait.getIcon() == b20){
        lblPortrait.setIcon(b1);
        }
    }                                       

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (lblPortrait1.getIcon() == b1){
        lblPortrait1.setIcon(b2);
        }else
        if (lblPortrait1.getIcon() == b2){
        lblPortrait1.setIcon(b3);
        }else
        if (lblPortrait1.getIcon() == b3){
        lblPortrait1.setIcon(b4);
        }else
        if (lblPortrait1.getIcon() == b4){
        lblPortrait1.setIcon(b5);
        }else
        if (lblPortrait1.getIcon() == b5){
        lblPortrait1.setIcon(b6);
        }else
        if (lblPortrait1.getIcon() == b6){
        lblPortrait1.setIcon(b7);
        }else
        if (lblPortrait1.getIcon() == b7){
        lblPortrait1.setIcon(b8);
        }else
        if (lblPortrait1.getIcon() == b8){
        lblPortrait1.setIcon(b9);
        }else
        if (lblPortrait1.getIcon() == b9){
        lblPortrait1.setIcon(b10);
        }else
        if (lblPortrait1.getIcon() == b10){
        lblPortrait1.setIcon(b11);
        }else
        if (lblPortrait1.getIcon() == b11){
        lblPortrait1.setIcon(b12);
        }else
        if (lblPortrait1.getIcon() == b12){
        lblPortrait1.setIcon(b13);
        }else
        if (lblPortrait1.getIcon() == b13){
        lblPortrait1.setIcon(b14);
        }else
        if (lblPortrait1.getIcon() == b14){
        lblPortrait1.setIcon(b15);
        }else
        if (lblPortrait1.getIcon() == b15){
        lblPortrait1.setIcon(b16);
        }else
        if (lblPortrait1.getIcon() == b16){
        lblPortrait1.setIcon(b17);
        }else
        if (lblPortrait1.getIcon() == b17){
        lblPortrait1.setIcon(b18);
        }else
        if (lblPortrait1.getIcon() == b18){
        lblPortrait1.setIcon(b19);
        }else
        if (lblPortrait1.getIcon() == b19){
        lblPortrait1.setIcon(b20);
        }else
        if (lblPortrait1.getIcon() == b20){
        lblPortrait1.setIcon(b1);
        }
    }                                        

    private void btnNext4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (lblPortrait4.getIcon() == b1){
        lblPortrait4.setIcon(b2);
        }else
        if (lblPortrait4.getIcon() == b2){
        lblPortrait4.setIcon(b3);
        }else
        if (lblPortrait4.getIcon() == b3){
        lblPortrait4.setIcon(b4);
        }else
        if (lblPortrait4.getIcon() == b4){
        lblPortrait4.setIcon(b5);
        }else
        if (lblPortrait4.getIcon() == b5){
        lblPortrait4.setIcon(b6);
        }else
        if (lblPortrait4.getIcon() == b6){
        lblPortrait4.setIcon(b7);
        }else
        if (lblPortrait4.getIcon() == b7){
        lblPortrait4.setIcon(b8);
        }else
        if (lblPortrait4.getIcon() == b8){
        lblPortrait4.setIcon(b9);
        }else
        if (lblPortrait4.getIcon() == b9){
        lblPortrait4.setIcon(b10);
        }else
        if (lblPortrait4.getIcon() == b10){
        lblPortrait4.setIcon(b11);
        }else
        if (lblPortrait4.getIcon() == b11){
        lblPortrait4.setIcon(b12);
        }else
        if (lblPortrait4.getIcon() == b12){
        lblPortrait4.setIcon(b13);
        }else
        if (lblPortrait4.getIcon() == b13){
        lblPortrait4.setIcon(b14);
        }else
        if (lblPortrait4.getIcon() == b14){
        lblPortrait4.setIcon(b15);
        }else
        if (lblPortrait4.getIcon() == b15){
        lblPortrait4.setIcon(b16);
        }else
        if (lblPortrait4.getIcon() == b16){
        lblPortrait4.setIcon(b17);
        }else
        if (lblPortrait4.getIcon() == b17){
        lblPortrait4.setIcon(b18);
        }else
        if (lblPortrait4.getIcon() == b18){
        lblPortrait4.setIcon(b19);
        }else
        if (lblPortrait4.getIcon() == b19){
        lblPortrait4.setIcon(b20);
        }else
        if (lblPortrait4.getIcon() == b20){
        lblPortrait4.setIcon(b1);
        }
    }                                        

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
try {

        File pdfFile = new File("src/CDTOOL/DATA/regelwerk.pdf");
        if (pdfFile.exists()) {

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                System.out.println("Awt Desktop is not supported!");
            }

        } else {
            System.out.println("File is not exists!");
        }

        System.out.println("Done");

      } catch (IOException ex) {
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
                if ("CDE/Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new GUI().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnNext4;
    private javax.swing.JButton btnRNG;
    private javax.swing.JButton btnRules;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JPanel jPanelStats1;
    private javax.swing.JPanel jPanelStats4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JLabel lblAlter;
    private javax.swing.JLabel lblAlter1;
    private javax.swing.JLabel lblAlter4;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBeruf;
    private javax.swing.JLabel lblBeruf1;
    private javax.swing.JLabel lblBeruf4;
    private javax.swing.JLabel lblFront;
    private javax.swing.JLabel lblFrontL;
    private javax.swing.JLabel lblFrontR;
    private javax.swing.JLabel lblGBH;
    private javax.swing.JLabel lblGBS;
    private javax.swing.JLabel lblGBW;
    private javax.swing.JLabel lblGeschlecht;
    private javax.swing.JLabel lblGeschlecht1;
    private javax.swing.JLabel lblGeschlecht4;
    private javax.swing.JLabel lblHandelX;
    private javax.swing.JLabel lblHeimat;
    private javax.swing.JLabel lblHeimat1;
    private javax.swing.JLabel lblHeimat4;
    private javax.swing.JLabel lblLback;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblNotizen;
    private javax.swing.JLabel lblNotizen1;
    private javax.swing.JLabel lblNotizen2;
    private javax.swing.JLabel lblPortrait;
    private javax.swing.JLabel lblPortrait1;
    private javax.swing.JLabel lblPortrait4;
    private javax.swing.JLabel lblRasse;
    private javax.swing.JLabel lblRasse1;
    private javax.swing.JLabel lblRasse4;
    private javax.swing.JLabel lblRback;
    private javax.swing.JLabel lblRucksack;
    private javax.swing.JLabel lblRucksack1;
    private javax.swing.JLabel lblRucksack2;
    private javax.swing.JLabel lblRucksackb;
    private javax.swing.JLabel lblRucksackb1;
    private javax.swing.JLabel lblRucksackb2;
    private javax.swing.JLabel lblSozialesX;
    private javax.swing.JLabel lblStatur;
    private javax.swing.JLabel lblStatur1;
    private javax.swing.JLabel lblStatur4;
    private javax.swing.JLabel lblWaffen;
    private javax.swing.JLabel lblWaffen1;
    private javax.swing.JLabel lblWaffen2;
    private javax.swing.JLabel lblWissenX;
    private javax.swing.JLabel lblZauber;
    private javax.swing.JLabel lblZauber1;
    private javax.swing.JLabel lblZauber2;
    private javax.swing.JLabel lblmain;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMain1;
    private javax.swing.JPanel panelMain4;
    private javax.swing.JPanel pnlL;
    private javax.swing.JPanel pnlLmain;
    private javax.swing.JPanel pnlLmain1;
    private javax.swing.JPanel pnlLmain2;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlR;
    private javax.swing.JPanel pnlRmain;
    private javax.swing.JPanel pnlRmain1;
    private javax.swing.JPanel pnlRmain2;
    private javax.swing.JScrollPane scrpNotizen;
    private javax.swing.JScrollPane scrpNotizen1;
    private javax.swing.JScrollPane scrpNotizen2;
    private javax.swing.JScrollPane scrpRucksack;
    private javax.swing.JScrollPane scrpRucksack1;
    private javax.swing.JScrollPane scrpRucksack2;
    private javax.swing.JScrollPane scrpWaffen;
    private javax.swing.JScrollPane scrpWaffen1;
    private javax.swing.JScrollPane scrpWaffen2;
    private javax.swing.JScrollPane scrpZauber;
    private javax.swing.JScrollPane scrpZauber1;
    private javax.swing.JScrollPane scrpZauber2;
    private javax.swing.JSlider sliderRNG;
    private javax.swing.JPanel tabb1;
    private javax.swing.JPanel tabb2;
    private javax.swing.JPanel tabb3;
    private javax.swing.JTabbedPane tabbMain;
    private javax.swing.JTextField tfxRNG;
    private javax.swing.JToggleButton tglbtnL;
    private javax.swing.JToggleButton tglbtnR;
    private javax.swing.JTextArea txaNotizen;
    private javax.swing.JTextArea txaNotizen1;
    private javax.swing.JTextArea txaNotizen2;
    private javax.swing.JTextArea txaRucksack;
    private javax.swing.JTextArea txaRucksack1;
    private javax.swing.JTextArea txaRucksack2;
    private javax.swing.JTextArea txaWaffen;
    private javax.swing.JTextArea txaWaffen1;
    private javax.swing.JTextArea txaWaffen2;
    private javax.swing.JTextArea txaZauber;
    private javax.swing.JTextArea txaZauber1;
    private javax.swing.JTextArea txaZauber2;
    private javax.swing.JTextField txfAlter;
    private javax.swing.JTextField txfAlter1;
    private javax.swing.JTextField txfAlter4;
    private javax.swing.JTextField txfBeruf;
    private javax.swing.JTextField txfBeruf1;
    private javax.swing.JTextField txfBeruf4;
    private javax.swing.JTextField txfGBH;
    private javax.swing.JTextField txfGBH1;
    private javax.swing.JTextField txfGBH4;
    private javax.swing.JTextField txfGBS;
    private javax.swing.JTextField txfGBS1;
    private javax.swing.JTextField txfGBS4;
    private javax.swing.JTextField txfGBW;
    private javax.swing.JTextField txfGBW1;
    private javax.swing.JTextField txfGBW4;
    private javax.swing.JTextField txfGeschlecht;
    private javax.swing.JTextField txfGeschlecht1;
    private javax.swing.JTextField txfGeschlecht4;
    private javax.swing.JTextField txfH1;
    private javax.swing.JTextField txfH10;
    private javax.swing.JTextField txfH11;
    private javax.swing.JTextField txfH12;
    private javax.swing.JTextField txfH13;
    private javax.swing.JTextField txfH14;
    private javax.swing.JTextField txfH15;
    private javax.swing.JTextField txfH16;
    private javax.swing.JTextField txfH17;
    private javax.swing.JTextField txfH18;
    private javax.swing.JTextField txfH19;
    private javax.swing.JTextField txfH2;
    private javax.swing.JTextField txfH20;
    private javax.swing.JTextField txfH3;
    private javax.swing.JTextField txfH4;
    private javax.swing.JTextField txfH41;
    private javax.swing.JTextField txfH42;
    private javax.swing.JTextField txfH43;
    private javax.swing.JTextField txfH44;
    private javax.swing.JTextField txfH45;
    private javax.swing.JTextField txfH46;
    private javax.swing.JTextField txfH47;
    private javax.swing.JTextField txfH48;
    private javax.swing.JTextField txfH49;
    private javax.swing.JTextField txfH5;
    private javax.swing.JTextField txfH50;
    private javax.swing.JTextField txfH6;
    private javax.swing.JTextField txfH7;
    private javax.swing.JTextField txfH8;
    private javax.swing.JTextField txfH9;
    private javax.swing.JTextField txfHP1;
    private javax.swing.JTextField txfHP10;
    private javax.swing.JTextField txfHP11;
    private javax.swing.JTextField txfHP12;
    private javax.swing.JTextField txfHP13;
    private javax.swing.JTextField txfHP14;
    private javax.swing.JTextField txfHP15;
    private javax.swing.JTextField txfHP16;
    private javax.swing.JTextField txfHP17;
    private javax.swing.JTextField txfHP18;
    private javax.swing.JTextField txfHP19;
    private javax.swing.JTextField txfHP2;
    private javax.swing.JTextField txfHP20;
    private javax.swing.JTextField txfHP3;
    private javax.swing.JTextField txfHP4;
    private javax.swing.JTextField txfHP41;
    private javax.swing.JTextField txfHP42;
    private javax.swing.JTextField txfHP43;
    private javax.swing.JTextField txfHP44;
    private javax.swing.JTextField txfHP45;
    private javax.swing.JTextField txfHP46;
    private javax.swing.JTextField txfHP47;
    private javax.swing.JTextField txfHP48;
    private javax.swing.JTextField txfHP49;
    private javax.swing.JTextField txfHP5;
    private javax.swing.JTextField txfHP50;
    private javax.swing.JTextField txfHP6;
    private javax.swing.JTextField txfHP7;
    private javax.swing.JTextField txfHP8;
    private javax.swing.JTextField txfHP9;
    private javax.swing.JTextField txfHandel;
    private javax.swing.JTextField txfHandel1;
    private javax.swing.JTextField txfHandel4;
    private javax.swing.JTextField txfHeimat;
    private javax.swing.JTextField txfHeimat1;
    private javax.swing.JTextField txfHeimat4;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfName1;
    private javax.swing.JTextField txfName4;
    private javax.swing.JTextField txfRasse;
    private javax.swing.JTextField txfRasse1;
    private javax.swing.JTextField txfRasse4;
    private javax.swing.JTextField txfS1;
    private javax.swing.JTextField txfS10;
    private javax.swing.JTextField txfS11;
    private javax.swing.JTextField txfS12;
    private javax.swing.JTextField txfS13;
    private javax.swing.JTextField txfS14;
    private javax.swing.JTextField txfS15;
    private javax.swing.JTextField txfS16;
    private javax.swing.JTextField txfS17;
    private javax.swing.JTextField txfS18;
    private javax.swing.JTextField txfS19;
    private javax.swing.JTextField txfS2;
    private javax.swing.JTextField txfS20;
    private javax.swing.JTextField txfS3;
    private javax.swing.JTextField txfS4;
    private javax.swing.JTextField txfS41;
    private javax.swing.JTextField txfS42;
    private javax.swing.JTextField txfS43;
    private javax.swing.JTextField txfS44;
    private javax.swing.JTextField txfS45;
    private javax.swing.JTextField txfS46;
    private javax.swing.JTextField txfS47;
    private javax.swing.JTextField txfS48;
    private javax.swing.JTextField txfS49;
    private javax.swing.JTextField txfS5;
    private javax.swing.JTextField txfS50;
    private javax.swing.JTextField txfS6;
    private javax.swing.JTextField txfS7;
    private javax.swing.JTextField txfS8;
    private javax.swing.JTextField txfS9;
    private javax.swing.JTextField txfSP1;
    private javax.swing.JTextField txfSP10;
    private javax.swing.JTextField txfSP11;
    private javax.swing.JTextField txfSP12;
    private javax.swing.JTextField txfSP13;
    private javax.swing.JTextField txfSP14;
    private javax.swing.JTextField txfSP15;
    private javax.swing.JTextField txfSP16;
    private javax.swing.JTextField txfSP17;
    private javax.swing.JTextField txfSP18;
    private javax.swing.JTextField txfSP19;
    private javax.swing.JTextField txfSP2;
    private javax.swing.JTextField txfSP20;
    private javax.swing.JTextField txfSP3;
    private javax.swing.JTextField txfSP4;
    private javax.swing.JTextField txfSP41;
    private javax.swing.JTextField txfSP42;
    private javax.swing.JTextField txfSP43;
    private javax.swing.JTextField txfSP44;
    private javax.swing.JTextField txfSP45;
    private javax.swing.JTextField txfSP46;
    private javax.swing.JTextField txfSP47;
    private javax.swing.JTextField txfSP48;
    private javax.swing.JTextField txfSP49;
    private javax.swing.JTextField txfSP5;
    private javax.swing.JTextField txfSP50;
    private javax.swing.JTextField txfSP6;
    private javax.swing.JTextField txfSP7;
    private javax.swing.JTextField txfSP8;
    private javax.swing.JTextField txfSP9;
    private javax.swing.JTextField txfSlider;
    private javax.swing.JTextField txfSlider2;
    private javax.swing.JTextField txfSlider4;
    private javax.swing.JTextField txfSoziales;
    private javax.swing.JTextField txfSoziales1;
    private javax.swing.JTextField txfSoziales4;
    private javax.swing.JTextField txfStatur;
    private javax.swing.JTextField txfStatur1;
    private javax.swing.JTextField txfStatur4;
    private javax.swing.JTextField txfW1;
    private javax.swing.JTextField txfW10;
    private javax.swing.JTextField txfW11;
    private javax.swing.JTextField txfW12;
    private javax.swing.JTextField txfW13;
    private javax.swing.JTextField txfW14;
    private javax.swing.JTextField txfW15;
    private javax.swing.JTextField txfW16;
    private javax.swing.JTextField txfW17;
    private javax.swing.JTextField txfW18;
    private javax.swing.JTextField txfW19;
    private javax.swing.JTextField txfW2;
    private javax.swing.JTextField txfW20;
    private javax.swing.JTextField txfW3;
    private javax.swing.JTextField txfW4;
    private javax.swing.JTextField txfW41;
    private javax.swing.JTextField txfW42;
    private javax.swing.JTextField txfW43;
    private javax.swing.JTextField txfW44;
    private javax.swing.JTextField txfW45;
    private javax.swing.JTextField txfW46;
    private javax.swing.JTextField txfW47;
    private javax.swing.JTextField txfW48;
    private javax.swing.JTextField txfW49;
    private javax.swing.JTextField txfW5;
    private javax.swing.JTextField txfW50;
    private javax.swing.JTextField txfW6;
    private javax.swing.JTextField txfW7;
    private javax.swing.JTextField txfW8;
    private javax.swing.JTextField txfW9;
    private javax.swing.JTextField txfWP1;
    private javax.swing.JTextField txfWP10;
    private javax.swing.JTextField txfWP11;
    private javax.swing.JTextField txfWP12;
    private javax.swing.JTextField txfWP13;
    private javax.swing.JTextField txfWP14;
    private javax.swing.JTextField txfWP15;
    private javax.swing.JTextField txfWP16;
    private javax.swing.JTextField txfWP17;
    private javax.swing.JTextField txfWP18;
    private javax.swing.JTextField txfWP19;
    private javax.swing.JTextField txfWP2;
    private javax.swing.JTextField txfWP20;
    private javax.swing.JTextField txfWP3;
    private javax.swing.JTextField txfWP4;
    private javax.swing.JTextField txfWP41;
    private javax.swing.JTextField txfWP42;
    private javax.swing.JTextField txfWP43;
    private javax.swing.JTextField txfWP44;
    private javax.swing.JTextField txfWP45;
    private javax.swing.JTextField txfWP46;
    private javax.swing.JTextField txfWP47;
    private javax.swing.JTextField txfWP48;
    private javax.swing.JTextField txfWP49;
    private javax.swing.JTextField txfWP5;
    private javax.swing.JTextField txfWP50;
    private javax.swing.JTextField txfWP6;
    private javax.swing.JTextField txfWP7;
    private javax.swing.JTextField txfWP8;
    private javax.swing.JTextField txfWP9;
    private javax.swing.JTextField txfWissen;
    private javax.swing.JTextField txfWissen1;
    private javax.swing.JTextField txfWissen4;
    private javax.swing.JTextField txfWürfel;
    // End of variables declaration                   

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
