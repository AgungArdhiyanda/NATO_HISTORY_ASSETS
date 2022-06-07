package com.nato;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Controller extends App {

    private void setMedia(Media media) {
        App.mediaPlayer = new MediaPlayer(media);
        App.mediaPlayer.play();
    }

    public void musicPlay(String s) {
        String path = "src/main/resources/com/nato/resource/" + s + ".mp3";
        setMedia(new Media(new File(path).toURI().toString()));
    }

    @FXML
    private Button buttonEnter;

    @FXML
    public void enterMain() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        App.stage.setScene(new Scene(root));
    }

    // TOMBOL BUAT MASUK KE SETIAP KATEGORI
    @FXML
    private Button aircraftButton;

    @FXML
    private Button infantryButton;

    @FXML
    private Button landVehicleButton;

    @FXML
    private Button historyButton;

    @FXML
    private Button tankButton;

    @FXML
    private Button stealthAirCraftButton;

    @FXML
    private Button backToHomeButton;

    // BUAT NAMPILIN STAGE KATEGORI
    @FXML
    void toAircraftPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Aircraft.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("AH1Z_1");
    }

    @FXML
    void toInfantryPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BallisticMissile.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("BallisticMissile");

    }

    @FXML
    void toLandVehiclePage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LandVehicle.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("LandVehicleAudio");
    }

    @FXML
    void toHistoryPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("History.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("History");
    }

    @FXML
    void toTankPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainBattleTank.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("BattleTank");
    }

    @FXML
    void toStealthAircraftPage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("StealthAircraft.fxml"));
        App.stage.setScene(new Scene(root));
        musicPlay("StealthAircraft");
    }

    // BUTTON TO MAINPAGE
    @FXML
    void backToHome() throws IOException {
        if (App.mediaPlayer != null)
            App.mediaPlayer.stop();
        enterMain();
    }
}
