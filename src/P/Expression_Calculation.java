package P;

import java.util.Stack;

public class Expression_Calculation {
	public static boolean binary;
	public static boolean octal;
	public static boolean hexa;
	public static boolean decimal;
	final static double precision=1000000000;
	/** Evaluate an expression */
	public static double evaluateExpression(String expression) {
		// Create operandStack to store operands
		Stack<Double> operandStack = new Stack<>();

		// Create operatorStack to store operators
		Stack<Character> operatorStack = new Stack<>();

		// Insert blanks around (, ), +, -, /,%,^ and *
		expression = insertBlanks(expression);

		// Extract operands and operators
		String[] tokens = expression.split(" ");
		// ______________________binary_______________________________________________
		if (binary == true) {
			for (int i = 0; i < tokens.length; i++) {
				// if(tokens[i].startsWith("1")||tokens[i].startsWith("0"))
				if (!tokens[i].startsWith("+") && !tokens[i].startsWith("-") && !tokens[i].startsWith("/")
						&& !tokens[i].startsWith("*") && !tokens[i].isEmpty()) {
					tokens[i] = "" + BinaryToDecimal(tokens[i]);
				}
			}
		}
		// __________________________________________________________________________
		// ______________________octal_______________________________________________
		if (octal == true) {
			for (int i = 0; i < tokens.length; i++) {
				// if(tokens[i].startsWith("1")||tokens[i].startsWith("0"))
				if (!tokens[i].startsWith("+") && !tokens[i].startsWith("-") && !tokens[i].startsWith("/")
						&& !tokens[i].startsWith("*") && !tokens[i].isEmpty()) {
					tokens[i] = "" + OctalToDecimal(tokens[i]);
				}
			}
		}
		// __________________________________________________________________________
		// ______________________hexa_______________________________________________
		if (hexa == true) {
			for (int i = 0; i < tokens.length; i++) {
				// if(tokens[i].startsWith("1")||tokens[i].startsWith("0"))
				if (!tokens[i].startsWith("+") && !tokens[i].startsWith("-") && !tokens[i].startsWith("/")
						&& !tokens[i].startsWith("*") && !tokens[i].isEmpty()) {
					tokens[i] = "" + HexaToDecimal(tokens[i]);
				}
			}
		}
		// __________________________________________________________________________

		// Phase 1: Scan tokens
		for (String token : tokens) {
			if (token.length() == 0) // Blank space
				continue; // Back to the while loop to extract the next token
			else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
				// Process all +, -, *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '%' || operatorStack.peek() == '+'
						|| operatorStack.peek() == '-' || operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
					processAnOperator(operandStack, operatorStack);
				}

				// Push the + or - operator into the operator stack
				operatorStack.push(token.charAt(0));
			}
			// ........................................................................

			else if (token.charAt(0) == '!') {
				// Process all *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '!')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}
			// ........................................................................
			else if (token.charAt(0) == '^') {
				// Process all *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '^')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}
			
			else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%'
					|| token.charAt(0) == '^') {
				// Process all *, / in the top of the operator stack
				while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '^'
						|| operatorStack.peek() == '/' || operatorStack.peek() == '%')) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}

			// to push log & ln
			else if (token.trim().charAt(0) == 'l') {
				if (token.trim().charAt(1) == 'o')
					operatorStack.push('g'); // for push log
				else if (token.trim().charAt(1) == 'n')
					operatorStack.push('n'); // for push ln
			}

			// to push sin&sqrt
			else if (token.trim().charAt(0) == 's') {
				if (token.trim().charAt(3) == '(')
					operatorStack.push('i'); // Push 'sin' to stack
				else if (token.trim().charAt(3) == 'h')
					operatorStack.push('w'); // for push sinh
				else if (token.trim().charAt(1) == 'q')
					operatorStack.push('q'); // Push 'sqrt' to stack

			}

			// to push cos
			else if (token.trim().charAt(0) == 'c') {
				if (token.trim().charAt(3) == '(')
					operatorStack.push('c'); // Push 'cos' to stack
				else if (token.trim().charAt(3) == 'h')
					operatorStack.push('k'); // push cosh

			}

			// to push tan
			else if (token.trim().charAt(0) == 't') {
				if (token.trim().charAt(3) == '(')
					operatorStack.push('t'); // Push 'cos' to stack
				else if (token.trim().charAt(3) == 'h')
					operatorStack.push('u'); // for tanh

			}

			// Push the * or / operator into the operator stack
			else if (token.trim().charAt(0) == '(') {

				operatorStack.push('('); // Push '(' to stack
			}

			/*
			 * else if (token.trim().charAt(0) == 'x') {
			 * operatorStack.push('x'); // Push '(' to stack }
			 */

			else if (token.trim().charAt(0) == ')') { // Process all the
														// operators in the
														// stack until seeing
														// '('

				while (operatorStack.peek() != '(' && operatorStack.peek() != 'i' && operatorStack.peek() != 't'
						&& operatorStack.peek() != 'c' && operatorStack.peek() != 'q' && operatorStack.peek() != 'w'
						&& operatorStack.peek() != 'u' && operatorStack.peek() != 'k' && operatorStack.peek() != 'g'
						&& operatorStack.peek() != 'n') {
					processAnOperator(operandStack, operatorStack);
				}
				if (operatorStack.peek() == '(')
					operatorStack.pop(); // Pop the '(' symbol from the stack
				else if (operatorStack.peek() == 'i') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.sin(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.sin(operandStack.pop()*(Math.PI/180))*precision)/precision));					operatorStack.pop(); // Pop the 'sin' symbol from the stack
					operatorStack.pop(); // Pop the 'sin' symbol from the stack

				} else if (operatorStack.peek() == 'c') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.cos(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.cos(operandStack.pop()*(Math.PI/180))*precision)/precision));
					operatorStack.pop(); // Pop the 'cos' symbol from the stack
	
				} else if (operatorStack.peek() == 'w') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.sinh(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.sinh(operandStack.pop()*(Math.PI/180))*precision)/precision));
					operatorStack.pop(); // Pop the 'sinh' symbol from the stack
	
				} else if (operatorStack.peek() == 'k') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.cosh(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.cosh(operandStack.pop()*(Math.PI/180))*precision)/precision));
					operatorStack.pop(); // Pop the 'cosh' symbol from the stack
	
				} else if (operatorStack.peek() == 'u') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.tanh(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.tanh(operandStack.pop()*(Math.PI/180))*precision)/precision));
					operatorStack.pop(); // Pop the 'tanh' symbol from the stack
	
				} else if (operatorStack.peek() == 't') {
					if(Scientific.count%2!=0)
						operandStack.push(Math.tan(operandStack.pop()));
					else
					operandStack.push(((double) Math.round(Math.tan(operandStack.pop()*(Math.PI/180))*precision)/precision));//degree
					operatorStack.pop(); // Pop the 'tan' symbol from the stack
					} else if (operatorStack.peek() == 'q') {
					operandStack.push(Math.sqrt(operandStack.pop()));
					operatorStack.pop(); // Pop the 'sqrt' symbol from the stack

				} else if (operatorStack.peek() == 'g') {
					operandStack.push(Math.log10(operandStack.pop()));
					operatorStack.pop(); // Pop the 'sqrt' symbol from the stack

				} else if (operatorStack.peek() == 'n') {
					operandStack.push(Math.log(operandStack.pop()));
					operatorStack.pop(); // Pop the 'sqrt' symbol from the stack

				}

			} else { // An operand scanned
				// Push an operand to the stack
				operandStack.push(new Double(token));
			}
		}

		// Phase 2: Process all the remaining operators in the stack
		while (!operatorStack.isEmpty()) {
			processAnOperator(operandStack, operatorStack);
		}

		// Return the result
		return operandStack.pop();
	}

	/**
	 * Process one operator: Take an operator from operatorStack and apply it on
	 * the operands in the operandStack
	 */
	public static void processAnOperator(Stack<Double> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop();
		double op1 = operandStack.pop();
		double op2 = operandStack.pop();
		if (op == '+')
			operandStack.push(op2 + op1);
		else if (op == '-')
			operandStack.push(op2 - op1);
		else if (op == '*')
			operandStack.push(op2 * op1);
		else if (op == '%')
			operandStack.push(op2 % op1);
		else if (op == '/')
			operandStack.push(op2 / op1);
		else if (op == '^')
			operandStack.push(Math.pow(op2, op1));
		else if (op == '!') {
			operandStack.push(op2);
			operandStack.push(factorial(op1));
		}
	}

	public static String insertBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
					|| s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%' || s.charAt(i) == '^'
					|| s.charAt(i) == '!')
				result += " " + s.charAt(i) + " ";

			// to split cos
			else if (s.charAt(i) == 'c') {
				if (s.charAt(i + 3) == '(') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
					i += 3;
				} else if (s.charAt(i + 3) == 'h') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + s.charAt(i + 4)
							+ " ";
					i += 4;
				}
			}
			// to split tan
			else if (s.charAt(i) == 't') {
				if (s.charAt(i + 3) == '(') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
					i += 3;
				} else if (s.charAt(i + 3) == 'h') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + s.charAt(i + 4)
							+ " ";
					i += 4;
				}
			}
			// to split sin & sqrt
			else if (s.charAt(i) == 's') {
				if (s.charAt(i + 3) == '(') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
					i += 3;
				} else if (s.charAt(i + 1) == 'q') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + s.charAt(i + 4)
							+ " ";
					i += 4;
				}
				// ...............................................................................
				else if (s.charAt(i + 3) == 'h') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + s.charAt(i + 4)
							+ " ";
					i += 4;
				}
			}
			// ...............................................................................
			else if (s.charAt(i) == 'l') {
				if (s.charAt(i + 1) == 'o') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
					i += 3;
				} else if (s.charAt(i + 1) == 'n') {
					result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + " ";
					i += 2;
				}
			}

			else
				result += s.charAt(i);
		}
		// System.out.println(result);
		return result;
	}

	// .......................................................................................
	public static double factorial(double n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	// ___________________from binary to
	// decimal_________________________________________________________
	public static int BinaryToDecimal(String str) {
		double j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				j = j + Math.pow(2, str.length() - 1 - i);
			}
		}
		return (int) j;
	}

	// ___________________from Octal to
	// decimal_________________________________________________________
	public static int OctalToDecimal(String str) {
		int octnum = Integer.parseInt(str);
		int decnum = 0;
		int i = 0;
		while (octnum != 0) {
			decnum = decnum + (octnum % 10) * (int) Math.pow(8, i);
			i++;
			octnum = octnum / 10;
		}
		return decnum;
	}
	// ___________________from Hexa to
	// Decimal_________________________________________________________

	public static int HexaToDecimal(String s) {
		String digits = "0123456789ABCDEF";
		s = s.toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		return val;
	}

	// ___________________Set
	// Binary,Octal,Hexa________________________________________________________
	public static void setBase(int Base) {
		if (Base == 2) {
			binary = true;
			octal = false;
			hexa = false;
			decimal = false;
		}
		if (Base == 8) {
			binary = false;
			octal = true;
			hexa = false;
			decimal = false;
		}
		if (Base == 10) {
			binary = false;
			octal = false;
			hexa = false;
			decimal = true;
		}
		if (Base == 16) {
			binary = false;
			octal = false;
			hexa = true;
			decimal = false;
		}
	}

}
