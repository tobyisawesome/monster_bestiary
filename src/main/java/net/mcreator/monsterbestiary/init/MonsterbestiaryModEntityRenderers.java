
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterbestiary.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monsterbestiary.client.renderer.SuuRenderer;
import net.mcreator.monsterbestiary.client.renderer.RachneraRenderer;
import net.mcreator.monsterbestiary.client.renderer.MiiaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MonsterbestiaryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MonsterbestiaryModEntities.MIIA.get(), MiiaRenderer::new);
		event.registerEntityRenderer(MonsterbestiaryModEntities.RACHNERA.get(), RachneraRenderer::new);
		event.registerEntityRenderer(MonsterbestiaryModEntities.SUU.get(), SuuRenderer::new);
	}
}
