
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefuture.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thefuture.client.renderer.RobotRenderer;
import net.mcreator.thefuture.client.renderer.MuzRenderer;
import net.mcreator.thefuture.client.renderer.HodnyrobotRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheFutureModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheFutureModEntities.ROBOT.get(), RobotRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.HODNYROBOT.get(), HodnyrobotRenderer::new);
		event.registerEntityRenderer(TheFutureModEntities.MUZ.get(), MuzRenderer::new);
	}
}
