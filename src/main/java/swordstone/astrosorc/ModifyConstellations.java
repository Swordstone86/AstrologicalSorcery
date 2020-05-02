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
		ConstellationBase virgo = (ConstellationBase) Constellations.aevitas;
	 	Class<?> c = virgo.getClass().getSuperclass().getSuperclass();
	 	StarLocation sl1, sl2, sl3, sl4, sl5, sl6, sl7, sl8, sl9, sl10, sl11, sl12, sl13, sl14, sl15, sl16, sl17, sl18, sl19, sl20, sl21, sl22;
	 	
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		Field fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	List<StarLocation> stars = (List<StarLocation>) fieldStarLocations.get(virgo);
    	
    	Field fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	List<StarConnection> connections = (List<StarConnection>) fieldConnections.get(virgo);
    	
    	stars.clear(); // remove existing Aevitas constellation stars and connections
    	connections.clear();
    	
    	sl1 = virgo.addStar(29, 5);
        sl2 = virgo.addStar(16, 6);
        sl3 = virgo.addStar(18, 11);
        sl4 = virgo.addStar(25, 12);
        sl5 = virgo.addStar(22, 13);
        sl6 = virgo.addStar(17, 22);
        sl7 = virgo.addStar(14, 15);
        sl8 = virgo.addStar(9, 15);
        sl9 = virgo.addStar(2, 17);
        sl10 = virgo.addStar(10, 23);
        sl11 = virgo.addStar(8, 21);
        sl12 = virgo.addStar(4, 22);

        virgo.addConnection(sl1, sl4);
        virgo.addConnection(sl4, sl5);
        virgo.addConnection(sl3, sl5);
        virgo.addConnection(sl2, sl3);
        virgo.addConnection(sl5, sl6);
        virgo.addConnection(sl6, sl7);
        virgo.addConnection(sl7, sl3);
        virgo.addConnection(sl6, sl10);
        virgo.addConnection(sl10, sl11);
        virgo.addConnection(sl11, sl12);
        virgo.addConnection(sl7, sl8);
        virgo.addConnection(sl8, sl9);
        
        ConstellationBase pisces = (ConstellationBase) Constellations.octans;
	 	c = pisces.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(pisces);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(pisces);
    	
    	stars.clear(); // remove existing Octans constellation stars and connections
    	connections.clear();
        
    	sl1 = pisces.addStar(4, 9);
    	sl2 = pisces.addStar(6, 7);
    	sl3 = pisces.addStar(8, 13);
    	sl4 = pisces.addStar(10, 21);
    	sl5 = pisces.addStar(12, 29);
    	sl6 = pisces.addStar(14, 21);
    	sl7 = pisces.addStar(16, 15);
    	sl8 = pisces.addStar(18, 11);
    	sl9 = pisces.addStar(20, 7);
    	sl10 = pisces.addStar(22, 3);
    	sl11 = pisces.addStar(24, 11);
    	sl12 = pisces.addStar(26, 3);
    	sl13 = pisces.addStar(28, 7);
        
        pisces.addConnection(sl1, sl2);
        pisces.addConnection(sl2, sl3);
        pisces.addConnection(sl3, sl1);
        pisces.addConnection(sl3, sl4);
        pisces.addConnection(sl4, sl5);
        pisces.addConnection(sl5, sl6);
        pisces.addConnection(sl6, sl7);
        pisces.addConnection(sl7, sl8);
        pisces.addConnection(sl8, sl9);
        pisces.addConnection(sl9, sl10);
        pisces.addConnection(sl9, sl11);
        pisces.addConnection(sl11, sl13);
        pisces.addConnection(sl10, sl12);
        pisces.addConnection(sl13, sl12);
        
        ConstellationBase taurus = (ConstellationBase) Constellations.mineralis;
	 	c = taurus.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(taurus);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(taurus);
        
    	stars.clear(); // remove existing Mineralis constellation stars and connections
    	connections.clear();
    	
        sl1 = taurus.addStar(2, 9);
        sl2 = taurus.addStar(8, 3);
        sl3 = taurus.addStar(10, 15);
        sl4 = taurus.addStar(16, 13);
        sl5 = taurus.addStar(16, 17);
        sl6 = taurus.addStar(20, 21);
        sl7 = taurus.addStar(26, 25);
        sl8 = taurus.addStar(28, 27);
        
        taurus.addConnection(sl1, sl3);
        taurus.addConnection(sl2, sl4);
        taurus.addConnection(sl4, sl5);
        taurus.addConnection(sl3, sl5);
        taurus.addConnection(sl5, sl6);
        taurus.addConnection(sl6, sl7);
        taurus.addConnection(sl7, sl8);
        
        ConstellationBase aries = (ConstellationBase) Constellations.evorsio;
	 	c = aries.getClass().getSuperclass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(aries);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(aries);
        
    	stars.clear(); // remove existing Evorsio constellation stars and connections
    	connections.clear();
        
    	sl1 = aries.addStar(2, 9);
    	sl2 = aries.addStar(18, 11);
    	sl3 = aries.addStar(26, 15);
    	sl4 = aries.addStar(28, 17);
        
        aries.addConnection(sl1, sl2);
        aries.addConnection(sl2, sl3);
        aries.addConnection(sl3, sl4);
	}
}
