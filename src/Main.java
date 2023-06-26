
	import java.util.Scanner;

class Money {
    private long hryvnia;
    private byte kopiyky;

    public Money(long hryvnia, byte kopiyky) {
        this.hryvnia = hryvnia;
        this.kopiyky = kopiyky;
    }

    public Money() {
        this.hryvnia = 0;
        this.kopiyky = 0;
    }

    public void add(Money money) {
        this.hryvnia += money.hryvnia;
        this.kopiyky += money.kopiyky;
    }

    public void subtract(Money money) {
        this.hryvnia -= money.hryvnia;
        this.kopiyky -= money.kopiyky;
    }

    public double divide(double divisor) {
        double totalAmount = this.hryvnia + this.kopiyky / 100.0;
        return totalAmount / divisor;
    }

    public boolean equals(Money money) {
        return this.hryvnia == money.hryvnia && this.kopiyky == money.kopiyky;
    }

    @Override
    public String toString() {
        return hryvnia + " грн. " + kopiyky + " коп.";
    }
}

class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double calculateMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void multiplyByScalar(double scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public void add(Vector vector) {
        this.x += vector.x;
        this.y += vector.y;
        this.z += vector.z;
    }

    public double calculateDotProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector calculateCrossProduct(Vector vector) {
        double crossX = y * vector.z - z * vector.y;
        double crossY = z * vector.x - x * vector.z;
        double crossZ = x * vector.y - y * vector.x;
        return new Vector(crossX, crossY, crossZ);
    }

    public boolean equals(Vector vector) {
        return this.x == vector.x && this.y == vector.y && this.z == vector.z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Зчитування грошової суми з консолі
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Java Lab 2 ");

        System.out.print("Enter the amount in hryvnia: ");
        long hryvnia = scanner.nextLong();

        System.out.print("Enter the amount in kopiyky: ");
        byte kopiyky = scanner.nextByte();

        Money money1 = new Money(hryvnia, kopiyky);
        System.out.println("Money 1: " + money1);

        Money money2 = new Money(100, (byte) 50);
        System.out.println("Money 2: " + money2);

        money1.add(money2);
        System.out.println("Money 1 + Money 2: " + money1);

        money1.subtract(money2);
        System.out.println("Money 1 - Money 2: " + money1);

        double divisionResult = money1.divide(3.0);
        System.out.println("Money 1 / 3.0: " + divisionResult);

        boolean equalResult = money1.equals(money2);
        System.out.println("Are Money 1 and Money 2 equal? " + equalResult);

        // Зчитування вектора з консолі
        System.out.print("Enter the x-coordinate of the vector: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the y-coordinate of the vector: ");
        double y = scanner.nextDouble();

        System.out.print("Enter the z-coordinate of the vector: ");
        double z = scanner.nextDouble();

        Vector vector1 = new Vector(x, y, z);
        System.out.println("Vector 1: " + vector1);

        Vector vector2 = new Vector(2.0, 3.0, 4.0);
        System.out.println("Vector 2: " + vector2);

        vector1.add(vector2);
        System.out.println("Vector 1 + Vector 2: " + vector1);

        vector1.multiplyByScalar(2.5);
        System.out.println("Vector 1 * 2.5: " + vector1);

        double dotProduct = vector1.calculateDotProduct(vector2);
        System.out.println("Dot product of Vector 1 and Vector 2: " + dotProduct);

        Vector crossProduct = vector1.calculateCrossProduct(vector2);
        System.out.println("Cross product of Vector 1 and Vector 2: " + crossProduct);

        boolean vectorEqualResult = vector1.equals(vector2);
        System.out.println("Are Vector 1 and Vector 2 equal? " + vectorEqualResult);
    }
}


    }
}
