package swordstone.astrosorc;

import java.lang.reflect.Field;
import java.util.List;

import hellfirepvp.astralsorcery.common.constellation.ConstellationBase;
import hellfirepvp.astralsorcery.common.constellation.star.StarConnection;
import hellfirepvp.astralsorcery.common.constellation.star.StarLocation;
import hellfirepvp.astralsorcery.common.lib.Constellations;

/**
 * This class is part of the Astrological Sorcery mod, 
 * an addon for the original Astral Sorcery mod by HellFirePvP.
 * 
 * The complete source code for this mod can be found on GitHub: 
 * https://github.com/Hydrokinetic/AstrologicalSorcery
 * 
 * Class: ModifyConstellations
 * 
 * Created by Swordstone
 * 
 * Date: 5/2/2020
 */
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
	
	// TODO: split this up somehow, this thing's massive
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
    	
    	sl1 = virgo.addStar(2, 21);
    	sl2 = virgo.addStar(4, 27);
    	sl3 = virgo.addStar(6, 19);
    	sl4 = virgo.addStar(8, 25);
    	sl5 = virgo.addStar(10, 5);
    	sl6 = virgo.addStar(10, 19);
    	sl7 = virgo.addStar(12, 27);
    	sl8 = virgo.addStar(14, 11);
    	sl9 = virgo.addStar(18, 19);
    	sl10 = virgo.addStar(18, 25);
    	sl11 = virgo.addStar(20, 13);
    	sl12 = virgo.addStar(24, 9);
    	sl13 = virgo.addStar(26, 3);

    	virgo.addConnection(sl1, sl3);
    	virgo.addConnection(sl3, sl6);
    	virgo.addConnection(sl2, sl4);
    	virgo.addConnection(sl4, sl7);
    	virgo.addConnection(sl7, sl10);
    	virgo.addConnection(sl9, sl10);
    	virgo.addConnection(sl9, sl11);
    	virgo.addConnection(sl11, sl12);
    	virgo.addConnection(sl12, sl13);
    	virgo.addConnection(sl6, sl8);
    	virgo.addConnection(sl6, sl10);
    	virgo.addConnection(sl8, sl5);
    	virgo.addConnection(sl8, sl11);
        
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
        
        ConstellationBase sagittarius = (ConstellationBase) Constellations.discidia;
	 	c = sagittarius.getClass().getSuperclass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(sagittarius);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(sagittarius);
        
    	stars.clear(); // remove existing Discidia constellation stars and connections
    	connections.clear();
        
    	sl1 = sagittarius.addStar(2, 5);
    	sl2 = sagittarius.addStar(6, 7);
    	sl3 = sagittarius.addStar(6, 17);
    	sl4 = sagittarius.addStar(8, 21);
    	sl5 = sagittarius.addStar(10, 5);
    	sl6 = sagittarius.addStar(10, 13);
    	sl7 = sagittarius.addStar(14, 15);
    	sl8 = sagittarius.addStar(20, 11);
    	sl9 = sagittarius.addStar(20, 21);
    	sl10 = sagittarius.addStar(22, 17);
    	sl11 = sagittarius.addStar(22, 27);
    	sl12 = sagittarius.addStar(24, 5);
    	sl13 = sagittarius.addStar(26, 19);
        
        sagittarius.addConnection(sl1, sl2);
        sagittarius.addConnection(sl2, sl5);
        sagittarius.addConnection(sl3, sl4);
        sagittarius.addConnection(sl3, sl6);
        sagittarius.addConnection(sl2, sl6);
        sagittarius.addConnection(sl6, sl7);
        sagittarius.addConnection(sl7, sl8);
        sagittarius.addConnection(sl8, sl10);
        sagittarius.addConnection(sl10, sl9);
        sagittarius.addConnection(sl8, sl12);
        sagittarius.addConnection(sl9, sl11);
        sagittarius.addConnection(sl10, sl13);

        ConstellationBase leo = (ConstellationBase) Constellations.fornax;
	 	c = leo.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(leo);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(leo);
        
    	stars.clear(); // remove existing Fornax constellation stars and connections
    	connections.clear();
        
    	sl1 = leo.addStar(2, 23);
    	sl2 = leo.addStar(4, 17);
    	sl3 = leo.addStar(8, 21);
    	sl4 = leo.addStar(14, 15);
    	sl5 = leo.addStar(16, 11);
    	sl6 = leo.addStar(20, 17);
    	sl7 = leo.addStar(22, 5);
    	sl8 = leo.addStar(22, 23);
    	sl9 = leo.addStar(26, 9);
    	
        leo.addConnection(sl1, sl2);
        leo.addConnection(sl1, sl3);
        leo.addConnection(sl3, sl8);
        leo.addConnection(sl2, sl4);
        leo.addConnection(sl4, sl5);
        leo.addConnection(sl4, sl6);
        leo.addConnection(sl6, sl8);
        leo.addConnection(sl5, sl7);
        leo.addConnection(sl7, sl9);
        
        ConstellationBase gemini = (ConstellationBase) Constellations.vicio;
	 	c = gemini.getClass().getSuperclass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(gemini);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(gemini);
        
    	stars.clear(); // remove existing Vicio constellation stars and connections
    	connections.clear();
        
        sl1 = gemini.addStar(2, 7);
        sl2 = gemini.addStar(2, 15);
        sl3 = gemini.addStar(6, 11);
        sl4 = gemini.addStar(8, 3);
        sl5 = gemini.addStar(10, 9);
        sl6 = gemini.addStar(10, 17);
        sl7 = gemini.addStar(14, 7);
        sl8 = gemini.addStar(14, 19);
        sl9 = gemini.addStar(18, 3);
        sl10 = gemini.addStar(20, 13);
        sl11 = gemini.addStar(20, 27);
        sl12 = gemini.addStar(22, 25);
        sl13 = gemini.addStar(24, 21);
        sl14 = gemini.addStar(26, 19);
        
        gemini.addConnection(sl1, sl3);
        gemini.addConnection(sl2, sl3);
        gemini.addConnection(sl3, sl5);
        gemini.addConnection(sl3, sl6);
        gemini.addConnection(sl5, sl7);
        gemini.addConnection(sl4, sl7);
        gemini.addConnection(sl7, sl10);
        gemini.addConnection(sl7, sl9);
        gemini.addConnection(sl10, sl13);
        gemini.addConnection(sl10, sl14);
        gemini.addConnection(sl6, sl8);
        gemini.addConnection(sl8, sl11);
        gemini.addConnection(sl8, sl12);
        
        ConstellationBase capricornus = (ConstellationBase) Constellations.armara;
	 	c = capricornus.getClass().getSuperclass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(capricornus);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(capricornus);
        
    	stars.clear(); // remove existing Armara constellation stars and connections
    	connections.clear();
        
    	sl1 = capricornus.addStar(2, 11);
    	sl2 = capricornus.addStar(8, 13);
    	sl3 = capricornus.addStar(8, 21);
    	sl4 = capricornus.addStar(14, 15);
    	sl5 = capricornus.addStar(16, 27);
    	sl6 = capricornus.addStar(24, 15);
    	sl7 = capricornus.addStar(26, 11);
    	
        capricornus.addConnection(sl1, sl2);
        capricornus.addConnection(sl1, sl3);
        capricornus.addConnection(sl2, sl4);
        capricornus.addConnection(sl4, sl6);
        capricornus.addConnection(sl6, sl7);
        capricornus.addConnection(sl3, sl5);
        capricornus.addConnection(sl5, sl6);
        
        ConstellationBase libra = (ConstellationBase) Constellations.lucerna;
	 	c = libra.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(libra);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(libra);
        
    	stars.clear(); // remove existing Lucerna constellation stars and connections
    	connections.clear();
        
        sl1 = libra.addStar(4, 13);
        sl2 = libra.addStar(6, 27);
        sl3 = libra.addStar(8, 25);
        sl4 = libra.addStar(10, 11);
        sl5 = libra.addStar(16, 3);
        sl6 = libra.addStar(20, 23);
        sl7 = libra.addStar(24, 11);
        
        libra.addConnection(sl1, sl4);
        libra.addConnection(sl4, sl5);
        libra.addConnection(sl5, sl7);
        libra.addConnection(sl5, sl6);
        libra.addConnection(sl7, sl6);
        libra.addConnection(sl2, sl3);
        libra.addConnection(sl3, sl6);
        
        ConstellationBase aquarius = (ConstellationBase) Constellations.bootes;
	 	c = aquarius.getClass().getSuperclass();
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(aquarius);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(aquarius);
        
    	stars.clear(); // remove existing Bootes constellation stars and connections
    	connections.clear();
        
    	sl1 = aquarius.addStar(2, 7);
    	sl2 = aquarius.addStar(4, 23);
    	sl3 = aquarius.addStar(6, 9);
    	sl4 = aquarius.addStar(6, 17);
    	sl5 = aquarius.addStar(8, 3);
    	sl6 = aquarius.addStar(8, 15);
    	sl7 = aquarius.addStar(12, 9);
    	sl8 = aquarius.addStar(14, 3);
    	sl9 = aquarius.addStar(14, 15);
    	sl10 = aquarius.addStar(20, 5);
    	sl11 = aquarius.addStar(26, 7);
        
        aquarius.addConnection(sl1, sl3);
        aquarius.addConnection(sl3, sl6);
        aquarius.addConnection(sl6, sl4);
        aquarius.addConnection(sl4, sl2);
        aquarius.addConnection(sl1, sl5);
        aquarius.addConnection(sl5, sl8);
        aquarius.addConnection(sl8, sl7);
        aquarius.addConnection(sl7, sl9);
        aquarius.addConnection(sl8, sl10);
        aquarius.addConnection(sl10, sl11);
        
        ConstellationBase scorpius = (ConstellationBase) Constellations.horologium;
	 	c = scorpius.getClass().getSuperclass().getSuperclass().getSuperclass();
	 	// RegistryConstellations -> WeakSpecial -> Weak -> ConstellationBase
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(scorpius);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(scorpius);
        
    	stars.clear(); // remove existing Horologium constellation stars and connections
    	connections.clear();
        
        sl1 = scorpius.addStar(2, 21);
        sl2 = scorpius.addStar(4, 19);
        sl3 = scorpius.addStar(4, 25);
        sl4 = scorpius.addStar(6, 17);
        sl5 = scorpius.addStar(10, 27);
        sl6 = scorpius.addStar(16, 19);
        sl7 = scorpius.addStar(16, 25);
        sl8 = scorpius.addStar(18, 13);
        sl9 = scorpius.addStar(20, 9);
        sl10 = scorpius.addStar(24, 5);
        sl11 = scorpius.addStar(26, 7);
        sl12 = scorpius.addStar(26, 9);
        
        scorpius.addConnection(sl1, sl2);
        scorpius.addConnection(sl2, sl4);
        scorpius.addConnection(sl1, sl3);
        scorpius.addConnection(sl3, sl5);
        scorpius.addConnection(sl5, sl7);
        scorpius.addConnection(sl7, sl6);
        scorpius.addConnection(sl6, sl8);
        scorpius.addConnection(sl8, sl9);
        scorpius.addConnection(sl9, sl10);
        scorpius.addConnection(sl9, sl11);
        scorpius.addConnection(sl9, sl12);
        
        ConstellationBase cancer = (ConstellationBase) Constellations.pelotrio;
	 	c = cancer.getClass().getSuperclass().getSuperclass().getSuperclass();
	 	// RegistryConstellations -> WeakSpecial -> Weak -> ConstellationBase
	 
	 	// We know exactly what types stars and connections are, so we can do these unchecked casts safely
		fieldStarLocations = c.getDeclaredField("starLocations");
		fieldStarLocations.setAccessible(true);
    	stars = (List<StarLocation>) fieldStarLocations.get(cancer);
    	
    	fieldConnections = c.getDeclaredField("connections");
		fieldConnections.setAccessible(true);
    	connections = (List<StarConnection>) fieldConnections.get(cancer);
        
    	stars.clear(); // remove existing Pelotrio constellation stars and connections
    	connections.clear();
    	
    	sl1 = cancer.addStar(8, 23);
    	sl2 = cancer.addStar(12, 3);
    	sl3 = cancer.addStar(14, 11);
    	sl4 = cancer.addStar(14, 15);
    	sl5 = cancer.addStar(18, 21);
    	sl6 = cancer.addStar(22, 25);
    	
    	cancer.addConnection(sl1, sl4);
    	cancer.addConnection(sl2, sl3);
    	cancer.addConnection(sl3, sl4);
    	cancer.addConnection(sl4, sl5);
    	cancer.addConnection(sl5, sl6);
	}
}
