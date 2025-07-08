/**
 * Objective: Is to display a bar chart using JavaFX to show grade weight.
 * Algorithm: Creates  four rectangles sized by percentages, different colors each, and labeled at the top with text.
 * Input and Output: No user input. Output is a window showing the bar chart.
 * Created by: Orion Medrano
 * Date: 7/2/2025
 * Version: 1.0
 */

// Declares that this class belongs to the 'application' package
package application;

// Imports the base JavaFX Application class needed to launch the GUI
import javafx.application.Application;

// Imports the Scene class for creating the window scene
import javafx.scene.Scene;

// Imports the Pane layout which allows absolute positioning
import javafx.scene.layout.Pane;

// Imports the Color class to apply fill colors to shapes
import javafx.scene.paint.Color;

// Imports the Rectangle class to draw bar shapes
import javafx.scene.shape.Rectangle;

// Imports the Text class to add labels to each bar
import javafx.scene.text.Text;

// Imports the Stage class, which is the primary window container
import javafx.stage.Stage;

// Declares a public class 'BarChart' that extends JavaFX's Application class
public class BarChart extends Application {

    // This method is the entry point for JavaFX applications
    public void start(Stage primaryStage) {
        
        // Creates a pane as the root node of the scene graph
        Pane pane = new Pane();
        
        // Total height of the chart bars scale
        double height = 400;
        
        // Height of the pane/window itself
        double paneHeight = 250;

        // Creates the first bar (Project - 20%) with RED fill
        Rectangle r1 = new Rectangle(10, paneHeight - height * 0.2, 100, height * 0.2);
        r1.setFill(Color.YELLOW);
        // Adds label text above the first bar
        Text text1 = new Text(10, paneHeight - height * 0.2 - 10, "Project -- 20%");
        
        // Creates the second bar (Quiz - 10%) with BLUE fill
        Rectangle r2 = new Rectangle(10 + 110, paneHeight - height * 0.1, 100, height * 0.1);
        r2.setFill(Color.BLUE);
        // Adds label text above the second bar
        Text text2 = new Text(10 + 110, paneHeight - height * 0.1 - 10, "Quiz -- 10%");
        
        // Creates the third bar (Midterm - 30%) with PURPLE fill
        Rectangle r3 = new Rectangle(10 + 220, paneHeight - height * 0.3, 100, height * 0.3);
        r3.setFill(Color.PURPLE);
        // Adds label text above the third bar
        Text text3 = new Text(10 + 220, paneHeight - height * 0.3 - 10, "Midterm -- 30%");
        
        // Creates the fourth bar (Final - 40%) with TEAL fill
        Rectangle r4 = new Rectangle(10 + 330, paneHeight - height * 0.4, 100, height * 0.4);
        r4.setFill(Color.TEAL);
        // Adds label text above the fourth bar
        Text text4 = new Text(10 + 330, paneHeight - height * 0.4 - 10, "Final -- 40%");
        
        // Adds all rectangles and texts to the pane
        pane.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);
        
        // Creates a new Scene with the pane, width 500 and height of the pane
        Scene scene = new Scene(pane, 500, paneHeight);
        
        // Sets the window title
        primaryStage.setTitle("Bar Chart");
        // Sets the scene on the stage (window)
        primaryStage.setScene(scene);
        // Displays the window
        primaryStage.show();
    }

    // The main method that launches the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
