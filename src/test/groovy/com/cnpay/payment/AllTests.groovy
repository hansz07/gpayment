package com.cnpay.payment

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.runner.RunWith
import org.junit.runners.Suite
/**
 * 参考：
 * https://stackoverflow.com/questions/6580670/testsuite-setup-in-junit-4
 */
@RunWith(Suite)
@Suite.SuiteClasses([DaoSpec,PayApiServiceSpec])
class AllTests {
    @BeforeClass
    static void setUpClass() {
        println("在有所测试类之前执行....")
        //TODO: docker-compose up
    }

    @AfterClass 
    static void tearDownClass() {
        println("在有所测试类之后执行....")
        //结束 docker中间件运行
        //TODO: docker-compose down (stop不删除容器)
    }
}

