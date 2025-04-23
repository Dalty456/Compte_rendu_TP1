ublic class Cryptomonnaie 
{
    private String nom;
    private double valeurDeJeton; 

    public Cryptomonnaie(String nom, double valeurDeJeton) 
    {
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }

    
    public String getNom()
    {
        return nom;
    }

    public double getValeurDeJeton() 
    {
        return valeurDeJeton;
    }

   
    public void setNom(String nom) 
    {
        this.nom = nom;
    }

    public void setValeurDeJeton(double valeurDeJeton) 
    {
        this.valeurDeJeton = valeurDeJeton;
    }

    public String toString() 
    {
        return "Cryptomonnaie : " + nom + ", Valeur du jeton : " + valeurDeJeton + " €";
    }
}
