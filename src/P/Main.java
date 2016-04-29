package P;

import java.util.Stack;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application 
{
	private short desgin = 1;
	private GridPane container;
	private Label lbl_answer;
	private Button  btnscene1,btn_add, btn_sub, btn_div, btn_mul, btn_clear,
		    btn_dot, btn_openBra, btn_closeBra, btn_square,
   		    btn_sqrt, btn_delete, btn_equal, btn_PI,
   		    btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
   		    btn_7, btn_8, btn_9, btn_0, btn_lg, btn_log,
   		    btn_mod, btn_sin, btn_cos, btn_tan,
   		    btn_sinh, btn_cosh, btn_tanh, btn_fact;
	private  Scene scene1;
 	private  Scene scene2;
 	private  Stage thestage;
    
    @Override
    public void start(Stage primaryStage)
    {
    	 thestage=primaryStage;
     	
       initiateComponents(); 	 
       resizeComponents();
       design1(); //Default Design
       setStyles();
       eventHandler();

       
       btnscene1=new Button("Swap to go to calcuator");
       btnscene1.setStyle("-fx-background-radius: 0; -fx-base: #C0392b; -fx-font: 20pt Serif; opacity:30%");
       btnscene1.setOnAction(e-> ButtonClicked(e));

       scene1 = new Scene(btnscene1, 200, 100);
        scene2 = new Scene(container, 350, 550);
       primaryStage.setFullScreenExitHint("");
       primaryStage.setFullScreen(true);
       primaryStage.centerOnScreen();
       primaryStage.setTitle("3MG Calculator");
       primaryStage.setScene(scene1);
       primaryStage.show();
    }
   
	public static void main(String[] args) 
    {
        launch(args);
    }
    
    private void initiateComponents()
    {
    	container = new GridPane();
    	btn_add = new Button("+");
    	btn_sub = new Button("-");
    	btn_div = new Button("/");
    	btn_mul = new Button("*");
    	btn_clear = new Button("AC");
    	btn_dot = new Button(".");
    	btn_openBra = new Button("(");
    	btn_closeBra = new Button(")");
    	btn_square = new Button("^2");
    	btn_sqrt = new Button("S");
    	btn_delete = new Button("C");
    	btn_equal = new Button("=");
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
    	btn_mod = new Button("%");
    	btn_sin = new Button("Sin");
    	btn_cos = new Button("Cos");
    	btn_tan = new Button("Tan");
    	btn_sinh = new Button("Sinh");
    	btn_cosh = new Button("Cosh");
    	btn_tanh = new Button("Tanh");
    	btn_fact = new Button("!");
    	btn_PI = new Button("PI");
    	lbl_answer = new Label();
    }
  
    private void resizeComponents()
    {
    	DoubleBinding btn_height;
    	DoubleBinding btn_width;
    	if(desgin==1)
    	{
    		lbl_answer.prefHeightProperty().bind(container.heightProperty().divide(4));
    		btn_height = container.heightProperty().divide(9);
    		btn_width = container.widthProperty().divide(3);
    		btn_0.prefWidthProperty().bind(btn_width.divide(1.45));
    	}
    	else
    	{
    		lbl_answer.prefHeightProperty().bind(container.heightProperty().multiply(8));
    		btn_height = container.heightProperty().divide(8);
    		btn_width = container.widthProperty().divide(7).subtract(7);
    		btn_0.prefWidthProperty().bind(btn_width.multiply(2.05));
    	}
    	
    	lbl_answer.prefWidthProperty().bind(container.widthProperty().subtract(15)); 
        
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
     	btn_sin.prefWidthProperty().bind(btn_width);
     	btn_cos.prefWidthProperty().bind(btn_width);
     	btn_tan.prefWidthProperty().bind(btn_width);
     	btn_sinh.prefWidthProperty().bind(btn_width);
     	btn_cosh.prefWidthProperty().bind(btn_width);
     	btn_tanh.prefWidthProperty().bind(btn_width);
     	btn_fact.prefWidthProperty().bind(btn_width);
     	btn_mod.prefWidthProperty().bind(btn_width);
     	btn_mod.prefWidthProperty().bind(btn_width);
     	btn_PI.prefWidthProperty().bind(btn_width);
     	btn_equal.prefWidthProperty().bind(btn_width);
     	
     	btn_1.prefWidthProperty().bind(btn_width);
     	btn_2.prefWidthProperty().bind(btn_width);
     	btn_3.prefWidthProperty().bind(btn_width);
     	btn_4.prefWidthProperty().bind(btn_width);
     	btn_5.prefWidthProperty().bind(btn_width);
     	btn_6.prefWidthProperty().bind(btn_width);
     	btn_7.prefWidthProperty().bind(btn_width);
     	btn_8.prefWidthProperty().bind(btn_width);
     	btn_9.prefWidthProperty().bind(btn_width);
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
     	btn_equal.prefHeightProperty().bind(btn_height.multiply(2.1));
     	btn_sin.prefHeightProperty().bind(btn_height);
     	btn_cos.prefHeightProperty().bind(btn_height);
     	btn_tan.prefHeightProperty().bind(btn_height);
     	btn_sinh.prefHeightProperty().bind(btn_height);
     	btn_cosh.prefHeightProperty().bind(btn_height);
     	btn_tanh.prefHeightProperty().bind(btn_height);
     	btn_fact.prefHeightProperty().bind(btn_height);
     	btn_mod.prefHeightProperty().bind(btn_height);
     	btn_PI.prefHeightProperty().bind(btn_height);
     	
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
    
    private void design1()
    {  	    
    	desgin=1;
    	container.getChildren().clear();
         container.add(lbl_answer,1,1,6,2);
         
         //Add column 1
         container.add(btn_sqrt,1,4);
         container.add(btn_openBra,1,5);
         container.add(btn_7,1,6);
         container.add(btn_4,1,7);
         container.add(btn_1,1,8);
         container.add(btn_0,1,9);

         //Add column 2
         container.add(btn_square,2,4);
         container.add(btn_closeBra,2,5); 
         container.add(btn_8,2,6);
         container.add(btn_5,2,7);
         container.add(btn_2,2,8);
         container.add(btn_dot,2,9);

         //Add column 3
         container.add(btn_clear,3,4);
         container.add(btn_mul,3,5);
         container.add(btn_9,3,6);
         container.add(btn_6,3,7);
         container.add(btn_3,3,8);
         container.add(btn_mod,3,9);
         
         //Add column 4
         container.add(btn_delete,4,4);
         container.add(btn_div,4,5);
         container.add(btn_add,4,6);
         container.add(btn_sub,4,7);
         container.add(btn_equal,4,8,1,2);
         resizeComponents();
         setStyles();
         if(lbl_answer.getText().isEmpty())
        	 check("Clear");
         else
        	 check("Equal");
    }
    
    private void design2()
    {  	    
    	 desgin=2;
    	 container.getChildren().clear();
         container.add(lbl_answer,1,1,7,3);
         
         //Add row 1
         container.add(btn_clear,1,4);
         container.add(btn_delete,2,4);
         container.add(btn_PI,3,4);
         container.add(btn_openBra,4,4);
         container.add(btn_closeBra,5,4);
         container.add(btn_mul,6,4);
         container.add(btn_div,7,4);
         
         //Add row 2
         container.add(btn_log,1,5);
         container.add(btn_lg,2,5);
         container.add(btn_fact,3,5);
         container.add(btn_7,4,5);
         container.add(btn_8,5,5);
         container.add(btn_9,6,5);
         container.add(btn_sub,7,5);
         
         //Add row 3
         container.add(btn_sqrt,1,6);
         container.add(btn_square,2,6);
         container.add(btn_mod,3,6);
         container.add(btn_4,4,6);
         container.add(btn_5,5,6);
         container.add(btn_6,6,6);
         container.add(btn_add,7,6);
         
         //Add row 4
         container.add(btn_sin,1,7);
         container.add(btn_cos,2,7);
         container.add(btn_tan,3,7);
         container.add(btn_1,4,7);
         container.add(btn_2,5,7);
         container.add(btn_3,6,7);
         container.add(btn_equal,7,7);
         
       //Add row 5
         container.add(btn_sinh,1,8);
         container.add(btn_cosh,2,8);
         container.add(btn_tanh,3,8);
         container.add(btn_0,4,8,2,1);
         container.add(btn_dot,6,8);
         
         resizeComponents();
         setStyles();
         if(lbl_answer.getText().isEmpty())
        	 check("Clear");
         else
        	 check("Equal");
    }
    
    private void setStyles()
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
    	
    	String style1_to_button = "-fx-background-radius: "+
    			"0;-fx-base: rgb(46, 46, 46); -fx-font: 18pt Serif;";
    	
    	String style2_to_button = "-fx-background-radius: "+
    			"0;-fx-base: rgb(30, 30, 30); -fx-font: 15pt Serif;";
    	
    	btn_equal.setStyle("-fx-background-radius: 0; -fx-base: #C0392b; -fx-font: 20pt Serif;");
    	
    	if(desgin==1)
    		style2_to_button= style1_to_button;
    		
     	btn_PI.setStyle(style2_to_button);
     	btn_sin.setStyle(style2_to_button);
     	btn_cos.setStyle(style2_to_button);
     	btn_tan.setStyle(style2_to_button);
     	btn_sinh.setStyle(style2_to_button);
     	btn_cosh.setStyle(style2_to_button);
     	btn_tanh.setStyle(style2_to_button);
     	btn_mod.setStyle(style2_to_button);
     	btn_fact.setStyle(style2_to_button);
     	btn_clear.setStyle(style2_to_button);
     	btn_square.setStyle(style2_to_button);
     	btn_sqrt.setStyle(style2_to_button);
     	btn_delete.setStyle(style2_to_button);
     	btn_log.setStyle(style2_to_button);
     	btn_lg.setStyle(style2_to_button);
     	

     	btn_openBra.setStyle(style1_to_button);
     	btn_closeBra.setStyle(style1_to_button);
     	btn_add.setStyle(style1_to_button);
     	btn_sub.setStyle(style1_to_button);
     	btn_div.setStyle(style1_to_button);
     	btn_mul.setStyle(style1_to_button);
     	btn_dot.setStyle(style1_to_button);
     	btn_1.setStyle(style1_to_button);
     	btn_2.setStyle(style1_to_button);
     	btn_3.setStyle(style1_to_button);
     	btn_4.setStyle(style1_to_button);
     	btn_5.setStyle(style1_to_button);
     	btn_6.setStyle(style1_to_button);
     	btn_7.setStyle(style1_to_button);
     	btn_8.setStyle(style1_to_button);
     	btn_9.setStyle(style1_to_button);
     	btn_0.setStyle(style1_to_button);
    }
    
    private void eventHandler()
    {
       	lbl_answer.setText(" ");
       	
       	//check the lbl_answer if it is valid or not before writing 
        btn_0.setOnAction(e->{check("0");});
	   	btn_1.setOnAction(e->{check("1");});
	   	btn_2.setOnAction(e->{check("2");});
	   	btn_3.setOnAction(e->{check("3");});
	   	btn_4.setOnAction(e->{check("4");});
	   	btn_5.setOnAction(e->{check("5");});
	   	btn_6.setOnAction(e->{check("6");});
	   	btn_7.setOnAction(e->{check("7");});
	   	btn_8.setOnAction(e->{check("8");});
	   	btn_9.setOnAction(e->{check("9");});
	   	btn_dot.setOnAction(e->{check(".");});
	   	
	   	btn_add.setOnAction(e->{check(" + ");});
    	btn_sub.setOnAction(e->{check(" - ");});
    	btn_div.setOnAction(e->{check(" / ");});
    	btn_mul.setOnAction(e->{check(" * ");});
    	btn_mod.setOnAction(e->{check(" % ");});
    	
    	btn_openBra.setOnAction(e->{check(" ( ");});
    	btn_closeBra.setOnAction(e->{check(" ) ");});
    	btn_square.setOnAction(e->{check(" ^2");});
    	btn_sqrt.setOnAction(e->{check(" sqrt( ");});
    	btn_log.setOnAction(e->{check(" log( ");});
    	btn_lg.setOnAction(e->{check(" lg( ");});
    	
    	btn_sin.setOnAction(e->{check(" sin( ");});
    	btn_cos.setOnAction(e->{check(" cos( ");});
    	btn_tan.setOnAction(e->{check(" tan( ");});
    	btn_sinh.setOnAction(e->{check(" sinh( ");});
    	btn_cosh.setOnAction(e->{check(" cosh( ");});
    	btn_tanh.setOnAction(e->{check(" tanh( ");});
    	btn_fact.setOnAction(e->{check(" !");});
    	btn_PI.setOnAction(e->{check(" PI");});
    	
    	
    	btn_clear.setOnAction(e->{check("Clear");});
    	btn_delete.setOnAction(e->{delete(lbl_answer.getText());});
    	btn_equal.setOnAction(e->{calculate(lbl_answer.getText());});
    	
    	
    	// close on escape button (back button in android)
    	container.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ESCAPE)
					System.exit(0);
			}
    		
		});
    	
    	//if the size changed, the design will change
    	 container.widthProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
      	    	if(container.heightProperty().doubleValue()>
      	    	container.widthProperty().doubleValue() )
      	    		design1();
      	    	else
      	    		design2();
      	    }
      	});
         
         container.heightProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
      	       if(container.heightProperty().doubleValue()<=
      	    		  container.widthProperty().doubleValue() )
      	    	   design2();
      	       else
      	    	   design1();
      	    }
      	});
         
         //if the text's length is larger than label's size ,the text's font will change
         lbl_answer.textProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable arg0) {
				
				double numbers = 0;
				double symbol = 0;
				double space = 0;
				for(int i=0;i<lbl_answer.getText().length();i++)
					if(lbl_answer.getText().charAt(i)<='9'&&lbl_answer.getText().charAt(i)>='0')
						numbers++;
					else if (lbl_answer.getText().charAt(i)==' ')
						space++;
					else
						symbol++;
				double numbers_font_size = numbers*lbl_answer.getFont().getSize()/2;
				double symbol_font_size = symbol/1.5*lbl_answer.getFont().getSize()/2;
				double space_font_size = space*lbl_answer.getFont().getSize()/3;
				String lbl_answer_style = "-fx-border-radius: 0; " +
			    		   "-fx-background-radius: 0;"+
			    		   "-fx-background-color: rgb(30, 30, 30);"+
			    		   "-fx-border-color: rgb(150, 30, 30);";
				int lbl_answer_font_size = (int)lbl_answer.getFont().getSize();
				if(numbers_font_size+symbol_font_size+space_font_size>lbl_answer.getWidth())
				{
					lbl_answer_font_size-=9;
					lbl_answer_style += "-fx-font: "+lbl_answer_font_size+" Serif;";
					lbl_answer.setStyle(lbl_answer_style);					
				}
				if(lbl_answer_font_size<19)
					check("Error");
			}
		}); 
       	
    }
    
    private void delete(String exp)
    {
    	//delete anyone word if there is( exist (log(, lg(, sqrt(, Error, Infinity,
    	// sin(, cos(, tan(, sinh(, cosh, tanh( )
    	if(exp.endsWith("sqrt( ")||exp.endsWith("sinh( ")||exp.endsWith("cosh( ")||exp.endsWith("tanh( "))
    		exp = exp.substring(0,exp.length()-6);
    	else if(exp.endsWith("log( ")||exp.endsWith("Error")||
    			exp.endsWith("sin( ")||exp.endsWith("cos( ")||exp.endsWith("tan( "))
    				exp = exp.substring(0,exp.length()-5);
    	else if(exp.endsWith("lg( "))
    		exp = exp.substring(0,exp.length()-4);
    	else if(exp.endsWith("Infinity"))
    		exp = exp.substring(0,exp.length()-8);
    		
    	
    	//delete  ^2 or PI or )! if it is exist
    	else if(exp.length()>2&&(exp.charAt(exp.length()-2)=='^'||
    			exp.charAt(exp.length()-2)=='P'||exp.charAt(exp.length()-2)==')'))
    		exp = exp.substring(0, exp.length()-3);
    	//delete any operator or brackets
    	else if(exp.length()>2&&exp.charAt(exp.length()-1)==' ')
    	{
    		switch(exp.charAt(exp.length()-2))
    		{
    			case '+':	case '-':
    			case '*':	case ')':
    			case '(':	case '/':
    			case '%':
    			exp = exp.substring(0, exp.length()-2);
    		}
       	}
    	//delete number or space
    	if(exp.length()>1)
    		exp = exp.substring(0, exp.length()-1);
    	lbl_answer.setText(exp);
    }
    
    private void check(String op_num)
    {
    	//check for clear, error and Infinity words or error calculation
    	
		if( lbl_answer.getText().startsWith(" Error") || lbl_answer.getText().endsWith("Infinity") || op_num=="Clear" 
				|| op_num==(" Infinity") || op_num=="Error")
		{
			if(op_num=="Error")
				lbl_answer.setText(" Error");
			else if(op_num=="Clear" || lbl_answer.getText().startsWith(" Error")||lbl_answer.getText().startsWith(" Infinity"))
				lbl_answer.setText(" ");
			else if(op_num==(" Infinity"))
				lbl_answer.setText(" Infinity");
			setStyles();
		}
		
		//add the number or operator
		if(op_num!=" Infinity" && op_num!="Equal" && op_num!="Clear" && op_num!="Error")
		lbl_answer.setText(lbl_answer.getText()+op_num);
		
	}

    private void calculate(String exp)
    {
		//calculate
		double cal = 0;
		exp = exp.replaceAll("PI", ""+Math.PI);
		try
		{	
			
	    	if(new Double(cal).isInfinite())
	    		cal = Double.POSITIVE_INFINITY;
	    	else
	    	{
	    		//to handle -
	    			exp="0"+exp;
	    		cal = evaluateExpression(exp);
	    	}
		}
		catch(Exception e)
		{
			check("Error");return ;
		}
    	if(new Double(cal).isInfinite())
    		{check(" Infinity");}
    	else
    		{cal = evaluateExpression(exp);lbl_answer.setText(" "+cal);check("Equal");}
    }
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

	// Phase 1: Scan tokens
	for (String token : tokens) {
		if (token.length() == 0) // Blank space
			continue; // Back to the while loop to extract the next token
		else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
			// Process all +, -, *, / in the top of the operator stack
			while (!operatorStack.isEmpty() && (operatorStack.peek() == '%'
					||operatorStack.peek() == '+' || operatorStack.peek() == '-'
					|| operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
          			processAnOperator(operandStack, operatorStack);
			}

			// Push the + or - operator into the operator stack
			operatorStack.push(token.charAt(0));
		} 
		//........................................................................

		else if (token.charAt(0) == '!') {
			// Process all *, / in the top of the operator stack
			while (!operatorStack.isEmpty() && (operatorStack.peek() == '!')) {
				processAnOperator(operandStack, operatorStack);
			}
			operatorStack.push(token.charAt(0));
		}
		//........................................................................
		
		else if (token.charAt(0) == '^') {
			// Process all *, / in the top of the operator stack
			while (!operatorStack.isEmpty() && (operatorStack.peek() == '^')) {
				processAnOperator(operandStack, operatorStack);
			}operatorStack.push(token.charAt(0));
			}
		
	else if    (token.charAt(0)== '*' || 
				token.charAt(0) == '/'||
				token.charAt(0) == '%'||
				token.charAt(0) == '^') {
			// Process all *, / in the top of the operator stack
			while (!operatorStack.isEmpty() && (operatorStack.peek() == '*'||operatorStack.peek() == '^'
					||operatorStack.peek() == '/'|| operatorStack.peek() == '%')) {
				processAnOperator(operandStack, operatorStack);
			}
		//to push log & ln	
			operatorStack.push(token.charAt(0));
		} 
		
				//to push sin&sqrt
		else if (token.trim().charAt(0) == 's') {
			if(token.trim().charAt(3) == '(')
			operatorStack.push('i'); // Push 'sin' to stack
			else if(token.trim().charAt(3) == 'h')
				operatorStack.push('w'); //for push sinh
			else if(token.trim().charAt(1) == 'q')
				operatorStack.push('q'); // Push 'sqrt' to stack
				
		}
		
         //to push cos
		else if (token.trim().charAt(0) == 'c') {
			if(token.trim().charAt(3) == '(')
			operatorStack.push('c'); // Push 'cos' to stack
			else if(token.trim().charAt(3) == 'h')
				operatorStack.push('k'); //push cosh
				
		}
		

		 //to push tan
		else if (token.trim().charAt(0) == 't') {
			if(token.trim().charAt(3) == '(')
			    operatorStack.push('t'); // Push 'cos' to stack
			else if(token.trim().charAt(3) == 'h')
				operatorStack.push('u');  //for tanh 
				
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

			while ( operatorStack.peek() != '(' 
					&& operatorStack.peek() != 'i'&& operatorStack.peek() != 't'
					&& operatorStack.peek() != 'c'&& operatorStack.peek() != 'q'
					&& operatorStack.peek() != 'w'&& operatorStack.peek() != 'u'
					&& operatorStack.peek() != 'k') {
				processAnOperator(operandStack, operatorStack);
			}
			if (operatorStack.peek() == '(')
				operatorStack.pop(); // Pop the '(' symbol from the stack
						else if (operatorStack.peek() == 'i') {
				operandStack.push(Math.sin(operandStack.pop()*((int)Math.PI/180)));
				operatorStack.pop(); // Pop the 'sin' symbol from the stack

			}
			else if (operatorStack.peek() == 'c') {
				operandStack.push(Math.cos(operandStack.pop()*(Math.PI/180)));
				operatorStack.pop(); // Pop the 'cos' symbol from the stack

			}
			else if (operatorStack.peek() == 'w') {
				operandStack.push(Math.sinh(operandStack.pop()*(Math.PI/180)));
				operatorStack.pop(); // Pop the 'cos' symbol from the stack

			}
			else if (operatorStack.peek() == 'k') {
				operandStack.push(Math.cosh(operandStack.pop()*(Math.PI/180)));
				operatorStack.pop(); // Pop the 'cos' symbol from the stack

			}
			else if (operatorStack.peek() == 'u') {
				operandStack.push(Math.tanh(operandStack.pop()*(Math.PI/180)));
				operatorStack.pop(); // Pop the 'cos' symbol from the stack

			}
			else if (operatorStack.peek() == 't') {
				operandStack.push(Math.tan(operandStack.pop()*(Math.PI/180)));//degree
				operatorStack.pop(); // Pop the 'tan' symbol from the stack

			}
			else if (operatorStack.peek() == 'q') {
				operandStack.push(Math.sqrt(operandStack.pop()));
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
	else if (op == '!'){
		operandStack.push(op2);
		operandStack.push(factorial(op1));
}
}
public static String insertBlanks(String s) {
	String result = "";
	for (int i=0; i < s.length(); i++) {
		
	if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+'|| 
	    s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'||
	    s.charAt(i) == '%' || s.charAt(i) == '^'|| s.charAt(i) == '!')
			result += " " + s.charAt(i) + " ";
	 
		//to split cos
		else if(s.charAt(i)=='c')
		{
			if(s.charAt(i+3)=='('){
			result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
			i +=3;
			}
			else if(s.charAt(i+3)=='h'){
				result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + 
						s.charAt(i+4)+" ";
				i +=4;
			}
		}
		//to split  tan
		else if(s.charAt(i)=='t')
		{
			if(s.charAt(i+3)=='('){
			result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
			i +=3;
			}
			else if(s.charAt(i+3)=='h'){
				result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + 
						s.charAt(i+4)+" ";
				i +=4;
			}
		}
		//to split sin & sqrt
		else if(s.charAt(i)=='s')
		{
			if(s.charAt(i+3)=='(')
			{
				result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) + " ";
			    i +=3;
	     	}
			else if(s.charAt(i+1)=='q'){
				result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) +s.charAt(i+4)+ " ";
			    i +=4;
			}
			//...............................................................................
			else if(s.charAt(i+3)=='h'){
				result += " " + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2) + s.charAt(i + 3) +s.charAt(i+4)+" ";
			    i +=4;
			}
			
		}
			//...............................................................................

		
		else
			result += s.charAt(i);
	}
	//System.out.println(result);
	return result;
}
//.......................................................................................
public static double factorial(double n)
{
	if (n == 0)
		return 1;
	else
		return n * factorial(n-1);
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public void ButtonClicked(ActionEvent e)
{
    if (e.getSource()==btnscene1)
    {
    	thestage.setFullScreen(true);
    	thestage.centerOnScreen();
        thestage.setScene(scene2);
    }
    else
    {
    	thestage.setFullScreen(true);
    	thestage.centerOnScreen();
        thestage.setScene(scene1);
    }
}           

}
   
