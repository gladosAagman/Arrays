import java.util.Random;

class Player {
    String name;
    int age;
    String state;
// constructor
    Player(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", State: " + state;
    }
}

public class CricketTeam {
    public static void main(String[] args) {
        //creating an array of players
        Player[] team = new Player[12];

        //adding details to the players
        team[0] = new Player("Aagman", 22, "MP");
        team[1] = new Player("Mohit", 21, "MP");
        team[2] = new Player("Priyal", 20, "TN");
        team[3] = new Player("Ranjana", 19, "UP");
        team[4] = new Player("Saddam", 19, "HP");
        team[5] = new Player("Harsh", 23, "Bihar");
        team[6] = new Player("Veer", 21, "MH");
        team[7] = new Player("Visahl", 22, "J&K");
        team[8] = new Player("Jagruti", 20, "Rajasthan");
        team[9] = new Player("ChandraShekhar", 21, "Orissa");
        team[10] = new Player("Raja", 21, "UP");
        team[11] = new Player("Nikhil", 22, "UK");


        

        Random rand = new Random();
        int captainIndex = rand.nextInt(12) + 1; 
        
        // Generating a random number between 1 and 12

        Player captain = team[captainIndex - 1];

        System.out.println("Captain Details: " + captain);

       
    }
}
