public class ReturnValues {

    public static void main (String args[]){
        calculateArea(4.3, 7.5);
    }

    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    }
}
