void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem adja meg az adatok számát!");
    int adatszam = sc.nextInt();
    String[] tomb = new String[adatszam];
    System.out.println("Adja meg az adatokat(szöveg)!");
    for(int i =0; i<adatszam; i++){
        tomb[i] = sc.nextLine();
    }
    System.out.println("A tömb tagjai: ");
    for(int i = 0; i<tomb.length; i++){
        System.out.print(tomb[i]+" ");
    }
}