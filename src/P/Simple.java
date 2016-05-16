package P;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

public class Simple 
{
	protected String ans = "" ;
	protected static int desgin = 0;
	protected GridPane container = new GridPane();
	protected Line line_top;
	protected Label lbl_answer,lbl_notelabel ;
	protected Button btn_add, btn_sub, btn_div, btn_mul, btn_clear,
		    btn_dot, btn_openBra, btn_closeBra, btn_square,
   		    btn_sqrt, btn_delete, btn_equal, btn_mod,
   		    btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
   		    btn_7, btn_8, btn_9, btn_0, btn_ans;
	
	protected void initiateComponents()
    {
    	desgin = 1;
    	line_top = new Line(0,0,0,0);
    	btn_add = new Button("+");
    	btn_sub = new Button("-");
    	btn_div = new Button("/");
    	btn_mul = new Button("*");
    	btn_clear = new Button("AC");
    	btn_dot = new Button(".");
    	btn_openBra = new Button("(");
    	btn_closeBra = new Button(")");
    	btn_square = new Button("^");
    	btn_sqrt = new Button("sqrt");
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
    	btn_ans = new Button("ans");
    	btn_mod = new Button("%");
    	lbl_answer = new Label();
    	lbl_notelabel = new Label("Rotate the phone");
    }
  
	protected void resizeComponents()
    {
    	DoubleBinding btn_height;
    	DoubleBinding btn_width;
    	lbl_answer.prefHeightProperty().bind(container.heightProperty().divide(4));
    	btn_height = container.heightProperty().divide(9);
    	btn_width = container.widthProperty().divide(3);
    	lbl_answer.prefWidthProperty().bind(container.widthProperty().subtract(15));
        line_top.endXProperty().bind(container.widthProperty().subtract(22));
        line_top.setStrokeWidth(7);
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
     	btn_mod.prefWidthProperty().bind(btn_width);
     	btn_equal.prefWidthProperty().bind(btn_width);
     	btn_ans.prefWidthProperty().bind(btn_width);
     	
		btn_0.prefWidthProperty().bind(btn_width);
     	btn_1.prefWidthProperty().bind(btn_width);
     	btn_2.prefWidthProperty().bind(btn_width);
     	btn_3.prefWidthProperty().bind(btn_width);
     	btn_4.prefWidthProperty().bind(btn_width);
     	btn_5.prefWidthProperty().bind(btn_width);
     	btn_6.prefWidthProperty().bind(btn_width);
     	btn_7.prefWidthProperty().bind(btn_width);
     	btn_8.prefWidthProperty().bind(btn_width);
     	btn_9.prefWidthProperty().bind(btn_width);
     	
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
     	btn_mod.prefHeightProperty().bind(btn_height);
     	btn_ans.prefHeightProperty().bind(btn_height);
    	
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
    }
    
    protected void design1()
    {  	    
    	container.getChildren().clear();
         container.add(lbl_answer,1,1,6,2);
         container.add(line_top,1,1,6,1);
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
         container.add(btn_mod,3,5);
         container.add(btn_9,3,6);
         container.add(btn_6,3,7);
         container.add(btn_3,3,8);
         container.add(btn_ans,3,9);
         
         //Add column 4
         container.add(btn_delete,4,4);
         container.add(btn_mul,4,5);
         container.add(btn_div,4,6);
         container.add(btn_add,4,7);
         container.add(btn_sub,4,8);
         container.add(btn_equal,4,9);
         resizeComponents();
         setStyles();
         if(lbl_answer.getText().isEmpty())
        	 check("Clear");
         else
        	 check("Equal");
    }
    
    protected void design2()
    {
    	container.getChildren().clear();
    	container.add(lbl_notelabel,0,0);
    }
    
    protected void setStyles()
    {
        container.setHgap(5);
        container.setVgap(5);
        container.setAlignment(Pos.CENTER);
    	container.setStyle("-fx-background-color: rgb(0,0,0);");
    	
    	lbl_answer.setStyle("-fx-border-radius: 0; " +
			    		   "-fx-background-radius: 0;"+
			    		   "-fx-background-color: rgb(30, 30, 30);"+
			    		   "-fx-font: 28pt Serif;");
    	lbl_notelabel.setStyle("-fx-border-radius: 0; " +
			    		   "-fx-background-radius: 0;"+
			    		   "-fx-background-color: rgb(0,0,0);"+
			    		   "-fx-font: 28pt Serif;");
    	String style1_to_button = "-fx-background-radius: "+
    			"0;-fx-background-color: rgb(10, 15, 15); -fx-font: 18pt Serif;";
    	
    	String style2_to_button = "-fx-background-radius: "+
    			"0;-fx-background-color: rgb(40, 40, 40); -fx-font: 15pt Serif;";
    	
    	btn_equal.setStyle("-fx-background-radius: 0; -fx-background-color: rgb(255,170,0); -fx-font: 20pt Serif;");
    	
    	line_top.setStroke((Paint) Color.rgb(255, 170, 0) );
     	btn_mod.setStyle(style2_to_button);
     	btn_clear.setStyle(style2_to_button);
     	btn_square.setStyle(style2_to_button);
     	btn_sqrt.setStyle(style2_to_button);
     	btn_delete.setStyle(style2_to_button);

     	btn_openBra.setStyle(style2_to_button);
     	btn_closeBra.setStyle(style2_to_button);
     	btn_add.setStyle(style2_to_button);
     	btn_sub.setStyle(style2_to_button);
     	btn_div.setStyle(style2_to_button);
     	btn_mul.setStyle(style2_to_button);
     	btn_dot.setStyle(style1_to_button);
     	btn_ans.setStyle(style1_to_button);
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
     	
     	Paint color = (Paint) Color.WHITE;
     	
     	btn_mod.setTextFill(color);
     	btn_clear.setTextFill(color);
     	btn_square.setTextFill(color);
     	btn_sqrt.setTextFill(color);
     	btn_delete.setTextFill(color);

     	btn_openBra.setTextFill(color);
     	btn_closeBra.setTextFill(color);
     	btn_add.setTextFill(color);
     	btn_sub.setTextFill(color);
     	btn_div.setTextFill(color);
     	btn_mul.setTextFill(color);
     	btn_dot.setTextFill(color);
     	btn_ans.setTextFill(color);
     	btn_1.setTextFill(color);
     	btn_2.setTextFill(color);
     	btn_3.setTextFill(color);
     	btn_4.setTextFill(color);
     	btn_5.setTextFill(color);
     	btn_6.setTextFill(color);
     	btn_7.setTextFill(color);
     	btn_8.setTextFill(color);
     	btn_9.setTextFill(color);
     	btn_0.setTextFill(color);
     	lbl_answer.setTextFill(color);
     	lbl_notelabel.setTextFill(color);
    }
    
    protected void eventHandler()
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
	   	btn_ans.setOnAction(e->{lbl_answer.setText(lbl_answer.getText()+ans);});
	   	
	   	
	   	btn_add.setOnAction(e->{check(" + ");});
    	btn_sub.setOnAction(e->{check(" - ");});
    	btn_div.setOnAction(e->{check(" / ");});
    	btn_mul.setOnAction(e->{check(" * ");});
    	btn_mod.setOnAction(e->{check(" % ");});
    	
    	btn_openBra.setOnAction(e->{check(" ( ");});
    	btn_closeBra.setOnAction(e->{check(" ) ");});
    	btn_square.setOnAction(e->{check(" ^");});
    	btn_sqrt.setOnAction(e->{check(" sqrt( ");});
    	
    	
    	btn_clear.setOnAction(e->{check("Clear");});
    	btn_delete.setOnAction(e->{delete(lbl_answer.getText());});
    	btn_equal.setOnAction(e->{calculate(lbl_answer.getText());});
    	
    	//
    	// close on escape button (back button in android)
    	container.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				switch(event.getCode()){
				case DIGIT0              : {check("0"); break;}
				case DIGIT1        		 : {check("1"); break;}
				case DIGIT2        		 : {check("2"); break;}
				case DIGIT3        		 : {check("3"); break;}
				case DIGIT4              : {check("4"); break;}
				case DIGIT5              : {check("5"); break;}
				case DIGIT6              : {check("6"); break;}
				case DIGIT7              : {check("7"); break;}
				case DIGIT8              : {check("8"); break;}
				case DIGIT9              : {check("9"); break;}
				case ADD                 : {check(" + "); break;}
				case DIVIDE              : {check(" / "); break;}
				case MULTIPLY            : {check(" * "); break;}   
				case MINUS               : {check(" - "); break;}

				case ENTER               : {calculate(lbl_answer.getText()); break;}
				case EQUALS              : {calculate(lbl_answer.getText()); break;}
				case BACK_SPACE          : {delete(lbl_answer.getText()); break;}
				case DELETE              : {check("Clear"); break;}
				default:
					break;
				}
			}
    		
		});
    	Main.con.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode() == KeyCode.ESCAPE)
					{Main.welcomePage();Main.calculatorDetection();}						
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
			    		   "-fx-background-color: rgb(30, 30, 30);";
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
    
    protected void delete(String exp)
    {
    	//delete anyone word if there is ( Error, Infinity ) word 
    	
    	if(exp.endsWith("Error"))
    			exp = exp.substring(0,exp.length()-5);
    	else if(exp.endsWith("Infinity"))
    		exp = exp.substring(0,exp.length()-8);
    		
    	
    	//delete  ^2  if it is exist
    	else if(exp.length()>1&&exp.charAt(exp.length()-1)=='^')
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
    
    protected void check(String op_num)
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
		
		if((lbl_answer.getText().endsWith(" * ") || lbl_answer.getText().endsWith(" / ") ||
				lbl_answer.getText().endsWith(" + ") || lbl_answer.getText().endsWith(" - ") ||
				lbl_answer.getText().endsWith(" % ") || lbl_answer.getText().endsWith(".")) && 
				(op_num == " * "|| op_num == " / "|| op_num == " * "|| op_num == " - "|| 
						op_num == " % " || op_num == " + "|| op_num == "."))
			delete(lbl_answer.getText());
		
		//add the number or operator
		if(op_num!=" Infinity" && op_num!="Equal" && op_num!="Clear" && op_num!="Error")
		lbl_answer.setText(lbl_answer.getText()+op_num);
		
	}

    protected void calculate(String exp)
    {
		//calculate
		exp = exp.replaceAll("PI", ""+Math.PI);
    		ans = Expression_Calculation.evaluateExpression(exp);
    		lbl_answer.setText(" "+ans);
    		check("Equal");
    }
}
