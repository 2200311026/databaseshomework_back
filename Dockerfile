# 基础镜像
FROM java:8

#指定工作目录
WORKDIR /app

# 将jar包添加到工作目录
ADD ./springboot_furn-1.0-SNAPSHOT.jar /app

# 暴露端口
EXPOSE 8080

# 启动命令
ENTRYPOINT ["java","-jar","/app/springboot_furn-1.0-SNAPSHOT.jar"]
