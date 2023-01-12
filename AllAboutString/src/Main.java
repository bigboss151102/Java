public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello world";
        System.out.printf("Index of r = %d%n", helloWorld.indexOf('r')); //Chỉ số của r trong chuỗi
        System.out.printf("Index of world = %d%n", helloWorld.indexOf("world")); // chỉ số cuae world trong chuỗi

        System.out.printf("Index of l = %d%n", helloWorld.indexOf('l'));
        System.out.printf("Index of l = %d%n",helloWorld.lastIndexOf('l'));

        System.out.printf("Index of l = %d%n", helloWorld.indexOf('l', 3));
        System.out.printf("Index of l = %d%n",helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower))
        {
            System.out.println("Value match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower))
        {
            System.out.println("Value match ignoring case");
        }

        if (helloWorld.startsWith("Hello"))
        {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World"))
        {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World"))
        {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World"))
        {
            System.out.println("Values match exactly");
        }


    }

    public static void printInformation(String string)
    {
        int length = string.length();
        System.out.printf("Lenght = %d%n", length);

        if (string.isEmpty())  // kiểm tra rỗng
        {
            System.out.println("String is Empty !");
            return;
        }

        if (string.isBlank())  // kiểm tra rỗng hoặc kí tự trắng
        {
            System.out.println("String is Blank !");
        }

        System.out.printf("First char = %c%n", string.charAt(0)); // Lấy kí tự đầu tiên
        System.out.printf("Last char = %c%n", string.charAt(length - 1)); // Lấy kí tự cuối cùng

    }
}
