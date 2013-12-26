package mmmod;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TutorialTab extends CreativeTabs {

	public TutorialTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	// sets the image for the creative tab
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		// there is a difference between items and blocks. will give an example
		// of both
		return TutorialMod.topaz.itemID;
	}

	// sets the title/name for the creative tab
	public String getTranslatedTabLabel() {
//		return LanguageRegistry.instance().getStringLocalization("itemGroup.carpentersBlocks.name");
		return "勐萌的练习Mod 黄晶";
	}
	
}
