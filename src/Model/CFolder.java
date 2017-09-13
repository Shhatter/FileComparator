package Model;

import Interfaces.Entity;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class CFolder extends Entity{

    private HashMap<UUID,Entity> containedFiles ;
    private DirectoryAdder directoryAdder;
    private CFolder parentNode ;

    public CFolder() {
        super();
        this.containedFiles = new HashMap<>();
        new DirectoryAdder().start();

    }

    public CFolder(Path mainDirectoryPath,CFolder parentNode) {
        super();
        this.parentNode = parentNode;
        this.containedFiles = containedFiles;
        this.directoryAdder = new DirectoryAdder();
        directoryAdder.start();
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

    private class DirectoryAdder extends Thread
    {
        DirectoryAdder()
        {
            directoryAdder.start();
        }


        public void run()
        {
            System.out.println("Directory Adder");
        }
    }

}
