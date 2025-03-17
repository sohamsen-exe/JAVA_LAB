interface Emp_Details {
    void emp1();
    void emp2();
    void emp3();
    void emp4();
    void emp5();
}

abstract class emp1_details implements Emp_Details {
    public void emp1() {
        System.out.println("----------EMPLOYEE 1 DETAILS----------");
        System.out.println("Employee Name : Yuvraj");
        System.out.println("Employee ID : 069");
        System.out.println("Employee Department : Wine & Hard Liquor");
        System.out.println("Employee Salary : $69,420");
    }
}

abstract class emp2_details implements Emp_Details {
    public void emp2() {
        System.out.println("----------EMPLOYEE 2 DETAILS----------");
        System.out.println("Employee Name : Keshav");
        System.out.println("Employee ID : 420");
        System.out.println("Employee Department : Mechanical Hardware");
        System.out.println("Employee Salary : $42,069");
    }
}

abstract class emp3_detials implements Emp_Details {
    public void emp3() {
        System.out.println("----------EMPLOYEE 3 DETAILS----------");
        System.out.println("Employee Name : Soham");
        System.out.println("Employee ID : 404");
        System.out.println("Employee Department : Sports & Fitness");
        System.out.println("Employee Salary : $69,699");
    }
}

abstract class emp4_details implements Emp_Details {
    public void emp4() {
        System.out.println("----------EMPLOYEE 4 DETAILS----------");
        System.out.println("Employee Name : Vishesh");
        System.out.println("Employee ID : 808");
        System.out.println("Employee Department : Calisthenics & Weight Training");
        System.out.println("Employee Salary : $66,666");
    }
}

abstract class emp5_details implements Emp_Details {
    public void emp5() {
        System.out.println("----------EMPLOYEE 5 DETAILS----------");
        System.out.println("Employee Name : Gajodhar");
        System.out.println("Employee ID : 666");
        System.out.println("Employee Department : Bak & Chowdi");
        System.out.println("Employee Salary : Infinity");
    }
}

public class employees {
    public static void main(String[] args) {
        emp1_details e1 = new emp1_details() {
            @Override
            public void emp2() {

            }

            @Override
            public void emp3() {

            }

            @Override
            public void emp4() {

            }

            @Override
            public void emp5() {

            }
        };
        emp2_details e2 = new emp2_details() {
            @Override
            public void emp1() {

            }

            @Override
            public void emp3() {

            }

            @Override
            public void emp4() {

            }

            @Override
            public void emp5() {

            }
        };
        emp3_detials e3 = new emp3_detials() {
            @Override
            public void emp1() {

            }

            @Override
            public void emp2() {

            }

            @Override
            public void emp4() {

            }

            @Override
            public void emp5() {

            }
        };
        emp4_details e4 = new emp4_details() {
            @Override
            public void emp1() {

            }

            @Override
            public void emp2() {

            }

            @Override
            public void emp3() {

            }

            @Override
            public void emp5() {

            }
        };
        emp5_details e5 = new emp5_details() {
            @Override
            public void emp1() {

            }

            @Override
            public void emp2() {

            }

            @Override
            public void emp3() {

            }

            @Override
            public void emp4() {

            }
        };
        e1.emp1();
        e2.emp2();
        e3.emp3();
        e4.emp4();
        e5.emp5();
    }
}