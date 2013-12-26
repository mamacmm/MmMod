package mmmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;

public class TutorialBasicHoe extends ItemHoe {

	public TutorialBasicHoe(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(TutorialMod.tutorialTab);
		setTextureName("mmmod:jasperhoe");
	}

}
