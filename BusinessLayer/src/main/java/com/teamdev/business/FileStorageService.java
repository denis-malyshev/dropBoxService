package com.teamdev.business;

import com.sun.org.apache.xpath.internal.operations.String;
import com.teamdev.business.dto.FolderDto;
import com.teamdev.business.dto.UserDto;
import com.teamdev.business.dto.UserFileDto;

import java.util.Collection;
import java.util.List;

public interface FileStorageService<AuthenticationToken, UserFile, UserFolder> {

    UserFileDto viewFile(AuthenticationToken token, String userFile);

    int getFreeSpaceSize(AuthenticationToken token, UserDto user);

    List<String> getFileList(AuthenticationToken token, UserDto user);

    void addFile(AuthenticationToken token, UserDto userDto, UserFile userFile);

    void addFiles(AuthenticationToken token, UserDto userDto, Collection<UserFile>  userFile);

    void createFolder(AuthenticationToken token, UserDto userDto, UserFolder userFolder);

    void renameFolder(AuthenticationToken token, UserDto userDto, FolderDto folderDto);

    void deleteFolder(AuthenticationToken token, UserDto userDto, FolderDto folderDto);

    void downloadFiles(AuthenticationToken token, UserDto userDto, Collection<UserFileDto> files);
}
