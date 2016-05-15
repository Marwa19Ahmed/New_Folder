package P;

import javafx.beans.binding.DoubleBinding;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Programmer extends Simple
{
	protected Button btn_inBaseX, btn_toBaseX,
		btn_A, btn_B, btn_C, btn_D, btn_E, btn_F;
	
	protected void initiateComponents()
    {
		super.initiateComponents();
    	btn_inBaseX = new Button("inBaseX");
    	btn_toBaseX = new Button("toBaseX");
    	btn_A = new Button("A");
    	btn_B = new Button("B");
    	btn_C = new Button("C");
    	btn_D = new Button("D");
    	btn_E = new Button("E");
    	btn_F = new Button("F");
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
     	btn_inBaseX.prefWidthProperty().bind(btn_width.multiply(2).add(container.getVgap()));
     	btn_toBaseX.prefWidthProperty().bind(btn_width.multiply(2).add(container.getVgap()));
     	btn_delete.prefWidthProperty().bind(btn_width);
     	btn_mod.prefWidthProperty().bind(btn_width);
     	btn_equal.prefWidthProperty().bind(btn_width);
     	
		btn_0.prefWidthProperty().bind(btn_width.multiply(3).add(container.getVgap()*2));
     	btn_1.prefWidthProperty().bind(btn_width);
     	btn_2.prefWidthProperty().bind(btn_width);
     	btn_3.prefWidthProperty().bind(btn_width);
     	btn_4.prefWidthProperty().bind(btn_width);
     	btn_5.prefWidthProperty().bind(btn_width);
     	btn_6.prefWidthProperty().bind(btn_width);
     	btn_7.prefWidthProperty().bind(btn_width);
     	btn_8.prefWidthProperty().bind(btn_width);
     	btn_9.prefWidthProperty().bind(btn_width);
     	btn_A.prefWidthProperty().bind(btn_width);
     	btn_B.prefWidthProperty().bind(btn_width);
     	btn_C.prefWidthProperty().bind(btn_width);
     	btn_D.prefWidthProperty().bind(btn_width);
     	btn_E.prefWidthProperty().bind(btn_width);
     	btn_F.prefWidthProperty().bind(btn_width);
     	
     	//reset height to all button on changing in container's height
     	btn_add.prefHeightProperty().bind(btn_height);
     	btn_sub.prefHeightProperty().bind(btn_height);
     	btn_div.prefHeightProperty().bind(btn_height);
     	btn_mul.prefHeightProperty().bind(btn_height);
     	btn_clear.prefHeightProperty().bind(btn_height);
     	btn_dot.prefHeightProperty().bind(btn_height);
     	btn_inBaseX.prefHeightProperty().bind(btn_height);
     	btn_toBaseX.prefHeightProperty().bind(btn_height);
     	btn_delete.prefHeightProperty().bind(btn_height);
     	btn_equal.prefHeightProperty().bind(btn_height);
     	btn_mod.prefHeightProperty().bind(btn_height);
    	
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
     	btn_A.prefHeightProperty().bind(btn_height);
     	btn_B.prefHeightProperty().bind(btn_height);
     	btn_C.prefHeightProperty().bind(btn_height);
     	btn_D.prefHeightProperty().bind(btn_height);
     	btn_E.prefHeightProperty().bind(btn_height);
     	btn_F.prefHeightProperty().bind(btn_height);
    }
    
    protected void design1()
    {  	    
    	container.getChildren().clear();
         container.add(lbl_answer,1,1,6,2);
         container.add(line_top,1,1,6,1);
       //Add column 1
         container.add(btn_A,1,4);
         container.add(btn_B,1,5);
         container.add(btn_C,1,6);
         container.add(btn_D,1,7);
         container.add(btn_E,1,8);
         container.add(btn_F,1,9);

         
         //Add column 
         container.add(btn_toBaseX,2,4,2,1);
         container.add(btn_inBaseX,2,5,2,1);
         container.add(btn_7,2,6);
         container.add(btn_4,2,7);
         container.add(btn_1,2,8);
         container.add(btn_0,2,9,3,1);

         //Add column 2 
         container.add(btn_8,3,6);
         container.add(btn_5,3,7);
         container.add(btn_2,3,8);

         //Add column 3
         container.add(btn_clear,4,4);
         container.add(btn_mod,4,5);
         container.add(btn_9,4,6);
         container.add(btn_6,4,7);
         container.add(btn_3,4,8);
         
         //Add column 4
         container.add(btn_delete,5,4);
         container.add(btn_mul,5,5);
         container.add(btn_div,5,6);
         container.add(btn_add,5,7);
         container.add(btn_sub,5,8);
         container.add(btn_equal,5,9);
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
    	
     	btn_toBaseX.setStyle(style2_to_button);
     	btn_inBaseX.setStyle(style2_to_button);
     	btn_A.setStyle(style2_to_button);
     	btn_B.setStyle(style2_to_button);
     	btn_C.setStyle(style2_to_button);
     	btn_D.setStyle(style2_to_button);
     	btn_E.setStyle(style2_to_button);
     	btn_F.setStyle(style2_to_button);
     	
     	Paint color = (Paint) Color.WHITE;
     	
     	btn_toBaseX.setTextFill(color);
     	btn_inBaseX.setTextFill(color);
     	btn_A.setTextFill(color);
     	btn_B.setTextFill(color);
     	btn_C.setTextFill(color);
     	btn_D.setTextFill(color);
     	btn_E.setTextFill(color);
     	btn_F.setTextFill(color);
    }
    
    protected void eventHandler()
    {
       	lbl_answer.setText(" ");
       	
       	//check the lbl_answer if it is valid or not before writing 
        super.eventHandler();
    	btn_inBaseX.setOnAction(e->{check(" _ ");});
    	btn_toBaseX.setOnAction(e->{check(" > ");});
    	btn_A.setOnAction(e->{check("A");});
    	btn_B.setOnAction(e->{check("B");});
    	btn_C.setOnAction(e->{check("C");});
    	btn_D.setOnAction(e->{check("D");});
    	btn_E.setOnAction(e->{check("E");});
    	btn_F.setOnAction(e->{check("F");});
               	
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
    
    protected void calculate(String exp)
    {
    	
    }
    
}

