public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Doors: " + car.getDoors());
        System.out.println("Convertible: " + car.isConvertible());
        car.describerCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Black");
        targa.describerCar();
        System.out.println("Make: " +  targa.getMake());
        System.out.println("Model: " +  targa.getModel());
        System.out.println("Color: " +  targa.getColor());
        System.out.println("Doors: " +  targa.getDoors());
        System.out.println("Convertible: " +  targa.isConvertible());
    }

}
