public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().oderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();
    }
}
