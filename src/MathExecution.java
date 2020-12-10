public class MathExecution {

    private double leftVal;
    private double rightVal;
    private char codes;
    private double result;

    // getters and setters of the double values
    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getCodes() {
        return codes;
    }

    public void setCodes(char codes) {
        this.codes = codes;
    }

    public void execute(){
        switch(codes){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;
                break;
            default:
                System.out.println("Invalid code.");
        }
    }
}
