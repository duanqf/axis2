# axis2
axis2是一个WebService框架，使用它可以快速的构建WebService服务，发布部署，
它提供了相关的工具可以快速生成客户端代码进行服务调用。axis2是下一代 Apache Axis。
Axis2 虽然由 Axis 1.x 处理程序模型提供支持，但它具有更强的灵活性并可扩展到新的体系结构。
Axis2 基于新的体系结构进行了全新编写，而且没有采用 Axis 1.x 的常用代码。
支持开发 Axis2 的动力是探寻模块化更强、灵活性更高和更有效的体系结构，
这种体系结构可以很容易地插入到其他相关 Web 服务标准和协议（如 WS-Security、WS-ReliableMessaging 等）的实现中
### 特点
<b><i>1</i></b> 支持不同的消息交换模式。<br>
<b><i>2</i></b> 灵活的数据绑定，可以选择直接使用 AXIOM，使用与原来的 Axis 相似的简单数据绑定方法，或使用XMLBeans、JiBX 或 JAXB 2.0 等专用数据绑定框架。<br>
<b><i>3</i></b> 提供阻塞和非阻塞客户端 API。（同步和异步调用）<br>
<b><i>4</i></b> 支持内置的 Web服务寻址 (WS-Addressing) 。<br>
<b><i>5</i></b> 支持热部署。<br>
<b><i>6</i></b> 支持REST (Representational State Transfer)。<br>

# 使用axis2部署发布项目
## 官网下载源码插件
### 1
官网地址：http://axis.apache.org/axis2/java/core/download.html
下载bin、war、插件包
### 2 war包解压放到tomcat webapps目录下启动tomcat
访问：http://localhost:8080/axis2/
### 3 部署本地项目

