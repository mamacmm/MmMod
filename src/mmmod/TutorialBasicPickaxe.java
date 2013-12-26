package mmmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class TutorialBasicPickaxe extends ItemPickaxe {

	public TutorialBasicPickaxe(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(TutorialMod.tutorialTab);
	}

}
