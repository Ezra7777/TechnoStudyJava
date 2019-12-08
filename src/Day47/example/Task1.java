package Day47.example;

public class Task1 {
    // Create abstract class AbstractLogin
    // add abstract method: testLogin
    // create 3 subclasses as AdminLogin, ManagerLogin,c
    // and implement method testLogin


    public abstract class AbstractLogin {
        public abstract void testLogin();
        public abstract  void testPassword();
    }


    class AdminLogin extends AbstractLogin {

        @Override
        public void testLogin() {
            System.out.println("admin logged in ");
        }

        @Override
        public void testPassword() {

        }
    }

    class ManagerLogin extends AbstractLogin {

        @Override
        public void testLogin() {
            System.out.println("manager logged in ");

        }

        @Override
        public void testPassword() {

        }
    }

    class UserLogin extends AbstractLogin {

        @Override
        public void testLogin() {
            System.out.println("user logged in ");

        }

        @Override
        public void testPassword() {
            System.out.println("User Password");

        }
    }

    }
