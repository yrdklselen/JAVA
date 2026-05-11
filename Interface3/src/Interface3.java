/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



public class Interface3 {

    
    public static void main(String[] args) {
       String team1="Barcelona";
       String team2="Real Madrid";
       
       TacticContext context=new TacticContext();
        context.setStrategy(new AttactTactic());
        context.selectStrategy(team1);
        
         context.setStrategy(new DefenceTactic());
        context.selectStrategy(team2);
    }
    
}
