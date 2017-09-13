package Model;

import javafx.collections.ObservableList;
import javafx.scene.control.TreeItem;

import java.io.File;
import java.util.ArrayList;

public class TreeReader2 extends TreeItem<File> {

public static ArrayList<Long> uniqueIdList;
/*

    private HashMap<String, CFile> allFiles;
    private HashMap<String , CFolder> allFolders;
    private LinkedBlockingDeque linkedBlockingDeque;
*/
    public TreeReader2(File f )
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
