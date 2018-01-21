package es.esy.playdotv.pollutionmap.gui;

import net.minecraft.block.material.MapColor;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class MapScreen extends GuiScreen{
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks){
		this.drawDefaultBackground();
		
		drawMap();
				
	}
	
	private void drawMap(){
		int indexX = -128;
		int indexY = -128;
		
		while(indexX < 128){
			int posX = width / 2 + indexX;
			while(indexY < 128){
				int posY = height / 2 + indexY;
				
				int bpX = getThisPos().getX() + indexX;
				int bpZ = getThisPos().getZ() + indexY;
				int bpY = getHighestBlock(bpX, bpZ);
				
				BlockPos bp = new BlockPos(bpX, bpY, bpZ);
				
				drawRect(posX, posY, posX + 1, posY + 1, getBlockColour(bp));
				
				indexY++;
				
			}
			indexY = -128;
			indexX++;
			
		}
		indexX = -128;
		
	}
	
	private Integer getBlockColour(BlockPos pos){
		MapColor mapcol = mc.world.getBlockState(pos).getMaterial().getMaterialMapColor();
		int colour = mapcol.colorValue;
		int[] numArray = {255, colour >> 16, colour >> 8 & 255, colour & 255};
		StringBuilder numAsString = new StringBuilder();
		numAsString.append(Integer.toHexString(numArray[0]));
		numAsString.append(Integer.toHexString(numArray[1]));
		numAsString.append(Integer.toHexString(numArray[2]));
		numAsString.append(Integer.toHexString(numArray[3]));
		return Integer.parseUnsignedInt(numAsString.toString(), 16);
		
	}
	
	private BlockPos getThisPos(){
		Vec3d lookVector = mc.player.getLookVec();
		Vec3d positionVector = mc.player.getPositionVector();
		RayTraceResult rtr = mc.world.rayTraceBlocks(positionVector, lookVector);
		return rtr.getBlockPos();

	}
	
	private int getHighestBlock(int x, int z){
		for(int i = 255; i > 0; i--){
			if(!mc.world.getBlockState(new BlockPos(x, i, z)).isTranslucent()){
				return i;
			}
			
		}
		return 62;

	}
	
	@Override
	public boolean doesGuiPauseGame(){
		return true;
	}
	
	@Override
	public void initGui(){
		
	}
	
	@Override
	public void updateScreen(){
		
	}
	
}
