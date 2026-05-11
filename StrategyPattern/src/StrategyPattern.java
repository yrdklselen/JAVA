/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



public class StrategyPattern {

  
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println("Add: "+context.executeStrategy(10,5));
        
        context=new Context(new OperationSubstract());
        System.out.println("Substract: "+context.executeStrategy(10,5));
        
        context=new Context(new OperationMultiply());
        System.out.println("Multiply: "+context.executeStrategy(10,5));
    }
    
}
