package mmmod.tutorial;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TopazOre extends Block {

	public TopazOre(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(TutorialMod.tutorialTab);
		setTextureName("mmmod:tutorial/topazore");
	}

	public int idDropped(int par1, Random par2Random, int par3) {
		return TutorialMod.topaz.itemID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}

}
