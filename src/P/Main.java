package P;

import java.util.Stack;
import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application 
{
	private short desgin = 1;
	private GridPane container;
	private Label lbl_answer;
	private Button btn_add, btn_sub, btn_div, btn_mul, btn_clear,
		    btn_dot, btn_openBra, btn_closeBra, btn_square,
   		    btn_sqrt, btn_delete, btn_equal,
   		    btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
   		    btn_7, btn_8, btn_9, btn_0, btn_lg, btn_log;
	
    @Override
    public void start(Stage primaryStage)
    {            
       initiateComponents(); 	 
       resizeComponents();
       Design1(); //Default Design
       setStyles();
       eventHandler();
       Scene scene = new Scene(container, 350, 550);
       primaryStage.setFullScreenExitHint("");
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
    
    private void initiateComponents()
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
    	}
    	else
    	{
    		lbl_answer.prefHeightProperty().bind(container.heightProperty().divide(2));
    		btn_height = container.heightProperty().divide(7);
    		btn_width = container.widthProperty().divide(6).subtract(7);
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
     	btn_equal.prefHeightProperty().bind(btn_height);
     	
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
    
    private void Design1()
    {  	    
    	desgin=1;
    	container.getChildren().clear();
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
         container.add(btn_equal,3,9);
         
         //Add column 4
         container.add(btn_delete,4,4);
         container.add(btn_log,4,5);
         container.add(btn_add,4,6);
         container.add(btn_sub,4,7);
         container.add(btn_mul,4,8);
         container.add(btn_div,4,9);
         resizeComponents();
         if(lbl_answer.getText().isEmpty())
        	 check("Clear");
         else
        	 check("Equal");
    }
    
    private void Design2()
    {  	    
    	 desgin=2;
    	 container.getChildren().clear();
         container.add(lbl_answer,1,1,6,2);
         
         //Add row 1
         container.add(btn_7,1,3);
         container.add(btn_8,2,3);
         container.add(btn_9,3,3);
         container.add(btn_add,4,3);
         container.add(btn_openBra,5,3);
         container.add(btn_closeBra,6,3);
         
         //Add row 2
         container.add(btn_4,1,4);
         container.add(btn_5,2,4);
         container.add(btn_6,3,4);
         container.add(btn_sub,4,4);
         container.add(btn_sqrt,5,4);
         container.add(btn_square,6,4);
         
         //Add row 3
         container.add(btn_1,1,5);
         container.add(btn_2,2,5);
         container.add(btn_3,3,5);
         container.add(btn_mul,4,5);
         container.add(btn_clear,5,5);
         container.add(btn_delete,6,5);
         
         //Add row 4
         container.add(btn_0,1,6);
         container.add(btn_dot,2,6);
         container.add(btn_equal,3,6);
         container.add(btn_div,4,6);
         container.add(btn_log,5,6);
         container.add(btn_lg,6,6);
         resizeComponents();
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
    	
    	String style_to_all_button = "-fx-background-radius: "+
    			"0;-fx-base: rgb(46, 46, 46); -fx-font: 18pt Serif;";
    	
    	btn_equal.setStyle("-fx-background-radius: 0; -fx-base: #C0392b; -fx-font: 20pt Serif;");
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
    	
    	btn_openBra.setOnAction(e->{check(" ( ");});
    	btn_closeBra.setOnAction(e->{check(" ) ");});
    	btn_square.setOnAction(e->{check(" )^2");});
    	btn_sqrt.setOnAction(e->{check(" sqrt( ");});
    	btn_log.setOnAction(e->{check(" log( ");});
    	btn_lg.setOnAction(e->{check(" lg( ");});
    	
    	btn_clear.setOnAction(e->{check("Clear");});
    	btn_delete.setOnAction(e->{delete(lbl_answer.getText());});
    	btn_equal.setOnAction(e->{calculate(lbl_answer.getText());});
    	
    	//if the size changed, the design will change
    	 container.widthProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
      	    	if(container.heightProperty().doubleValue()>
      	    	container.widthProperty().doubleValue() )
      	    		Design1();
      	    	else
      	    		Design2();
      	    }
      	});
         
         container.heightProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
      	       if(container.heightProperty().doubleValue()<=
      	    		  container.widthProperty().doubleValue() )
      	    	   Design2();
      	       else
      	    	   Design1();
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
    	//delete anyone word if there is exist (log(, lg(, sqrt(, Error, Infinity )
    	if(exp.endsWith("sqrt( "))
    		exp = exp.substring(0,exp.length()-6);
    	else if(exp.endsWith("log( ")||exp.endsWith("Error"))
    				exp = exp.substring(0,exp.length()-5);
    	else if(exp.endsWith("lg( "))
    		exp = exp.substring(0,exp.length()-4);
    	else if(exp.endsWith("Infinity"))
    		exp = exp.substring(0,exp.length()-8);
    	
    	//delete  ^2 if it is exist
    	else if(exp.length()>2&&exp.charAt(exp.length()-2)=='^')
    		exp = exp.substring(0, exp.length()-3);
    	//delete any operator or brackets
    	else if(exp.length()>2&&exp.charAt(exp.length()-1)==' ')
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
		double cal = 0;
		Stack<Comparable> st = new Stack<Comparable>();
		st.push('(');
		try
		{
			for(int i=0;i<exp.length();i++)
			{
				if(exp.charAt(i)==')') 
				{
					String s = ")";
					while(!st.peek().equals('('))
						s = st.pop() + s;
					s = st.pop() + s;
					if(st.peek().equals('t')) 			//sqrt()
					{
						while(!st.peek().equals('s')) 
							st.pop();st.pop();
						st.push(Math.sqrt(evaluateExp(s)));						
					}
					else if(st.peek().equals('g'))    //log() or lg()
					{
						st.pop();
						if(st.peek().equals('o'))    // log()
						{
							st.pop();st.pop();
							st.push(Math.log10(evaluateExp(s)));	
						}
						else    					//lg()
						{
							st.pop();
							st.push(Math.log10(evaluateExp(s))/Math.log10(2));
						}
					}
					else if(exp.charAt(i+1)=='^')    // ()^2
					{
						st.push(Math.pow(evaluateExp(s),2));
						i+=2;
					}
					else
						st.push(evaluateExp(s)); //( + * - / )
				}
				else
					st.push(exp.charAt(i));
			}
		String s = " ) ";
		while(!st.isEmpty())
			s = st.pop() + s;
	    cal = evaluateExp(s);
		}
		catch(Exception e)
		{
			check("Error");return ;
		}
    	if(new Double(cal).isInfinite())
    		{check(" Infinity");}
    	else
    		{lbl_answer.setText(" "+cal);check("Equal");}
    }
	
    private double evaluateExp(String exp)
    {
    	boolean contain_operand = true;
    	exp = exp.replace("(", "");
	   	exp = exp.replace(")", "");
    	while(contain_operand)
    	{
		 	char last;
		   	double op1=0,op2=0;
		   	exp = exp.replaceAll("  ", " ");
		   	contain_operand = exp.contains(" + ") || exp.contains(" - ") ||
    			exp.contains(" * ") || exp.contains(" / ") ;
		   	if(contain_operand)
		   	{
			   	String[] op = exp.split(" ");
			   	//handle the first operation
			   	op1 = new Double(op[1]);
			   	last = op[2].charAt(0);
			   	op2 = new Double(op[3]);
			   	//handle and calculate the next operation
			   	for(int i = 4;i<op.length;i++)
			   	{
			   		if(op[i].charAt(0)=='+' || op[i].charAt(0)=='-')
			   		{
			 			switch(last)
			   			{
			   				case'+':op1 += op2; break;
			   				case'-':op1 -= op2; break;
			   				case'*':op1 *= op2; break;
			   				case'/':op1 /= op2; break;
			   			}
			   			op2 = new Double(op[i+1]);
			   			last = op[i].charAt(0);
			   		}
			   		else if(op[i].charAt(0)=='*' || op[i].charAt(0)=='/')
			   		{
			   			if(op[i].charAt(0) == '*')
			   				op2 *= new Double(op[i+1]);
			   			else
			   				op2 /= new Double(op[i+1]);
			   		}
			   	}		    	
			   	//calculate the last operation in priority
			   	switch(last)
				{
					case'+':op1 += op2; break;
					case'-':op1 -= op2; break;
					case'*':op1 *= op2; break;
					case'/':op1 /= op2; break;
				}		    	
			   	exp = ""+op1;	
			   	}
		     }
    		return new Double(exp);
    	}

}
   
