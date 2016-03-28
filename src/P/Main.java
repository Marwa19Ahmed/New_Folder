package P;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application 
{
	Label lblanswer;
	Button btn_add, btn_sub, btn_div, btn_mul, btn_clear,
		   btn_dot, btn_openBra, btn_closeBra, btn_square,
   		   btn_sqrt, btn_delete, btn_equal, btn_mod,
   		   btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
   		   btn_7, btn_8, btn_9, btn_0, btn_lg, btn_log;
    
    @Override
    public void start(Stage primaryStage)
    {
       InitiateComponents(); 	 
       ResizeComponents();
       SetStyles();
       
       GridPane root = new GridPane();
       root.setAlignment(Pos.TOP_LEFT);
       root.setHgap(5);
       root.setVgap(5);
       AddComponents(root);
       
       Scene scene = new Scene(root, 335, 280);
       primaryStage.setTitle("Cal");
       primaryStage.setScene(scene);
       primaryStage.show();
       
          	
    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
    private void InitiateComponents()
    {
    	btn_add = new Button("+");
    	btn_sub = new Button("-");
    	btn_div = new Button("/");
    	btn_mul = new Button("*");
    	btn_clear = new Button("C");
    	btn_dot = new Button(".");
    	btn_openBra = new Button("(");
    	btn_closeBra = new Button(")");
    	btn_square = new Button("X^2");
    	btn_sqrt = new Button("S");
    	btn_delete = new Button("<-");
    	btn_equal = new Button("=");
    	btn_mod = new Button("%");
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
    	lblanswer = new Label();
    }
   
    private void ResizeComponents()
    {
    	lblanswer.setPrefWidth(325);
        lblanswer.setPrefHeight(50);
        
        btn_add.setPrefWidth(50);
     	btn_sub.setPrefWidth(50);
     	btn_div.setPrefWidth(50);
     	btn_mul.setPrefWidth(50);
     	btn_clear.setPrefWidth(50);
     	btn_dot.setPrefWidth(50);
     	btn_openBra.setPrefWidth(50);
     	btn_closeBra.setPrefWidth(50);
     	btn_square.setPrefWidth(50);
     	btn_sqrt.setPrefWidth(50);
     	btn_delete.setPrefWidth(50);
     	btn_equal.setPrefWidth(50);
     	btn_mod.setPrefWidth(50);
     	btn_1.setPrefWidth(50);
     	btn_2.setPrefWidth(50);
     	btn_3.setPrefWidth(50);
     	btn_4.setPrefWidth(50);
     	btn_5.setPrefWidth(50);
     	btn_6.setPrefWidth(50);
     	btn_7.setPrefWidth(50);
     	btn_8.setPrefWidth(50);
     	btn_9.setPrefWidth(50);
     	btn_0.setPrefWidth(50);
     	btn_lg.setPrefWidth(50);
     	btn_log.setPrefWidth(50);
     	
     	btn_add.setPrefHeight(50);
     	btn_sub.setPrefHeight(50);
     	btn_div.setPrefHeight(50);
     	btn_mul.setPrefHeight(50);
     	btn_clear.setPrefHeight(50);
     	btn_dot.setPrefHeight(50);
     	btn_openBra.setPrefHeight(50);
     	btn_closeBra.setPrefHeight(50);
     	btn_square.setPrefHeight(50);
     	btn_sqrt.setPrefHeight(50);
     	btn_delete.setPrefHeight(50);
     	btn_equal.setPrefHeight(50);
     	btn_mod.setPrefHeight(50);
     	btn_1.setPrefHeight(50);
     	btn_2.setPrefHeight(50);
     	btn_3.setPrefHeight(50);
     	btn_4.setPrefHeight(50);
     	btn_5.setPrefHeight(50);
     	btn_6.setPrefHeight(50);
     	btn_7.setPrefHeight(50);
     	btn_8.setPrefHeight(50);
     	btn_9.setPrefHeight(50);
     	btn_0.setPrefHeight(50);
     	btn_log.setPrefHeight(50);
     	btn_lg.setPrefHeight(50);
    }
    
    private void AddComponents(GridPane root)
    {  	    
         root.add(lblanswer,1,1,6,2);
         
         root.add(btn_7,1,3);
         root.add(btn_8,2,3);
         root.add(btn_9,3,3);
         root.add(btn_add,4,3);
         root.add(btn_openBra,5,3);
         root.add(btn_closeBra,6,3);
         
         root.add(btn_4,1,4);
         root.add(btn_5,2,4);
         root.add(btn_6,3,4);
         root.add(btn_sub,4,4);
         root.add(btn_sqrt,5,4);
         root.add(btn_square,6,4);
         
         root.add(btn_1,1,5);
         root.add(btn_2,2,5);
         root.add(btn_3,3,5);
         root.add(btn_mul,4,5);
         root.add(btn_clear,5,5);
         root.add(btn_delete,6,5);
         
         root.add(btn_0,1,6);
         root.add(btn_dot,2,6);
         root.add(btn_equal,3,6);
         root.add(btn_div,4,6);
         root.add(btn_log,5,6);
         root.add(btn_lg,6,6);
    }
    
    private void SetStyles()
    {
    	lblanswer.setStyle("-fx-border-radius: 10; -fx-background-radius: 10;"+
    			"-fx-background-color: #ffffff; -fx-border-color: #00ffff;");
    	btn_add.setStyle("-fx-background-radius: 30;");
     	btn_sub.setStyle("-fx-background-radius: 30;");
     	btn_div.setStyle("-fx-background-radius: 30;");
     	btn_mul.setStyle("-fx-background-radius: 30;");
     	btn_clear.setStyle("-fx-background-radius: 30;");
     	btn_dot.setStyle("-fx-background-radius: 30;");
     	btn_openBra.setStyle("-fx-background-radius: 30;");
     	btn_closeBra.setStyle("-fx-background-radius: 30;");
     	btn_square.setStyle("-fx-background-radius: 30;");
     	btn_sqrt.setStyle("-fx-background-radius: 30;");
     	btn_delete.setStyle("-fx-background-radius: 30;");
     	btn_equal.setStyle("-fx-background-radius: 30;");
     	btn_mod.setStyle("-fx-background-radius: 30;");
     	btn_1.setStyle("-fx-background-radius: 30;");
     	btn_2.setStyle("-fx-background-radius: 30;");
     	btn_3.setStyle("-fx-background-radius: 30;");
     	btn_4.setStyle("-fx-background-radius: 30;");
     	btn_5.setStyle("-fx-background-radius: 30;");
     	btn_6.setStyle("-fx-background-radius: 30;");
     	btn_7.setStyle("-fx-background-radius: 30;");
     	btn_8.setStyle("-fx-background-radius: 30;");
     	btn_9.setStyle("-fx-background-radius: 30;");
     	btn_0.setStyle("-fx-background-radius: 30;");
     	btn_log.setStyle("-fx-background-radius: 30;");
     	btn_lg.setStyle("-fx-background-radius: 30;");
    }
}
