public class CalculatorClass {

    //+
    int augment(int... values) {
        int result = 0;
        for (int x : values) {
            result = result + x;
        }
        return result;
    }

    long augment(long... values) {
        long result = 0;
        for (long x : values) {
            result = result + x;
        }
        return result;
    }

    float augment(float... values) {
        float result = 0;
        for (float x : values) {
            result = result + x;
        }
        return result;
    }

    double augment(double... values) {
        double result = 0;
        for (double x : values) {
            result = result + x;
        }
        return result;
    }

// -

    int subtraction(int value, int valueTwo) {
        int result = value - valueTwo;
        return result;
    }

    long subtraction(long value, long valueTwo) {
        long result = value - valueTwo;
        return result;
    }

    float subtraction(float value, float valueTwo) {
        float result = value - valueTwo;
        return result;
    }

    double subtraction(double value, double valueTwo) {
        double result = value - valueTwo;
        return result;
    }

// / (division)

    int division(int value, int valueTwo) {
        int result = value / valueTwo;
        return result;
    }

    long division(long value, long valueTwo) {
        long result = value / valueTwo;
        return result;
    }

    float division(float value, float valueTwo) {
        float result = value / valueTwo;
        return result;
    }

    double division(double value, double valueTwo) {
        double result = value / valueTwo;
        return result;
    }

// *

    int multiple(int value, int valueTwo) {
        int result = value * valueTwo;
        return result;
    }

    long multiple(long value, long valueTwo) {
        long result = value * valueTwo;
        return result;
    }

    float multiple(float value, float valueTwo) {
        float result = value * valueTwo;
        return result;
    }

    double multiple(double value, double valueTwo) {
        double result = value * valueTwo;
        return result;
    }
//a
}
