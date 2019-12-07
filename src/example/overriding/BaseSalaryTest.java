package example.overriding;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

 public class BaseSalaryTest {
     @Test
     public void testBaseSalary() {
         TesterBaseSalary s = new TesterBaseSalary();
//        Assert.assertEquals(100_000, s.getSalary());

         int actual = s.getSalary();
         int expected = 100_000;

         Assert.assertEquals(expected, actual);
     }

     @Test
     public void testJunior() {
         JuniorTesterSalary j = new JuniorTesterSalary();
         Assert.assertEquals(50_000, j.getSalary());
     }

     @Test
     public void testMiddle() {
         MiddleTesterSalary m = new MiddleTesterSalary();
         Assert.assertEquals(110_000, m.getSalary());

         // create N middle testers,






     }

     @Test
     public void testSenior() {
         SeniorTesterSalary m = new SeniorTesterSalary();
         Assert.assertEquals(200_000, m.getSalary());

     }

     @Test
     public void testSumOfThreeJuniorSalary() {
         // create 3 junior testers, sum their salary, and check if you have $150,000 in total
//        TesterBaseSalary j1 = new JuniorTesterSalary();
//        TesterBaseSalary j2 = new JuniorTesterSalary();
//        TesterBaseSalary j3 = new JuniorTesterSalary();
//        int actual = j1.getSalary() + j2.getSalary() + j3.getSalary();

         int sum = 0;
         for (int i = 0; i < 3; i++) {
             TesterBaseSalary junior = new JuniorTesterSalary();
             sum += junior.getSalary();
         }
         int actual = sum;

         Assert.assertEquals(150_000, actual);

     }
 }