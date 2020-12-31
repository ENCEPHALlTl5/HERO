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

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Character implements Serializable{
    
    private final String name;
    private final String geschlecht;
    private final String alter;
    private final String rasse;
    private final String heimat;
    private final String beruf;
    private final String statur;
    int life;
    private final String h1;
    private final String h2;
    private final String h3;
    private final String h4;
    private final String h5;
    private final String h6;
    private final String h7;
    private final String h8;
    private final String h9;
    private final String h0;
    private final String hp1;
    private final String hp2;
    private final String hp3;
    private final String hp4;
    private final String hp5;
    private final String hp6;
    private final String hp7;
    private final String hp8;
    private final String hp9;
    private final String hp0;
    private final String w1;
    private final String w2;
    private final String w3;
    private final String w4;
    private final String w5;
    private final String w6;
    private final String w7;
    private final String w8;
    private final String w9;
    private final String w0;
    private final String wp1;
    private final String wp2;
    private final String wp3;
    private final String wp4;
    private final String wp5;
    private final String wp6;
    private final String wp7;
    private final String wp8;
    private final String wp9;
    private final String wp0;
    private final String s1;
    private final String s2;
    private final String s3;
    private final String s4;
    private final String s5;
    private final String s6;
    private final String s7;
    private final String s8;
    private final String s9;
    private final String s0;
    private final String sp1;
    private final String sp2;
    private final String sp3;
    private final String sp4;
    private final String sp5;
    private final String sp6;
    private final String sp7;
    private final String sp8;
    private final String sp9;
    private final String sp0;
    
    private final String waffen;
    private final String zauber;
    private final String rucksack;
    private final String notizen;
    
    private final ImageIcon image;
    

    public Character(String name, String geschlecht, String alter, String rasse, String heimat, String beruf, String statur, int life,
            String h1, String h2, String h3, String h4, String h5, String h6, String h7, String h8, String h9, String h0,
            String hp1, String hp2, String hp3, String hp4, String hp5, String hp6, String hp7, String hp8, String hp9, String hp0,
            String w1, String w2, String w3, String w4, String w5, String w6, String w7, String w8, String w9, String w0,
            String wp1, String wp2, String wp3, String wp4, String wp5, String wp6, String wp7, String wp8, String wp9, String wp0,
            String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s0,
            String sp1, String sp2, String sp3, String sp4, String sp5, String sp6, String sp7, String sp8, String sp9, String sp0,
            String waffen, String zauber, String rucksack, String notizen, ImageIcon image) {
        
        this.name = name;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.rasse = rasse;
        this.heimat = heimat;
        this.beruf = beruf;
        this.statur = statur;
        this.life = life;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.h7 = h7;
        this.h8 = h8;
        this.h9 = h9;
        this.h0 = h0;
        this.hp1 = hp1;
        this.hp2 = hp2;
        this.hp3 = hp3;
        this.hp4 = hp4;
        this.hp5 = hp5;
        this.hp6 = hp6;
        this.hp7 = hp7;
        this.hp8 = hp8;
        this.hp9 = hp9;
        this.hp0 = hp0;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
        this.w5 = w5;
        this.w6 = w6;
        this.w7 = w7;
        this.w8 = w8;
        this.w9 = w9;
        this.w0 = w0;
        this.wp1 = wp1;
        this.wp2 = wp2;
        this.wp3 = wp3;
        this.wp4 = wp4;
        this.wp5 = wp5;
        this.wp6 = wp6;
        this.wp7 = wp7;
        this.wp8 = wp8;
        this.wp9 = wp9;
        this.wp0 = wp0;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.s0 = s0;
        this.sp1 = sp1;
        this.sp2 = sp2;
        this.sp3 = sp3;
        this.sp4 = sp4;
        this.sp5 = sp5;
        this.sp6 = sp6;
        this.sp7 = sp7;
        this.sp8 = sp8;
        this.sp9 = sp9;
        this.sp0 = sp0;
        this.waffen = waffen;
        this.zauber = zauber;
        this.rucksack = rucksack;
        this.notizen = notizen;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getAlter() {
        return alter;
    }

    public String getRasse() {
        return rasse;
    }

    public String getHeimat() {
        return heimat;
    }

    public String getBeruf() {
        return beruf;
    }

    public String getStatur() {
        return statur;
    }
 
    public int getLife() {
        return life;
    }

    public String getH1() {
        return h1;
    }

    public String getH2() {
        return h2;
    }

    public String getH3() {
        return h3;
    }

    public String getH4() {
        return h4;
    }

    public String getH5() {
        return h5;
    }

    public String getH6() {
        return h6;
    }

    public String getH7() {
        return h7;
    }

    public String getH8() {
        return h8;
    }

    public String getH9() {
        return h9;
    }

    public String getH0() {
        return h0;
    }

    public String getHp1() {
        return hp1;
    }

    public String getHp2() {
        return hp2;
    }

    public String getHp3() {
        return hp3;
    }

    public String getHp4() {
        return hp4;
    }

    public String getHp5() {
        return hp5;
    }

    public String getHp6() {
        return hp6;
    }

    public String getHp7() {
        return hp7;
    }

    public String getHp8() {
        return hp8;
    }

    public String getHp9() {
        return hp9;
    }

    public String getHp0() {
        return hp0;
    }

    public String getW1() {
        return w1;
    }

    public String getW2() {
        return w2;
    }

    public String getW3() {
        return w3;
    }

    public String getW4() {
        return w4;
    }

    public String getW5() {
        return w5;
    }

    public String getW6() {
        return w6;
    }

    public String getW7() {
        return w7;
    }

    public String getW8() {
        return w8;
    }

    public String getW9() {
        return w9;
    }

    public String getW0() {
        return w0;
    }

    public String getWp1() {
        return wp1;
    }

    public String getWp2() {
        return wp2;
    }

    public String getWp3() {
        return wp3;
    }

    public String getWp4() {
        return wp4;
    }

    public String getWp5() {
        return wp5;
    }

    public String getWp6() {
        return wp6;
    }

    public String getWp7() {
        return wp7;
    }

    public String getWp8() {
        return wp8;
    }

    public String getWp9() {
        return wp9;
    }

    public String getWp0() {
        return wp0;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }

    public String getS3() {
        return s3;
    }

    public String getS4() {
        return s4;
    }

    public String getS5() {
        return s5;
    }

    public String getS6() {
        return s6;
    }

    public String getS7() {
        return s7;
    }

    public String getS8() {
        return s8;
    }

    public String getS9() {
        return s9;
    }

    public String getS0() {
        return s0;
    }

    public String getSp1() {
        return sp1;
    }

    public String getSp2() {
        return sp2;
    }

    public String getSp3() {
        return sp3;
    }

    public String getSp4() {
        return sp4;
    }

    public String getSp5() {
        return sp5;
    }

    public String getSp6() {
        return sp6;
    }

    public String getSp7() {
        return sp7;
    }

    public String getSp8() {
        return sp8;
    }

    public String getSp9() {
        return sp9;
    }

    public String getSp0() {
        return sp0;
    }

    public String getWaffen() {
        return waffen;
    }
    
    public String getZauber() {
        return zauber;
    }

    public String getRucksack() {
        return rucksack;
    }

    public String getNotizen() {
        return notizen;
    }

    public ImageIcon getImage() {
        return image;
    }
}
