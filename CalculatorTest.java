class CalculatorTest{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        if (cal.add(2, 3) == 5) {
            System.out.println("Add Test Passed.");
        } else {
            System.out.println("Add Test Failed.");
        }

        if (cal.subtract(5, 3) == 2) {
            System.out.println("Subtract Test Passed.");
        } else {
            System.out.println("Subtract Test Failed.");
        }

        if (cal.multiply(4, 3) == 12) {
            System.out.println("Multiply Test Passed.");
        } else {
            System.out.println("Multiply Test Failed.");
        }

        if (cal.divide(10, 2) == 5.0) {
            System.out.println("Divide Test Passed.");
        } else {
            System.out.println("Divide Test Failed.");
        }

        if (cal.modulus(10, 3) == 1) {
            System.out.println("Modulus Test Passed.");
        } else {
            System.out.println("Modulus Test Failed.");
        }
    }
}