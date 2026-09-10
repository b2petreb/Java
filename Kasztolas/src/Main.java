void main() {
    byte bit = 22;
    short tiny = 2222;
    int bigger = 424356;
    long loong = 745634843L;
    float flat = 45908f;
    double two = 56456.9012d;
    boolean boo = true;
    char character = 'b';

    //Double
    float repul = (float)two;
    System.out.print("egy: "+repul);

    long repulk = (long)repul;
    System.out.print("ketto: "+repulk);

    long repulh = (long)repulk;
    System.out.print("harom: "+repulh);

    int repuln = (int)repulh;
    System.out.print("négy: "+repuln);

    char repulo = (char)repuln;
    System.out.print("öt: "+repulo);

    short repulha = (short)repulo;
    System.out.print("hat: "+repulha);

    byte repulhe = (byte)repulha;
    System.out.print("hét: "+repulhe);

    //Float
    long hossz = (long)flat;
    System.out.print("nyolc: "+hossz);

    int hossze = (int)hossz;
    System.out.print("kilenc: "+hossze);

    char hosszk = (char)hossze;
    System.out.print("tíz: "+hosszk);

    short hosszh = (short)hosszk;
    System.out.print("tizenegy: "+hosszh);

    byte hosszn = (byte)hosszh;
    System.out.print("tiizenketto: "+hosszn);

    //Long
    int longe = (int)loong;
    System.out.print("tizenharom: "+longe);

}
