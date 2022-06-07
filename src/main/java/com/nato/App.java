//Agung Kartika Ardhiyanda
//H071211064
//Muhammad Faiz Fatwa Syarifuddin
//H071211069
package com.nato;


import java.io.IOException;
import java.net.URISyntaxException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class App extends Application {

    public static Stage stage;
    public static MediaPlayer mediaPlayer;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        Parent root = FXMLLoader.load(getClass().getResource("Beginning.fxml"));
        Image image = new Image(getClass().getResourceAsStream("resource/app-logo.png"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        App.stage = stage;
    
        stage.setTitle("NATO HISTORY AND ASSETS");
        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.show();
    }

}
