package Classes;
import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.ResourceBundle;

import Model.MergeTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Controller implements Initializable{

public Button confirmMergeButton;



public void initialize(URL location, ResourceBundle resources)
{
}

@FXML
public void confirmMerge(ActionEvent e)
{
    //MessageBox
    Path path2 = Paths.get("C:\\HashiCorp\\Vagrant");
    Path path = Paths.get("C:\\fedora");
//    MergeTask mergeTask = new MergeTask()


    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Flow monitor ");
    alert.setHeaderText("Status");
    alert.setContentText("Created new Merge Task !");
    alert.showAndWait();
}

}
