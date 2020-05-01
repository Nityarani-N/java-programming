public class EmployeeBuilderUC1{
        public static void main(String[] args){
                int FULL_TIME=1;
                double empCheck = Math.floor(Math.random() * 10) % 2;
                if ((int)empCheck == FULL_TIME)
                        System.out.println("employee is present");
                else
                        System.out.println("employee is absent");
        }
}

