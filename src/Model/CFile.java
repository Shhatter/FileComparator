package Model;

import Interfaces.Entity;

import java.nio.file.Path;
import java.util.Date;
import java.util.UUID;

public class CFile extends Entity{

    private String fileType;


    public CFile( String fileType) {
        super();
        this.fileType = fileType;
    }
}
