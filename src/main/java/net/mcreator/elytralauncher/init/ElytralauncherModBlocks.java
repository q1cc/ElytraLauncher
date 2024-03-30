
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elytralauncher.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.elytralauncher.block.LauncherBlockBlock;
import net.mcreator.elytralauncher.ElytralauncherMod;

public class ElytralauncherModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ElytralauncherMod.MODID);
	public static final RegistryObject<Block> LAUNCHER_BLOCK = REGISTRY.register("launcher_block", () -> new LauncherBlockBlock());
}
