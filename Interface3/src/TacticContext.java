/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class TacticContext {
    private IFootbalStrategyI footbalStrategy=null;
    
    public TacticContext(){
        
    }

    public void selectStrategy(String team){
        footbalStrategy.adhereTactic(team);
    }
    public IFootbalStrategyI getStrategy(){
        return footbalStrategy;
    }
    public void setStrategy(IFootbalStrategyI footbalStrategy){
        this.footbalStrategy=footbalStrategy;
    }
}
