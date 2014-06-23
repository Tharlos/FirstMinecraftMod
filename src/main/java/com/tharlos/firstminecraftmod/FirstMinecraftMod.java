package com.tharlos.firstminecraftmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "FirstMinecraftMod", name = "First Minecraft Mod", version = "1.7.2-1.0")
public class FirstMinecraftMod
{
    //
    @Mod.Instance("FirstMinecraftMod")
    public static FirstMinecraftMod instance;

    // PreInitializationEvent is where you load your network configuration, init your blocks and items, set keybindings etc.
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {

    }

    // InitializationEvent is where you init GUI handler, tile entitys, , general eventhandlers etc. can also be the start of registering you recipes
    @Mod.EventHandler
    public void init(FMLInitializationEvent initEvent)
    {

    }

    // PostInitializationEvent is where you
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {

    }
}
