package P;


import javafx.beans.binding.DoubleBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Scientific extends Simple 
{
	protected Button btn_PI, btn_ln, btn_log,
   		    btn_mod, btn_sin, btn_cos, btn_tan,
   		    btn_sinh, btn_cosh, btn_tanh, btn_fact,degree_radian;
    
	protected void initiateComponents()
    {
    	super.initiateComponents();
    	desgin = 3;
    	btn_log = new Button("log");
    	btn_ln = new Button("ln");
    	btn_mod = new Button("%");
    	btn_sin = new Button("Sin");
    	btn_cos = new Button("Cos");
    	btn_tan = new Button("Tan");
    	btn_sinh = new Button("Sinh");
    	btn_cosh = new Button("Cosh");
    	btn_tanh = new Button("Tanh");
    	btn_fact = new Button("!");
    	btn_PI = new Button("PI");
    	degree_radian = new Button("Deg");
    }
  
	protected void resizeComponents()
    {
    	DoubleBinding btn_height;
    	DoubleBinding btn_width;
    	//
    		lbl_answer.prefHeightProperty().bind(container.heightProperty().multiply(8));
    		btn_height = container.heightProperty().divide(8);
    		btn_width = container.widthProperty().divide(7).subtract(7); 

    		lbl_answer.prefWidthProperty().bind(container.widthProperty().subtract(15));
            line_top.endXProperty().bind(container.widthProperty().subtract(22));
            line_top.setStrokeWidth(7);
            
            //reset width to all button on changing in container's width
            btn_add.prefWidthProperty().bind(btn_width);
            btn_ans.prefWidthProperty().bind(btn_width);
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
            degree_radian.prefWidthProperty().bind(btn_width);
         	
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
         	btn_ln.prefWidthProperty().bind(btn_width);
         	btn_log.prefWidthProperty().bind(btn_width);
         	
         	//reset height to all button on changing in container's height
         	btn_add.prefHeightProperty().bind(btn_height);
         	btn_ans.prefHeightProperty().bind(btn_height);
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
         	btn_sin.prefHeightProperty().bind(btn_height);
         	btn_cos.prefHeightProperty().bind(btn_height);
         	btn_tan.prefHeightProperty().bind(btn_height);
         	btn_sinh.prefHeightProperty().bind(btn_height);
         	btn_cosh.prefHeightProperty().bind(btn_height);
         	btn_tanh.prefHeightProperty().bind(btn_height);
         	btn_fact.prefHeightProperty().bind(btn_height);
         	btn_mod.prefHeightProperty().bind(btn_height);
         	btn_PI.prefHeightProperty().bind(btn_height);
         	
         	degree_radian.prefHeightProperty().bind(btn_height);     	
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
         	btn_ln.prefHeightProperty().bind(btn_height);
    }
    
    protected void design1()
    {  	 
    	 container.getChildren().clear();
    	     	 
         container.add(lbl_answer,1,1,7,3);
         container.add(line_top,1,1,7,1);
         
         //Add row 1
         container.add(btn_clear,1,4);
         container.add(btn_delete,2,4);
         container.add(degree_radian,3,4);
         container.add(btn_openBra,4,4);
         container.add(btn_closeBra,5,4);
         container.add(btn_PI,6,4);
         container.add(btn_mul,7,4);
         
         //Add row 2
         container.add(btn_log,1,5);
         container.add(btn_ln,2,5);
         container.add(btn_fact,3,5);
         container.add(btn_7,4,5);
         container.add(btn_8,5,5);
         container.add(btn_9,6,5);
         container.add(btn_div,7,5);
         
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
         container.add(btn_sub,7,7);
         
       //Add row 5
         container.add(btn_sinh,1,8);
         container.add(btn_cosh,2,8);
         container.add(btn_tanh,3,8);
         container.add(btn_0,4,8);
         container.add(btn_dot,5,8);
         container.add(btn_ans,6,8);
         container.add(btn_equal,7,8);
         
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
    	super.setStyles();
    	String style2_to_button = "-fx-background-radius: "+
    			"0;-fx-background-color: rgb(40, 40, 40); -fx-font: 15pt Serif;";
    	
     	btn_PI.setStyle(style2_to_button);
     	btn_sin.setStyle(style2_to_button);
     	btn_cos.setStyle(style2_to_button);
     	btn_tan.setStyle(style2_to_button);
     	btn_sinh.setStyle(style2_to_button);
     	btn_cosh.setStyle(style2_to_button);
     	btn_tanh.setStyle(style2_to_button);
     	btn_mod.setStyle(style2_to_button);
     	btn_fact.setStyle(style2_to_button);
     	btn_log.setStyle(style2_to_button);
     	btn_ln.setStyle(style2_to_button);
     	degree_radian.setStyle(style2_to_button);
     	
     	Paint color = (Paint) Color.WHITE;
     	
     	btn_PI.setTextFill(color);
     	btn_sin.setTextFill(color);
     	btn_cos.setTextFill(color);
     	btn_tan.setTextFill(color);
     	btn_sinh.setTextFill(color);
     	btn_cosh.setTextFill(color);
     	btn_tanh.setTextFill(color);
     	btn_mod.setTextFill(color);
     	btn_fact.setTextFill(color);
     	btn_log.setTextFill(color);
     	btn_ln.setTextFill(color);
     	degree_radian.setTextFill(color);
    }
    
    protected void eventHandler()
    {
       	lbl_answer.setText(" ");
       	
       	//check the lbl_answer if it is valid or not before writing 
        super.eventHandler();
    	btn_ln.setOnAction(e->{check(" ln( ");});
    	btn_sin.setOnAction(e->{check(" sin( ");});
    	btn_cos.setOnAction(e->{check(" cos( ");});
    	btn_tan.setOnAction(e->{check(" tan( ");});
    	btn_sinh.setOnAction(e->{check(" sinh( ");});
    	btn_cosh.setOnAction(e->{check(" cosh( ");});
    	btn_tanh.setOnAction(e->{check(" tanh( ");});
    	btn_fact.setOnAction(e->{check(" !");});
    	btn_PI.setOnAction(e->{check(" PI ");});
    	
    	//if the size changed, the design will change
    	 container.widthProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneWidth, Number newSceneWidth) {
      	    	if(container.heightProperty().doubleValue()>
      	    	container.widthProperty().doubleValue() )
      	    		design2();
      	    	else
      	    		design1();
      	    }
      	});
         
         container.heightProperty().addListener(new ChangeListener<Number>() {
      	    @Override public void changed(ObservableValue<? extends Number> observableValue, Number oldSceneHeight, Number newSceneHeight) {
      	       if(container.heightProperty().doubleValue()<=
      	    		  container.widthProperty().doubleValue() )
      	    	   design1();
      	       else
      	    	   design2();
      	    }
      	});       	
    }
    
    protected void delete(String exp)
    {
    	//delete anyone word if there is( exist (log(, lg(, sqrt(, Error, Infinity,
    	// sin(, cos(, tan(, sinh(, cosh, tanh( )
    	if(exp.endsWith("sqrt( ")||exp.endsWith("sinh( ")||exp.endsWith("cosh( ")||exp.endsWith("tanh( "))
    		exp = exp.substring(0,exp.length()-6);
    	else if(exp.endsWith("log( ")||exp.endsWith("Error")||
    			exp.endsWith("sin( ")||exp.endsWith("cos( ")||exp.endsWith("tan( "))
    				exp = exp.substring(0,exp.length()-5);
    	else if(exp.endsWith("ln( "))
    		exp = exp.substring(0,exp.length()-4);
    	else if(exp.endsWith("Infinity"))
    		exp = exp.substring(0,exp.length()-8);
    		
    	
    	//delete  ^2 or PI or )! if it is exist
    	else if(exp.length()>2&&(
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
    
    protected void calculate(String exp)
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
	    		cal = Expression_Calculation.evaluateExpression(exp);
	    	}
		}
		catch(Exception e)
		{
			check("Error");return ;
		}
    	if(new Double(cal).isInfinite())
    		{check(" Infinity");}
    	else
    		{cal = Expression_Calculation.evaluateExpression(exp);ans = cal; lbl_answer.setText(" "+cal);check("Equal");}
    }

}