//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int randomNume = (int)(Math.random() * 201);
    int randomNumk = (int)(Math.random() * 201);
    int kisebb = 0;
    int nagyobb = 0;
    IO.println(randomNume);
    IO.println(randomNumk);

    //nagyobb
    if(randomNumk > randomNume){
        IO.println(randomNumk);
        nagyobb = randomNumk;
    }
    else if(randomNume> randomNumk){
        IO.println("A nagyobb szám: "+randomNume);
        nagyobb = randomNume;
    }
    //kisebb
    if(randomNumk < randomNume){
        IO.println(randomNumk);
        kisebb = randomNumk;
    }
    else if(randomNume < randomNumk){
        IO.println("A kisebb szám: "+randomNume);
        nagyobb = randomNume;
    }
    //négyzetgyökök
    int elsogyok = (int) Math.sqrt(randomNume);
    int masodikgyok = (int) Math.sqrt(randomNumk);
    IO.println("Elso gyoke: "+elsogyok);
    IO.println("Masodik gyoke: "+masodikgyok);
    //eltérés
    int differnece = nagyobb - kisebb;
    IO.println("A differencia: "+differnece);
    //ket szam köbe
    int kobe = (int) Math.pow(randomNume, 3);
    int kobk = (int) Math.pow(randomNumk, 3);
    IO.println("Az elso szam kobe: "+kobe);
    IO.println("A masodik szam kobe: "+kobk);
    //ket szam hanyadosa egesz kerekitessel
    float hanyados = (float) Math.round(nagyobb/kisebb);
    IO.println(hanyados);
}
