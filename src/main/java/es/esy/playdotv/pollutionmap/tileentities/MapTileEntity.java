package es.esy.playdotv.pollutionmap.tileentities;

import ecomod.api.EcomodAPI;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class MapTileEntity extends TileEntity implements ITickable{
	
	private int tickCount = 0;
	
	@Override
	public void update() {
		if(!world.isRemote){
			if(tickCount > 20){
				int chunkX = pos.getX() >> 4;
				int chunkZ = pos.getZ() >> 4;
				System.out.println("Pollution at " + chunkX + " " + chunkZ + ": " + EcomodAPI.getPollution(world, chunkX, chunkZ));
				
				tickCount = 0;
			}else{
				tickCount++;
			}
			
		}
		
	}
	
}
