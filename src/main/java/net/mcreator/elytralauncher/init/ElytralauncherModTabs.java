
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.elytralauncher.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.elytralauncher.ElytralauncherMod;

public class ElytralauncherModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElytralauncherMod.MODID);
	public static final RegistryObject<CreativeModeTab> ELYTRA_LAUNCHER = REGISTRY.register("elytra_launcher",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.elytralauncher.elytra_launcher")).icon(() -> new ItemStack(ElytralauncherModBlocks.LAUNCHER_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ElytralauncherModBlocks.LAUNCHER_BLOCK.get().asItem());
			})

					.build());
}
