
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefuture.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.thefuture.entity.RobotEntity;
import net.mcreator.thefuture.entity.PistolEntity;
import net.mcreator.thefuture.entity.MuzEntity;
import net.mcreator.thefuture.entity.HolkaEntity;
import net.mcreator.thefuture.entity.AK47Entity;
import net.mcreator.thefuture.TheFutureMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheFutureModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, TheFutureMod.MODID);
	public static final RegistryObject<EntityType<RobotEntity>> ROBOT = register("robot",
			EntityType.Builder.<RobotEntity>of(RobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RobotEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MuzEntity>> MUZ = register("muz",
			EntityType.Builder.<MuzEntity>of(MuzEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MuzEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HolkaEntity>> HOLKA = register("holka",
			EntityType.Builder.<HolkaEntity>of(HolkaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HolkaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PistolEntity>> PISTOL = register("projectile_pistol",
			EntityType.Builder.<PistolEntity>of(PistolEntity::new, MobCategory.MISC).setCustomClientFactory(PistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AK47Entity>> AK_47 = register("projectile_ak_47",
			EntityType.Builder.<AK47Entity>of(AK47Entity::new, MobCategory.MISC).setCustomClientFactory(AK47Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RobotEntity.init();
			MuzEntity.init();
			HolkaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ROBOT.get(), RobotEntity.createAttributes().build());
		event.put(MUZ.get(), MuzEntity.createAttributes().build());
		event.put(HOLKA.get(), HolkaEntity.createAttributes().build());
	}
}
