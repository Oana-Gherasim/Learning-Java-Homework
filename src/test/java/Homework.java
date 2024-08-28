public class Homework {


//1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;

    public void displayNr5() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Da ");
        }
        System.out.println("  ");
    }

//2. Afisam in consola primele 3 numere de la 1 la 3;

    public void displayPrimele3Nr() {
        for (int i = 1; i < 4; i++) {
            System.out.print("Primele 3 numere sunt: " + i + " ");
        }
        System.out.println("  ");
    }

//3. Afisam in consola numarul cel mai mare dintre 15 si 20;
//4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25;

    public void displayNrCelMaiMare(double x, double y) {
        if (x < y) {
            System.out.println("Numarul mai mare este: " + y);
        } else {
            System.out.println("Numarul mai mare este: " + x);
        }
    }
    public int firstNumber;
    public int secondNumber;
    public float thirdNumber;
    public float forthNumber;

    public void displayNrcuVar(){
        if ( firstNumber > secondNumber) {
            System.out.println("Numarul mai mare este: " + firstNumber);
        }
        else if( firstNumber < secondNumber) {
            System.out.println("Numarul mai mare este: " + secondNumber);
        }
        else {
            System.out.println("Numerele sunt egale.");
        }
    }

    public void displayNrcuVar2(){
        if ( thirdNumber > forthNumber) {
            System.out.println("Numarul mai mare este: " + thirdNumber);
        }
        else if( thirdNumber < forthNumber) {
            System.out.println("Numarul mai mare este: " + forthNumber);
        }
        else {
            System.out.println("Numerele sunt egale.");
        }
    }

//5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");

    public void displayNrPareSiImpare() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Numarul " + i + " este par.");
            } else {
                System.out.println("Numarul " + i + " este impar.");
            }
        }
    }

//6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");

    public void displayDoarNrPare() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("  ");
    }

//7. Afisam in consola numerele divizibile cu 5;

    public void displayNrDivCu5(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("  ");
    }

//8. Afisam in consola primele 3 numere dibizibile cu 5;

    public void displayPrimele3NrDivCu5Inc1() {
        int i = 0;
        int numar = 1;
        while (i < 3) {
            if (numar % 5 == 0) {
                System.out.print(numar + " ");
                i++;
            }

            numar++;
        }
        System.out.println("  ");
    }

    public void displayPrimele3NrDivCu5Inc2() {
        int i = 0;
        for (int numar = 1; i < 3; numar++) {
            if (numar % 5 == 0) {
                System.out.print(numar + " ");
                i++;
            }
        }
        System.out.println("  ");
    }

    public void displayPrimele3NrDivCu5Inc3(int nrMax) {
        int Contor = 0;
        for (int i = 1; i < nrMax; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " este divizibil cu 5");
                Contor++;
            }
            else if (Contor == 3) {
                break;
            }
        }
    }




//9. Afisam in consola suma a doua numere 235 si 10;

    public void dispalySuma(int x, int y) {
        int calcul = x + y;
        System.out.println("Suma este: " + calcul);
    }

//10. Afisam in consola suma numerelor pana la 10 (int suma=0);

    public void sumaNrPanaLa10() {
        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            suma = suma + i;
        }
        System.out.println("Suma numerelor pana la 10 este: " + suma);
    }

//11. Afisam in consola produsul numerelor pana la 5;

    public void displayProduslNrPanaLa5() {
        int produs = 1;
        for (int i = 1; i <= 5; i++) {
            produs = produs * i;
        }
        System.out.println("Produsul nr pana la 5 este: " + produs);
    }










}
