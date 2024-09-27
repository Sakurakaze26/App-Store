package guissica_soho;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

import guissica_soho.model.Game;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Path jsonPath = Paths.get("src/main/java/assets/appStore.json");
        String jsonContent = new String(Files.readAllBytes(jsonPath));
    
        Gson gson = new Gson();
        Game[] games = gson.fromJson(jsonContent, Game[].class);
    
        //first game title (for testing if the json is working)
        String gameTitle = games[0].getTitle();
    

        //gui without fxml
        //add more gui components below
        Label label = new Label(gameTitle);
    
        Scene scene = new Scene(label, 750, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

