package edu.guilford;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

// ShapePane will extend Pane because we want exact control over where we place 
// the graphic objects 
public class ShapePane extends Pane {
    // ShapePane does everything Pane does

    // constructor this constructor essentially overrides the Pane default constructor
    public ShapePane() {
        // When a class extends another class, the first line sould be asking the superclass 
        // to run its constructor 
        super(); // *this* refers to the current object; *super* refers to the superclass
        // could do other stuff here as well
    }

    // add a Shape to the Pane 
    public void addShape(Shape shape) {
        // add the shape to the Pane 
        this.getChildren().add(shape);
    }

    // remove a Shape from the Pane
    public void removeShape(Shape shape) {
        // remove the shape from the Pane 
        this.getChildren().remove(shape);
    }

    // clear all Shapes from the Pane
    public void clearShapes() {
        // clear all the shapes from the Pane 
        this.getChildren().clear();
    } 

}
