// Kristian Dimitrov
// 04.13/2017
// Chapter 14


import javafx.application.Application;
import java.util.ArrayList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application
{
	ArrayList<Person> list = new ArrayList<Person>();
	TextField firstnameTXT;
	TextField lastnameTXT;
	TextField IDTXT;
	TextField IDdefineTXT;
 
	@Override // Override the start method in the Application class
  public void start(Stage primaryStage) 
  {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    
    // Place nodes in the pane
    
    firstnameTXT = new TextField();
    lastnameTXT = new TextField();
    IDTXT = new TextField();
    IDdefineTXT = new TextField();
    
    
    
    pane.add(new Label("First Name:"), 0, 0);
    pane.add(firstnameTXT, 1, 0);
    

    pane.add(new Label("LastName:"), 0, 1); 
    pane.add(lastnameTXT, 1, 1);
  
    
    
    pane.add(new Label("ID:"), 0, 2);
    pane.add(IDTXT, 1, 2);
    
    
  
    Button btAdd = new Button("ADD");
    pane.add(btAdd, 1, 4);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
    
    
    Button btClear = new Button("Clear");
    pane.add(btClear, 1 ,4);
    GridPane.setHalignment(btClear, HPos.CENTER);
    
    Button btFind = new Button("Find");
    pane.add(btFind, 0, 4);
    GridPane.setHalignment(btFind, HPos.LEFT);
    
    
   
    
    
    btAdd.setOnAction(e ->  AddPerson());
    btFind.setOnAction(e ->  FindPerson());
    btClear.setOnAction(e ->  ClearText());
  
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("GUI"+ ""); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
	private void ClearText()
	{
		firstnameTXT.setText("");
		lastnameTXT.setText("");
		IDTXT.setText("");
		
		
	}
	private void FindPerson()
	{
		System.out.println("this is the text from textfield IDTXTL " + IDTXT.getText());
		String FirstName = firstnameTXT.getText();
		String LastName = lastnameTXT.getText();
		String ID = IDTXT.getText();
		Person person2 = new Person(FirstName, LastName, ID);
		list.add(person2);
		for(Person p : list)

		{
			p.printID();
		}
		
	}

  private void AddPerson()
  {
	  /**Person pP = new Person();
	  
	  pP.firstname = firstname.getText();
	  pP.firstname = firstname.getText();
	  pP.lastname = lastname.getText();
	  pP.ID = ID.getText();
	  list.add(pP);
	  **/
	  System.out.println("this is the text from textfield firstnameTXT: " + firstnameTXT.getText());
	  String FirstName = firstnameTXT.getText();
	  String LastName = lastnameTXT.getText();
	  String ID = IDTXT.getText();
	  Person person1 = new Person(FirstName, LastName, ID);
	  list.add(person1);
	  for(Person p : list)
	  {
		  p.printPerson();
	  }
  }
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args)
  {
    launch(args);
  }
} 

