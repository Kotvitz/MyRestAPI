package com.task.myrestapi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.task.myrestapi.data.DataExtractor;
import com.task.myrestapi.model.Folder;
import com.task.myrestapi.model.FolderContent;

@Controller
public class FolderController {
	
	DataExtractor extractor = new DataExtractor();
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	@ResponseBody
	public List<Folder> getAllFolders() {
		return extractor.getAllFolders();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{folderId}")
	@ResponseBody
	public FolderContent getContentByFolderId(@PathVariable("folderId") String folderId) {
		return extractor.getContentByFolderId(folderId);
	}
}
