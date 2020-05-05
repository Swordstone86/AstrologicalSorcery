package swordstone.astrosorc;

import java.lang.reflect.Field;
import java.util.List;

import hellfirepvp.astralsorcery.common.constellation.ConstellationBase;
import hellfirepvp.astralsorcery.common.constellation.IConstellation;
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
		registerNewConstellations();
	}
	
	// TODO: split this up somehow, this thing's massive
	private static void registerNewConstellations() {
	 	StarLocation sl1, sl2, sl3, sl4, sl5, sl6, sl7, sl8, sl9, sl10, sl11, sl12, sl13, sl14;
	 	
		ConstellationBase virgo = clearExistingConstellation(Constellations.aevitas);
    	
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
        
    	ConstellationBase pisces = clearExistingConstellation(Constellations.octans);
        
    	sl1 = pisces.addStar(4, 9);
    	sl2 = pisces.addStar(6, 7);
    	sl3 = pisces.addStar(8, 11);
    	sl4 = pisces.addStar(10, 19);
    	sl5 = pisces.addStar(12, 27);
    	sl6 = pisces.addStar(14, 19);
    	sl7 = pisces.addStar(16, 15);
    	sl8 = pisces.addStar(18, 9);
    	sl9 = pisces.addStar(20, 5);
    	sl10 = pisces.addStar(22, 3);
    	sl11 = pisces.addStar(22, 7);
    	sl12 = pisces.addStar(24, 3);
    	sl13 = pisces.addStar(24, 5);
        
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
    	pisces.addConnection(sl10, sl12);
    	pisces.addConnection(sl12, sl13);
    	pisces.addConnection(sl13, sl11);
    	pisces.addConnection(sl11, sl9);
    	
        ConstellationBase taurus = clearExistingConstellation(Constellations.mineralis);
    	
        sl1 = taurus.addStar(2, 9);
        sl2 = taurus.addStar(8, 3);
        sl3 = taurus.addStar(10, 15);
        sl4 = taurus.addStar(16, 13);
        sl5 = taurus.addStar(16, 17);
        sl6 = taurus.addStar(20, 21);
        sl7 = taurus.addStar(26, 25);
        
        taurus.addConnection(sl1, sl3);
        taurus.addConnection(sl2, sl4);
        taurus.addConnection(sl4, sl5);
        taurus.addConnection(sl3, sl5);
        taurus.addConnection(sl5, sl6);
        taurus.addConnection(sl6, sl7);
        
        ConstellationBase aries = clearExistingConstellation(Constellations.evorsio);
        
        sl1 = aries.addStar(2, 9);
        sl2 = aries.addStar(16, 11);
        sl3 = aries.addStar(24, 15);
        sl4 = aries.addStar(26, 17);
        
        aries.addConnection(sl1, sl2);
        aries.addConnection(sl2, sl3);
        aries.addConnection(sl3, sl4);
        
        ConstellationBase sagittarius = clearExistingConstellation(Constellations.discidia);
        
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

        ConstellationBase leo = clearExistingConstellation(Constellations.fornax);
        
        sl1 = leo.addStar(2, 25);
        sl2 = leo.addStar(8, 17);
        sl3 = leo.addStar(10, 23);
        sl4 = leo.addStar(18, 11);
        sl5 = leo.addStar(18, 15);
        sl6 = leo.addStar(22, 5);
        sl7 = leo.addStar(22, 17);
        sl8 = leo.addStar(24, 23);
        sl9 = leo.addStar(26, 7);
    	
        leo.addConnection(sl1, sl2);
        leo.addConnection(sl1, sl3);
        leo.addConnection(sl2, sl5);
        leo.addConnection(sl3, sl8);
        leo.addConnection(sl8, sl7);
        leo.addConnection(sl7, sl5);
        leo.addConnection(sl5, sl4);
        leo.addConnection(sl4, sl6);
        leo.addConnection(sl6, sl9);

        ConstellationBase gemini = clearExistingConstellation(Constellations.vicio);
        
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
        
        ConstellationBase capricornus = clearExistingConstellation(Constellations.armara);
        
        sl1 = capricornus.addStar(2, 11);
        sl2 = capricornus.addStar(6, 21);
        sl3 = capricornus.addStar(8, 13);
        sl4 = capricornus.addStar(14, 15);
        sl5 = capricornus.addStar(14, 27);
        sl6 = capricornus.addStar(24, 17);
        sl7 = capricornus.addStar(26, 13);
    	
        capricornus.addConnection(sl1, sl2);
        capricornus.addConnection(sl1, sl3);
        capricornus.addConnection(sl3, sl4);
        capricornus.addConnection(sl2, sl5);
        capricornus.addConnection(sl5, sl6);
        capricornus.addConnection(sl4, sl7);
        capricornus.addConnection(sl6, sl7);
        
        ConstellationBase libra = clearExistingConstellation(Constellations.lucerna);
        
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
        
        ConstellationBase aquarius = clearExistingConstellation(Constellations.bootes);
        
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
        
        ConstellationBase scorpius = clearExistingConstellation(Constellations.horologium);
        
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
        
        ConstellationBase cancer = clearExistingConstellation(Constellations.pelotrio);
    	
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
    	
    	ConstellationBase lyra = clearExistingConstellation(Constellations.alcara);
    	
    	sl1 = lyra.addStar(6, 27);
    	sl2 = lyra.addStar(8, 9);
    	sl3 = lyra.addStar(14, 25);
    	sl4 = lyra.addStar(16, 7);
    	sl5 = lyra.addStar(22, 3);
    	
    	lyra.addConnection(sl1, sl2);
    	lyra.addConnection(sl1, sl3);
    	lyra.addConnection(sl3, sl4);
    	lyra.addConnection(sl2, sl4);
    	lyra.addConnection(sl4, sl5);
    	
    	ConstellationBase coronaBorealis = clearExistingConstellation(Constellations.gelu);
    	
    	sl1 = coronaBorealis.addStar(2, 11);
    	sl2 = coronaBorealis.addStar(4, 21);
    	sl3 = coronaBorealis.addStar(10, 23);
    	sl4 = coronaBorealis.addStar(16, 23);
    	sl5 = coronaBorealis.addStar(22, 5);
    	sl6 = coronaBorealis.addStar(22, 21);
    	sl7 = coronaBorealis.addStar(26, 13);
    	
    	coronaBorealis.addConnection(sl1, sl2);
    	coronaBorealis.addConnection(sl2, sl3);
    	coronaBorealis.addConnection(sl3, sl4);
    	coronaBorealis.addConnection(sl4, sl6);
    	coronaBorealis.addConnection(sl6, sl7);
    	coronaBorealis.addConnection(sl7, sl5);
    	
    	ConstellationBase scutum = clearExistingConstellation(Constellations.ulteria);
    	
    	sl1 = scutum.addStar(6, 3);
    	sl2 = scutum.addStar(8, 15);
    	sl3 = scutum.addStar(10, 17);
    	sl4 = scutum.addStar(16, 11);
    	sl5 = scutum.addStar(22, 27);
    	
    	scutum.addConnection(sl1, sl2);
    	scutum.addConnection(sl2, sl3);
    	scutum.addConnection(sl3, sl5);
    	scutum.addConnection(sl5, sl4);
    	scutum.addConnection(sl4, sl1);
    	
    	ConstellationBase draco = clearExistingConstellation(Constellations.vorux);
    	
    	sl1 = draco.addStar(2, 19);
    	sl2 = draco.addStar(6, 15);
    	sl3 = draco.addStar(6, 23);
    	sl4 = draco.addStar(8, 9);
    	sl5 = draco.addStar(8, 19);
    	sl6 = draco.addStar(10, 5);
    	sl7 = draco.addStar(14, 11);
    	sl8 = draco.addStar(14, 17);
    	sl9 = draco.addStar(16, 21);
    	sl10 = draco.addStar(20, 23);
    	sl11 = draco.addStar(24, 19);
    	sl12 = draco.addStar(26, 17);
    	
    	draco.addConnection(sl1, sl2);
    	draco.addConnection(sl2, sl4);
    	draco.addConnection(sl1, sl3);
    	draco.addConnection(sl3, sl5);
    	draco.addConnection(sl5, sl2);
    	draco.addConnection(sl4, sl6);
    	draco.addConnection(sl6, sl7);
    	draco.addConnection(sl7, sl8);
    	draco.addConnection(sl8, sl9);
    	draco.addConnection(sl9, sl10);
    	draco.addConnection(sl10, sl11);
    	draco.addConnection(sl11, sl12);
	}
	
	@SuppressWarnings("unchecked")
	private static ConstellationBase clearExistingConstellation(IConstellation old) {
		ConstellationBase oldBase = (ConstellationBase) old;
		try {
			Class<?> c = oldBase.getClass();;
			if (oldBase.getClass().getName().endsWith("ConstellationBase$Weak") || 
					oldBase.getClass().getName().endsWith("ConstellationBase$Minor")) {
				c = c.getSuperclass();
				// Weak -> ConstellationBase, or
				// Minor -> ConstellationBase
			}
			else if (oldBase.getClass().getName().endsWith("ConstellationBase$Major")) {
				c = c.getSuperclass().getSuperclass();
				// Major -> Weak -> ConstellationBase
			}
			else if (oldBase.getClass().getName().contains("RegistryConstellations")) {
				c = c.getSuperclass().getSuperclass().getSuperclass();
				// RegistryConstellations -> WeakSpecial -> Weak -> ConstellationBase
				// (why are special constellations so weird)
			}
			Field fieldStarLocations = c.getDeclaredField("starLocations");
			fieldStarLocations.setAccessible(true);
	    	List<StarLocation> stars = (List<StarLocation>) fieldStarLocations.get(oldBase);
	    	
	    	Field fieldConnections = c.getDeclaredField("connections");
			fieldConnections.setAccessible(true);
	    	List<StarConnection> connections = (List<StarConnection>) fieldConnections.get(oldBase);
	    	
	    	stars.clear();
	    	connections.clear();
	    	
	    	return oldBase;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		return null;
	}
}
