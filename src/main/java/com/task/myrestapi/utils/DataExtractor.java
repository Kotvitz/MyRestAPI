package com.task.myrestapi.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.task.myrestapi.model.Folder;

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
}
