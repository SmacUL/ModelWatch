package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(value =SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ProjectDaoTest {

    @Autowired
    ProjectDao projectDao;

    @Test
    public void getProjectById() {
    }

    @Test
    public void getProjectsByCreateUid() {
    }

    @Test
    public void getSubProjects() {
    }

    @Test
    public void addProject() {
    }

    @Test
    public void updateProjectData() {
    }

    @Test
    public void alterProjectData() {
    }

    @Test
    public void deleteProject() {
        System.out.println(projectDao.deleteProject(9));
    }
}