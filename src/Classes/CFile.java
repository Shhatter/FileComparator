package Classes;

import Interfaces.Entity;

import java.util.Date;

public class CFile extends Entity{

    private String fileType;

    public CFile(String id, String name, String directory, long size, Date dateCreated, Date dateModified, String folderLocation, long mdFive, CFolder parentFolder, String fileType) {
        super(id, name, directory, size, dateCreated, dateModified, folderLocation, mdFive, parentFolder);
        this.fileType = fileType;
    }
}