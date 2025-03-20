import java.util.ArrayList;

//Class
public class Author {

    private String name;
    private ArrayList<Title> titles;

    //Constructor
    public Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }
    //addTitle Method
    public void addTitle(Title title){
        titles.add(title);

    }
    //Calculate total pay Method
    public float calculateTotalPay(){
        float totalPay = 0;
        for (Title title : titles){
            totalPay += title.calculateRoyalty();


        }
        float roundOff = Math.round(totalPay*100f)/100.0f;
        return roundOff;
    }
    //Get name Method
    public String getName(){ return name; }

}

