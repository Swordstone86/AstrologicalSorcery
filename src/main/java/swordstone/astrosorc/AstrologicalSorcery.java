package swordstone.astrosorc;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.thread.SidedThreadGroups;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
@Mod(AstrologicalSorcery.MODID)
public class AstrologicalSorcery
{
    public static final String MODID = "astrosorc";
    public static final String NAME = "Astrological Sorcery";
    
    public static Logger logger = LogManager.getLogger(NAME);
    
    // This entire ensureResourceOrder bit of code is taken from wiiv's Magical Psi mod
    // It serves the purpose of substituting our modified .lang files for the originals
    public AstrologicalSorcery() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    	modEventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

        // ensure custom .lang files are loaded
        //ensureResourceOrder();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Do this in postInit to allow Astral Sorcery to load its constellations first
        ModifyConstellations.init();
    }
    
	// Construction is called before resources are loaded and before
	// proxies are assigned, so we have to reflect around
	/*private void ensureResourceOrder() {
		if(Thread.currentThread().getThreadGroup() == SidedThreadGroups.CLIENT) {
            String classname = "swordstone.astrosorc.client.ResourceProxy";
            try {
                Class<?> clazz = Class.forName(classname);
                clazz.getMethod("init").invoke(null);
            } catch (Exception e) {
                logger.error("Could not hook Resource Proxy.", e);
            }
        }
	}*/
}
