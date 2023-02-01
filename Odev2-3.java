public class Complex {


    //instance variables
    //getter and setters
    private double reel;
    private double imaginel;

    public double getReel(){
        return this.reel;
    }
    public void setReel(double reel){
        this.reel=reel;
    }
    public double getImaginel(){
        return this.imaginel;
    }
    public void setImaginal(double imaginel){
        this.imaginel=imaginel;
    }

    public Complex(Complex Obj) {
        //this(Obj.reel,Obj.imaginel);

    }

    public Complex(double reel, double imaginel) {
        this.reel=reel;
        this.imaginel=imaginel;

    }
    public void addComplex (Complex c){

        addComplex(c.getReel(),c.getImaginel());
    }
    public void addComplex (double reel, double imaginel)
    {
        this.reel+=reel;
        this.imaginel+=imaginel;

    }
    public void subtractComplex (Complex c){

        subtractComplex(c.getReel(),c.getImaginel());

    }

    public void subtractComplex (double reel, double imaginel)
    {
        this.reel-=reel;
        this.imaginel-=imaginel;
    }

    public void multiplyComplex (Complex c)
    {
        multiplyComplex(c.getReel(),c.getImaginel());

    }
    public void multiplyComplex (double reel, double imaginel)
    {
        double nreel=this.reel;
        double nimaginel=this.imaginel;
        this.reel=(reel*getReel())-(imaginel*getImaginel());
        this.imaginel=(nreel*imaginel+nimaginel*reel);

    }
    public String toString()
    {
        String reel1 = this.reel+"";
        String imaginel1="";
        if(this.imaginel<0){
            imaginel1=this.imaginel+"i";
        }
        else{
            imaginel1="+"+this.imaginel+"i";
        }
        return reel1+imaginel1;

    }

}
