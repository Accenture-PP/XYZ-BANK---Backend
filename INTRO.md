To create a Spring Boot project with two controllers (one for a portfolio and one for account-related functionality) in VS Code, follow these steps:

### 1. **Set Up Your Spring Boot Project**

If you haven’t already created the Spring Boot project, follow these steps to set it up:

- Install the **Spring Boot Extension Pack** in VS Code.
- Use the **Spring Initializr** to generate the project.

#### Via Spring Initializr:
- Go to [start.spring.io](https://start.spring.io).
- Select the project type (`Maven` or `Gradle`).
- Add the required dependencies such as **Spring Web**.
- Generate the project and download the ZIP.
- Extract the ZIP and open it in VS Code.

Alternatively, you can initialize it from the VS Code terminal:

```bash
mvn archetype:generate -DgroupId=com.example.demo -DartifactId=demo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn archetype:generate -DgroupId=xyb.bank.backend -DartifactId=backend -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### 2. **Create Controllers**

#### Portfolio Controller:

1. In the `src/main/java/com/example/demo/controller/` folder, create a new class file called `PortfolioController.java`.
2. Add the following code:

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {

    @GetMapping("/details")
    public String getPortfolioDetails() {
        return "Portfolio details";
    }
}
```

#### Account Controller:

1. In the same `controller` folder, create a new class file called `AccountController.java`.
2. Add the following code:

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/info")
    public String getAccountInfo() {
        return "Account information";
    }
}
```

### 3. **Run the Application**

Once you have your controllers in place, start the Spring Boot application. You can do this via the terminal or by using the VS Code Spring Boot Dashboard.

To run from the terminal:

```bash
./mvnw spring-boot:run
```



### 4. **Access the Endpoints**

- `http://localhost:8080/portfolio/details` – This should return "Portfolio details".
- `http://localhost:8080/account/info` – This should return "Account information".

If you want to customize ports or settings, you can configure them in `application.properties` under `src/main/resources/`.

Let me know if you need further adjustments or help!