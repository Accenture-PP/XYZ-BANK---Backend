The error message `bash: mvn: command not found` indicates that Maven is not installed or not properly set up on your machine. Here's how you can resolve this issue:

### Step 1: Install Maven

#### On Windows:
1. **Download Maven**:
   - Go to the [Apache Maven official site](https://maven.apache.org/download.cgi) and download the binary ZIP archive.

2. **Extract Maven**:
   - Extract the downloaded ZIP to a folder, e.g., `C:\Program Files\Apache\Maven`.

3. **Set Up Environment Variables**:
   - Go to the Start Menu and search for "Environment Variables".
   - Click on **Edit the system environment variables**.
   - In the **System Properties** window, click on **Environment Variables**.
   
   Under **System variables**:
   - Add a new variable named `MAVEN_HOME` and set it to the path where you extracted Maven, e.g., `C:\Program Files\Apache\Maven`.
   - Find the `Path` variable, click **Edit**, and add the following to the list: `%MAVEN_HOME%\bin`.

4. **Verify Installation**:
   - Open a new terminal and type:
   
   ```bash
   mvn -v
   ```

   You should see information about your Maven version, Java version, and OS. If you see that, Maven is installed correctly.

### Step 2: Install Java JDK (if not installed)

Maven requires Java to work, so ensure the JDK is installed:

1. **Download JDK**:
   - Go to the [Oracle JDK website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK from [AdoptOpenJDK](https://adoptopenjdk.net/).
   
2. **Install JDK**:
   - Install the JDK, and remember the installation path (e.g., `C:\Program Files\Java\jdk-17`).

3. **Set Up Java Environment Variables**:
   - Add a new environment variable named `JAVA_HOME` and set it to the path where Java is installed, e.g., `C:\Program Files\Java\jdk-17`.
   - Edit the `Path` variable and add `%JAVA_HOME%\bin`.

4. **Verify Installation**:
   - Open a new terminal and type:

   ```bash
   java -version
   ```

   If Java is installed correctly, you’ll see the version info.

### Step 3: Try Running Maven Again

Once Maven is installed and properly configured, try running the Maven command again:

```bash
mvn archetype:generate -DgroupId=xyb.bank.backend
```

This should now work if Maven is correctly installed and Java is configured.