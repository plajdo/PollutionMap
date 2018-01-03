package es.esy.playdotv.pollutionmap.init;

import es.esy.playdotv.pollutionmap.blocks.MapBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	@ObjectHolder("pollutionmap:map")
	public static MapBlock map;
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		map.initModel();
	}
	
}
