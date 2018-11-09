package ohtuesimerkki;

public class Main {
    private static final int MAARA = 10;
    public static void main(String[] args) {
        Statistics stats = new Statistics( new PlayerReader("http://nhlstats-2013-14.herokuapp.com/players.txt") );
          
        System.out.println("Philadelphia Flyers");
        for (Player player : stats.team("PHI") ) {
            System.out.println( player );
        }
        
        System.out.println("");
        
        System.out.println("Top scorers");
        for (Player player : stats.topScorers(MAARA) ) {
            System.out.println( player );
        }        
    }
}
