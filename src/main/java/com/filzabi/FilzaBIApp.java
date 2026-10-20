
package com.filzabi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FilzaBIApp extends Application {

    private static final String PURPLE = "#8B5CF6";
    private static final String BACKGROUND = "#111118";
    private static final String PANEL = "#1B1B27";
    private static final String TEXT = "#F4F1FF";

    @Override
    public void start(Stage stage) {

        Label logo = new Label("FilzaBI");
        logo.setStyle(
            "-fx-font-size: 25px;" +
            "-fx-font-weight: bold;" +
            "-fx-text-fill: " + PURPLE + ";"
        );

        Label subtitle = new Label("Business Intelligence Studio");
        subtitle.setTextFill(Color.web("#A6A3B8"));

        VBox branding = new VBox(5, logo, subtitle);
        branding.setAlignment(Pos.CENTER_LEFT);

        Button importButton = new Button("+ Import Data");
        importButton.setStyle(
            "-fx-background-color: " + PURPLE + ";" +
            "-fx-text-fill: white;" +
            "-fx-font-weight: bold;" +
            "-fx-padding: 11 18 11 18;" +
            "-fx-background-radius: 8;"
        );

        HBox topBar = new HBox(branding, importButton);
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setPadding(new Insets(22));
        topBar.setSpacing(20);
        HBox.setHgrow(branding,
            javafx.scene.layout.Priority.ALWAYS);

        Label heading = new Label("Your data. Your insights.");
        heading.setStyle(
            "-fx-font-size: 29px;" +
            "-fx-font-weight: bold;" +
            "-fx-text-fill: " + TEXT + ";"
        );

        Label description = new Label(
            "Analyze data, discover trends, and build dashboards."
        );
        description.setStyle(
            "-fx-font-size: 14px;" +
            "-fx-text-fill: #A6A3B8;"
        );

        Label welcome = new Label("Ready to explore your data?");
        welcome.setStyle(
            "-fx-font-size: 19px;" +
            "-fx-text-fill: " + TEXT + ";"
        );

        Label details = new Label(
            "Import a CSV or Excel file to get started."
        );
        details.setStyle("-fx-text-fill: #A6A3B8;");

        VBox welcomeCard = new VBox(14, welcome, details, importButton);
        welcomeCard.setAlignment(Pos.CENTER);
        welcomeCard.setPadding(new Insets(35));
        welcomeCard.setStyle(
            "-fx-background-color: " + PANEL + ";" +
            "-fx-background-radius: 16;"
        );

        // The import button is placed in the welcome card for now.
        topBar.getChildren().remove(importButton);

        VBox content = new VBox(12, heading, description, welcomeCard);
        content.setPadding(new Insets(30));
        content.setAlignment(Pos.TOP_LEFT);
        VBox.setVgrow(welcomeCard,
            javafx.scene.layout.Priority.ALWAYS);

        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(content);
        root.setStyle("-fx-background-color: " + BACKGROUND + ";");

        Scene scene = new Scene(root, 1100, 700);

        stage.setTitle("FilzaBI — Business Intelligence Studio");
        stage.setMinWidth(850);
        stage.setMinHeight(550);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
