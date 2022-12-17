
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterbestiary.init;

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

import net.mcreator.monsterbestiary.entity.SuuEntity;
import net.mcreator.monsterbestiary.entity.RachneraEntity;
import net.mcreator.monsterbestiary.entity.MiiaEntity;
import net.mcreator.monsterbestiary.MonsterbestiaryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonsterbestiaryModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MonsterbestiaryMod.MODID);
	public static final RegistryObject<EntityType<MiiaEntity>> MIIA = register("miia",
			EntityType.Builder.<MiiaEntity>of(MiiaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MiiaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RachneraEntity>> RACHNERA = register("rachnera",
			EntityType.Builder.<RachneraEntity>of(RachneraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RachneraEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<SuuEntity>> SUU = register("suu",
			EntityType.Builder.<SuuEntity>of(SuuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SuuEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MiiaEntity.init();
			RachneraEntity.init();
			SuuEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MIIA.get(), MiiaEntity.createAttributes().build());
		event.put(RACHNERA.get(), RachneraEntity.createAttributes().build());
		event.put(SUU.get(), SuuEntity.createAttributes().build());
	}
}
