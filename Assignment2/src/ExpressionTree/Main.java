package ExpressionTree;



public class Main {

	public static void main(String[] args){
		String s = "(4%2)+(2+2)*(9-2)"; // should 28
		System.out.println(Parser.toTree(s).eval());
	}

}
