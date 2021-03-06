// This is an one line comment.
/*
 * This is a block comment. You can write comments in multiple lines.
 */
/* 
 * A package is a namespace where your related classes and interfaces are grouped.
 * When you share your program to other developers,
 * other developers can import the package and can use classes and interfaces in the package
 */
package edu.handong.csee.pp1.bigdata.lab1_1; 


/**
 * @author JC
 * We are defining a class which is a blueprint of our Calculator object.
 */
/**
 * @author jaech
 *
 */
public class Calculator {

	// An object has data and actions
	// Object data are any variables/constants in this area
	// (in 'class' definition but not in method definitions.)
	// We call all variables defined in this area as member variables or fields.

	// static decides how this variable can be accessed and maintained.
	// Static variables are shared by all objects crated by this class definition.
	static int countForAnyCompution = 0;
	// private member variable is used by only one object can can't be shared by other objects
	//

	private int localCount = 0;

	/**
	 * This is a main method, which is a special method where is the starting point of a program execution.
	 * This method is not an actual action of this object but just for starting our program.
	 * 'public' means this method can be called via this object in anywhere.
	 */
	public static void main(String[] args) {

		// Based on our class definition, we can create a real object!
		// classname objectname = new classname();
		Calculator myCalulator = new Calculator();

		// now we can do some action (method) in our object!
		myCalulator.execute(args[0], args[1]);
	}

	/**
	 * @param firstArg
	 * @param secondArg
	 * 
	 * This method (action) get two numbers in String type and various computations
	 * and call a method printing their results.
	 * 'private' means this method can be called only in this class.
	 * 
	 */
	//(#4) Divide by 0 issue handled
	private void execute(String firstArg, String secondArg) {

			int firstIntArg = Integer.parseInt(firstArg);
			int secondIntArg = Integer.parseInt(secondArg);
		

		countForAnyCompution=0;
		localCount = 0;

		print("SUM:" , sum(firstIntArg, secondIntArg));
		print("SUB:" , this.subtract(firstIntArg, secondIntArg));
		print("*:" , multiply(firstIntArg, secondIntArg));
		try {
			print("DV:" , divide(firstIntArg,secondIntArg));
		}catch(ArithmeticException e)
		{
			System.out.println("Input parameter causes Divied by 0 issue.");
			System.out.print("System close.");
			System.exit(1);
		}
	}	

/**
 * @param prefix
 * @param result
 * This method prints out computation result.
 */
void print(String prefix, int result) {
	System.out.println(prefix + " " + result);
}

int sum(int first, int second) {
	countForAnyCompution++;
	localCount++;
	return first + second;
}

//(#1) subtract wrong logic
int subtract(int first, int second) {
	countForAnyCompution++;
	localCount++;
	return first - second;
}

int multiply(int first, int second) {
	countForAnyCompution++;
	localCount++;
	return first * second;
}

int divide(int first, int second){
	countForAnyCompution++;
	localCount++;
	return first / second;
}

//(#2) mod function body unimplemented
int mod(int first, int second) {
	countForAnyCompution++;
	localCount++;
	return first % second;
}

static int getCount() {
	return countForAnyCompution;
}

int getLocalCount() {
	return localCount;
}
}
