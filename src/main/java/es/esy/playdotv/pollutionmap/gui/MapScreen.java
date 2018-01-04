package es.esy.playdotv.pollutionmap.gui;

import net.minecraft.client.gui.GuiScreen;

public class MapScreen extends GuiScreen{
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	@Override
	public void initGui() {
		System.out.println("wolololololo gui");
		this.fontRenderer.drawString("Aaaaa", 0, 0, 16719390);
	}
	
}
