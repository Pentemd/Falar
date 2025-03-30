package fr.pentalonwaterprof.falar;

import fr.pentalonwaterprof.falar.init.ModBlocks;
import fr.pentalonwaterprof.falar.init.ModFeatures;
import fr.pentalonwaterprof.falar.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Falar.MODID)
public class Falar {

    public static final String MODID = "falar";

    public Falar()
    {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }
    private void setup(FMLCommonSetupEvent e)
    {
        ModFeatures feature = new ModFeatures();
        feature.init();
        MinecraftForge.EVENT_BUS.register(feature);

    }
    private void clientSetup(FMLClientSetupEvent e)
    {

    }
}


//https://crafting.thedestruc7i0n.ca/
