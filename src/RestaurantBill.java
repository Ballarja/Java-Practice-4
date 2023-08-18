public class RestaurantBill {

    public static void main(String args[]){
        tipTheWaiter(35.12);
        foodOrdered("Steak and mashed potatoes");
    }

    public static void tipTheWaiter(double bill){
        double amountToTip = bill * 0.15;

        System.out.println("Your service was wonderful! Please, accept this tip: "+ amountToTip );
    }
    public static void foodOrdered(String entreeOrdered){

        System.out.println(entreeOrdered);
    }
}
