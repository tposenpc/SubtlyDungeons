package net.meander.subtlyd;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(SubtlyDungeonsForge.MOD_ID)
public class SubtlyDungeonsForge {

    public static final String MOD_ID = "subtlyd";

    public SubtlyDungeonsForge() {
        if (FMLEnvironment.dist == Dist.CLIENT) {
            // Client-only init can be registered here via ModEventBus
        }
        // Common init: register DeferredRegisters, events, etc. when porting from Fabric
    }
}
