//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem adja meg az adatok számát!");
    int adatszam = sc.nextInt();
    int[] tomb = new int[adatszam];
    System.out.println("Adja meg az adatokat(egész számok)!");
    for(int i =0; i<adatszam; i++){
        tomb[i] = sc.nextInt();
    }
    System.out.println("A tömb tagjai: ");
    for(int i = 0; i<tomb.length; i++){
        System.out.print(tomb[i]+" ");
    }
}
