public class PrintedBook  extends Title{
    //Subclass
    private int pages;
    //Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;

    }
    //Calculate points Method
    @Override
    protected double calculatePoints() {
        double totalPoints = pages * convertLiteratureType() * super.copies;
        return totalPoints;
    }
}
