
package net.mcreator.monsterbestiary.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monsterbestiary.entity.RachneraEntity;
import net.mcreator.monsterbestiary.client.model.Modelrachnera;

public class RachneraRenderer extends MobRenderer<RachneraEntity, Modelrachnera<RachneraEntity>> {
	public RachneraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrachnera(context.bakeLayer(Modelrachnera.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RachneraEntity entity) {
		return new ResourceLocation("monsterbestiary:textures/entities/spider.png");
	}
}
