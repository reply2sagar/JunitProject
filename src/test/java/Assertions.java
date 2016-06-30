import org.junit.Assert;
import org.junit.Test;

public class Assertions {
    @Test
    public void test1(){
        System.out.println("Running test1");
        Assert.assertTrue("Checking simple condition",1==1);
        Assert.assertFalse("Checking that expression is false",1==3);

        String a = null;
        Assert.assertNull("Assert if variable points to null",a );
        Assert.assertEquals("Assert if strings are same", "softpost.org","softpost.org");
        int [] a1 = {22,33};
        int [] b1 = {22,33};
        Assert.assertArrayEquals(a1,b1);

        Student s1 = new Student();
        s1.name = "watson";
        Student s2 = s1;

        //below assertions is successful as s1 and s2 point to same object
        Assert.assertEquals(s1,s2);

        //below assertions is successful as s1 and s2 point to same object
        Assert.assertSame(s1, s2);

        Student s3 = new Student();
        s3.name = "Shaun";

        //below assertions is unsuccessful as equals method of s1 returns false
        Assert.assertEquals(s1,s3);

        //below assertions is unsuccessful as s1 and s3 point to different object
        Assert.assertSame(s1,s3);

        s3.name = "watson";
        //below assertions is successful as equals method of s1 returns true
        Assert.assertEquals(s1,s3);

        //below assertions is unsuccessful as s1 and s3 are different objects
        Assert.assertSame(s1,s3);
    }
}

class Student{
    String name;

    @Override
    public boolean equals(Object obj) {
        if (this.name.equalsIgnoreCase(((Student)obj).name))
        {
            return true;
        }else
            return false;
    }
}
