# Use uma imagem base do Java
FROM openjdk:17-jdk-slim

# Adicione informações sobre o autor
LABEL authors="eumesmo"

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o jar da aplicação para o diretório de trabalho
COPY mensageriaAPI.jar app.jar

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
