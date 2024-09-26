SETUP MAVEN (XYB BANK):

### RUN THE APP:

mvn clean install

mvn spring-boot:run

### Endpoints

http://localhost:8080/account/info

http://localhost:8080/portfolio/details

**Access the Endpoints**

- `http://localhost:8080/portfolio/details` – This should return "Portfolio details".
- `http://localhost:8080/account/info` – This should return "Account information".

If you want to customize ports or settings, you can configure them in `application.properties` under `src/main/resources/`.

Let me know if you need further adjustments or help!
