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
        //przypisujemy liczby na których będziemy pracować (chociaż w poleceniu tego nie było ale zrobiłem to w ramach sprawdzenia czy dziala)
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

    //metodę która zwróci informacje ile liczb w klasie jest ujemnych
    public int ujemne()
    {
        int licznikUjemnych=0;
        if(this.calkowita1<0)
        {
            licznikUjemnych++;
        }
        if(this.calkowita2<0)
        {
            licznikUjemnych++;
        }
        if(this.rzeczywista1<0)
        {
            licznikUjemnych++;
        }

        return licznikUjemnych;
    }

    /* metodę która jako parametr pobiera wartość logiczną i liczbe rzeczywistą. Jeżeli wartość logiczna przekazana jako parametr jest równa false -
    wartość pola klasy zostanie ustawiona na wartość parametru  jeżeli jest ujemny.
    Jeżeli wartość logiczna jest równa true wartośc pola klasy zostanie ustawiona na wartość parametru metody jeżeli jest dodatnia.
    Jeżeli przekazana jako parametr wartość rzeczywista jest równa 0, to ustawiamy taką wartość pola klasy bez względu na wartość parametru logicznego metody.
     */
    public void coToJest(boolean wartoscL, float wartoscR)
    {
        if (wartoscR == 0)
        {
            this.rzeczywista1=wartoscR;
        }
        else
        {
            if (wartoscL == false&&wartoscR<0)
            {
                    this.rzeczywista1 = wartoscR;
            }
            else if (wartoscL == true&& wartoscR>0)
            {
                    this.rzeczywista1 = wartoscR;
            }
        }
    }

    //metodę która ma za zadanie wyświetlić tyle razy słowo "Hello world" jaką wartość ma parametr metody - za pommocą pętli while
        public void helloWhile(int x)
        {
            while(x>0)
            {
                System.out.println("Hello world");
                x--;
            }
        }


    //metodę która ma za zadanie wyświetlić tyle razy słowo "Hello world" jaką wartość ma parametr metody - za pomocą petli for
    public void helloFor(int y)
    {
        for(int i=0;i<y;i++)
        {
            System.out.println("Hello World");
        }
    }

    //metodę która ma za zadanie wyświetlić wszystkie liczby do zadanej parametrem o ile nie jest to liczba parzysta
    public void wszystkieLiczby(int z)
    {
        for(int i=0;i<z;i++)
        {
               if(i%2==0)
               {

               }
               else
               {
                   System.out.println(i);
               }
        }
    }


    //metodę która ma za zadanie wyświetlić wszystkie liczby z zakresu zadanego parametrami metody, o ile nie jest to liczba pierwsza
    public void niePierwsza(int odtad,int dotad)
    {
      //to be continue
    }



}
