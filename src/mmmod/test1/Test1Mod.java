package mmmod.test1;

import java.util.logging.Logger;

import mmmod.core.config.Version;
import mmmod.test1.entity.EntityFrozen;
import mmmod.test1.misc.CCTGraphRevo;
import mmmod.test1.proxy.GRCommonProxy;
import mmmod.test1.registry.GRItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid="MmMod-Test1Mod",name="勐萌的Mod-测试1Mod",version=Version.version)
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class Test1Mod {
	/**
     * 日志
     */
    public static Logger log = Logger.getLogger("MmMod-Test1Mod");
    
    /**
     * 创造模式栏。
     */
    public static CreativeTabs cct = new CCTGraphRevo("mmmod.test1.default.name");
    
	@Instance(value = "MmMod-Test1Mod")
	public static Test1Mod instance;
	
	 /**
     * 加载代理，由forge来辅助管理。
     */
    @SidedProxy(
            clientSide = "mmmod.test1.proxy.GRClientProxy",
            serverSide = "mmmod.test1.proxy.GRCommonProxy"
    )
    public static GRCommonProxy proxy;
	
    /**
     * 加载第一阶段。
     */
    @EventHandler()
    public void preInit(FMLPreInitializationEvent event) {
        log.setParent(FMLLog.getLogger()); //设置为FML日志的子日志
        log.info("Starting MmMod-Test1Mod " + Version.version); //启动信息
        log.info("Copyright (c) MmMod, 2013");
        
        GRItems.init(); //进行物品注册！
        
        proxy.preInit();
    }
    
    /**
     * 加载第二阶段。
     */
    @EventHandler()
    public void init(FMLInitializationEvent event) {
        proxy.init();
        registerEntity(EntityFrozen.class, "entity_frozen");
    }
    
    static int nextEntityID = 0;
	private void registerEntity(Class<? extends Entity> entityClass, String name) {
		EntityRegistry.registerModEntity(entityClass, name, ++nextEntityID, Test1Mod.instance, 32, 3, true);
	}
    
    /**
     * 加载第三阶段。
     */
    @EventHandler()
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
    
    /**
     * 服务器加载（注册指令）
     */
    @EventHandler()
    public void serverStarting(FMLServerStartingEvent event) {
        
    }
}
