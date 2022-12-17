
package net.mcreator.monsterbestiary.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.monsterbestiary.entity.MiiaEntity;
import net.mcreator.monsterbestiary.client.model.Modelmiia;

public class MiiaRenderer extends MobRenderer<MiiaEntity, Modelmiia<MiiaEntity>> {
	public MiiaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmiia(context.bakeLayer(Modelmiia.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MiiaEntity entity) {
		return new ResourceLocation("monsterbestiary:textures/entities/miia.png");
	}
}
