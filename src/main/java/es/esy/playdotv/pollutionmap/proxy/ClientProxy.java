package es.esy.playdotv.pollutionmap.proxy;

import es.esy.playdotv.pollutionmap.init.ModBlocks;
import es.esy.playdotv.pollutionmap.init.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent e){
		super.preInit(e);
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent e){
		ModBlocks.initModels();
		ModItems.initModels();
	}

}
