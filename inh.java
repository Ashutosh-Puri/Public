//Write a program for multilevel inheritance such that country is inherited from continent. 
//State is inherited from country. Display the place, state, country and continent.

import java.util.Scanner;
class Continent
{
    String con;
    Scanner sc= new Scanner(System.in);
    void con_in()
    {
        System.out.println("Enter Continent Name: ");
        con = sc.next();
    }
}

class Country extends Continent
{
    String cou ;
    void cou_in() 
    {
        System.out.println("Enter Country Name: ");
        cou = sc.next();
    }
}

class State extends Country
{
    String sta;
    void sta_in()
    {
        System.out.println("Enter State Name: ");
        sta =sc.next();
    }
}


class inh extends State
{
    String pla;
    void pla_in()
    {
        System.out.println("Enter Place Name : ");
        pla = sc.next();
    }

    public static void main( String args[] )
    {
        inh s = new inh();
        s.con_in();
        s.cou_in();
        s.sta_in();
        s.pla_in();
        System.out.println("\n\nContinent: "+s.con);
        System.out.println("Country: "+s.cou);
        System.out.println("State: "+s.sta);
        System.out.println("Place :" + s.pla);
    }
}
