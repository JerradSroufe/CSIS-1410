/* Group Homework 1
 * Jerrad Sroufe
 * Grouped with Peter and Hayden
 * 8/31/16
 */
package src;

import java.io.File;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Images extends Application {	
	
	// Our "main" method. Has the user select a file, then opens a window to view it.
	public void start(Stage primaryStage) {
		File userFile = userSelectFile();		    
	    
		try {
			ImageView userImage = fileToImageView(userFile);
			openImageViewer(userImage);
		} catch (NullPointerException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("No file was selected!");
			alert.show();
		}
	}
	
	
	// Has the user select a file:
	public File userSelectFile() {
		File selectedFile; 
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select an image");
		ExtensionFilter filter = new ExtensionFilter("Image Files", " *.png", " *.jpg", " *.gif");	// Sets our filter for image files only.
		fileChooser.getExtensionFilters().add(filter);												// Applies the filter.
		selectedFile = fileChooser.showOpenDialog(new Stage()); 									// Open the file chooser dialogue box and saves the file as the variable selectedFile.	
		return selectedFile;
	}
	
	// Returns a file as an ImageView:
	public ImageView fileToImageView(File file) {
		return new ImageView(file.toURI().toString());
	}
	
	// Opens a window to view a selected image:
	public void openImageViewer(ImageView image) {
		Stage stage = new Stage();
		GridPane pane = new GridPane();
		
		stage.setTitle("Group Homework 1");
		pane.setAlignment(Pos.CENTER);
		pane.add(image, 0, 0);				
		stage.setScene(new Scene(pane));	
		stage.show();
	}
}
