public class TotalItUp {
    private int numOne;
    private int numTwo;
    private int answer;


    public void setNums(int n1, int n2) {
        this.numOne = n1;
        this.numTwo = n2;
    }	              
   
	//method add totals up numOne and numTwo
    public void add() {  
        this.answer = this.numOne + this.numTwo;
    }

	//method print displays the sum of numOne and numTwo
    public void print() {  
        System.out.println(numOne + " + " + numTwo + " = " + answer);
    }
}
