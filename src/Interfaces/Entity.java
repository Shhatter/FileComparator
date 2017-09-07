package Interfaces;

import Classes.CFolder;

import java.util.Date;

public abstract class Entity {

    private final String id;
    private String name;
    private String directory;
    private long size;
    private Date dateCreated;
    private Date dateModified;
    private String folderLocation;
    private long mdFive;
    private CFolder parentFolder;

    public Entity(String id, String name, String directory, long size, Date dateCreated, Date dateModified, String folderLocation, long mdFive, CFolder parentFolder) {
        this.id = id;
        this.name = name;
        this.directory = directory;
        this.size = size;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.folderLocation = folderLocation;
        this.mdFive = mdFive;
        this.parentFolder = parentFolder;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getFolderLocation() {
        return folderLocation;
    }

    public void setFolderLocation(String folderLocation) {
        this.folderLocation = folderLocation;
    }

    public long getMdFive() {
        return mdFive;
    }

    public void setMdFive(long mdFive) {
        this.mdFive = mdFive;
    }

    public CFolder getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(CFolder parentFolder) {
        this.parentFolder = parentFolder;
    }
}