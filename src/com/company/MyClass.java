//napisz publiczną klasę o nazwie MyClass
package com.company;
public class MyClass
{
    //2 pola typu całkowite (jedno dostępne dla wszystkich, drugie tylko w tej klasie)
     public int calkowita1;
     private int calkowita2;
    //1 pole typu rzeczywistego (dostępne tylko w tej klasie)
     private float rzeczywista1;
    //1 pole przetrzymujące wartość logiczną (dostępne tylko w tej klasie, jej domyślna wartość powinna być ustawiona na true)
     private boolean logiczna1=true;
    //1 pole przetrzymujące znak(dostępny tylko w tej klasie)
     private char znak1;

     /*
    3 publiczne konstruktory (domyślny, dwuparametrowy - ustawiający wartości typu całkowitego, trójparametrowy - ustawiający wartości
    typu całkowitego i logiczne - do inicjalizacji części wartości w tym konsktruktorze wykorzystaj konstruktor dwuparametrowy)
    */
    public MyClass()
    {

    }

    public MyClass(int a, int b)
    {
        this.calkowita1=a;
        this.calkowita2=b;
    }

    public MyClass(int a,int b,boolean c)
    {
        this(a,b);
        this.logiczna1=c;
    }

















}
