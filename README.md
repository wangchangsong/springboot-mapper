# springboot-mapper
springboot集成mybatis的通用mapper的demo

##  通用mapper的好处
 - 以往我们使用mapper文件都是自己写sql语句，针对的是单个实体，也就是每个实体都有其对应的mapper文件。使用通用mapper给我们带来了极大的方便，它不需要mapper.xml文件，只需我们调用相应的接口，引入jar包再进行简单的配置就好了
 
 
## 通用mapper创建中的一些坑
   在使用 DevTools 时，通用Mapper经常会出现 class x.x.A cannot be cast to x.x.A。
   
   同一个类如果使用了不同的类加载器，就会产生这样的错误，所以解决方案就是让通用Mapper和实体类使用相同的类加载器即可。
   
   DevTools 默认会对 IDE 中引入的所有项目使用 restart 类加载器，对于引入的 jar 包使用 base 类加载器，因此只要保证通用Mapper的jar包使用 restart 类加载器即可。
   
   在 src/main/resources 中创建 META-INF 目录，在此目录下添加 spring-devtools.properties 配置，内容如下：
   
   restart.include.mapper=/mapper-[\\w-\\.]+jar
   restart.include.pagehelper=/pagehelper-[\\w-\\.]+jar
   使用这个配置后，就会使用 restart 类加载加载 include 进去的 jar 包。
