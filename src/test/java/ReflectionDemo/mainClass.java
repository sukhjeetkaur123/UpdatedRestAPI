package ReflectionDemo;


import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class mainClass {
    public static void main(String [] args) throws NoSuchMethodException {

        Class reflectionBasicClass = reflectionBasic.class;
        System.out.println(reflectionBasicClass.getName());
        System.out.println(reflectionBasicClass);
        System.out.println("this is interface  "+reflectionBasicClass.getInterfaces());
        System.out.println("this is array " +reflectionBasicClass.isArray());
            Constructor constructors =  reflectionBasicClass.getConstructor();
       reflectionBasic rf = new reflectionBasic();
//        for(Constructor constructor:constructors) {
//            System.out.println("constructor name :" + constructor.getName());
//
//
//            Parameter parameters = constructors.getParameterTypes();
//        }






   }
}
