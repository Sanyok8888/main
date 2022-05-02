public class Calculator {
    public static void main(String[] args) {
        CalculatorClass calculatorClass = new CalculatorClass();

//+
        int intResult = calculatorClass.augment(5,5,5,5,5,5,5,5,5,5); //int
        System.out.println(intResult + " - plus value");

        long longResult = calculatorClass.augment(1000000000l,2000000000l,3000000000l,4000000000l);//long
        System.out.println(longResult + " - plus value");

        float floatResult = calculatorClass.augment(1.543f, 2.378f,4.743f,8.213f); //float
        System.out.println(floatResult + " - plus value");

        double doubleResult = calculatorClass.augment(8.56, 9.32,3.11,9.22); //double
        System.out.println(doubleResult + " - plus value");


        System.out.println(" ");
//-

        int intResultMinus = calculatorClass.subtraction(10,5); //int
        System.out.println(intResultMinus + " - minus value");
        long longResultMinus = calculatorClass.subtraction(4000000000l,1000000000l); //long
        System.out.println(longResultMinus + " - minus value");

        float floatResultMinus = calculatorClass.subtraction(5.543f, 2.378f); //float
        System.out.println(floatResultMinus + " - minus value");

        double doubleResultMinus = calculatorClass.subtraction(20.56, 9.32); //double
        System.out.println(doubleResultMinus + " - minus value");


        System.out.println(" ");

// / (division)

        int intResultDivision = calculatorClass.division(10,5); //int
        System.out.println(intResultDivision + " - division value");

        long longResultDivision = calculatorClass.division(5000000000l,2); //long
        System.out.println(longResultDivision + " - division value");

        float floatResultDivision = calculatorClass.division(50.800f,2.000f); //float
        System.out.println(floatResultDivision + " - division value");

        double doubleResultDivision = calculatorClass.division(30.33, 3.0);
        System.out.println(doubleResultDivision + " - division value");

        System.out.println(" ");

// *
        int intResultMultiple = calculatorClass.multiple(4,2);
        System.out.println(intResultMultiple + " - multiple value");

        long longResultMultiple = calculatorClass.multiple(1000000000l,8l);
        System.out.println(longResultMultiple + " - multiple value");

        float floatResultMultiple = calculatorClass.multiple(30.800f, 2.0f);
        System.out.println(floatResultMultiple + " - multiple value");

        double doubleResultMultiple = calculatorClass.multiple(20.0, 5.0);
        System.out.println(doubleResultMultiple + " - multiple value");



    }
}
