package Classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Path;
import java.nio.file.Paths;
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

        Path path2 = Paths.get("C:\\HashiCorp\\Vagrant");
        Path path = Paths.get("C:\\fedora");
        MergeTask mergeTask;
        mergeTask =new MergeTask(path,path2,null,"1","Merge_2",new Date("2017/10/10"),0,null );
        System.out.println(        mergeTask.getMainDirectory());


        launch(args);
    }
}
