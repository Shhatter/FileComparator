package Classes;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;

public class MergeTask {


    private Path mainDirectory,comparedDirectory,optionalDestDirectory;
    private String mergeTaskID ;
    private String mergeTaskName;
    private Date startDate;
    private float progressBarProcent; // fancy, can be not implemented at all
    private ArrayList<Conflict> conflictList;
    private TreeReader mainDirectoryTree,comparedDirectoryTree,optionalDestDirectoryTree;


    public MergeTask(Path mainDirectory, Path comparedDirectory, Path optionalDestDirectory, String mergeTaskID, String mergeTaskName, Date startDate, float progressBarProcent, ArrayList<Conflict> conflictList) {
        this.mainDirectory = mainDirectory;
        this.comparedDirectory = comparedDirectory;
        this.optionalDestDirectory = optionalDestDirectory;
        this.mergeTaskID = mergeTaskID;
        this.mergeTaskName = mergeTaskName;
        this.startDate = startDate;
        this.progressBarProcent = progressBarProcent;
        this.conflictList = conflictList;
    }


    public Path getMainDirectory() {
        return mainDirectory;
    }

    public void setMainDirectory(Path mainDirectory) {
        this.mainDirectory = mainDirectory;
    }

    public Path getComparedDirectory() {
        return comparedDirectory;
    }

    public void setComparedDirectory(Path comparedDirectory) {
        this.comparedDirectory = comparedDirectory;
    }

    public Path getOptionalDestDirectory() {
        return optionalDestDirectory;
    }

    public void setOptionalDestDirectory(Path optionalDestDirectory) {
        this.optionalDestDirectory = optionalDestDirectory;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public float getProgressBarProcent() {
        return progressBarProcent;
    }

    public void setProgressBarProcent(float progressBarProcent) {
        this.progressBarProcent = progressBarProcent;
    }

    public ArrayList<Conflict> getConflictList() {
        return conflictList;
    }

    public void setConflictList(ArrayList<Conflict> conflictList) {
        this.conflictList = conflictList;
    }

    public TreeReader getMainDirectoryTree() {
        return mainDirectoryTree;
    }

    public void setMainDirectoryTree(TreeReader mainDirectoryTree) {
        this.mainDirectoryTree = mainDirectoryTree;
    }

    public TreeReader getComparedDirectoryTree() {
        return comparedDirectoryTree;
    }

    public void setComparedDirectoryTree(TreeReader comparedDirectoryTree) {
        this.comparedDirectoryTree = comparedDirectoryTree;
    }

    public TreeReader getOptionalDestDirectoryTree() {
        return optionalDestDirectoryTree;
    }

    public void setOptionalDestDirectoryTree(TreeReader optionalDestDirectoryTree) {
        this.optionalDestDirectoryTree = optionalDestDirectoryTree;
    } // setters & getters

}
