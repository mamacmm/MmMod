package mmmod.tutorial;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class TutorialBasicShovel  extends ItemSpade {

	public TutorialBasicShovel(int ItemID, EnumToolMaterial material) {
		super(ItemID, material);
		setCreativeTab(TutorialMod.tutorialTab);
		setTextureName("mmmod:tutorial/jaspershovel");
	}

}
