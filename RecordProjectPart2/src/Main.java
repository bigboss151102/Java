public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            LPAStudent s = new LPAStudent("S92300" + i,
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
        Student pojoStudent = new Student("S923006", "Ann", "15/11/2002", "JavaClassMaster");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "15/11/2002", "JavaMasterClass");

        System.out.println("----------------------------------------------------");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println("----------------------------------------------------");

        System.out.println(pojoStudent.getName() + "is talking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + "is talking " + recordStudent.classList());

        System.out.println("----------------------------------------------------");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");


    }
}
