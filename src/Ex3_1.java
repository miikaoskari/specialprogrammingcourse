@FunctionalInterface
interface AreaCalculator
{
    double calculate(double a, double b);
}

public class Ex3_1
{
    public static void main(String[] args)
    {
        // lambda for rectangle area
        AreaCalculator rectangle_area = (height, width) -> height * width;

        // lambda for triangle area
        AreaCalculator triangle_area = (height, width) -> 0.5 * height * width;

        double rectangle_length = 10, rectangle_width = 5;
        double triangle_base = 10, triangle_height = 5;

        System.out.println("rectangle area: " + rectangle_area.calculate(rectangle_length, rectangle_width));
        System.out.println("triangle area: " + triangle_area.calculate(triangle_base, triangle_height));
    }
}
