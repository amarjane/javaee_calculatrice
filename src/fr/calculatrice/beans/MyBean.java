package fr.calculatrice.beans;

/** MyBean class has :
 * 
 * 		4 String parameters :
 * 
 * 			number1, number2, operation and result.
 * 
 * 		2 methods :
 * 
 * 			doOperation and toString (with constructors, setters and getters).
 * 
 *************************************************************************************
 *
 * The method doOperation does :
 * 
 * 		result = number1 operation number 2, 
 * 
 * 		with checking :
 * 
 * 			values : empty converted to 0, 
 * 
 * 			types : 
 * 
 * 					takes String attributes, 
 * 					converts them to integer, 
 * 					does the calculus 
 * 					and converts Integer result to String,
 * 
 * 			and exceptions (/0 and %0 are forbidden).
 * 
 * *************************************************************************************
 * 
 * The method toString returns a String message with the result or with the message exception.
 * 
 */
	
public class MyBean {

	// parameters
	
	private String number1;
	private String number2;
	private String operation;
	private String result;
	
	// constructors
	
	public MyBean() {}
	
	public MyBean(String n1, String n2, String op) {
		
		this.number1 = (n1.equals("")) ? "0" : n1;
		this.number2 = (n2.equals("")) ? "0" : n2;
		this.operation = op;
		this.doOperation();
		
	}
	
	// methods
	
	private void doOperation() {
		
		int n1 = Integer.valueOf(this.number1);
		int n2 = Integer.valueOf(this.number2);
		
		switch(this.operation) {
		
			case ("+") :
				this.result = String.valueOf( n1 + n2);
				break;
				
			case ("-") :
				this.result = String.valueOf(n1 - n2);
				break;	
				
			case ("*") :
				this.result = String.valueOf(n1 * n2);
				break;
				
			case ("/") :
				try {
					
					this.result = String.valueOf(n1 / n2);
				
				} catch (ArithmeticException e) {
					
					this.result = "";
					
				} 
				break;
				
			default :
				try {
					
					this.result = String.valueOf(n1 % n2);
				
				} catch (ArithmeticException e) {
					
					this.result = "";
					
				}
		
		}
				
	}
	
	public String toString() {
		
		return this.result.equals("") ?
				"It's forbidden to divide by zero !" : 
				"Result of the operation " + this.number1 + " " + this.operation + " " + this.number2 + " = " + this.result;
		
	}

	// setters and getters
	
	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1;
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
