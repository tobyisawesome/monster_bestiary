
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterbestiary.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.monsterbestiary.client.model.Modelsuu;
import net.mcreator.monsterbestiary.client.model.Modelrachnera;
import net.mcreator.monsterbestiary.client.model.Modelmiia;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MonsterbestiaryModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsuu.LAYER_LOCATION, Modelsuu::createBodyLayer);
		event.registerLayerDefinition(Modelrachnera.LAYER_LOCATION, Modelrachnera::createBodyLayer);
		event.registerLayerDefinition(Modelmiia.LAYER_LOCATION, Modelmiia::createBodyLayer);
	}
}
