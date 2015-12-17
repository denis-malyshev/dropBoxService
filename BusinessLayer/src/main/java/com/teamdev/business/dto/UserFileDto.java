package com.teamdev.business.dto;

public class UserFileDto {

    private long id;
    private String fileName;
    private String fileType;
    private String fileSize;

    public UserFileDto() {
    }

    public UserFileDto(long id, String fileName, String fileType, String fileSize) {
        this.id = id;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}
