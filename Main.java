package com.tutorial;

//Player
class player {
String playerName;
double darah;
int level;
    //player jugA MEMPUNYAI armor dan senjata
    senjata pedang;
    armor rompi;

    player(String playerName, double darah){
        this.playerName=playerName;
        this.darah=darah;
    }
    void equipSenjata(senjata pedang){
        this.pedang = pedang;
    }
    void equiprompi(armor rompi){
        this.rompi=rompi;
    }
    void display(){
        System.out.print("\nNama : " + this.playerName);
        System.out.println("Health : " + this.darah + "hp");
        this.pedang.display();
        this.rompi.display();
    }
}

// senjata
class senjata{
double attackpower;
String namasenjata;
    senjata(String namasenjata,double attackpower){
        this.namasenjata = namasenjata;
        this.attackpower=attackpower;
    }
    void display(){
        System.out.println("Nama Senjata : " + this.namasenjata + " , power : " + this.attackpower);
    }
}
//Defence
class armor{
double defencepower;
String nama;
    armor(String nama, double defencepower){
        this.nama = nama;
        this.defencepower=defencepower;
    }
    void display(){
        System.out.println("Nama rompi : " + this.nama + " , Defence power : " + this.defencepower);
    }
}



public class Main{
    public static void main(String[] args) {
        //Membuat objek player
    player player1 = new player("Atep Rosdiana", 100);
    
        //membuat objec senjata
    senjata pedang = new senjata("Keris rencong", 15.0);

        //membuat objec armor
    armor rompi1 = new armor("Rompi Level 1", 10);

        //equip senjat dan armor
        player1.equipSenjata(pedang);
        player1.equiprompi(rompi1);
        player1.display();
}
}