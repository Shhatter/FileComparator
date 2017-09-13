package Model;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingDeque;

public class TreeReader extends TreeItem<File> {

public static ArrayList<Long> uniqueIdList;
/*

    private HashMap<String, CFile> allFiles;
    private HashMap<String , CFolder> allFolders;
    private LinkedBlockingDeque linkedBlockingDeque;
*/
    public TreeReader(File f )
    {
        super(f);
    }

    @Override
    public ObservableList<TreeItem<File>> getChildren() {


        return super.getChildren();
    }


    public void returnFIlesystem()
    {

    }


    private void generateUniqueId()
    {

    }

}
