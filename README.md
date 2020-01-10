# httpsdemo
spring boot demo on https


# 实现HTTP转HTTPS
1. 生成证书
获取证书可通过购买，或者本机生成，以下演示本机生成
通过keytool -genkey alias tomcat生成的.keystore已经过时了，不推荐
在正确配置完JDK环境变量的前提下，在任意目录，执行命令 
keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
按提示填好相关信息……
在当前目录下会生成一个keystore.p12文件，即证书文件
2. 修改配置文件
将证书文件复制到Idea中的项目根目录
修改application.properties文件
证书目录
server.ssl.key-store = keystore.p12
你之前填好的密码
server.ssl.key-store-password= password
server.ssl.keyStoreType= PKCS12
server.ssl.keyAlias: tomcat
