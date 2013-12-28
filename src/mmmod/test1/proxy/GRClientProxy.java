package mmmod.test1.proxy;

import mmmod.test1.client.render.RenderFrozen;
import mmmod.test1.entity.EntityFrozen;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * 客户端的加载代理。
 * 
 * @author cuimh
 */
public class GRClientProxy extends GRCommonProxy {

    public void preInit() {
        super.preInit();
    }
    
    public void init() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFrozen.class, new RenderFrozen()); //注册渲染器
        super.init();
    }
    
    public void postInit() {
        super.postInit();
    }

}
