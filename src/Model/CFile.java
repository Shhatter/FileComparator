package Model;

import Interfaces.Entity;

import java.io.File;
import java.nio.file.Path;
import java.util.Date;
import java.util.UUID;

public class CFile extends Entity{

    private String fileType;
    private CFolder parent;


    public CFile(Path directory,CFolder parent,String fileType,int treeDepth) {
        super();
        this.fileType =   fileType;
        this.setDirectory(directory);
        this.parent = parent;
        this.setTreeDeph(treeDepth);
        this.setFile(new File(directory.toString()));
    }




}
