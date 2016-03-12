package com.rcgonzalezf.yourapp;

import com.rcgonzalezf.yourapp.TestDependency;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

	// Testing the library is linked correctly
        TestDependency td = new TestDependency();
        td.foo();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
