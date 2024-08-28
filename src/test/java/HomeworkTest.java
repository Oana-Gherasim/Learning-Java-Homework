import org.junit.Test;

public class HomeworkTest {

    @Test

    public void tema() {
        Homework numar = new Homework();
        numar.firstNumber = 15;
        numar.secondNumber = 20;
        numar.thirdNumber = 3.25f;
        numar.forthNumber = 4.5f;

        numar.displayNr5();
        numar.displayPrimele3Nr();
        numar.displayNrCelMaiMare(15, 20);
        numar.displayNrCelMaiMare(4.5, 3.25);
        numar.displayNrPareSiImpare();
        numar.displayDoarNrPare();
        numar.displayNrDivCu5(20);
        numar.displayPrimele3NrDivCu5Inc1();
        numar.displayPrimele3NrDivCu5Inc2();
        numar.dispalySuma(235, 10);
        numar.sumaNrPanaLa10();
        numar.displayProduslNrPanaLa5();
        numar.displayNrcuVar();
        numar.displayNrcuVar2();
        numar.displayPrimele3NrDivCu5Inc3(50);

    }
}
