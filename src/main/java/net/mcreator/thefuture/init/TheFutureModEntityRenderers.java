
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefuture.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.thefuture.client.renderer.RobotRenderer;
import net.mcreator.thefuture.client.renderer.MuzRenderer;
import net.mcreator.thefuture.client.renderer.HolkaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheFutureModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheFutureModEntities.ROBOT.get(), RobotRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.MUZ.get(), MuzRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.HOLKA.get(), HolkaRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.AK_47.get(), ThrownItemRenderer::new);
	}
}
