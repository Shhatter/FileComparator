package Model;

import Interfaces.Entity;
import Interfaces.Strategy;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class MergeTask {

    private boolean firstCreation = true;
    private final UUID id;
    private Path mainDirectoryPath, comparedDirectoryPath, optionalDestDirectoryPath;
    private String mergeTaskID ;
    private String mergeTaskName;
    private LocalDateTime startDate;
    //private float progressBarPercent; // fancy, can be not implemented at all
    private ArrayList<Conflict> conflictList;
    //private TreeReader mainDirectoryTree,comparedDirectoryTree,optionalDestDirectoryTree;
    private CFolder mainDirectoryFileSystem ;
    private CFolder comparedDirectorySystem ;
    private CFolder optionalDirectorySystem ;
    private Strategy strategy;
    private boolean isOptionalLocationSet;


    public MergeTask( Path mainDirectoryPath, Path comparedDirectoryPath, Path optionalDestDirectoryPath, String mergeTaskID, String mergeTaskName) {
        this.id = UUID.randomUUID();
        this.mainDirectoryPath = mainDirectoryPath;
        this.comparedDirectoryPath = comparedDirectoryPath;
        this.optionalDestDirectoryPath = optionalDestDirectoryPath;
        this.mergeTaskID = mergeTaskID;
        this.mergeTaskName = mergeTaskName;

        if (firstCreation)
        {
            firstCreation = false ;
            createFileSystem();
        }
    }

    public void createFileSystem()
    {

        mainDirectoryFileSystem.setParentFolder(null);
        comparedDirectorySystem.setParentFolder(null);
        mainDirectoryFileSystem.setDirectory(mainDirectoryPath);
        comparedDirectorySystem.setDirectory(comparedDirectoryPath);

        try
        {
            mainDirectoryFileSystem = new CFolder(mainDirectoryPath, null,0);
        } catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }


        try
        {
            comparedDirectorySystem = new CFolder(comparedDirectoryPath, null,0);
        } catch (IllegalArgumentException e)
        {
            e.printStackTrace();

        }
        if (optionalDestDirectoryPath != null)
        {
            optionalDirectorySystem.setParentFolder(null);
            optionalDirectorySystem.setDirectory(optionalDestDirectoryPath);
            isOptionalLocationSet = true;
            try
            {
                optionalDirectorySystem = new CFolder(optionalDestDirectoryPath, null,0);
            } catch (IllegalArgumentException e)
            {
                e.printStackTrace();
            }

        }
        else
        {
            isOptionalLocationSet = false ;
        }
    }

    public Path getMainDirectoryPath() {
        return mainDirectoryPath;
    }

    public void setMainDirectoryPath(Path mainDirectoryPath) {
        this.mainDirectoryPath = mainDirectoryPath;
    }

    public Path getComparedDirectoryPath() {
        return comparedDirectoryPath;
    }

    public void setComparedDirectoryPath(Path comparedDirectoryPath) {
        this.comparedDirectoryPath = comparedDirectoryPath;
    }

    public Path getOptionalDestDirectoryPath() {
        return optionalDestDirectoryPath;
    }

    public void setOptionalDestDirectoryPath(Path optionalDestDirectoryPath) {
        this.optionalDestDirectoryPath = optionalDestDirectoryPath;
    }

    public String getMergeTaskID() {
        return mergeTaskID;
    }

    public void setMergeTaskID(String mergeTaskID) {
        this.mergeTaskID = mergeTaskID;
    }

    public String getMergeTaskName() {
        return mergeTaskName;
    }

    public void setMergeTaskName(String mergeTaskName) {
        this.mergeTaskName = mergeTaskName;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

//    public float getProgressBarPercent() {
//        return progressBarPercent;
//    }
//
//    public void setProgressBarPercent(float progressBarPercent) {
//        this.progressBarPercent = progressBarPercent;
//    }

    public ArrayList<Conflict> getConflictList() {
        return conflictList;
    }

    public void setConflictList(ArrayList<Conflict> conflictList) {
        this.conflictList = conflictList;
    }

//    public TreeReader getMainDirectoryTree() {
//        return mainDirectoryTree;
//    }
//
//    public void setMainDirectoryTree(TreeReader mainDirectoryTree) {
//        this.mainDirectoryTree = mainDirectoryTree;
//    }
//
//    public TreeReader getComparedDirectoryTree() {
//        return comparedDirectoryTree;
//    }
//
//    public void setComparedDirectoryTree(TreeReader comparedDirectoryTree) {
//        this.comparedDirectoryTree = comparedDirectoryTree;
//    }
//
//    public TreeReader getOptionalDestDirectoryTree() {
//        return optionalDestDirectoryTree;
//    }
//
//    public void setOptionalDestDirectoryTree(TreeReader optionalDestDirectoryTree) {
//        this.optionalDestDirectoryTree = optionalDestDirectoryTree;
//    } // setters & getters

}
