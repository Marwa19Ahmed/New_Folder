package P;

import javafx.beans.binding.DoubleBinding;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Programmer extends Simple {
	protected int ans = 0 ;
	public boolean binary, octal, hexa, decimal;
	protected Button btn_hex, btn_oct, btn_bin, btn_dec,
			btn_A, btn_B, btn_C, btn_D, btn_E, btn_F;

	
	protected void initiateComponents() {
		super.initiateComponents();
		desgin = 2;
		btn_hex = new Button("HEX");
		btn_oct = new Button("OCT");
		btn_bin = new Button("BIN");
		btn_dec = new Button("DEC");
		btn_A = new Button("A");
		btn_B = new Button("B");
		btn_C = new Button("C");
		btn_D = new Button("D");
		btn_E = new Button("E");
		btn_F = new Button("F");
		hexa = true;
	}

	protected void resizeComponents() {
		DoubleBinding btn_height;
		DoubleBinding btn_width;
		lbl_answer.prefHeightProperty().bind(container.heightProperty().divide(4));
		btn_height = container.heightProperty().divide(9);
		btn_width = container.widthProperty().divide(3);
		lbl_answer.prefWidthProperty().bind(container.widthProperty().subtract(15));
		line_top.endXProperty().bind(container.widthProperty().subtract(22));
		line_top.setStrokeWidth(7);
		// reset width to all button on changing in container's width
		btn_add.prefWidthProperty().bind(btn_width);
		btn_sub.prefWidthProperty().bind(btn_width);
		btn_div.prefWidthProperty().bind(btn_width);
		btn_mul.prefWidthProperty().bind(btn_width);
		btn_clear.prefWidthProperty().bind(btn_width);
		btn_dot.prefWidthProperty().bind(btn_width);
		btn_oct.prefWidthProperty().bind(btn_width);
		btn_hex.prefWidthProperty().bind(btn_width);
		btn_dec.prefWidthProperty().bind(btn_width);
		btn_bin.prefWidthProperty().bind(btn_width);
		btn_delete.prefWidthProperty().bind(btn_width);
		btn_mod.prefWidthProperty().bind(btn_width);
		btn_ans.prefWidthProperty().bind(btn_width);
		btn_equal.prefWidthProperty().bind(btn_width);

		btn_0.prefWidthProperty().bind(btn_width.multiply(3).add(container.getVgap() * 2));
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

		// reset height to all button on changing in container's height
		btn_add.prefHeightProperty().bind(btn_height);
		btn_sub.prefHeightProperty().bind(btn_height);
		btn_div.prefHeightProperty().bind(btn_height);
		btn_mul.prefHeightProperty().bind(btn_height);
		btn_clear.prefHeightProperty().bind(btn_height);
		btn_ans.prefHeightProperty().bind(btn_height);
		btn_dot.prefHeightProperty().bind(btn_height);
		btn_oct.prefHeightProperty().bind(btn_height);
		btn_bin.prefHeightProperty().bind(btn_height);
		btn_dec.prefHeightProperty().bind(btn_height);
		btn_hex.prefHeightProperty().bind(btn_height);
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

	protected void design1() {
		container.getChildren().clear();
		container.add(lbl_answer, 1, 1, 6, 2);
		container.add(line_top, 1, 1, 6, 1);
		// Add column 1
		container.add(btn_A, 1, 4);
		container.add(btn_B, 1, 5);
		container.add(btn_C, 1, 6);
		container.add(btn_D, 1, 7);
		container.add(btn_E, 1, 8);
		container.add(btn_F, 1, 9);

		// Add column
		container.add(btn_hex, 2, 4);
		container.add(btn_oct, 2, 5);
		container.add(btn_7, 2, 6);
		container.add(btn_4, 2, 7);
		container.add(btn_1, 2, 8);
		container.add(btn_0, 2, 9, 2, 1);

		// Add column 2
		container.add(btn_bin, 3, 4);
		container.add(btn_dec, 3, 5);
		container.add(btn_8, 3, 6);
		container.add(btn_5, 3, 7);
		container.add(btn_2, 3, 8);

		// Add column 3
		container.add(btn_clear, 4, 4);
		container.add(btn_mod, 4, 5);
		container.add(btn_9, 4, 6);
		container.add(btn_6, 4, 7);
		container.add(btn_3, 4, 8);
		container.add(btn_ans, 4, 9);

		/// Add column 4
		container.add(btn_delete, 5, 4);
		container.add(btn_mul, 5, 5);
		container.add(btn_div, 5, 6);
		container.add(btn_add, 5, 7);
		container.add(btn_sub, 5, 8);
		container.add(btn_equal, 5, 9);
		resizeComponents();
		setStyles();
		if (lbl_answer.getText().isEmpty())
			check("Clear");
		else
			check("Equal");
	}

	protected void design2() {
		container.getChildren().clear();
		container.add(lbl_notelabel, 0, 0);
	}

	protected void setStyles() {
		super.setStyles();
		String style2_to_button = "-fx-background-radius: "
				+ "0;-fx-background-color: rgb(40, 40, 40); -fx-font: 13pt Serif;";

		btn_oct.setStyle(style2_to_button);
		btn_hex.setStyle(style2_to_button);
		btn_dec.setStyle(style2_to_button);
		btn_bin.setStyle(style2_to_button);
		btn_A.setStyle(style2_to_button);
		btn_B.setStyle(style2_to_button);
		btn_C.setStyle(style2_to_button);
		btn_D.setStyle(style2_to_button);
		btn_E.setStyle(style2_to_button);
		btn_F.setStyle(style2_to_button);

		Paint color = (Paint) Color.WHITE;

		btn_oct.setTextFill(color);
		btn_bin.setTextFill(color);
		btn_dec.setTextFill(color);
		btn_hex.setTextFill(color);
		btn_A.setTextFill(color);
		btn_B.setTextFill(color);
		btn_C.setTextFill(color);
		btn_D.setTextFill(color);
		btn_E.setTextFill(color);
		btn_F.setTextFill(color);
	}

	protected void eventHandler() {
		lbl_answer.setText(" ");

		// check the lbl_answer if it is valid or not before writing
		super.eventHandler();
		// activate binary
		btn_bin.setOnAction(e -> {
			String lbl = "";
			if (lbl_answer.getText().startsWith(" ")) {
				lbl = (lbl_answer.getText().substring(1, lbl_answer.getText().length()));
			} else
				lbl = lbl_answer.getText();
			btn_7.setDisable(true);
			btn_6.setDisable(true);
			btn_5.setDisable(true);
			btn_4.setDisable(true);
			btn_3.setDisable(true);
			btn_2.setDisable(true);
			btn_9.setDisable(true);
			btn_8.setDisable(true);
			btn_A.setDisable(true);
			btn_B.setDisable(true);
			btn_C.setDisable(true);
			btn_D.setDisable(true);
			btn_E.setDisable(true);
			btn_F.setDisable(true);
			if(!(lbl_answer.getText().endsWith(" * ") || lbl_answer.getText().endsWith(" / ") ||
					lbl_answer.getText().endsWith(" + ") || lbl_answer.getText().endsWith(" - ")||
					lbl_answer.getText().endsWith(" % ")))
			{
				int c = 0;
				if (binary == true)	c = 2;
			if (octal == true)	c = 8;
			if (hexa == true)	c=16;
			if (decimal == true)c=10;
			int x = Expression_Calculation.fromXto10(lbl_answer.getText(), c);
			lbl_answer.setText(Expression_Calculation.from10toX(x, 2));
			binary = true;
			octal = hexa = decimal = false;
			}
		});

		// activate octal
		btn_oct.setOnAction(e -> {
			String lbl = "";
			if (lbl_answer.getText().startsWith(" ")) {
				lbl = (lbl_answer.getText().substring(1, lbl_answer.getText().length()));
			} else
				lbl = lbl_answer.getText();
			btn_9.setDisable(true);
			btn_8.setDisable(true);
			btn_A.setDisable(true);
			btn_B.setDisable(true);
			btn_C.setDisable(true);
			btn_D.setDisable(true);
			btn_E.setDisable(true);
			btn_F.setDisable(true);
			btn_7.setDisable(false);
			btn_6.setDisable(false);
			btn_5.setDisable(false);
			btn_4.setDisable(false);
			btn_3.setDisable(false);
			btn_2.setDisable(false);
			if(!(lbl_answer.getText().endsWith(" * ") || lbl_answer.getText().endsWith(" / ") ||
					lbl_answer.getText().endsWith(" + ") || lbl_answer.getText().endsWith(" - ")||
					lbl_answer.getText().endsWith(" % ")))
			{
				int c = 0;
			if (binary == true)	c = 2;
			if (octal == true)	c = 8;
			if (hexa == true)	c=16;
			if (decimal == true)c=10;
			int x = Expression_Calculation.fromXto10(lbl_answer.getText(), c);
			lbl_answer.setText(Expression_Calculation.from10toX(x, 8));
			octal = true;
			binary = decimal = hexa = false;}
		});
		btn_equal.setOnAction(e->{calculate();});
		// activate hexa
		btn_hex.setOnAction(e -> {
			btn_A.setDisable(false);
			btn_B.setDisable(false);
			btn_C.setDisable(false);
			btn_D.setDisable(false);
			btn_E.setDisable(false);
			btn_F.setDisable(false);
			btn_7.setDisable(false);
			btn_6.setDisable(false);
			btn_5.setDisable(false);
			btn_4.setDisable(false);
			btn_3.setDisable(false);
			btn_2.setDisable(false);
			btn_9.setDisable(false);
			btn_8.setDisable(false);
			if(!(lbl_answer.getText().endsWith(" * ") || lbl_answer.getText().endsWith(" / ") ||
					lbl_answer.getText().endsWith(" + ") || lbl_answer.getText().endsWith(" - ")||
					lbl_answer.getText().endsWith(" % ")))
			{
				int c = 0;
				if (binary == true)	c = 2;
			if (octal == true)	c = 8;
			if (hexa == true)	c=16;
			if (decimal == true)c=10;
			int x = Expression_Calculation.fromXto10(lbl_answer.getText(), c);
			lbl_answer.setText(Expression_Calculation.from10toX(x, 16));
			octal = binary = decimal = false;
			hexa = true;}
		});

		// activate decimal
		btn_dec.setOnAction(e -> {
			String lbl = "";
			if (lbl_answer.getText().startsWith(" ")) {
				lbl = (lbl_answer.getText().substring(1, lbl_answer.getText().length()));
			} else
				lbl = lbl_answer.getText();
			btn_7.setDisable(false);
			btn_6.setDisable(false);
			btn_5.setDisable(false);
			btn_4.setDisable(false);
			btn_3.setDisable(false);
			btn_2.setDisable(false);
			btn_9.setDisable(false);
			btn_8.setDisable(false);
			btn_A.setDisable(true);
			btn_B.setDisable(true);
			btn_C.setDisable(true);
			btn_D.setDisable(true);
			btn_E.setDisable(true);
			btn_F.setDisable(true);
			if(!(lbl_answer.getText().endsWith(" * ") || lbl_answer.getText().endsWith(" / ") ||
					lbl_answer.getText().endsWith(" + ") || lbl_answer.getText().endsWith(" - ")||
					lbl_answer.getText().endsWith(" % ")))
			{
				int c = 0;
				if (binary == true)	c = 2;
			if (octal == true)	c = 8;
			if (hexa == true)	c=16;
			if (decimal == true)c=10;
			int x = Expression_Calculation.fromXto10(lbl_answer.getText(), c);
			lbl_answer.setText(Expression_Calculation.from10toX(x, 10));
			hexa =octal = binary = false;
			 decimal = true;}
		});
		btn_A.setOnAction(e -> {
			check("A");
		});
		btn_B.setOnAction(e -> {
			check("B");
		});
		btn_C.setOnAction(e -> {
			check("C");
		});
		btn_D.setOnAction(e -> {
			check("D");
		});
		btn_E.setOnAction(e -> {
			check("E");
		});
		btn_F.setOnAction(e -> {
			check("F");
		});
		btn_ans.setOnAction(e->{
			if(binary==true)lbl_answer.setText(lbl_answer.getText()+Integer.toBinaryString(ans));
			else if(octal==true)lbl_answer.setText(lbl_answer.getText()+Integer.toOctalString(ans)); 
			else if(binary==true)lbl_answer.setText(lbl_answer.getText()+Integer.toHexString(ans));
			else lbl_answer.setText(lbl_answer.getText()+ans);});

	}

	protected void delete(String exp) {
		// delete anyone word if there is ( Error, Infinity ) word

		if (exp.endsWith("Error"))
			exp = exp.substring(0, exp.length() - 5);
		else if (exp.endsWith("Infinity"))
			exp = exp.substring(0, exp.length() - 8);

		// delete ^2 if it is exist
		else if (exp.length() > 1 && exp.charAt(exp.length() - 1) == '^')
			exp = exp.substring(0, exp.length() - 3);
		// delete any operator or brackets
		else if (exp.length() > 2 && exp.charAt(exp.length() - 1) == ' ') {
			switch (exp.charAt(exp.length() - 2)) {
			case '+':
			case '-':
			case '*':
			case ')':
			case '(':
			case '/':
			case '%':
				exp = exp.substring(0, exp.length() - 2);
			}
		}
		// delete number or space
		if (exp.length() > 1)
			exp = exp.substring(0, exp.length() - 1);
		lbl_answer.setText(exp);
	}

	protected void calculate() {
		// calculate
		String cal = "";
		{
			if(decimal == true)
				lbl_answer.setText(" " + Expression_Calculation.evaluateExpression(lbl_answer.getText()));
			if (binary == true)
			{
				String x = Expression_Calculation.sxs(lbl_answer.getText(), 2);
				lbl_answer.setText(Expression_Calculation.evaluateExpression(x));
			}
			else if (octal == true)
			{
				String x = Expression_Calculation.sxs(lbl_answer.getText(), 8);
				lbl_answer.setText(Expression_Calculation.evaluateExpression(x));
			}
			else if (hexa == true)
			{
				String x = Expression_Calculation.sxs(lbl_answer.getText(), 16);
				lbl_answer.setText(Expression_Calculation.evaluateExpression(x));
			}
			check("Equal");
		}
	}
}
