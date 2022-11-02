package com.tutorial;

//player
class player{
    String playername;
    Double darah;
    Integer level;
        //player juga mempunyai senjata dan armor
        senjata Senjata;
        armor Armor;

    player(String playername, Double darah, Integer level){
        this.playername = playername;
        this.darah = darah;
        this.level = level;
    }
    void equipsenjata(senjata Senjata){
        this.Senjata = Senjata;
    }
    void equiparmor(armor Armor){
        this.Armor = Armor;
    }
    void display(){
        System.out.println("\nNama Player   :" + playername );
        System.out.println("Darah         :" + darah );
        System.out.println("Level         :Lv " + level );
        this.Armor.display();
        this.Senjata.display();
    }
        
}

// senjata
class senjata{
    String namasenjata;
    Double attackpower;

    senjata(String namasenjata, Double attackpower){
        this.namasenjata = namasenjata;
        this.attackpower = attackpower;
    }
    void equipsenjata(String namasenjata){
        this.namasenjata = namasenjata;
        this.attackpower = attackpower;
    }
    void display(){
        System.out.println("Weapon        :" + namasenjata + " , Attack Power" + this.attackpower); 
    }
}
//Armor
class armor{
    String namaarmor;
    Double defencepower;

    armor(String namaarmor, Double defencepower){
        this.namaarmor = namaarmor;
        this.defencepower = defencepower;
    }
    void display(){
        System.out.println("Armor         :" + this.namaarmor + " , Defence power" + this.defencepower +" Hp");
    }

}


public class Main{
    public static void main(String[] args) {
        System.out.println("hello watep");
        player player1 = new player("Atep Rosdiana", 100.0, 1);
        player player2 = new player("Roronoa Dzoro", 80.0, 3);
       

        senjata senjata1 = new senjata("Pedang Tajam 1", 10.0);
        senjata senjata2 = new senjata("Pedang Tajam 2", 15.0);
        senjata senjata3 = new senjata("Pedang Tajam 2", 20.0);

        armor armor1 = new armor("Rompi Lv 1", 40.0);
        armor armor2 = new armor("Rompi Lv 2", 60.0);
        armor armor3 = new armor("Rompi Lv 3", 80.0);

        player1.equiparmor(armor1);
        player1.equipsenjata(senjata1);
        player1.display();

        player2.equiparmor(armor1);
        player2.equipsenjata(senjata1);
        player2.display();
    }
}