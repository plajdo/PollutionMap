package es.esy.playdotv.pollutionmap.blocks;

import es.esy.playdotv.pollutionmap.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MapBlock extends Block{
	
	public MapBlock(){
		super(Material.ROCK);
		setUnlocalizedName(Ref.MOD_ID + ".map");
		setRegistryName("map");
		setCreativeTab(CreativeTabs.REDSTONE);
		setHardness(2f);
		setResistance(10f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
}
