public abstract class Title {
    //Superclass
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    //Constructor
    public Title(String title, String literatureType, int copies){
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate = 0.067574;

    }
    //Calculate Royalties Method
    public double calculateRoyalty(){ return calculatePoints() * rate; }

    //Implement calculate points Method
    abstract double calculatePoints();

    //Implement convert literature type Method
    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI", "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                System.out.println("Fejl: " + literatureType);
                return -1;
        }
    }
}
