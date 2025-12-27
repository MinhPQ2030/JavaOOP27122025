package com.quangminhtester.Login;
import com.quangminhtester.Customer.CustomerTest;

public class LoginTest {
    String name = "Selenium";

    public void testLogin()
    {
        System.out.println("Test login ok");
    }
    public static void main(String[] args) {
        LoginTest logTest = new LoginTest();
        logTest.testLogin();
        System.out.println(logTest.name);

        CustomerTest loginTest3 = new CustomerTest();

        new LoginTest().testLogin(); // Gọi kiểu Anonymous , tốn bộ nhớ ko cần thiết

    }
}

// Class và Object

/**1
 * Class có nhiều Object
  1 Object chỉ có 1 Class
**/