package Interfaces;

import Model.CFolder;

import java.io.File;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public abstract class Entity {


    private File file;
    private final UUID id;
    private String name;
    private Path directory;
    private long size;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    private String folderLocation;
    private long mdFive;
    private CFolder parentFolder;


    public Entity() {
        this.id = UUID.randomUUID();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getDirectory() {
        return directory;
    }

    public void setDirectory(Path directory) {
        this.directory = directory;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
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