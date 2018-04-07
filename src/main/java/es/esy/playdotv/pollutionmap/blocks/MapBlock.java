package es.esy.playdotv.pollutionmap.blocks;

import es.esy.playdotv.pollutionmap.PollutionMap;
import es.esy.playdotv.pollutionmap.Ref;
import es.esy.playdotv.pollutionmap.network.GuiHandler;
import es.esy.playdotv.pollutionmap.tileentities.MapTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MapBlock extends Block implements ITileEntityProvider{
	
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
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(worldIn.isRemote){
			playerIn.openGui(PollutionMap.instance, GuiHandler.MOD_TILE_ENTITY_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new MapTileEntity();
	}
	
}
