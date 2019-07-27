
package  com.example.visit_record;

import com.example.visit_record.entity.Dept;
import com.example.visit_record.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RbacDemoApplicationTests {

    @Resource
    private IDeptService deptService; //这里可以使用接口类型接收(多态)，也可以使用实现类接收。


    public void contextLoads() {
    }





    public void saveDeptTest() {
        //给Dept实体类添加lombok的@Builder注解，就可以使用如下的方式构建对象
        Dept dept = Dept.builder().deptName("科技部").loc("广州").parentId(0).level("0").phone("12345678901")
                .orderNum(1).status(0).delFlg(0).createTime(LocalDateTime.now()).build();
        boolean flg = deptService.save(dept);
        System.out.println(flg);
    }


    public void saveBatchDeptTest(){
        Dept dept1 = Dept.builder().deptName("科技部1").loc("广州1").parentId(1).level("0").phone("12345678901").orderNum(1).status(0).delFlg(0).createTime(LocalDateTime.now()).build();
        Dept dept2 = Dept.builder().deptName("科技部2").loc("广州2").parentId(1).level("0.1").phone("12345677701").orderNum(2).status(0).delFlg(0).createTime(LocalDateTime.now()).build();
        Dept dept3 = Dept.builder().deptName("科技部3").loc("广州3").parentId(1).level("0.2").phone("12345668901").orderNum(3).status(0).delFlg(0).createTime(LocalDateTime.now()).build();

        List<Dept> list = Arrays.asList(dept1,dept2,dept3);
        boolean flg = deptService.saveBatch(list);
        //这里使用日志打印，在要打印的类上添加lombok注解@Slf4j,它会提供一个log对象，我们就可以使用它打印统一样式的日志信息了

    }







}
