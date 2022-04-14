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


    //metodę pobierającą wartość przetrzymująca znak oraz wartość logiczną
    //komentarz od mnie, nie wiem czy da się jedną metodą get zwracać dwa różne typy danych więc rozpisałem to na dwie metody
    public char getZnak()
    {
        return this.znak1;
    }

    public boolean getLogiczna()
    {
        return this.logiczna1;
    }

    //metodę ustawiającą wartość pola rzeczywistego
    public void setRzeczywista(float nowaRzeczywista)
    {
       this.rzeczywista1=nowaRzeczywista;
    }

    //metodę która zwróci sumę wszystkich pól liczbowych klasy
    public float suma()
    {
        return this.calkowita1+this.calkowita2+this.rzeczywista1;
    }

    //metodę która zwróci wartość logiczną true - jeżeli obydwie liczby całkowite będą pierwsze, false= w przeciwnym razie
    public boolean liczbyPierwsze(int a,int b)
    {
        //przypisujemy liczby na których będziemy pracować
        this.calkowita1= a;
        this.calkowita2 =b;
        //zerujemy zmienne z iloscia dzielnikow
        int licznikDzielnikow1=0;
        int licznikDzielnikow2=0;
        //sprawdzamy ile dzielnikow ma pierwsza liczba
        for(int i=1;i<=this.calkowita1;i++)
        {
            if(this.calkowita1%i==0)
            {
                licznikDzielnikow1 = licznikDzielnikow1 +1;
            }
            else
            {

            }
        }

        //sprawdzamy ile dzielnikow ma druga liczba
        for(int j=1;j<=this.calkowita2;j++)
        {
            if(this.calkowita2%j==0)
            {
                licznikDzielnikow2 = licznikDzielnikow2 +1;
            }
            else
            {

            }
        }

        //jeśli obie liczby mają tylko dwa dzielniki to są pierwsze i wtedy ustawiamy true, w przeciwnym wypadku false
        if(licznikDzielnikow1==2&&licznikDzielnikow2==2)
        {
            return true;
        }
        else
        {
            return false;
        }



    }









}
