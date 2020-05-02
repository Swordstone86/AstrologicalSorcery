package swordstone.astrosorc;

import java.lang.reflect.Field;
import java.util.List;

import hellfirepvp.astralsorcery.common.constellation.ConstellationBase;
import hellfirepvp.astralsorcery.common.constellation.star.StarConnection;
import hellfirepvp.astralsorcery.common.constellation.star.StarLocation;
import hellfirepvp.astralsorcery.common.lib.Constellations;

public class ModifyConstellations
{
	public static void init() {
		try {
			registerNewConstellations();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	private static void registerNewConstellations() throws NoSuchFieldException, IllegalAccessException {
		ConstellationBase aevitas = (ConstellationBase) Constellations.aevitas;
	 	Class<?> c = aevitas.getClass().getSuperclass().getSuperclass();
	 	StarLocation sl1, sl2, sl3, sl4, sl5, sl6, sl7, sl8, sl9, sl10, sl11, sl12, sl13, sl14, sl15, sl16, sl17, sl18, sl19, sl20, sl21, sl22;
	 	
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		Field fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	List<StarLocation> stars = (List<StarLocation>) fieldStarLocations.get(aevitas);
    	
    	Field fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	List<StarConnection> connections = (List<StarConnection>) fieldConnections.get(aevitas);
    	
    	stars.clear(); // remove existing Aevitas constellation stars and connections
    	connections.clear();
    	
    	sl1 = aevitas.addStar(29, 5);
        sl2 = aevitas.addStar(16, 6);
        sl3 = aevitas.addStar(18, 11);
        sl4 = aevitas.addStar(25, 12);
        sl5 = aevitas.addStar(22, 13);
        sl6 = aevitas.addStar(17, 22);
        sl7 = aevitas.addStar(14, 15);
        sl8 = aevitas.addStar(9, 15);
        sl9 = aevitas.addStar(2, 17);
        sl10 = aevitas.addStar(10, 23);
        sl11 = aevitas.addStar(8, 21);
        sl12 = aevitas.addStar(4, 22);

        aevitas.addConnection(sl1, sl4);
        aevitas.addConnection(sl4, sl5);
        aevitas.addConnection(sl3, sl5);
        aevitas.addConnection(sl2, sl3);
        aevitas.addConnection(sl5, sl6);
        aevitas.addConnection(sl6, sl7);
        aevitas.addConnection(sl7, sl3);
        aevitas.addConnection(sl6, sl10);
        aevitas.addConnection(sl10, sl11);
        aevitas.addConnection(sl11, sl12);
        aevitas.addConnection(sl7, sl8);
        aevitas.addConnection(sl8, sl9);
        
        ConstellationBase octans = (ConstellationBase) Constellations.octans;
	 	c = octans.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(octans);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(octans);
    	
    	stars.clear(); // remove existing Octans constellation stars and connections
    	connections.clear();
        
    	sl1 = octans.addStar(4, 9);
    	sl2 = octans.addStar(6, 7);
    	sl3 = octans.addStar(8, 13);
    	sl4 = octans.addStar(10, 21);
    	sl5 = octans.addStar(12, 29);
    	sl6 = octans.addStar(14, 21);
    	sl7 = octans.addStar(16, 15);
    	sl8 = octans.addStar(18, 11);
    	sl9 = octans.addStar(20, 7);
    	sl10 = octans.addStar(22, 3);
    	sl11 = octans.addStar(24, 11);
    	sl12 = octans.addStar(26, 3);
    	sl13 = octans.addStar(28, 7);
        
        octans.addConnection(sl1, sl2);
        octans.addConnection(sl2, sl3);
        octans.addConnection(sl3, sl1);
        octans.addConnection(sl3, sl4);
        octans.addConnection(sl4, sl5);
        octans.addConnection(sl5, sl6);
        octans.addConnection(sl6, sl7);
        octans.addConnection(sl7, sl8);
        octans.addConnection(sl8, sl9);
        octans.addConnection(sl9, sl10);
        octans.addConnection(sl9, sl11);
        octans.addConnection(sl11, sl13);
        octans.addConnection(sl10, sl12);
        octans.addConnection(sl13, sl12);
	}
}
