
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

import net.mcreator.thefuture.item.StrelaItem;
import net.mcreator.thefuture.item.PistolItem;
import net.mcreator.thefuture.item.NukeCokeItem;
import net.mcreator.thefuture.item.NabojItem;
import net.mcreator.thefuture.item.AK47Item;
import net.mcreator.thefuture.TheFutureMod;

public class TheFutureModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheFutureMod.MODID);
	public static final RegistryObject<Item> ROBOT = REGISTRY.register("robot_spawn_egg",
			() -> new ForgeSpawnEggItem(TheFutureModEntities.ROBOT, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NUKE_COKE = REGISTRY.register("nuke_coke", () -> new NukeCokeItem());
	public static final RegistryObject<Item> RADIOACTIVE_BLOCK = block(TheFutureModBlocks.RADIOACTIVE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MUZ = REGISTRY.register("muz_spawn_egg",
			() -> new ForgeSpawnEggItem(TheFutureModEntities.MUZ, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HOLKA = REGISTRY.register("holka_spawn_egg",
			() -> new ForgeSpawnEggItem(TheFutureModEntities.HOLKA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NABOJ = REGISTRY.register("naboj", () -> new NabojItem());
	public static final RegistryObject<Item> STRELA = REGISTRY.register("strela", () -> new StrelaItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> AK_47 = REGISTRY.register("ak_47", () -> new AK47Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
