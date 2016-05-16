package P;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application 
{
	public static Simple s = new Simple();
	public static Scientific ss = new Scientific();
	public static Matrices sss = new Matrices();
	public static Programmer ssss = new Programmer(); 
	public static GridPane con = new GridPane();
	public static Button btn_Scientific,btn_Simple,
		btn_Programmer,btn_Matrices,btn_Equation,null_;
    
	@Override
    public void start(Stage primaryStage)
    {
	    s.initiateComponents();
        s.setStyles();
        welcomePage();
        calculatorDetection();
		
       Scene scene= new Scene(con, 350, 550);
       primaryStage.setFullScreenExitHint("");
       //primaryStage.setFullScreen(true);
       primaryStage.centerOnScreen();
       primaryStage.setTitle("3MG Calculator");
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    
	protected static void calculatorDetection()
	{
		btn_Simple.setOnAction(e->{calculatorIntialization(1);});
        btn_Scientific.setOnAction(e->{calculatorIntialization(2);});
		btn_Matrices.setOnAction(e->{calculatorIntialization(3);});
		btn_Programmer.setOnAction(e->{calculatorIntialization(4);});
		btn_Equation.setOnAction(e->{});
		
		// close on escape button (back button in android)
		con.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				if(event.getCode() == KeyCode.ESCAPE)	
						System.exit(0);
			}
		});
	}
	
    protected static void welcomePage()
	{
		con.getChildren().clear();
		//initialize component
		btn_Simple = new Button("Simple");
		btn_Equation = new Button("Equation");
		btn_Scientific = new Button("Scientific");
		btn_Matrices = new Button("Matrices");
		btn_Programmer = new Button("Programmer");
		null_ = new Button();
		
		con.setVgap(5);
		con.setHgap(15);
		
		//add component
		con.add(null_, 0, 0);
		con.add(btn_Simple, 1, 1);
		con.add(btn_Scientific, 1, 2);
		con.add(btn_Matrices, 1, 3);
		con.add(btn_Programmer, 1, 4);
		con.add(btn_Equation, 1, 5);
		
		//resize component
		null_.prefWidthProperty().bind(con.widthProperty().divide(200));
		null_.prefHeightProperty().bind(con.heightProperty().divide(200));
		btn_Scientific.prefWidthProperty().bind(con.widthProperty().subtract(50));
		btn_Scientific.prefHeightProperty().bind(con.heightProperty().divide(6));
		btn_Simple.prefWidthProperty().bind(con.widthProperty().subtract(50));
		btn_Simple.prefHeightProperty().bind(con.heightProperty().divide(6));
		btn_Matrices.prefWidthProperty().bind(con.widthProperty().subtract(50));
		btn_Matrices.prefHeightProperty().bind(con.heightProperty().divide(6));
		btn_Programmer.prefWidthProperty().bind(con.widthProperty().subtract(50));
		btn_Programmer.prefHeightProperty().bind(con.heightProperty().divide(6));
		btn_Equation.prefWidthProperty().bind(con.widthProperty().subtract(50));
		btn_Equation.prefHeightProperty().bind(con.heightProperty().divide(6));
		
		//add style to component
				con.setStyle("-fx-background-color: rgb(0, 0, 0);");
				null_.setStyle("-fx-background-color: rgb(0, 0, 0);");
		String style2_to_button = "-fx-background-radius: "+
    			"0;-fx-background-color: rgb(40, 40, 40); -fx-font: 15pt Serif;";
		btn_Scientific.setStyle(style2_to_button);
		btn_Simple.setStyle(style2_to_button);
		btn_Matrices.setStyle(style2_to_button);
		btn_Programmer.setStyle(style2_to_button);
		btn_Equation.setStyle(style2_to_button);
		
		Paint color = (Paint) Color.WHITE;
     	btn_Scientific.setTextFill(color);
     	btn_Simple.setTextFill(color);
     	btn_Matrices.setTextFill(color);
     	btn_Programmer.setTextFill(color);  
     	btn_Equation.setTextFill(color);
	}
 
    protected static void calculatorIntialization(int i)
    {
    	switch(i)
    	{
	    	case 1:s = new Simple(); break;
	    	case 2:s = new Scientific(); break;
	    	case 3:s = new Matrices(); break;
	    	case 4:s = new Programmer(); break;
    	}
    	
    	s.initiateComponents();
    	s.setStyles();
    	s.design1();
    	s.eventHandler();
    	s.resizeComponents();
    	
    	s.container.prefWidthProperty().bind(con.widthProperty());
    	s.container.prefHeightProperty().bind(con.heightProperty());
    	con.getChildren().clear();
    	con.add(s.container, 0, 0);
    	
    }
    
	public static void main(String[] args) 
    {
        launch(args);
    }

}