package dao;

import models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class Sql2oUserDaoTest {

    private Sql2oUserDao userDao;
    private Connection conn;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        userDao = new Sql2oUserDao(sql2o);

        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void add() throws Exception {
        User user = setupNewUser();
    }

    public User setupNewUser() {
        return new User("Byron", "byron@email.com");
    }
}