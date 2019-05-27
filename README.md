# MyRestAPI

This is RESTful Web Service written in Java using Spring framework. This application returns data about folders as JSON. 

It is best to run it using Eclipse IDE. After launching, the application will run on port 8080. Then you will be able to display the following informations:

- **All available folders** - at address [http://localhost:8080](http://localhost:3000/) you will be able to see a JSON array containing the id and path of each folder
- **Content of a specific folder** - at address http://localhost:8080/{folderId} you will be able to see what is in the folder with the id given in the address. 