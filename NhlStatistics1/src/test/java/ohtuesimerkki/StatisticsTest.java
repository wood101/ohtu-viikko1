/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janne
 */
public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }  
    
    
    @Test
    public void testSearch() {
        assertEquals(new Player("Semenko", "EDM", 4, 12).toString(), stats.search("Semenko").toString());
        assertFalse(new Player("Semenko", "EDM", 4, 12).equals(stats.search("SemenkO")));
    }
    
    @Test
    public void testTeamSearch() {
        assertEquals(3, stats.team("EDM").size());
    }
    
    @Test
    public void testTopScoring() {
        List<Player> scorers = new ArrayList<>();
        scorers.add(new Player("Gretzky", "EDM", 35, 89));
        scorers.add(new Player("Lemieux", "PIT", 45, 54));
        assertEquals(scorers.toString(), stats.topScorers(1).toString());
    }    
}

