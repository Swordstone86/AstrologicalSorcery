package swordstone.astrosorc;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * This class is part of the Astrological Sorcery mod, 
 * an addon for the original Astral Sorcery mod by HellFirePvP.
 * 
 * The complete source code for this mod can be found on GitHub: 
 * https://github.com/Hydrokinetic/AstrologicalSorcery
 *
 * Class: AstrologicalSorcery
 * 
 * Created by Swordstone
 * 
 * Date: 5/2/2020
 */
@Mod(modid = AstrologicalSorcery.MODID, name = AstrologicalSorcery.NAME, version = AstrologicalSorcery.VERSION, 
	dependencies = AstrologicalSorcery.DEPENDENCIES, acceptedMinecraftVersions = AstrologicalSorcery.MC_VERSION)
public class AstrologicalSorcery
{
    public static final String MODID = "astrosorc";
    public static final String NAME = "Astrological Sorcery";
    public static final String VERSION = "1.1.3";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2781,);required-after:astralsorcery@[1.8.5,)";
    public static final String MC_VERSION = "[1.12.2]";
    
    public static Logger logger = LogManager.getLogger(NAME);
    
    // This entire ensureResourceOrder bit of code is taken from wiiv's Magical Psi mod
    // It serves the purpose of substituting our modified .lang files for the originals
    public AstrologicalSorcery() {
    	ensureResourceOrder();
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	event.getModMetadata().version = VERSION;
    }
    
    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
    	// Do this in postInit to allow Astral Sorcery to load its constellations first
     	ModifyConstellations.init();
    }
    
	// Construction is called before resources are loaded and before
	// proxies are assigned, so we have to reflect around
	private void ensureResourceOrder() {
		if(FMLCommonHandler.instance().getSide().isServer())
			return;

		String classname = "swordstone.astrosorc.client.ResourceProxy";
		try {
			Class<?> clazz = Class.forName(classname);
			clazz.getMethod("init").invoke(null);
		} catch(Exception e) {
			logger.error("Could not hook Resource Proxy.", e);
		}
	}
}
