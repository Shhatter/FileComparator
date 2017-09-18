package Model;

import Interfaces.Entity;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class CFolder extends Entity{


    private boolean isDirectory;
    private HashMap<UUID,Entity> containedFiles ;
    private HashMap<UUID,Entity> globalHashMap ;
    private DirectoryAdder directoryAdder;
    private CFolder parentNode ;


    public CFolder(Path directory,CFolder parentNode,int treeDepth) {
        super();
        this.setTreeDeph(treeDepth);
        this.setDirectory(directory);
        this.setFile(new File(directory.toString()));
        this.parentNode = parentNode;
        if(getFile().isDirectory())
        {
            isDirectory = true;
            this.directoryAdder = new DirectoryAdder(this);
            directoryAdder.start();

        }
        else
        {
            System.out.println("Its not a directory ");
            throw new IllegalArgumentException("Problem with directory path");
        }
    }

    private class DirectoryAdder extends Thread
    {
        CFolder cFolder;
        DirectoryAdder(CFolder cFolder)
        {
            this.cFolder = cFolder;
            directoryAdder.start();
        }


        public void run()
        {
            System.out.println("Directory Adder started !" + cFolder.getTreeDeph() );
            Path path;
            Entity entity;
            String pathExt;

            for (File fileEntry: cFolder.getFile().listFiles() )
            {

                if(fileEntry.isDirectory())
                {
                    path = Paths.get(fileEntry.getPath());
                    entity = new CFolder(path, cFolder, getTreeDeph() + 1);
                    cFolder.getContainedFiles().put(entity.getId(),entity);

                }
                else
                {

                    path = Paths.get(fileEntry.getPath());
                    pathExt = path.toString().substring(path.toString().lastIndexOf("."));
                    entity = new CFile(path,cFolder,pathExt,getTreeDeph()+1);
                    cFolder.getContainedFiles().put(entity.getId(),entity);
                }
            }
        }
    }

    public HashMap<UUID, Entity> getContainedFiles() {
        return containedFiles;
    }

    public void setContainedFiles(HashMap<UUID, Entity> containedFiles) {
        this.containedFiles = containedFiles;
    }

    public DirectoryAdder getDirectoryAdder() {
        return directoryAdder;
    }

    public void setDirectoryAdder(DirectoryAdder directoryAdder) {
        this.directoryAdder = directoryAdder;
    }


    public void addToGlobalHashList(Entity hashObject)
    {
        globalHashMap.put(hashObject.getId(),hashObject);
    }






}
