package mmmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class TutorialBasicSword extends ItemSword {

	public TutorialBasicSword(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(TutorialMod.tutorialTab);
	}

}
