package P;

import java.util.Stack;
import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application 
{
	private GridPane container;
	private Label lbl_answer;
	private Button btn_add, btn_sub, btn_div, btn_mul, btn_clear,
		    btn_dot, btn_openBra, btn_closeBra, btn_square,
   		    btn_sqrt, btn_delete, btn_exqual,
   		    btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
   		    btn_7, btn_8, btn_9, btn_0, btn_lg, btn_log;
	
    @Override
    public void start(Stage primaryStage)
    {            
       InitiateComponents(); 	 
       ResizeComponents();
       SetStyles();
       AddComponents();
       EventHandler();
       
       Scene scene = new Scene(container, 350, 550);
       
       primaryStage.fullScreenExitHintProperty().set("");
       primaryStage.setFullScreen(true);
       primaryStage.centerOnScreen();
       primaryStage.setTitle("3MG Calculator");
       primaryStage.setScene(scene);
       primaryStage.show();
       
    }
   
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    private void InitiateComponents()
    {
    	container = new GridPane();
    	btn_add = new Button("+");
    	btn_sub = new Button("-");
    	btn_div = new Button("/");
    	btn_mul = new Button("*");
    	btn_clear = new Button("C");
    	btn_dot = new Button(".");
    	btn_openBra = new Button("(");
    	btn_closeBra = new Button(")");
    	btn_square = new Button("^2");
    	btn_sqrt = new Button("S");
    	btn_delete = new Button("<-");
    	btn_exqual = new Button("=");
    	btn_1 = new Button("1");
    	btn_2 = new Button("2");
    	btn_3 = new Button("3");
    	btn_4 = new Button("4");
    	btn_5 = new Button("5");
    	btn_6 = new Button("6");
    	btn_7 = new Button("7");
    	btn_8 = new Button("8");
    	btn_9 = new Button("9");
    	btn_0 = new Button("0");
    	btn_log = new Button("log");
    	btn_lg = new Button("lg");
    	lbl_answer = new Label();
    }
   
    private void ResizeComponents()
    {
    	lbl_answer.prefWidthProperty().bind(container.widthProperty().subtract(15));
        lbl_answer.prefHeightProperty().bind(container.heightProperty().divide(2));
        
        DoubleBinding btn_width = container.widthProperty().divide(3);
        DoubleBinding btn_height = container.heightProperty().subtract(35).divide(9);
        
        //reset width to all button on changing in container's width
        btn_add.prefWidthProperty().bind(btn_width);
     	btn_sub.prefWidthProperty().bind(btn_width);
     	btn_div.prefWidthProperty().bind(btn_width);
     	btn_mul.prefWidthProperty().bind(btn_width);
     	btn_clear.prefWidthProperty().bind(btn_width);
     	btn_dot.prefWidthProperty().bind(btn_width);
     	btn_openBra.prefWidthProperty().bind(btn_width);
     	btn_closeBra.prefWidthProperty().bind(btn_width);
     	btn_square.prefWidthProperty().bind(btn_width);
     	btn_sqrt.prefWidthProperty().bind(btn_width);
     	btn_delete.prefWidthProperty().bind(btn_width);
     	btn_exqual.prefWidthProperty().bind(btn_width);
     	
     	btn_1.prefWidthProperty().bind(btn_width);
     	btn_2.prefWidthProperty().bind(btn_width);
     	btn_3.prefWidthProperty().bind(btn_width);
     	btn_4.prefWidthProperty().bind(btn_width);
     	btn_5.prefWidthProperty().bind(btn_width);
     	btn_6.prefWidthProperty().bind(btn_width);
     	btn_7.prefWidthProperty().bind(btn_width);
     	btn_8.prefWidthProperty().bind(btn_width);
     	btn_9.prefWidthProperty().bind(btn_width);
     	btn_0.prefWidthProperty().bind(btn_width);
     	btn_lg.prefWidthProperty().bind(btn_width);
     	btn_log.prefWidthProperty().bind(btn_width);
     	
     	//reset height to all button on changing in container's height
     	btn_add.prefHeightProperty().bind(btn_height);
     	btn_sub.prefHeightProperty().bind(btn_height);
     	btn_div.prefHeightProperty().bind(btn_height);
     	btn_mul.prefHeightProperty().bind(btn_height);
     	btn_clear.prefHeightProperty().bind(btn_height);
     	btn_dot.prefHeightProperty().bind(btn_height);
     	btn_openBra.prefHeightProperty().bind(btn_height);
     	btn_closeBra.prefHeightProperty().bind(btn_height);
     	btn_square.prefHeightProperty().bind(btn_height);
     	btn_sqrt.prefHeightProperty().bind(btn_height);
     	btn_delete.prefHeightProperty().bind(btn_height);
     	btn_exqual.prefHeightProperty().bind(btn_height);
     	
     	btn_1.prefHeightProperty().bind(btn_height);
     	btn_2.prefHeightProperty().bind(btn_height);
     	btn_3.prefHeightProperty().bind(btn_height);
     	btn_4.prefHeightProperty().bind(btn_height);
     	btn_5.prefHeightProperty().bind(btn_height);
     	btn_6.prefHeightProperty().bind(btn_height);
     	btn_7.prefHeightProperty().bind(btn_height);
     	btn_8.prefHeightProperty().bind(btn_height);
     	btn_9.prefHeightProperty().bind(btn_height);
     	btn_0.prefHeightProperty().bind(btn_height);
     	btn_log.prefHeightProperty().bind(btn_height);
     	btn_lg.prefHeightProperty().bind(btn_height);
    }
    
    private void AddComponents()
    {  	    
         container.add(lbl_answer,1,1,6,2);
         
         //Add column 1
         container.add(btn_openBra,1,4);
         container.add(btn_sqrt,1,5);
         container.add(btn_7,1,6);
         container.add(btn_4,1,7);
         container.add(btn_1,1,8);
         container.add(btn_0,1,9);

         //Add column 2
         container.add(btn_closeBra,2,4);
         container.add(btn_square,2,5); 
         container.add(btn_8,2,6);
         container.add(btn_5,2,7);
         container.add(btn_2,2,8);
         container.add(btn_dot,2,9);

         //Add column 3
         container.add(btn_clear,3,4);
         container.add(btn_lg,3,5);
         container.add(btn_9,3,6);
         container.add(btn_6,3,7);
         container.add(btn_3,3,8);
         container.add(btn_exqual,3,9);
         
         //Add column 4
         container.add(btn_delete,4,4);
         container.add(btn_log,4,5);
         container.add(btn_add,4,6);
         container.add(btn_sub,4,7);
         container.add(btn_mul,4,8);
         container.add(btn_div,4,9);
         
    }
    
    private void SetStyles()
    {
        container.setHgap(5);
        container.setVgap(5);
        container.setAlignment(Pos.CENTER);
    	container.setStyle("-fx-base: rgb(46, 46, 46);");
    	
    	lbl_answer.setStyle("-fx-border-radius: 0; " +
			    		   "-fx-background-radius: 0;"+
			    		   "-fx-background-color: rgb(30, 30, 30);"+
			    		   "-fx-border-color: rgb(150, 30, 30);"+
			    		   "-fx-font: 28pt Serif;");
    	
    	String style_to_all_button = "-fx-background-radius: "+
    			"0;-fx-base: rgb(46, 46, 46); -fx-font: 18pt Serif;";
    	
    	btn_exqual.setStyle("-fx-background-radius: 0; -fx-base: #C0392b");
    	btn_add.setStyle(style_to_all_button);
     	btn_sub.setStyle(style_to_all_button);
     	btn_div.setStyle(style_to_all_button);
     	btn_mul.setStyle(style_to_all_button);
     	
     	btn_clear.setStyle(style_to_all_button);
     	btn_openBra.setStyle(style_to_all_button);
     	btn_closeBra.setStyle(style_to_all_button);
     	btn_square.setStyle(style_to_all_button);
     	btn_sqrt.setStyle(style_to_all_button);
     	btn_delete.setStyle(style_to_all_button);
     	btn_log.setStyle(style_to_all_button);
     	btn_lg.setStyle(style_to_all_button);
     	
     	btn_dot.setStyle(style_to_all_button);
     	btn_1.setStyle(style_to_all_button);
     	btn_2.setStyle(style_to_all_button);
     	btn_3.setStyle(style_to_all_button);
     	btn_4.setStyle(style_to_all_button);
     	btn_5.setStyle(style_to_all_button);
     	btn_6.setStyle(style_to_all_button);
     	btn_7.setStyle(style_to_all_button);
     	btn_8.setStyle(style_to_all_button);
     	btn_9.setStyle(style_to_all_button);
     	btn_0.setStyle(style_to_all_button);
    }
    
    private void EventHandler()
    {
       	lbl_answer.setText(" ");
       	
       	//check the lbl_answer if it is valid or not before writing 
        btn_0.setOnAction(e->{chk(lbl_answer.getText(),"0");});
	   	btn_1.setOnAction(e->{chk(lbl_answer.getText(),"1");});
	   	btn_2.setOnAction(e->{chk(lbl_answer.getText(),"2");});
	   	btn_3.setOnAction(e->{chk(lbl_answer.getText(),"3");});
	   	btn_4.setOnAction(e->{chk(lbl_answer.getText(),"4");});
	   	btn_5.setOnAction(e->{chk(lbl_answer.getText(),"5");});
	   	btn_6.setOnAction(e->{chk(lbl_answer.getText(),"6");});
	   	btn_7.setOnAction(e->{chk(lbl_answer.getText(),"7");});
	   	btn_8.setOnAction(e->{chk(lbl_answer.getText(),"8");});
	   	btn_9.setOnAction(e->{chk(lbl_answer.getText(),"9");});
	   	btn_dot.setOnAction(e->{chk(lbl_answer.getText(),".");});
	   	
	   	btn_add.setOnAction(e->{chk(lbl_answer.getText()," + ");});
    	btn_sub.setOnAction(e->{chk(lbl_answer.getText()," - ");});
    	btn_div.setOnAction(e->{chk(lbl_answer.getText()," / ");});
    	btn_mul.setOnAction(e->{chk(lbl_answer.getText()," * ");});
    	
    	btn_openBra.setOnAction(e->{chk(lbl_answer.getText()," ( ");});
    	btn_closeBra.setOnAction(e->{chk(lbl_answer.getText()," ) ");});
    	btn_square.setOnAction(e->{chk(lbl_answer.getText(),"^2 ");});
    	btn_sqrt.setOnAction(e->{chk(lbl_answer.getText()," sqrt");});
    	btn_log.setOnAction(e->{chk(lbl_answer.getText()," log");});
    	btn_lg.setOnAction(e->{chk(lbl_answer.getText()," log");});
    	
    	btn_clear.setOnAction(e->{chk(lbl_answer.getText(),"Clear");});
    	btn_delete.setOnAction(e->{Delete(lbl_answer.getText());});
    	btn_exqual.setOnAction(e->{Calculate(lbl_answer.getText());});
    }
    
    private void chk(String exp,String op_num)
    {
    	//reset style to label if the size of string is bigger than label's width
    	String lbl_answer_style = "-fx-border-radius: 0; " +
	    		   "-fx-background-radius: 0;"+
	    		   "-fx-background-color: rgb(30, 30, 30);"+
	    		   "-fx-border-color: rgb(150, 30, 30);";
    		    	
    	//check the font 
	    	boolean b = false;
    		if(lbl_answer.getFont().getSize()-9<=10 && 
    				exp.length()*lbl_answer.getFont().getSize()/2>lbl_answer.getWidth())
    			b = true;
    	
    	//check for clear word or error word or error calculation
    	boolean enter = false;
		if( exp.startsWith(" Error") || b==true || op_num=="Clear" || op_num=="Error" || op_num=="Equal")
		{
			if(op_num=="Error" || b==true)
				lbl_answer.setText(" Error");
			if(op_num=="Clear" || exp.startsWith(" Error"))
				lbl_answer.setText(" ");
			lbl_answer_style += "-fx-font: 28pt Serif;";
			lbl_answer.setStyle(lbl_answer_style);
			enter = true;
		}
		
		//add the number or operator
		if(op_num!="Clear" && op_num!="Error" && !b)
		lbl_answer.setText(lbl_answer.getText()+op_num);
		
		if(!enter&&exp.length()*lbl_answer.getFont().getSize()/2>lbl_answer.getWidth())
		{
			int lbl_answer_font_size = (int)lbl_answer.getFont().getSize()-9;
			lbl_answer_style += "-fx-font: "+lbl_answer_font_size+" Serif;";
			lbl_answer.setStyle(lbl_answer_style);
			return ;
		}
	}

	private void Calculate(String exp)
    {
		//check if brackets are validate or not
		int count = 0;
		for(int i=0;i<exp.length();i++)
			if(exp.charAt(i)=='(')
				count++;
			else if(exp.charAt(i)==')')
					count--;
		chk("","Equal");
		if(count!=0)
			{chk("","Error");return ;}
		double answer = 0;
		//calculate
		EvaluateExpression evalExp=new EvaluateExpression();
		answer=evalExp.evaluateExp(exp);
		lbl_answer.setText(" "+answer);
    }

    private void Delete(String exp)
    {
    	//delete anyone word if there is exist (log, lg, sqrt, Error )
    	while(exp.length()>1 &&exp.charAt(exp.length()-1)>='a' && exp.charAt(exp.length()-1)<='z')
    	{
    		exp = exp.substring(0, exp.length()-1);
    	}
    	//delete  ^2 if it is exist
    	if(exp.length()>2&&exp.charAt(exp.length()-3)=='^')
    		exp = exp.substring(0, exp.length()-2);
    	//delete any operator or brackets
    	else if(exp.length()>2)
    	{
    		switch(exp.charAt(exp.length()-2))
    		{
    			case '+':	case '-':
    			case '*':	case ')':
    			case '(':	case '/':
    			exp = exp.substring(0, exp.length()-2);
    		}
       	}
    	//delete number or space
    	if(exp.length()>1)
    		exp = exp.substring(0, exp.length()-1);
    	lbl_answer.setText(exp);
    }
    
  //.......................................................................

    public class EvaluateExpression{
    	EvaluateExpression(){}
    	public  double evaluateExp(String expression) {
    		 //  stack to store operands
    		 Stack<Double> operandStack = new Stack<>();

    		 // stack to store operators
    		 Stack<Character> operatorStack = new Stack<>();

    		 expression = insertBlanks(expression); 

    		// Extract operands and operators             
    		 String[] tokens = expression.split(" ");

    		 
    		 for (String token: tokens) {
    		 if (token.length() == 0) // Blank space
    		 continue; // Back to the while loop to extract the next token
    		 else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
    		 // Process all +, -, *, / in the top of the operator stack
    		 while (!operatorStack.isEmpty() &&
    		 (operatorStack.peek() == '+' ||
    		 operatorStack.peek() == '-' ||
    		 operatorStack.peek() == '*' ||
    		 operatorStack.peek() == '/')) {
    		 processAnOperator(operandStack, operatorStack); 
    		 }

    		 // Push the + or - operator into the operator stack
    		 operatorStack.push(token.charAt(0));
    		 }
    		 else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
    		 // Process all *, / in the top of the operator stack
    		 while (!operatorStack.isEmpty() &&
    		 (operatorStack.peek() == '*' ||
    		 operatorStack.peek() == '/')) {
    		processAnOperator(operandStack, operatorStack);   
    		 }

    		 // Push the * or / operator into the operator stack
    		 operatorStack.push(token.charAt(0));
    		 }
    		 else if (token.trim().charAt(0) == '(') {
    		 operatorStack.push('('); // Push '(' to stack
    		 }
    		 else if (token.trim().charAt(0) == ')') { 
    			
    		 while (operatorStack.peek() != '(') {
    		 processAnOperator(operandStack, operatorStack); 
    		 }

    		 operatorStack.pop(); 
    		 }
    		 else { 
    		 // Push an operand to the stack
    		 operandStack.push(new Double(token));
    		 }
    		 }

    		 while (!operatorStack.isEmpty()) {
    		processAnOperator(operandStack, operatorStack); 
    		 }

    		 return operandStack.pop();
    		 }
    }
    public static void processAnOperator(
    		 Stack<Double> operandStack, Stack<Character> operatorStack) {
    		 char op = operatorStack.pop();
    		 double op1 = operandStack.pop();
    		 double op2 = operandStack.pop();
    		if (op == '+')
    		operandStack.push(op2 + op1);
    		 else if (op == '-')
    		 operandStack.push(op2 - op1);
    		 else if (op == '*')
    		 operandStack.push(op2 * op1);
    		 else if (op == '/')
    		 operandStack.push(op2 / op1);
    		 }
    		public static String insertBlanks(String s) {
    		 String result = "";
    		
    		 for (int i = 0; i < s.length(); i++) {
    		 if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
    		 s.charAt(i) == '+' || s.charAt(i) == '-' ||
    		 s.charAt(i) == '*' || s.charAt(i) == '/')
    		 result += " " + s.charAt(i) + " ";
    		 else
    		 result += s.charAt(i);
    		 }
    		
    		 return result;
    		 }
    }
   
