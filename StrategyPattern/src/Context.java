/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Context {
    private StrategyInterface strategyinterface;
    public Context(StrategyInterface startegyinterface){
       this.strategyinterface=strategyinterface;
    }
    public int executeStrategy(int num1,int num2){
        return strategyinterface.doOperation(num1, num2);
    }
}
