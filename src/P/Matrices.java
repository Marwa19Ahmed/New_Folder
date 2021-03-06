package P;

import javafx.beans.binding.DoubleBinding;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Matrices extends Simple
{
	protected Button btn_Comma, btn_openBracket,
		btn_Semicolon,btn_closeBracket;
	//...........................................................variables used in calculation
		static int rows = 0;
		static int cols = 0;
		static boolean endOfRow = false;
		static double[][] mat1 ;
		static double[][] temp ;
		static int zero=0;
		static int operandCount=0;
	//....................................................................................
	//
	protected void initiateComponents()
    {
		super.initiateComponents();
		desgin = 4;
    	btn_Comma = new Button(",");
    	btn_openBracket = new Button("{");
    	btn_closeBracket = new Button("}");
    	btn_Semicolon = new Button(";");
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
     	btn_Comma.prefWidthProperty().bind(btn_width);
     	btn_openBracket.prefWidthProperty().bind(btn_width);
     	btn_Semicolon.prefWidthProperty().bind(btn_width);
     	btn_closeBracket.prefWidthProperty().bind(btn_width);
     	btn_delete.prefWidthProperty().bind(btn_width);
     	btn_mod.prefWidthProperty().bind(btn_width);
     	btn_equal.prefWidthProperty().bind(btn_width);
     	
		btn_0.prefWidthProperty().bind(btn_width.multiply(2).add(container.getVgap()));
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
     	btn_Comma.prefHeightProperty().bind(btn_height);
     	btn_openBracket.prefHeightProperty().bind(btn_height);
     	btn_Semicolon.prefHeightProperty().bind(btn_height);
     	btn_closeBracket.prefHeightProperty().bind(btn_height);
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
    }
    
    protected void design1()
    {  	    
    	container.getChildren().clear();
         container.add(lbl_answer,1,1,6,2);
         container.add(line_top,1,1,6,1);
         //Add row 1
         container.add(btn_openBracket,1,4);
         container.add(btn_Comma,1,5);
         container.add(btn_7,1,6);
         container.add(btn_4,1,7);
         container.add(btn_1,1,8);
         container.add(btn_0,1,9,2,1);

         //Add column 2 
         container.add(btn_closeBracket,2,4);
         container.add(btn_Semicolon,2,5);
         container.add(btn_8,2,6);
         container.add(btn_5,2,7);
         container.add(btn_2,2,8);

         //Add column 3
         container.add(btn_clear,3,4);
         container.add(btn_mod,3,5);
         container.add(btn_9,3,6);
         container.add(btn_6,3,7);
         container.add(btn_3,3,8);
         container.add(btn_dot,3,9);
         
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
        super.setStyles();
    	String style2_to_button = "-fx-background-radius: "+
    			"0;-fx-background-color: rgb(40, 40, 40); -fx-font: 15pt Serif;";
    	
     	btn_openBracket.setStyle(style2_to_button);
     	btn_Comma.setStyle(style2_to_button);
     	btn_closeBracket.setStyle(style2_to_button);
     	btn_Semicolon.setStyle(style2_to_button);
     	
     	Paint color = (Paint) Color.WHITE;
     	
     	btn_openBracket.setTextFill(color);
     	btn_Comma.setTextFill(color);
     	btn_closeBracket.setTextFill(color);
     	btn_Semicolon.setTextFill(color);
    }
 // .................................................................
    /*push elements in matrix
     * */
	void getMat(String[] mat){
		int count=0;
    for(int i=0;i<rows;i++){
    	for(int j=0;j<cols;j++){
    		count++;
    		if(zero==0)
    		{
    		temp[i][j]=Double.parseDouble(mat[count]);
    		}
    		else{
        	mat1[i][j]=Double.parseDouble(mat[count]);
    	}
    		}
	}
    count=0;
}
	//..............................................................
	static void addMat() {
		for (int i = 0; i < mat1.length; i++)
			for (int j = 0; j < mat1[0].length; j++) {
				temp[i][j]= temp[i][j] + mat1[i][j];
			}
	}

	// ...................................................
	static void subMat() {
		for (int i = 0; i < mat1.length; i++)
			for (int j = 0; j < mat1[0].length; j++) {
				temp[i][j] = temp[i][j] - mat1[i][j];
			}
	}

	// ...................................................
	static double getMatElement(double[][] mat1, double[][] mat2, int row, int col) {
		double element = 0.0;
		for (int i = 0; i < mat1[0].length; i++) {
			element += (mat1[row][i] * mat2[i][col]);
		}
		return element;
	}

	// ...................................................
	static void mulMat() {
		double[][] mulMat = new double[temp.length][mat1[0].length];
		for (int i = 0; i < temp.length; i++)
			for (int j = 0; j < mat1[0].length; j++) {
				mulMat[i][j] = getMatElement(temp, mat1, i, j);
			}
		temp=new double[temp.length][mat1[0].length];
		System.arraycopy( mulMat, 0, temp, 0, mulMat.length );
		for (int i = 0; i < temp.length; i++)
			for (int j = 0; j <temp[0].length; j++) {
			}
	}

	// ...................................................
	/*static void divMat(double[][] mat1, double[][] mat2) {
		double[][] mulMat = new double[mat1.length][mat2[0].length];
		for (int i = 0; i < mat1.length; i++)
			for (int j = 0; j < mat2[0].length; j++) {
				mulMat[i][j] = getMatElement(mat1, mat2, i, j);
				System.out.print(mulMat[i][j] + "    ");
			}
	}*/
	// ...................................................

    protected void eventHandler()
    {
       	lbl_answer.setText(" ");
       	
       	//check the lbl_answer if it is valid or not before writing 
        super.eventHandler();
    	btn_Comma.setOnAction(e->{check(",");});
    	btn_openBracket.setOnAction(e->{check(" { ");});
    	btn_Semicolon.setOnAction(e->{check(" ; ");});
    	btn_closeBracket.setOnAction(e->{check(" } ");}); 
    	btn_equal.setOnAction(e->{calculate(lbl_answer.getText());});

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
    	//..................................to isolate operators
    	String op = "";
    	for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '*' || exp.charAt(i) == '/' || exp.charAt(i) == '+' || exp.charAt(i) == '-') {
				op += (exp.charAt(i));
			}
		}
    	//..................................to isolate operands (matricise) 
		String[] mats = exp.split("[*/+-]");    	
    	//..................................to get number of rows and columns in each (matrix) 

		for (int i = 0; i<mats.length; i++) {
	    	//..................................to get number of rows and columns in each (matrix) 		
			for(int j=0;j<mats[i].length();j++){
			if (mats[i].charAt(j) == ',') {
				if (endOfRow == false) {
					cols++;
				}
			}

			if (mats[i].charAt(j) == ';') {
				if (endOfRow == false) {
					endOfRow = true;
					cols++;
				}
				rows++;
			}
			
		}
	       //......................................................................................... 		
			if(i==0){
				temp=new double[rows][cols];
				String[] elements=mats[i].split("[;,{}]");
		        getMat(elements);
			}
		        
				else {
					if(zero==0)
						zero=1;
					mat1=new double[rows][cols];
					System.out.println(rows+" two "+cols+"mat= "+mats[i]);
					
					String[] elements=mats[i].split("[;,{}]");
					//for (int k = 0; k <elements.length; k++) {
					//		System.out.println(elements[k]);
					
			        getMat(elements);
			        switch(op.charAt(operandCount)){
			        //case '/':operandCount++; divMat(temp,mat1);break;
			        case '*':operandCount++; mulMat();break;
			        case '+':operandCount++; addMat();break;
			        case '-':operandCount++; subMat();break;
			        }
			        }	        		
					
			
				rows=0;
				cols=0;
				endOfRow=false;

			}
		String calc="{";
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<temp[i].length;j++)
			{
				calc+=temp[i][j];
				if(j==temp[i].length-1)
					continue;
				calc+=",";
			}
			calc+=";";
		}
		calc+="}";
			
   	lbl_answer.setText(" "+calc);check("Equal");}
     
}
    
    