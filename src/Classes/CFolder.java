package Classes;

import Interfaces.Entity;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;

public class CFolder extends Entity{

    private ArrayList<Entity> containedFiles;

    public CFolder(String id, String name, Path directory, long size, Date dateCreated, Date dateModified, String folderLocation, long mdFive, CFolder parentFolder, ArrayList<Entity> containedFiles) {
        super(id, name, directory, size, dateCreated, dateModified, folderLocation, mdFive, parentFolder);
        this.containedFiles = new ArrayList<Entity>(containedFiles);
    }







    public ArrayList<Entity> getContainedFiles() {
        return containedFiles;
    }

    public void setContainedFiles(ArrayList<Entity> containedFiles) {
        this.containedFiles = containedFiles;
    }

}
