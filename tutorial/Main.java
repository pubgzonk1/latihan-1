package com.tutorial;
//jenis Ban
class ban {
    String namaban;
    String ukuranban;
    String pic;
        //turunan clas di namaban class
        tiredesign Tiredesign;
        testban Testbban;

    ban(String namaban, String ukuranban , String pic){
        this.namaban = namaban;
        this.ukuranban = ukuranban;
        this.pic  = pic ;
    }
    void equiptiredesign(tiredesign Tiredesign){
        this.Tiredesign = Tiredesign; 
    }
    void equiptestban(testban Testban){
        this.Testbban = Testban;
    }
    void display(){
        System.out.println("\nNama Ban         : " + this.namaban);
        System.out.println("Ukuran Ban       : " + this.ukuranban);
        System.out.println("PIC ban          : " + this.pic);
        this.Testbban.display();
        this.Tiredesign.display();
    }
}
//class tire design
class tiredesign{
    String namatiredesign;
    Integer jumlah;

    tiredesign(String namatiredesign, Integer jumlah){
        this.namatiredesign = namatiredesign;
        this.jumlah = jumlah;
}
    void display(){
        System.out.println("Nama Tire Design : " + this.namatiredesign);
        System.out.println("Jumlah ban       : " + this.jumlah + " Pcs");
    }

}

//class test ban
class testban{
    String namatestban;
    String ovt;

    testban(String namatestban, String ovt){
        this.namatestban = namatestban;
        this.ovt = ovt;
    }
    void display(){
        System.out.println("Nama Test Ban    : "+ this.namatestban);
        System.out.println("OVT              : "+ this.ovt);
    }
}


public class Main{
    public static void main(String[] args) {
        System.out.println("Hello Atep");
        //membuat data nama ban
        ban ban1 = new ban("CHAMPIRO ECO", "205/65 R16 99H", "Atep Rosdiana");
        ban ban2 = new ban("CHAMPIRO ECOTEC", "225/65 R16 88H", "Atep Rosdiana");
        ban ban3 = new ban("CHAMPIRO HPY", "205/50 R16 100H", "Atep Rosdiana");
            //membuat data tire design
        tiredesign tiredesign1 = new tiredesign("Rica Novia", 40);
        tiredesign tiredesign2 = new tiredesign("ASRY", 48);
        tiredesign tiredesign3 = new tiredesign("RIDWAN JUNIARGA", 24);
            //membuat objek test ban
        testban testban1 = new testban("WET BRAKING", "OVT 40");
        testban testban2 = new testban("DRY BRAKING", "OVT 40");
        testban testban3 = new testban("WET HANDLING", "OVT 40");
            //mambuat output yang di seting sbb
       ban1.equiptestban(testban1);
       ban1.equiptiredesign(tiredesign1);
       ban1.display();
       System.out.println("\n");
       
       ban2.equiptestban(testban2);
       ban2.equiptiredesign(tiredesign2);
       ban2.display();
       System.out.println("\n");

       ban3.equiptestban(testban3);
       ban3.equiptiredesign(tiredesign3);
       ban3.display();
       System.out.println("\n");

       ban1.display();
       //Bagaimana cara menampilkan output sesuai kita >>?
    }
}
