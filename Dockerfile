FROM openjdk:17

#jar 파일 경로 + 파일명
ARG JAR_FILE=build/libs/hellodocker-0.0.1-SNAPSHOT.jar

#컨테이너에 build/libs/hellodocker-0.0.1-SNAPSHOT.jar파일 복사
COPY $JAR_FILE app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]