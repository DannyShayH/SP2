public class AudioBook extends Title {
    //Subclass
    private int durationInMinutes;
    //Constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }
    //Calculate points Method
    @Override
    protected double calculatePoints() {
        double totalPoints = (durationInMinutes/2) * convertLiteratureType() * super.copies;
        return totalPoints;
    }
}
