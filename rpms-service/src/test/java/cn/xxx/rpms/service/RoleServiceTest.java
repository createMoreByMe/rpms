package cn.xxx.rpms.service;

import cn.xxx.basic.query.BaseQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-service.xml")
public class RoleServiceTest {
    @Autowired
    private IRoleService roleService;

     @Test
      public void myTest() throws Exception{
         BaseQuery baseQuery = new BaseQuery();
         roleService.selectManyToPermission(baseQuery).getRows().forEach(e-> System.out.println(e));
      }
}
