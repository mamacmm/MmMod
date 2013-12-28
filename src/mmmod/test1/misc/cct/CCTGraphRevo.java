package mmmod.test1.misc.cct;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * 自定义CreativeTab。
 */
public class CCTGraphRevo extends CreativeTabs {

    /**
     * @param label 标签名称
     */
    public CCTGraphRevo(String label) {
        super(label);
    }
    
    @Override
    public int getTabIconItemIndex() {
        return Block.enchantmentTable.blockID;
    }

}
