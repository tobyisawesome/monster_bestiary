package net.mcreator.monsterbestiary.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmiia<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monsterbestiary", "modelmiia"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Tail;
	public final ModelPart Tail2ndpart;
	public final ModelPart ChestArea;

	public Modelmiia(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Tail = root.getChild("Tail");
		this.Tail2ndpart = root.getChild("Tail2ndpart");
		this.ChestArea = root.getChild("ChestArea");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(54, 16)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 65)
						.addBox(-7.0F, -4.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(4.0F, -4.0F, 0.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild(
				"Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild(
				"RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(40, 32).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail",
				CubeListBuilder.create().texOffs(66, 1).addBox(-3.5F, -12.0F, -2.0F, 7.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 85)
						.addBox(-3.5F, -12.0F, -2.0F, 7.0F, 12.0F, 3.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 3.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition Tail2ndpart = partdefinition.addOrReplaceChild("Tail2ndpart",
				CubeListBuilder.create().texOffs(86, 4).addBox(-3.5F, -2.0F, -1.0F, 7.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 3.0F));
		PartDefinition ChestArea = partdefinition.addOrReplaceChild("ChestArea",
				CubeListBuilder.create().texOffs(0, 73).addBox(-11.0F, 0.5F, -0.0675F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 1.0F, -3.0F, -0.3054F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Tail2ndpart.render(poseStack, buffer, packedLight, packedOverlay);
		ChestArea.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Tail2ndpart.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
