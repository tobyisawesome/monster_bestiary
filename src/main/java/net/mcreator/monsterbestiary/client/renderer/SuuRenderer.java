
package net.mcreator.monsterbestiary.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monsterbestiary.entity.SuuEntity;
import net.mcreator.monsterbestiary.client.model.Modelsuu;

public class SuuRenderer extends MobRenderer<SuuEntity, Modelsuu<SuuEntity>> {
	public SuuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsuu(context.bakeLayer(Modelsuu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuuEntity entity) {
		return new ResourceLocation("monsterbestiary:textures/entities/suu.png");
	}
}
