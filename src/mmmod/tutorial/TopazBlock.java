package mmmod.tutorial;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TopazBlock extends Block {

	public TopazBlock(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(TutorialMod.tutorialTab);
		setTextureName("mmmod:tutorial/topazblock");
	}

	// drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3) {
		return TutorialMod.topazblock.blockID;
	}

	public int quantityDropped(Random random) {
		return 1;
	}
}
