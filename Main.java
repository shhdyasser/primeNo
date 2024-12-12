public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        PrimeChecker primeChecker = new PrimeChecker();

        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        primeChecker.setNumber(inputNumber);

        if (primeChecker.isPrime()) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }

        scanner.close();

    }
}