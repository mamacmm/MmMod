package mmmod.test1.registry;

import mmmod.test1.item.ItemFrozenWand;

public class GRItems {

	public static ItemFrozenWand frozenWand;

	public static void init() {
		frozenWand = new ItemFrozenWand(7777);
	}

}
