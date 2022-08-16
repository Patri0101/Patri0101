
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefuture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thefuture.item.PistolItem;
import net.mcreator.thefuture.item.NukeCokeItem;
import net.mcreator.thefuture.item.HardwareItem;
import net.mcreator.thefuture.TheFutureMod;

public class TheFutureModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheFutureMod.MODID);
	public static final RegistryObject<Item> ROBOT = REGISTRY.register("robot_spawn_egg",
			() -> new ForgeSpawnEggItem(TheFutureModEntities.ROBOT, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HARDWARE = REGISTRY.register("hardware", () -> new HardwareItem());
	public static final RegistryObject<Item> NUKE_COKE = REGISTRY.register("nuke_coke", () -> new NukeCokeItem());
	public static final RegistryObject<Item> RADIOACTIVE_BLOCK = block(TheFutureModBlocks.RADIOACTIVE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
