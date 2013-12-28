package mmmod.test1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Test1Mod",name="测试1",version="1.0")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)
public class Test1Mod {

	@Instance(value = "Test1Mod")
	public static Test1Mod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
	}
	
	@Mod.EventHandler
	public void processMessage(FMLInterModComms.IMCEvent event) {
		
	}
	
	public static String getModId() {
		return Test1Mod.class.getAnnotation(Mod.class).modid();
	}
	
}
