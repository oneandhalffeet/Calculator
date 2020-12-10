public class Main {
    public static void main(String[] args) {
        MathExecution[] executions = new MathExecution[4];
        executions[0] = create(100, 100, 'a');
        executions[1] = create(200, 100, 's');
        executions[2] = create(300, 100, 'd');
        executions[3] = create(100, 10, 'm');

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
