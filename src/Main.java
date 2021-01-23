public class Main {
    public static void main(String[] args) {
        MathExecution[] executions = new MathExecution[4];
        executions[0] = create(100, 100, 'a');
        executions[1] = create(200, 100, 's');
        executions[2] = create(300, 100, 'd');
        executions[3] = create(100, 10, 'm');
        Scanner sc = new Scanner(System.in);
        int i = 4;
        while(sc.hasNext()){
            int a,b;
            char e;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextChar();
            executions[i] = create(a, b, c);
            i++;
//             execution.execute();
//             System.out.println("Result is:" + execution.getResult());
        }

        for(MathExecution execution : executions){
            execution.execute();
            System.out.println("Result is:" + execution.getResult());
        }
    }

    public static MathExecution create(double leftVal, double rightVal, char codes){
        MathExecution execution = new MathExecution();
        execution.setLeftVal(leftVal);
        execution.setRightVal(rightVal);
        execution.setCodes(codes);
        return execution;
    }
}
