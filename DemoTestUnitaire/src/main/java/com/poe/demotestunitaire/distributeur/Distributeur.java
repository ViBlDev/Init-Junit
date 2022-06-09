
package com.poe.demotestunitaire.distributeur;

import java.util.ArrayList;


public class Distributeur {
    
    private double credit; // argent dispo pour acheter
    
    private ArrayList<Produit> stock = new ArrayList<>();
    
    public Distributeur(){
        credit = 0;
    }
    
    public void remplirLeStock(){
        
        stock.add(new Produit(1, "soda", 1, 5));
        stock.add(new Produit(2, "cafe", 2, 5));
        stock.add(new Produit(3, "barre cereale", 3, 5));
    }
    
    public void insererArgent (double montant){
        credit += montant;
    }
    
    public boolean stockSuffisant(int idProduit, int quantiteAAcheter){
        
        Produit produit = getProduit(idProduit);
        return produit.getQuantite() >= quantiteAAcheter;
    }
    
        public boolean creditSuffisant(int idProduit, int quantiteAAcheter){
            
        Produit produit = getProduit(idProduit);
        double cout = quantiteAAcheter * produit.getPrix();
        return credit >= cout;
    }
        
    public void commanderUnProduit(int idProduit){
        
        
        if(stockSuffisant(idProduit, 1) && creditSuffisant(idProduit, 1)){
        Produit produit = getProduit(idProduit);
               
                
                
                    produit.setQuantite(produit.getQuantite()-1);
                    credit = credit - produit.getPrix();
                }
    }
            
            
        
    

    public void recupererArgentRestant(){
        
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Produit> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Produit> Stock) {
        this.stock = stock;
    }
    
   public Produit getProduit(int id){
       for(Produit produit: stock){
           if(produit.getId() == id){
               return produit;
           }
       }
       return new Produit(); // temporaire
   }
}
    
    

