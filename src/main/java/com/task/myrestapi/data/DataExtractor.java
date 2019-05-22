package com.task.myrestapi.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.task.myrestapi.model.Folder;
import com.task.myrestapi.model.FolderContent;

public class DataExtractor {
	
	public static String JSON_FILENAME = "data.json";
	
	public Folder getFolder(String key) {
		Folder folder = null;
		try {
			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(new FileReader(JSON_FILENAME), JsonObject.class);
			folder = gson.fromJson((JsonObject)jsonObject.get(key), Folder.class);
			folder.setPath(key);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return folder;
	}
	
	public List<Folder> getAllFolders() {
		List<Folder> folders = new ArrayList<Folder>();
		Gson gson = new Gson();
		try {
			JsonObject jsonObject = gson.fromJson(new FileReader(JSON_FILENAME), JsonObject.class);
			for(String key : jsonObject.keySet()) {
				Folder folder = getFolder(key);
				folders.add(folder);
			}
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return folders;
	}
	
	public FolderContent getFolderContent(String key) {
		FolderContent content = null;
		try {
			Gson gson = new Gson();
			JsonObject jsonObject = gson.fromJson(new FileReader(JSON_FILENAME), JsonObject.class);
			content = gson.fromJson((JsonObject)jsonObject.get(key), FolderContent.class);
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return content;
	}
	
	public List<FolderContent> getAllContents() {
		List<FolderContent> contents = new ArrayList<FolderContent>();
		Gson gson = new Gson();
		try {
			JsonObject jsonObject = gson.fromJson(new FileReader(JSON_FILENAME), JsonObject.class);
			for(String key : jsonObject.keySet()) {
				FolderContent content = getFolderContent(key);
				contents.add(content);
			}
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return contents;
	}
	
	public FolderContent getContentByFolderId(String id) {
		List<FolderContent> contents = getAllContents(); 
		FolderContent content = contents.stream().filter(f -> f.getId().contentEquals(id)).findFirst().orElse(null); 
		return content;
	}
}
