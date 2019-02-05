# spb-spring-data-jpa-namequery

一、演示如何使用@NamedQuery查询

二、注解和pom关系

controller层中，注解：

    @RestController
    @RequestMapping("/student")

导入失败的话，添加pom文件依赖：

      <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

web方式启动，应该就有controller各种注解了

三、
