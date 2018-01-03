package es.esy.playdotv.pollutionmap;

import es.esy.playdotv.pollutionmap.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACCEPTED_VERSIONS)
public class PollutionMap {
	
	@Mod.Instance
	public static PollutionMap instance;
	
	@SidedProxy(clientSide = Ref.CLIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evt){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent evt){
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt){
		
	}

}
