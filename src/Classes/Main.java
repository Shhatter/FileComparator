package Classes;

import Model.MergeTask;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Date;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("File Comparator");
        primaryStage.setScene(new Scene(root, 800 , 600));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

       /* mergeTask =new MergeTask(path,path2,null,"1","Merge_2",LocalDateTime.parse("2017-10-10)"),0,null );
        mergeTask = new MergeTask(path,path2,null,);
        System.out.println(        mergeTask.getMainDirectoryPath());
*/


    }
}
