# spb-spring-data-jpa-namequery

一、演示如何使用@NamedQuery查询

1、bean类中，

	@Entity
	@Table(name="tb_student")
	// 查询班级下的学生信息
	@NamedQuery(name="Student.findStudentsByClazzName",query="select s from Student s where s.clazz.name = ?1")
	public class Student implements Serializable{...}

@NamedQuery要放在要查询的实体上，名称是实体的类名，方法名

2、repository层，数据持久化层中，

    public interface StudentRepository extends JpaRepository<Student, Integer> {
    /**
     * 查询班级下的所有学生
     * @param clazzName
     * @return
     */
    List<Student> findStudentsByClazzName(String clazzName);
    }
    
 定义数据访问层接口，其中有方法findStudentsByClazzName
 
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


