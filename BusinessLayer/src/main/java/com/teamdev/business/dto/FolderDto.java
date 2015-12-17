package com.teamdev.business.dto;

import java.util.Collection;

public class FolderDto {

    private long id;
    private String name;
    private String path;
    private Collection<String> fileList;

    public FolderDto() {
    }

    public FolderDto(long id, String name, String path, Collection<String> fileList) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.fileList = fileList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
