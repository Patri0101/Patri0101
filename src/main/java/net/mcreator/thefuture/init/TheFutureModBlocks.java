
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefuture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thefuture.block.RadioactiveBlockBlock;
import net.mcreator.thefuture.TheFutureMod;

public class TheFutureModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheFutureMod.MODID);
	public static final RegistryObject<Block> RADIOACTIVE_BLOCK = REGISTRY.register("radioactive_block", () -> new RadioactiveBlockBlock());
}
