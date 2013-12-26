package mmmod;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class TutorialBasicAxe extends ItemAxe {

	public TutorialBasicAxe(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(TutorialMod.tutorialTab);
	}

}
