
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public final class Fraction
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private final int num;
    private final int den;
    private static final Fraction UN = new Fraction(1);
    private static final Fraction ZERO = new Fraction(); 
    
    public Fraction()
    {
        // initialisation des variables d'instance
        this.num = 0;
        this.den = 1;
    }
    
    public Fraction(int num)
    {
        this.num = num;
        this.den = 1;
    }
    
    public Fraction(int num , int den)
    {
        this.num = num;
        this.den = den;
    }
    
    public int getNum()
    {
        return this.num;
    }
    
    public int getDen()
    {
        return this.den;
    }
    
    public double getVal()
    {
        return ((double)num)/den;
    }
    
    public Fraction add(Fraction toAdd)
    {
        int resNum = toAdd.getNum()*this.den + toAdd.getDen()*this.num;
        int resDen = toAdd.getDen()*this.den;
        
        //simplification
        for(int i = 0; i < toAdd.getDen()*this.den ; i++)
        {
            if( ((resNum%i) == 0) && ((resDen%i) == 0))
            {
                resNum /= i;resDen /= i;
            }
        }
        Fraction res = new Fraction(resNum , resDen);
        return res;
    }
    
    public boolean equals(Fraction A)
    {
        if(A.getVal() == this.getVal()) return true;
        return false;
    }
    
    @Override
    public String toString()
    {
        return this.num + " / "+ this.den + " = " + this.getVal();
    }
    
    public void compare(Fraction Z)
    {
        if(this.getVal() < Z.getVal())
             System.out.println(Z.toString() + " > " + this.toString());
        else if(this.equals(Z))
             System.out.println(Z.toString() + " = " + this.toString());
        else 
             System.out.println(Z.toString() + " < " + this.toString());
    }
}
