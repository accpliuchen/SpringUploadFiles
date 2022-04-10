## Spring Boot File Upload / Download Rest API Example

**Tutorial**: [Uploading an Downloading files with Spring Boot]

## Steps to Setup

**1. Clone the repository** 

```bash
git clone https://github.com/accpliuchen/SpringUploadFiles.git
```

**2. Specify the file uploads directory**

Open `src/main/resources/application.properties` file and change the property `file.upload-dir` to the path where you want the uploaded files to be stored.

```
file.upload-dir=/Users/uploads
```

**2. Run the app using maven**

```bash
cd SpringUploadFiles
mvn spring-boot:run
```

That's it! The application can be accessed at `http://localhost:8279`.
or access `http://localhost:8279/index.html`.

You may also package the application in the form of a jar and then run the jar file like so -

```bash
mvn clean package
java -jar SpringUploadFiles-0.0.1-SNAPSHOT
```