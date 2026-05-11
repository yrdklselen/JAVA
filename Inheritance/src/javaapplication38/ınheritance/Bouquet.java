/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication38.ınheritance;


class Bouquet {
    private String theme;
    private Flower flower;
    private int numOfFlowers;
    public Bouquet(String theme,Flower flower,int numOfFlowers){
        this.flower=flower;
        this.theme=theme;
        this.numOfFlowers=numOfFlowers;
  
    }
    public String getTheme(){
        return theme;
    }
     public Flower getFlower(){
        return flower;
    }
      public  int getNumOfFlowers(){
        return numOfFlowers;
    }
       public void setTheme(String theme){
        this.theme=theme;
    }
        public void setFlower(Flower flower){
       this.flower=flower;
    }
         public void setNumOfFlowers(int numOfFlowers){
       this.numOfFlowers=numOfFlowers;
    }
        
        public double getCost(){
            return flower.getUnitPrice()*numOfFlowers;
        }
}
   


    

