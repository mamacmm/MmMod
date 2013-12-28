package mmmod.test1.item;

import mmmod.test1.Test1Mod;

public class ItemFrozenWand extends GRGenericItem {

	/**
	 * 法杖物品的构造器。
	 */
	public ItemFrozenWand(int par1) {
		super(par1);
		this.setIAndU("test1:frozen_wand"); // 设置图标名和内部名称
		this.addLocalization("mmmod.test1.item.frozenwand.name"); // 添加物品名称
		this.setCreativeTab(Test1Mod.cct); // 设置所属创造模式物品栏
		this.setMaxStackSize(1); // 不可堆叠
		this.setMaxDamage(15); // 最高可使用15次
	}
}