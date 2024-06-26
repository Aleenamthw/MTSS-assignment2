////////////////////////////////////////////////////////////////////
// SARA STEFANI 2077673
// ALEENA MATHEW 2068242
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {
    /*
     * Test the letter I
     */
    @Test
    public void testLetterI() throws Exception {
        String result = RomanPrinter.print(1);
        assertEquals(" _____ \n" + //
                "|_   _|\n" + //
                "  | |  \n" + //
                "  | |  \n" + //
                " _| |_ \n" + //
                "|_____|\n", result);
    }

    /*
     * Test the letter V
     */
    @Test
    public void testLetterV() throws Exception {

            String result = RomanPrinter.print(5);
            assertEquals("__      __ \n" + //
                    "\\ \\    / / \n" + //
                    " \\ \\  / /  \n" + //
                    "  \\ \\/ /   \n" + //
                    "   \\  /    \n" + //
                    "    \\/     \n",
                    result);
     
    }

    /*
     * Test the number 8
     */
    @Test
    public void testNumberEightPrint() throws Exception {
    
            String result = RomanPrinter.print(8);

            assertEquals(
                    "__      __  _____  _____  _____ \n" + //
                                                "\\ \\    / / |_   _||_   _||_   _|\n" + //
                                                " \\ \\  / /    | |    | |    | |  \n" + //
                                                "  \\ \\/ /     | |    | |    | |  \n" + //
                                                "   \\  /     _| |_  _| |_  _| |_ \n" + //
                                                "    \\/     |_____||_____||_____|\n",
                    result);

    }

    /*
     * Test the letter X
     */
    @Test
    public void testLetterX() throws Exception {

            String result = RomanPrinter.print(10);

            assertEquals("__   __ \n" + //
                                "\\ \\ / / \n" + //
                                " \\ V /  \n" + //
                                "  > <   \n" + //
                                " / . \\  \n" + //
                                "/_/ \\_\\ \n", result);
 

    }

    /*
     * Test the number 14
     */
    @Test
    public void testNumerFourteenPrint() throws Exception {  

            String result = RomanPrinter.print(14);
            assertEquals(
                    "__   __  _____ __      __ \n" + //
                                                "\\ \\ / / |_   _|\\ \\    / / \n" + //
                                                " \\ V /    | |   \\ \\  / /  \n" + //
                                                "  > <     | |    \\ \\/ /   \n" + //
                                                " / . \\   _| |_    \\  /    \n" + //
                                                "/_/ \\_\\ |_____|    \\/     \n" //
                                ,
                    result);

    }

    /*
     * Test the letter L
     */
    @Test
    public void testLetterL() throws Exception {        

            String result = RomanPrinter.print(50);
            assertEquals(" _      \n" + //
                                "| |     \n" + //
                                "| |     \n" + //
                                "| |     \n" + //
                                "| |____ \n" + //
                                "|______|\n" //
                                , result);

    }

    /*
     * Test the number 41
     */
    @Test
    public void testNumberFortyOnePrint() throws Exception {

            String result = RomanPrinter.print(41);
            assertEquals(
                    "__   __  _       _____ \n" + //
                                                "\\ \\ / / | |     |_   _|\n" + //
                                                " \\ V /  | |       | |  \n" + //
                                                "  > <   | |       | |  \n" + //
                                                " / . \\  | |____  _| |_ \n" + //
                                                "/_/ \\_\\ |______||_____|\n",
                    result);

    }

    /*
     * Test the number 49
     */
    @Test
    public void testNumberFortyNinePrint() throws Exception {


            String result = RomanPrinter.print(49);
            assertEquals(
                    "__   __  _       _____ __   __ \n" + //
                                                "\\ \\ / / | |     |_   _|\\ \\ / / \n" + //
                                                " \\ V /  | |       | |   \\ V /  \n" + //
                                                "  > <   | |       | |    > <   \n" + //
                                                " / . \\  | |____  _| |_  / . \\  \n" + //
                                                "/_/ \\_\\ |______||_____|/_/ \\_\\ \n",
                    result);

    }

    /*
     * Test the number 90
     */
    @Test
    public void testNumberNinetyPrint() throws Exception {


            String result = RomanPrinter.print(90);
            assertEquals(
                    "__   __   _____ \n" + //
                            "\\ \\ / /  / ____|\n" + //
                            " \\ V /  | |     \n" + //
                            "  > <   | |     \n" + //
                            " / . \\  | |____ \n" + //
                            "/_/ \\_\\  \\_____|\n",
                    result);

    }

    /*
     * Test number 123
     */
    @Test
    public void testNumberOneHundredTwentyThreePrint() throws Exception {

            String result = RomanPrinter.print(123);

            assertEquals(
                    "  _____ __   __ __   __  _____  _____  _____ \n" + //
                            " / ____|\\ \\ / / \\ \\ / / |_   _||_   _||_   _|\n" + //
                            "| |      \\ V /   \\ V /    | |    | |    | |  \n" + //
                            "| |       > <     > <     | |    | |    | |  \n" + //
                            "| |____  / . \\   / . \\   _| |_  _| |_  _| |_ \n" + //
                            " \\_____|/_/ \\_\\ /_/ \\_\\ |_____||_____||_____|\n",
                    result);

    }

    /*
     * Test the number 400
     */
    @Test
    public void testNumberFourHundredPrint() throws Exception {


            String result = RomanPrinter.print(400);
            assertEquals(
                    "  _____  _____  \n / ____||  __ \\ \n| |     | |  | |\n| |     | |  | |\n| |____ | |__| |\n \\_____||_____/ \n",
                    result);


    }

    /*
     * Test the number 699
     */
    @Test
    public void testNumberSixHundredNinetyNinePrint() throws Exception {

            String result = RomanPrinter.print(699);
            assertEquals(
                    " _____    _____ __   __   _____  _____ __   __ \n" + //
                            "|  __ \\  / ____|\\ \\ / /  / ____||_   _|\\ \\ / / \n" + //
                            "| |  | || |      \\ V /  | |       | |   \\ V /  \n" + //
                            "| |  | || |       > <   | |       | |    > <   \n" + //
                            "| |__| || |____  / . \\  | |____  _| |_  / . \\  \n" + //
                            "|_____/  \\_____|/_/ \\_\\  \\_____||_____|/_/ \\_\\ \n",
                    result);

    }

    /*
     * Test the number 919
     */
    @Test
    public void testNumberNineHundredNineteenPrint() throws Exception {

            String result = RomanPrinter.print(919);

            assertEquals(
                    "  _____  __  __ __   __  _____ __   __ \n" + //
                            " / ____||  \\/  |\\ \\ / / |_   _|\\ \\ / / \n" + //
                            "| |     | \\  / | \\ V /    | |   \\ V /  \n" + //
                            "| |     | |\\/| |  > <     | |    > <   \n" + //
                            "| |____ | |  | | / . \\   _| |_  / . \\  \n" + //
                            " \\_____||_|  |_|/_/ \\_\\ |_____|/_/ \\_\\ \n",
                    result);
    }

    /*
     * Test the number 999
     */
    @Test
    public void testNumberNineHundredNinetyNinePrint() throws Exception {

            String result = RomanPrinter.print(999);
            assertEquals(
                    "  _____  __  __ __   __   _____  _____ __   __ \n" + //
                            " / ____||  \\/  |\\ \\ / /  / ____||_   _|\\ \\ / / \n" + //
                            "| |     | \\  / | \\ V /  | |       | |   \\ V /  \n" + //
                            "| |     | |\\/| |  > <   | |       | |    > <   \n" + //
                            "| |____ | |  | | / . \\  | |____  _| |_  / . \\  \n" + //
                            " \\_____||_|  |_|/_/ \\_\\  \\_____||_____|/_/ \\_\\ \n",
                    result);

    }

    /*
     * Test the number 1000
     */
    @Test
    public void testNumberOneThousandPrint() throws Exception {


            String result = RomanPrinter.print(1000);
            assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n", result);
    }

    /*
     * Test the number 0
     */
    @Test(expected = Exception.class)
    public void printNoCharacter() throws Exception {
        assertEquals("", RomanPrinter.print(0));
    }
    /*
     * Test the number below zero
     */
    @Test(expected = Exception.class)
    public void printBelowZero() throws Exception {
        assertEquals("", RomanPrinter.print(-3));
    }
}

