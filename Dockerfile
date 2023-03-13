# Imagem base do Java
FROM openjdk:8-jdk-alpine

# Diretório de trabalho
WORKDIR /app

# Copia o arquivo jar do projeto para dentro do contêiner
COPY out/artifacts/Library_jar/Library.jar /app/Library.jar

# Executa o arquivo jar
CMD ["java", "-jar", "Library.jar"]
