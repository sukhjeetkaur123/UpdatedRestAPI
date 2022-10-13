package ReflectionDemo;
class Test {
    // creating a private field
    private String s;
    public Test() { s = "abc"; }
    public void method1()
    {
        System.out.println("The string is " + s);
    }
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }

    private void method3()
    {
        System.out.println("Private method invoked");
    }
}