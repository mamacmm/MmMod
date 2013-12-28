package mmmod.tutorial;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="TutorialMod",name="练习Mod",version="1.0")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class TutorialMod {

	//ToolMaterial
	public static EnumToolMaterial EnumToolMaterialTopaz = EnumHelper.addToolMaterial("LowPower", 2, 10, 20.0F, 3, 15);
	
	//Tabs
	public static CreativeTabs tutorialTab = new TutorialTab(CreativeTabs.getNextID(), "勐萌的练习Mod 黄晶");
	
	// items
	public static Item topaz;
	
	// tools
	public static Item TopazAxe;
	public static Item TopazShovel;
	public static Item TopazSword;
	public static Item TopazPickaxe;
	public static Item TopazHoe;
	
	//blocks
	public static Block topazblock;
	public static Block topazore;
	
	
	
	@Init
	public void load(FMLInitializationEvent event){
		// 定义
		topaz = new GemItems(3001).setUnlocalizedName("topaz");
		// 命名
		LanguageRegistry.addName(topaz, "黄晶宝石");
		
		//========================================================================		
		
		topazblock = new TopazBlock(3002, "topazblock").setUnlocalizedName("topazblock").setHardness(5.0F).setStepSound(Block.soundMetalFootstep).setResistance(10.0F);
		GameRegistry.registerBlock(topazblock, "topazblock");
		LanguageRegistry.addName(topazblock, "黄晶块");
		
		// 合成
//		GameRegistry.addRecipe(new ItemStack(topazblock,1), new Object[]{
//			"TTT"," S "," S ",'T',topaz,'S',Item.stick
//			});
		GameRegistry.addRecipe(new ItemStack(topazblock,1), new Object[]{
			"TTT","TTT","TTT",'T',topaz
			});
		
		// 分解
		GameRegistry.addShapelessRecipe(new ItemStack(topaz,9), new Object[]{
			topazblock });
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.blockDiamond,64), new Object[]{
			Block.dirt, Block.bedrock, topaz });
		
		//========================================================================	
		
		topazore = new TopazOre(3003, "topazore").
				setUnlocalizedName("topazore").
				setHardness(2.0F).
				setStepSound(Block.soundStoneFootstep).
				setResistance(5.0F);
		GameRegistry.registerBlock(topazore, "topazore");
		LanguageRegistry.addName(topazore, "黄晶矿");
		
		//world gen
		GameRegistry.registerWorldGenerator(new WorldGeneratorTutorial());
		
		
		//========================================================================
		TopazAxe = new TutorialBasicAxe(3004, EnumToolMaterialTopaz).setUnlocalizedName("jasperaxe");//斧子
		TopazShovel = new TutorialBasicShovel(3005, EnumToolMaterialTopaz).setUnlocalizedName("jaspershovel");//铲子
		TopazPickaxe = new TutorialBasicPickaxe(3006, EnumToolMaterialTopaz).setUnlocalizedName("jasperpick");//镐
		TopazHoe = new TutorialBasicHoe(3007, EnumToolMaterialTopaz).setUnlocalizedName("jasperhoe");//锄
		TopazSword = new TutorialBasicSword(3008, EnumToolMaterialTopaz).setUnlocalizedName("jaspersword");//剑
		
		LanguageRegistry.addName(TopazAxe, "黄晶斧");
		LanguageRegistry.addName(TopazShovel, "黄晶铲");
		LanguageRegistry.addName(TopazPickaxe, "黄晶镐");
		LanguageRegistry.addName(TopazHoe, "黄晶锄");
		LanguageRegistry.addName(TopazSword, "黄晶剑");
		
		//合成
		GameRegistry.addRecipe(new ItemStack(TopazAxe,2), new Object[]{
			"TT ","TS "," S ",'T',topaz,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(TopazShovel,2), new Object[]{
			" T "," S "," S ",'T',topaz,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(TopazPickaxe,2), new Object[]{
			"TTT"," S "," S ",'T',topaz,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(TopazHoe,2), new Object[]{
			"TT "," S "," S ",'T',topaz,'S',Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(TopazSword,2), new Object[]{
			" T "," T "," S ",'T',topaz,'S',Item.stick
		});
		
	}
	
	
	
	
}
