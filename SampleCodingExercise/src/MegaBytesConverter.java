public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-5000);
    }
    public static void printMegaBytesAndKiloBytes(int kilo_bytes){
        int mega_byte;
        int remainder_kilobyte;
        if (kilo_bytes < 0){
            System.out.println("Invalid Value !");
        }else {
            mega_byte = (int) (kilo_bytes / 1024);
            remainder_kilobyte = (kilo_bytes - (mega_byte * 1024));
            System.out.println(kilo_bytes + " KB " + " = " + mega_byte + " MB " + " and " + remainder_kilobyte + " KB ");
        }
    }

}
