package P;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Main extends Application 
{
	protected Simple s = new Simple();
	protected Button btn_Scientific,btn_Simple,
		btn_Programmer,btn_Matrices,btn_Equation;
    
	@Override
    public void start(Stage primaryStage)
    {
        s.initiateComponents();
        s.setStyles();
        welcomePage();
        
        btn_Scientific.setOnAction(e->{	s = new Scientific(); ss(primaryStage);});
		btn_Simple.setOnAction(e->{s = new Simple(); ss(primaryStage);});
		btn_Matrices.setOnAction(e->{s = new Matrices(); ss(primaryStage);});
		btn_Programmer.setOnAction(e->{s = new Programmer(); ss(primaryStage);});
		btn_Equation.setOnAction(e->{s = new Equation(); /*ss(primaryStage);*/});
		
		// close on escape button (back button in android)
    	s.container.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				if(event.getCode() == KeyCode.ESCAPE)	
						System.exit(0);
			}
    		
		});
       
       Scene scene= new Scene(s.container, 350, 550);
       primaryStage.setFullScreenExitHint("");
       //primaryStage.setFullScreen(true);
       primaryStage.centerOnScreen();
       primaryStage.setTitle("3MG Calculator");
       primaryStage.setScene(scene);
       primaryStage.show();
    }
    
    protected void welcomePage()
	{
		s.container.getChildren().clear();
		btn_Simple = new Button("Simple");
		btn_Equation = new Button("Equation");
		btn_Scientific = new Button("Scientific");
		btn_Matrices = new Button("Matrices");
		btn_Programmer = new Button("Programmer");
		
		
		s.container.setVgap(5);
		s.container.setHgap(15);
		s.container.add(btn_Simple, 0, 0);
		s.container.add(btn_Scientific, 0, 1);
		s.container.add(btn_Matrices, 0, 2);
		s.container.add(btn_Programmer, 0, 3);
		s.container.add(btn_Equation, 0, 4);
		
		btn_Scientific.prefWidthProperty().bind(s.container.widthProperty().subtract(30));
		btn_Scientific.prefHeightProperty().bind(s.container.heightProperty().divide(6));
		btn_Simple.prefWidthProperty().bind(s.container.widthProperty().subtract(30));
		btn_Simple.prefHeightProperty().bind(s.container.heightProperty().divide(6));
		btn_Matrices.prefWidthProperty().bind(s.container.widthProperty().subtract(30));
		btn_Matrices.prefHeightProperty().bind(s.container.heightProperty().divide(6));
		btn_Programmer.prefWidthProperty().bind(s.container.widthProperty().subtract(30));
		btn_Programmer.prefHeightProperty().bind(s.container.heightProperty().divide(6));
		btn_Equation.prefWidthProperty().bind(s.container.widthProperty().subtract(30));
		btn_Equation.prefHeightProperty().bind(s.container.heightProperty().divide(6));
		
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
 
    private void ss(Stage stage)
    {
    	s.initiateComponents();
    	s.setStyles();
    	s.design1();
    	s.eventHandler();
    	s.resizeComponents();
    	Scene scene = new Scene(s.container, 350, 550);
    	stage.setScene(scene);
    }
    
	public static void main(String[] args) 
    {
        launch(args);
    }

}