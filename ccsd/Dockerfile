FROM maven:3.9.9-ibm-semeru-17-focal

EXPOSE 8082
COPY . .
RUN chmod +x mvnw
RUN mvn clean package
CMD ["./mvnw", "spring-boot:run"]