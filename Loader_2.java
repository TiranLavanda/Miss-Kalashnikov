import java.util.Scanner;

public class Loader_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте, введите количество ингредиентов:\n");

        System.out.println("Cколько мл молока?");
        int milkAmount = scanner.nextInt(); // ml

        System.out.println("Сколько гр муки?");
        int powderAmount = scanner.nextInt(); // g

        System.out.println("Сколько яиц?");
        int eggsCount = scanner.nextInt(); // items

        System.out.println("Сколько гр сахара?");
        int sugarAmount = scanner.nextInt(); // g

        System.out.println("Сколько мл масла?");
        int oilAmount = scanner.nextInt(); // ml

        System.out.println("Сколько желаете добавить яблок?");
        int appleCount = scanner.nextInt(); // items

        System.out.println("==============================================================");
        //========================================================================================================

        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30)

        //рецептура powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml

            {
            System.out.println("Вы можете приготовить Панкейки\n");
        } else {
            System.out.println("Для приготовления Панкейков вам не хватает:");
            if (powderAmount < 400) {
            int powderPan = powderAmount - 400;
                System.out.println(Math.abs(powderPan) + "\tгр муки");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (sugarAmount < 10) {
                int sugarPan = sugarAmount - 10;
                System.out.println(Math.abs(sugarPan) + "\tгр сахара");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (milkAmount < 1000) {
                int milkPan = milkAmount - 1000;
                System.out.println(Math.abs(milkPan) + "\tмл молока" );}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (oilAmount < 30) {
                int oilPan = oilAmount - 30;
                System.out.println(Math.abs(oilPan) + "\tмл масла");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            System.out.println("==============================================================");
        }

        //=======================================================================================================

        if (powderAmount >= 5 && milkAmount >= 300 && eggsCount >= 5)

        //рецептура milk - 300 ml, powder - 5 g, eggs - 5

        {
            System.out.println("Вы можете приготовить Омлет\n");
        } else {
            System.out.println("Для приготовления Омлета вам не хватает:");
            if (powderAmount < 5) {
                int powderOml = powderAmount - 5;
                System.out.println(Math.abs(powderOml) + "\tгр муки");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (milkAmount < 300) {
                int milkOml = milkAmount - 300;
                System.out.println(Math.abs(milkOml) + "\tмл молока" );}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (eggsCount < 5) {
                int eggsOml = eggsCount - 5;
                System.out.println(Math.abs(eggsOml) + "\tяиц");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            System.out.println("==============================================================");
        }

        //======================================================================================================
        if (powderAmount >= 300 && appleCount >= 3 && milkAmount >= 100 && eggsCount >= 4)

        //рецептура apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

        {
            System.out.println("Вы можете приготовить Яблочный пирог\n");
        } else {
            System.out.println("Для приготовления Яблочного пирога вам не хватает:");
            if (powderAmount < 300) {
                int powderApp = powderAmount - 300;
                System.out.println(Math.abs(powderApp) + "\tгр муки");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (appleCount < 3) {
                int apples = appleCount - 3;
                System.out.println(Math.abs(apples) + "\tяблок");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (milkAmount < 100) {
                int milkApp = milkAmount - 100;
                System.out.println(Math.abs(milkApp) + "\tмл молока" );}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            if (eggsCount < 4) {
                int eggsApp = eggsCount - 4;
                System.out.println(Math.abs(eggsApp) + "\tяиц");}
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            System.out.println("==============================================================");
        }
        //========================================================================================================
    }
}
