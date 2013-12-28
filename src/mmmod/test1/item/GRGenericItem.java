package mmmod.test1.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GRGenericItem extends Item {

	private String iconName = "";

	public GRGenericItem(int par1) { // 构造器
		super(par1);
	}

	protected void setIconName(String str) { // 设置物品图标位置
		iconName = str;
	}

	/**
	 * 方便的快速设置函数。
	 */
	protected void setIAndU(String str) {
		setUnlocalizedName(str);
		setIconName(str);
	}

	/**
	 * 为物品添加名字的方便函数。请务必在设置了unlocalizedName后调用。
	 */
	protected final void addLocalization(String str) {
		LanguageRegistry.addName(this, str);
	}

	/**
	 * 进行物品贴图的注册。
	 */
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		if (!iconName.equals(""))
			itemIcon = iconRegister.registerIcon(iconName);
	}
}