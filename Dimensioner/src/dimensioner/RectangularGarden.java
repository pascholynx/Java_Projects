package dimensioner;

public class RectangularGarden {
    private double totalArea;
    private double width;
    private double lengthDifference;
    private double length;

    // Constructor with default area
    public RectangularGarden() {
        this.totalArea = 40;
        this.lengthDifference = 3;
    }

    // Constructor with user-provided area
    public RectangularGarden(double totalArea) {
        this.totalArea = totalArea;
    }

    // Method to calculate width based on total area
    public void calculateDimensions() {
        // Assuming length is (3 or lengthDifference) meters more than width
        // Let width be x, then length = x + (3 or lengthDifference)
        // Total area = width * length
        // totalArea = x * (x + 3 or lengthDifference)
        // Solving the quadratic equation, we get:
        // x^2 + (3 or lengthDifference)x - totalArea = 0

        double discriminant = Math.pow(lengthDifference, 2) + 4 * totalArea;
        double width1 = (-lengthDifference + Math.sqrt(discriminant)) / 2;
        double width2 = (-lengthDifference - Math.sqrt(discriminant)) / 2;

        // Choose the positive root as width
        this.width = (width1 > 0) ? width1 : width2;
        this.length = this.width + lengthDifference;
    }

    // Method to display dimensions
    public void displayDimensions() {
        System.out.println("For a garden with an area of " + totalArea + " square meters,");
        System.out.println("Width: " + width + " meters");
        System.out.println("Length: " + length + " meters");
        System.out.println("Therefore the dimension is " + length + " by "+ width + " in square meters,");
    }

    // Setter for totalArea
    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    // Setter for LengthDifference
    public void setLengthDifference(double lengthDifference) {
        this.lengthDifference = lengthDifference;
    }


}
