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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Verwaltung {
    
    public static String name1;
    public static String geschlecht1;
    public static String alter1;
    public static String rasse1;
    public static String heimat1;
    public static String beruf1;
    public static String statur1;
    public static int life1;
    public static String h1;
    public static String h2;
    public static String h3;
    public static String h4;
    public static String h5;
    public static String h6;
    public static String h7;
    public static String h8;
    public static String h9;
    public static String h10;
    public static String hp1;
    public static String hp2;
    public static String hp3;
    public static String hp4;
    public static String hp5;
    public static String hp6;
    public static String hp7;
    public static String hp8;
    public static String hp9;
    public static String hp10;
    public static String w1;
    public static String w2;
    public static String w3;
    public static String w4;
    public static String w5;
    public static String w6;
    public static String w7;
    public static String w8;
    public static String w9;
    public static String w10;
    public static String wp1;
    public static String wp2;
    public static String wp3;
    public static String wp4;
    public static String wp5;
    public static String wp6;
    public static String wp7;
    public static String wp8;
    public static String wp9;
    public static String wp10;
    public static String s1;
    public static String s2;
    public static String s3;
    public static String s4;
    public static String s5;
    public static String s6;
    public static String s7;
    public static String s8;
    public static String s9;
    public static String s10;
    public static String sp1;
    public static String sp2;
    public static String sp3;
    public static String sp4;
    public static String sp5;
    public static String sp6;
    public static String sp7;
    public static String sp8;
    public static String sp9;
    public static String sp10;
    public static String name2;
    public static String geschlecht2;
    public static String alter2;
    public static String rasse2;
    public static String heimat2;
    public static String beruf2;
    public static String statur2;
    public static int life2;
    public static String h11;
    public static String h12;
    public static String h13;
    public static String h14;
    public static String h15;
    public static String h16;
    public static String h17;
    public static String h18;
    public static String h19;
    public static String h20;
    public static String hp11;
    public static String hp12;
    public static String hp13;
    public static String hp14;
    public static String hp15;
    public static String hp16;
    public static String hp17;
    public static String hp18;
    public static String hp19;
    public static String hp20;
    public static String w11;
    public static String w12;
    public static String w13;
    public static String w14;
    public static String w15;
    public static String w16;
    public static String w17;
    public static String w18;
    public static String w19;
    public static String w20;
    public static String wp11;
    public static String wp12;
    public static String wp13;
    public static String wp14;
    public static String wp15;
    public static String wp16;
    public static String wp17;
    public static String wp18;
    public static String wp19;
    public static String wp20;
    public static String s11;
    public static String s12;
    public static String s13;
    public static String s14;
    public static String s15;
    public static String s16;
    public static String s17;
    public static String s18;
    public static String s19;
    public static String s20;
    public static String sp11;
    public static String sp12;
    public static String sp13;
    public static String sp14;
    public static String sp15;
    public static String sp16;
    public static String sp17;
    public static String sp18;
    public static String sp19;
    public static String sp20;
    public static String name3;
    public static String geschlecht3;
    public static String alter3;
    public static String rasse3;
    public static String heimat3;
    public static String beruf3;
    public static String statur3;
    public static int life3;
    public static String h41;
    public static String h42;
    public static String h43;
    public static String h44;
    public static String h45;
    public static String h46;
    public static String h47;
    public static String h48;
    public static String h49;
    public static String h50;
    public static String hp41;
    public static String hp42;
    public static String hp43;
    public static String hp44;
    public static String hp45;
    public static String hp46;
    public static String hp47;
    public static String hp48;
    public static String hp49;
    public static String hp50;
    public static String w41;
    public static String w42;
    public static String w43;
    public static String w44;
    public static String w45;
    public static String w46;
    public static String w47;
    public static String w48;
    public static String w49;
    public static String w50;
    public static String wp41;
    public static String wp42;
    public static String wp43;
    public static String wp44;
    public static String wp45;
    public static String wp46;
    public static String wp47;
    public static String wp48;
    public static String wp49;
    public static String wp50;
    public static String s41;
    public static String s42;
    public static String s43;
    public static String s44;
    public static String s45;
    public static String s46;
    public static String s47;
    public static String s48;
    public static String s49;
    public static String s50;
    public static String sp41;
    public static String sp42;
    public static String sp43;
    public static String sp44;
    public static String sp45;
    public static String sp46;
    public static String sp47;
    public static String sp48;
    public static String sp49;
    public static String sp50;
    
    public static String waffen1;
    public static String zauber1;
    public static String rucksack1;
    public static String notizen1;
    
    public static String waffen2;
    public static String zauber2;
    public static String rucksack2;
    public static String notizen2;
    
    public static String waffen3;
    public static String zauber3;
    public static String rucksack3;
    public static String notizen3;
    
    public static ImageIcon image1;
    public static ImageIcon image2;
    public static ImageIcon image3;
    
    
    public static void boot() {
        try {
            startup1();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Verwaltung.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no c1");
        }
        try {
            startup2();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Verwaltung.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no c2");
        }
        try {
            startup3();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Verwaltung.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no c3");
        }
    }
    
    public static String writename1() {
        return name1;
    }
    
    public static String writegeschlecht1() {
        return geschlecht1;
    }
    
    public static String writealter1() {
        return alter1;
    }
    
    public static String writerasse1() {
        return rasse1;
    }
    
    public static String writeheimat1() {
        return heimat1;
    }
    
    public static String writeberuf1() {
        return beruf1;
    }
    
    public static String writestatur1() {
        return statur1;
    }
    
    public static int writelife1() {
        return life1;
    }
    
    public static String writeh1() {
        return h1;
    }
    
    public static String writeh2() {
        return h2;
    }
    
    public static String writeh3() {
        return h3;
    }
    
    public static String writeh4() {
        return h4;
    }
    
    public static String writeh5() {
        return h5;
    }
    
    public static String writeh6() {
        return h6;
    }
    
    public static String writeh7() {
        return h7;
    }
    
    public static String writeh8() {
        return h8;
    }
    
    public static String writeh9() {
        return h9;
    }
    
    public static String writeh10() {
        return h10;
    }
    
    public static String writehp1() {
        return hp1;
    }
    
    public static String writehp2() {
        return hp2;
    }
    
    public static String writehp3() {
        return hp3;
    }
    
    public static String writehp4() {
        return hp4;
    }
    
    public static String writehp5() {
        return hp5;
    }
    
    public static String writehp6() {
        return hp6;
    }
    
    public static String writehp7() {
        return hp7;
    }
    
    public static String writehp8() {
        return hp8;
    }
    
    public static String writehp9() {
        return hp9;
    }
    
    public static String writehp10() {
        return hp10;
    }
    
    public static String writew1() {
        return w1;
    }
    
    public static String writew2() {
        return w2;
    }
    
    public static String writew3() {
        return w3;
    }
    
    public static String writew4() {
        return w4;
    }
    
    public static String writew5() {
        return w5;
    }
    
    public static String writew6() {
        return w6;
    }
    
    public static String writew7() {
        return w7;
    }
    
    public static String writew8() {
        return w8;
    }
    
    public static String writew9() {
        return w9;
    }
    
    public static String writew10() {
        return w10;
    }
    
    public static String writewp1() {
        return wp1;
    }
    
    public static String writewp2() {
        return wp2;
    }
    
    public static String writewp3() {
        return wp3;
    }
    
    public static String writewp4() {
        return wp4;
    }
    
    public static String writewp5() {
        return wp5;
    }
    
    public static String writewp6() {
        return wp6;
    }
    
    public static String writewp7() {
        return wp7;
    }
    
    public static String writewp8() {
        return wp8;
    }
    
    public static String writewp9() {
        return wp9;
    }
    
    public static String writewp10() {
        return wp10;
    }
    
    public static String writes1() {
        return s1;
    }
    
    public static String writes2() {
        return s2;
    }
    
    public static String writes3() {
        return s3;
    }
    
    public static String writes4() {
        return s4;
    }
    
    public static String writes5() {
        return s5;
    }
    
    public static String writes6() {
        return s6;
    }
    
    public static String writes7() {
        return s7;
    }
    
    public static String writes8() {
        return s8;
    }
    
    public static String writes9() {
        return s9;
    }
    
    public static String writes10() {
        return s10;
    }
    
    public static String writesp1() {
        return sp1;
    }
    
    public static String writesp2() {
        return sp2;
    }
    
    public static String writesp3() {
        return sp3;
    }
    
    public static String writesp4() {
        return sp4;
    }
    
    public static String writesp5() {
        return sp5;
    }
    
    public static String writesp6() {
        return sp6;
    }
    
    public static String writesp7() {
        return sp7;
    }
    
    public static String writesp8() {
        return sp8;
    }
    
    public static String writesp9() {
        return sp9;
    }
    
    public static String writesp10() {
        return sp10;
    }
    
    public static String writename2() {
        return name2;
    }
    
    public static String writegeschlecht2() {
        return geschlecht2;
    }
    
    public static String writealter2() {
        return alter2;
    }
    
    public static String writerasse2() {
        return rasse2;
    }
    
    public static String writeheimat2() {
        return heimat2;
    }
    
    public static String writeberuf2() {
        return beruf2;
    }
    
    public static String writestatur2() {
        return statur2;
    }
    
    public static int writelife2() {
        return life2;
    }
    
    public static String writeh11() {
        return h11;
    }
    
    public static String writeh12() {
        return h12;
    }
    
    public static String writeh13() {
        return h13;
    }
    
    public static String writeh14() {
        return h14;
    }
    
    public static String writeh15() {
        return h15;
    }
    
    public static String writeh16() {
        return h16;
    }
    
    public static String writeh17() {
        return h17;
    }
    
    public static String writeh18() {
        return h18;
    }
    
    public static String writeh19() {
        return h19;
    }
    
    public static String writeh20() {
        return h20;
    }
    
    public static String writehp11() {
        return hp11;
    }
    
    public static String writehp12() {
        return hp12;
    }
    
    public static String writehp13() {
        return hp13;
    }
    
    public static String writehp14() {
        return hp14;
    }
    
    public static String writehp15() {
        return hp15;
    }
    
    public static String writehp16() {
        return hp16;
    }
    
    public static String writehp17() {
        return hp17;
    }
    
    public static String writehp18() {
        return hp18;
    }
    
    public static String writehp19() {
        return hp19;
    }
    
    public static String writehp20() {
        return hp20;
    }
    
    public static String writew11() {
        return w11;
    }
    
    public static String writew12() {
        return w12;
    }
    
    public static String writew13() {
        return w13;
    }
    
    public static String writew14() {
        return w14;
    }
    
    public static String writew15() {
        return w15;
    }
    
    public static String writew16() {
        return w16;
    }
    
    public static String writew17() {
        return w17;
    }
    
    public static String writew18() {
        return w18;
    }
    
    public static String writew19() {
        return w19;
    }
    
    public static String writew20() {
        return w20;
    }
    
    public static String writewp11() {
        return wp11;
    }
    
    public static String writewp12() {
        return wp12;
    }
    
    public static String writewp13() {
        return wp13;
    }
    
    public static String writewp14() {
        return wp14;
    }
    
    public static String writewp15() {
        return wp15;
    }
    
    public static String writewp16() {
        return wp16;
    }
    
    public static String writewp17() {
        return wp17;
    }
    
    public static String writewp18() {
        return wp18;
    }
    
    public static String writewp19() {
        return wp19;
    }
    
    public static String writewp20() {
        return wp20;
    }
    
    public static String writes11() {
        return s11;
    }
    
    public static String writes12() {
        return s12;
    }
    
    public static String writes13() {
        return s13;
    }
    
    public static String writes14() {
        return s14;
    }
    
    public static String writes15() {
        return s15;
    }
    
    public static String writes16() {
        return s16;
    }
    
    public static String writes17() {
        return s17;
    }
    
    public static String writes18() {
        return s18;
    }
    
    public static String writes19() {
        return s19;
    }
    
    public static String writes20() {
        return s20;
    }
    
    public static String writesp11() {
        return sp11;
    }
    
    public static String writesp12() {
        return sp12;
    }
    
    public static String writesp13() {
        return sp13;
    }
    
    public static String writesp14() {
        return sp14;
    }
    
    public static String writesp15() {
        return sp15;
    }
    
    public static String writesp16() {
        return sp16;
    }
    
    public static String writesp17() {
        return sp17;
    }
    
    public static String writesp18() {
        return sp18;
    }
    
    public static String writesp19() {
        return sp19;
    }
    
    public static String writesp20() {
        return sp20;
    }
    
    public static String writename3() {
        return name3;
    }
    
    public static String writegeschlecht3() {
        return geschlecht3;
    }
    
    public static String writealter3() {
        return alter3;
    }
    
    public static String writerasse3() {
        return rasse3;
    }
    
    public static String writeheimat3() {
        return heimat3;
    }
    
    public static String writeberuf3() {
        return beruf3;
    }
    
    public static String writestatur3() {
        return statur3;
    }
    
    public static int writelife3() {
        return life3;
    }
    
    public static String writeh41() {
        return h41;
    }
    
    public static String writeh42() {
        return h42;
    }
    
    public static String writeh43() {
        return h43;
    }
    
    public static String writeh44() {
        return h44;
    }
    
    public static String writeh45() {
        return h5;
    }
    
    public static String writeh46() {
        return h46;
    }
    
    public static String writeh47() {
        return h47;
    }
    
    public static String writeh48() {
        return h48;
    }
    
    public static String writeh49() {
        return h49;
    }
    
    public static String writeh50() {
        return h50;
    }
    
    public static String writehp41() {
        return hp41;
    }
    
    public static String writehp42() {
        return hp42;
    }
    
    public static String writehp43() {
        return hp43;
    }
    
    public static String writehp44() {
        return hp44;
    }
    
    public static String writehp45() {
        return hp45;
    }
    
    public static String writehp46() {
        return hp46;
    }
    
    public static String writehp47() {
        return hp47;
    }
    
    public static String writehp48() {
        return hp48;
    }
    
    public static String writehp49() {
        return hp49;
    }
    
    public static String writehp50() {
        return hp50;
    }
    
    public static String writew41() {
        return w41;
    }
    
    public static String writew42() {
        return w42;
    }
    
    public static String writew43() {
        return w43;
    }
    
    public static String writew44() {
        return w44;
    }
    
    public static String writew45() {
        return w45;
    }
    
    public static String writew46() {
        return w46;
    }
    
    public static String writew47() {
        return w47;
    }
    
    public static String writew48() {
        return w48;
    }
    
    public static String writew49() {
        return w49;
    }
    
    public static String writew50() {
        return w50;
    }
    
    public static String writewp41() {
        return wp41;
    }
    
    public static String writewp42() {
        return wp42;
    }
    
    public static String writewp43() {
        return wp43;
    }
    
    public static String writewp44() {
        return wp44;
    }
    
    public static String writewp45() {
        return wp45;
    }
    
    public static String writewp46() {
        return wp46;
    }
    
    public static String writewp47() {
        return wp47;
    }
    
    public static String writewp48() {
        return wp48;
    }
    
    public static String writewp49() {
        return wp49;
    }
    
    public static String writewp50() {
        return wp50;
    }
    
    public static String writes41() {
        return s41;
    }
    
    public static String writes42() {
        return s42;
    }
    
    public static String writes43() {
        return s43;
    }
    
    public static String writes44() {
        return s44;
    }
    
    public static String writes45() {
        return s45;
    }
    
    public static String writes46() {
        return s46;
    }
    
    public static String writes47() {
        return s47;
    }
    
    public static String writes48() {
        return s48;
    }
    
    public static String writes49() {
        return s49;
    }
    
    public static String writes50() {
        return s50;
    }
    
    public static String writesp41() {
        return sp41;
    }
    
    public static String writesp42() {
        return sp42;
    }
    
    public static String writesp43() {
        return sp43;
    }
    
    public static String writesp44() {
        return sp44;
    }
    
    public static String writesp45() {
        return sp45;
    }
    
    public static String writesp46() {
        return sp46;
    }
    
    public static String writesp47() {
        return sp47;
    }
    
    public static String writesp48() {
        return sp48;
    }
    
    public static String writesp49() {
        return sp49;
    }
    
    public static String writesp50() {
        return sp50;
    }
    
    public static String waffen1() {
        return waffen1;
    }
    
    public static String zauber1() {
        return zauber1;
    }
    
    public static String rucksack1() {
        return rucksack1;
    }
    
    public static String notizen1() {
        return notizen1;
    }
    
    public static String waffen2() {
        return waffen2;
    }
    
    public static String zauber2() {
        return zauber2;
    }
    
    public static String rucksack2() {
        return rucksack2;
    }
    
    public static String notizen2() {
        return notizen2;
    }
    
    public static String waffen3() {
        return waffen3;
    }
    
    public static String zauber3() {
        return zauber3;
    }
    
    public static String rucksack3() {
        return rucksack3;
    }
    
    public static String notizen3() {
        return notizen3;
    }
    
    public static ImageIcon image1() {
        return image1;
    }
    
    public static ImageIcon image2() {
        return image2;
    }
    
    public static ImageIcon image3() {
        return image3;
    }
    
    public static void startup1() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("Char1.txt"));
        Character char1 = (Character) in1.readObject();
        name1 = char1.getName();
        geschlecht1 = char1.getGeschlecht();
        alter1 = char1.getAlter();
        rasse1 = char1.getRasse();
        heimat1 = char1.getHeimat();
        beruf1 = char1.getBeruf();
        statur1 = char1.getStatur();
        life1 = char1.getLife();
        h1 = char1.getH1();
        h2 = char1.getH2();
        h3 = char1.getH3();
        h4 = char1.getH4();
        h5 = char1.getH5();
        h6 = char1.getH6();
        h7 = char1.getH7();
        h8 = char1.getH8();
        h9 = char1.getH9();
        h10 = char1.getH0();  
        hp1 = char1.getHp1();
        hp2 = char1.getHp2();
        hp3 = char1.getHp3();
        hp4 = char1.getHp4();
        hp5 = char1.getHp5();
        hp6 = char1.getHp6();
        hp7 = char1.getHp7();
        hp8 = char1.getHp8();
        hp9 = char1.getHp9();
        hp10 = char1.getHp0(); 
        w1 = char1.getW1();
        w2 = char1.getW2();
        w3 = char1.getW3();
        w4 = char1.getW4();
        w5 = char1.getW5();
        w6 = char1.getW6();
        w7 = char1.getW7();
        w8 = char1.getW8();
        w9 = char1.getW9();
        w10 = char1.getW0();  
        wp1 = char1.getWp1();
        wp2 = char1.getWp2();
        wp3 = char1.getWp3();
        wp4 = char1.getWp4();
        wp5 = char1.getWp5();
        wp6 = char1.getWp6();
        wp7 = char1.getWp7();
        wp8 = char1.getWp8();
        wp9 = char1.getWp9();
        wp10 = char1.getWp0();
        s1 = char1.getS1();
        s2 = char1.getS2();
        s3 = char1.getS3();
        s4 = char1.getS4();
        s5 = char1.getS5();
        s6 = char1.getS6();
        s7 = char1.getS7();
        s8 = char1.getS8();
        s9 = char1.getS9();
        s10 = char1.getS0();  
        sp1 = char1.getSp1();
        sp2 = char1.getSp2();
        sp3 = char1.getSp3();
        sp4 = char1.getSp4();
        sp5 = char1.getSp5();
        sp6 = char1.getSp6();
        sp7 = char1.getSp7();
        sp8 = char1.getSp8();
        sp9 = char1.getSp9();
        sp10 = char1.getSp0();
        waffen1 = char1.getWaffen();
        zauber1 = char1.getZauber();
        rucksack1 = char1.getRucksack();
        notizen1 = char1.getNotizen();
        image1 = char1.getImage();
    }
    
    
    public static void startup2() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("Char2.txt"));
        Character char2 = (Character) in2.readObject();   
        name2 = char2.getName();
        geschlecht2 = char2.getGeschlecht();
        alter2 = char2.getAlter();
        rasse2 = char2.getRasse();
        heimat2 = char2.getHeimat();
        beruf2 = char2.getBeruf();
        statur2 = char2.getStatur();
        life2 = char2.getLife();
        h11 = char2.getH1();
        h12 = char2.getH2();
        h13 = char2.getH3();
        h14 = char2.getH4();
        h15 = char2.getH5();
        h16 = char2.getH6();
        h17 = char2.getH7();
        h18 = char2.getH8();
        h19 = char2.getH9();
        h20 = char2.getH0();  
        hp11 = char2.getHp1();
        hp12 = char2.getHp2();
        hp13 = char2.getHp3();
        hp14 = char2.getHp4();
        hp15 = char2.getHp5();
        hp16 = char2.getHp6();
        hp17 = char2.getHp7();
        hp18 = char2.getHp8();
        hp19 = char2.getHp9();
        hp20 = char2.getHp0();
        w11 = char2.getW1();
        w12 = char2.getW2();
        w13 = char2.getW3();
        w14 = char2.getW4();
        w15 = char2.getW5();
        w16 = char2.getW6();
        w17 = char2.getW7();
        w18 = char2.getW8();
        w19 = char2.getW9();
        w20 = char2.getW0();  
        wp11 = char2.getWp1();
        wp12 = char2.getWp2();
        wp13 = char2.getWp3();
        wp14 = char2.getWp4();
        wp15 = char2.getWp5();
        wp16 = char2.getWp6();
        wp17 = char2.getWp7();
        wp18 = char2.getWp8();
        wp19 = char2.getWp9();
        wp20 = char2.getWp0();
        s11 = char2.getS1();
        s12 = char2.getS2();
        s13 = char2.getS3();
        s14 = char2.getS4();
        s15 = char2.getS5();
        s16 = char2.getS6();
        s17 = char2.getS7();
        s18 = char2.getS8();
        s19 = char2.getS9();
        s20 = char2.getS0();  
        sp11 = char2.getSp1();
        sp12 = char2.getSp2();
        sp13 = char2.getSp3();
        sp14 = char2.getSp4();
        sp15 = char2.getSp5();
        sp16 = char2.getSp6();
        sp17 = char2.getSp7();
        sp18 = char2.getSp8();
        sp19 = char2.getSp9();
        sp20 = char2.getSp0();
        waffen2 = char2.getWaffen();
        zauber2 = char2.getZauber();
        rucksack2 = char2.getRucksack();
        notizen2 = char2.getNotizen();
        image2 = char2.getImage();
    }
        
    public static void startup3() throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in3 = new ObjectInputStream(new FileInputStream("Char3.txt"));
        Character char3 = (Character) in3.readObject();
        name3 = char3.getName();
        geschlecht3 = char3.getGeschlecht();
        alter3 = char3.getAlter();
        rasse3 = char3.getRasse();
        heimat3 = char3.getHeimat();
        beruf3 = char3.getBeruf();
        statur3 = char3.getStatur();
        life3 = char3.getLife();
        h41 = char3.getH1();
        h42 = char3.getH2();
        h43 = char3.getH3();
        h44 = char3.getH4();
        h45 = char3.getH5();
        h46 = char3.getH6();
        h47 = char3.getH7();
        h48 = char3.getH8();
        h49 = char3.getH9();
        h50 = char3.getH0();  
        hp41 = char3.getHp1();
        hp42 = char3.getHp2();
        hp43 = char3.getHp3();
        hp44 = char3.getHp4();
        hp45 = char3.getHp5();
        hp46 = char3.getHp6();
        hp47 = char3.getHp7();
        hp48 = char3.getHp8();
        hp49 = char3.getHp9();
        hp50 = char3.getHp0();
        w41 = char3.getW1();
        w42 = char3.getW2();
        w43 = char3.getW3();
        w44 = char3.getW4();
        w45 = char3.getW5();
        w46 = char3.getW6();
        w47 = char3.getW7();
        w48 = char3.getW8();
        w49 = char3.getW9();
        w50 = char3.getW0();  
        wp41 = char3.getWp1();
        wp42 = char3.getWp2();
        wp43 = char3.getWp3();
        wp44 = char3.getWp4();
        wp45 = char3.getWp5();
        wp46 = char3.getWp6();
        wp47 = char3.getWp7();
        wp48 = char3.getWp8();
        wp49 = char3.getWp9();
        wp50 = char3.getWp0();
        s41 = char3.getS1();
        s42 = char3.getS2();
        s43 = char3.getS3();
        s44 = char3.getS4();
        s45 = char3.getS5();
        s46 = char3.getS6();
        s47 = char3.getS7();
        s48 = char3.getS8();
        s49 = char3.getS9();
        s50 = char3.getS0();  
        sp41 = char3.getSp1();
        sp42 = char3.getSp2();
        sp43 = char3.getSp3();
        sp44 = char3.getSp4();
        sp45 = char3.getSp5();
        sp46 = char3.getSp6();
        sp47 = char3.getSp7();
        sp48 = char3.getSp8();
        sp49 = char3.getSp9();
        sp50 = char3.getSp0();
        waffen3 = char3.getWaffen();
        zauber3 = char3.getZauber();
        rucksack3 = char3.getRucksack();
        notizen3 = char3.getNotizen();
        image3 = char3.getImage();
    }
       
    public static void addChar1(String name, String geschlecht, String alter, String rasse, String heimat, String beruf, String statur, int life,
            String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8, String h9, String h0,
            String hp1, String hp2, String hp3, String hp4, String hp5, String hp6, String hp7, String hp8, String hp9, String hp0,
            String w1, String w2, String w3, String w4, String w5, String w6, String w7, String w8, String w9, String w0,
            String wp1, String wp2, String wp3, String wp4, String wp5, String wp6, String wp7, String wp8, String wp9, String wp0,
            String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s0,
            String sp1, String sp2, String sp3, String sp4, String sp5, String sp6, String sp7, String sp8, String sp9, String sp0,
            String waffen, String zauber, String rucksack, String notizen, ImageIcon image)
            throws FileNotFoundException, IOException{
        
       Character char1 = new Character (name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
       
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Char1.txt"));
       out.writeObject(char1);
    }
      
    public static void addChar2(String name, String geschlecht, String alter, String rasse, String heimat, String beruf, String statur, int life
            , String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8, String h9, String h0,
            String hp1, String hp2, String hp3, String hp4, String hp5, String hp6, String hp7, String hp8, String hp9, String hp0,
            String w1, String w2, String w3, String w4, String w5, String w6, String w7, String w8, String w9, String w0,
            String wp1, String wp2, String wp3, String wp4, String wp5, String wp6, String wp7, String wp8, String wp9, String wp0,
            String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s0,
            String sp1, String sp2, String sp3, String sp4, String sp5, String sp6, String sp7, String sp8, String sp9, String sp0,
            String waffen, String zauber, String rucksack, String notizen, ImageIcon image)
            throws FileNotFoundException, IOException{
        
       Character char2 = new Character (name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
       
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Char2.txt"));
       out.writeObject(char2);
    }
        
    public static void addChar3(String name, String geschlecht, String alter, String rasse, String heimat, String beruf, String statur, int life,
            String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8, String h9, String h0,
            String hp1, String hp2, String hp3, String hp4, String hp5, String hp6, String hp7, String hp8, String hp9, String hp0,
            String w1, String w2, String w3, String w4, String w5, String w6, String w7, String w8, String w9, String w0,
            String wp1, String wp2, String wp3, String wp4, String wp5, String wp6, String wp7, String wp8, String wp9, String wp0,
            String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s0,
            String sp1, String sp2, String sp3, String sp4, String sp5, String sp6, String sp7, String sp8, String sp9, String sp0,
            String waffen, String zauber, String rucksack, String notizen, ImageIcon image)
            throws FileNotFoundException, IOException{
        
       Character char3 = new Character (name, geschlecht, alter, rasse, heimat, beruf, statur, life,
               h1, h2, h3, h4, h5, h6, h7, h8, h9, h0, hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9, hp0,
               w1, w2, w3, w4, w5, w6, w7, w8, w9, w0, wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, wp0,
               s1, s2, s3, s4, s5, s6, s7, s8, s9, s0, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp0,
               waffen, zauber, rucksack, notizen, image);
       
       ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Char3.txt"));
       out.writeObject(char3);
    }
                 
}
