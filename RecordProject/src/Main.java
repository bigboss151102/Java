public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            Student s = new Student("S92300" + i,
                    switch (i){
                        case 1 -> "Hoang";
                        case 2 -> "Cong";
                        case 3 -> "Trong";
                        case 4 -> "Linoel";
                        case 5 -> "Cristiano";
                        default -> "Anonymous";
                    },
                    "15/11/2002",
                    "JavaMasterClass");
            System.out.println(s);
        }

    }
}
