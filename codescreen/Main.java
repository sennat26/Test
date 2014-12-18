//
//  Main.java
//  codescreen

import src.*;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        RangeModule module = new RangeModule();
//        module.AddRange(15, 20);
//        module.AddRange(10, 20);
//        module.AddRange(17, 19);
//        module.AddRange(5, 20);
//        module.AddRange(12, 15);
//        module.AddRange(30, 40);
//        
//        
//        System.out.println(module.QueryRange(26, 27));
        
        module.AddRange(17, 19);
        module.AddRange(5, 8);
        module.AddRange(21, 24);
        module.AddRange(5, 8);
        module.AddRange(4, 8);
        module.AddRange(15, 18);
        module.AddRange(7, 10);
        module.AddRange(16, 22);
        
        System.out.println("Expected true,   Actual: " + module.QueryRange(23, 25));
        System.out.println("Expected false,  Actual: " + module.QueryRange(12, 14));
        System.out.println("Expected true,   Actual: " + module.QueryRange(21, 23));
        // testing adjoint
        System.out.println("Expected false,  Actual: " + module.QueryRange(10, 15));
        System.out.println("Expected false,  Actual: " + module.QueryRange(10, 14));
        System.out.println("Expected false,  Actual: " + module.QueryRange(11, 15));
    }
}