package swordstone.astrosorc;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
    
    public AstrologicalSorcery() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ModifyConstellations.init();
    }
}
