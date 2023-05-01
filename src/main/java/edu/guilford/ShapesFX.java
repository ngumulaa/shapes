package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class ShapesFX extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // shapePane is where we draw the shapes 
        ShapePane shapePane = new ShapePane();
        // shapeList is where we build the list of shapes we'll draw
        ShapeList shapeList = new ShapeList();

        // add all the shapes in shapeList to shapePane
        for (Shape shape : shapeList) {
            shapePane.addShape(shape);
        }


        scene = new Scene(shapePane,800, 600);
        stage.setScene(scene);
        stage.show();

        System.out.println(shapeList);
    }

    public static void main(String[] args) {
        launch();
    }

}