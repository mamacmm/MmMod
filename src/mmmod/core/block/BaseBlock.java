package mmmod.core.block;

import mmmod.core.config.IRegisterableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public abstract class BaseBlock extends Block implements IRegisterableBlock{

	public BaseBlock(int par1, Material par2Material) {
		super(par1, par2Material);
	}

}
