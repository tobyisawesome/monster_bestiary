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

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelrachnera<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("monsterbestiary", "modelrachnera"), "main");
	public final ModelPart body0;
	public final ModelPart body1;
	public final ModelPart leg0;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart leg5;
	public final ModelPart leg6;
	public final ModelPart leg7;
	public final ModelPart Body;
	public final ModelPart Head;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart ChestArea;
	public final ModelPart idkarea;

	public Modelrachnera(ModelPart root) {
		this.body0 = root.getChild("body0");
		this.body1 = root.getChild("body1");
		this.leg0 = root.getChild("leg0");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg5 = root.getChild("leg5");
		this.leg6 = root.getChild("leg6");
		this.leg7 = root.getChild("leg7");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.ChestArea = root.getChild("ChestArea");
		this.idkarea = root.getChild("idkarea");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body0 = partdefinition.addOrReplaceChild("body0",
				CubeListBuilder.create().texOffs(30, 52).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition body1 = partdefinition.addOrReplaceChild("body1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -7.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 15.0F, 9.0F));
		PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(0, 52).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 2.0F, 0.0F, 0.7854F, -0.7854F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(48, 32).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 2.0F, 0.0F, -0.7854F, 0.7854F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(48, 28).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 1.0F, 0.0F, 0.2618F, -0.6109F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(24, 48).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 1.0F, 0.0F, -0.2618F, 0.6109F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(24, 44).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));
		PartDefinition leg5 = partdefinition.addOrReplaceChild("leg5",
				CubeListBuilder.create().texOffs(44, 16).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));
		PartDefinition leg6 = partdefinition.addOrReplaceChild("leg6",
				CubeListBuilder.create().texOffs(24, 24).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 15.0F, -1.0F, 0.0F, -0.7854F, -0.7854F));
		PartDefinition leg7 = partdefinition.addOrReplaceChild("leg7",
				CubeListBuilder.create().texOffs(24, 20).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 15.0F, -1.0F, 0.0F, 0.7854F, 0.7854F));
		PartDefinition Body = partdefinition
				.addOrReplaceChild("Body",
						CubeListBuilder.create().texOffs(44, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
								.texOffs(0, 36).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition
				.addOrReplaceChild("Head",
						CubeListBuilder.create().texOffs(24, 28).addBox(-4.0F, -8.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(0, 20).addBox(-4.0F, -8.0F, -7.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
						PartPose.offset(0.0F, 0.0F, 3.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild(
				"RightArm", CubeListBuilder.create().texOffs(60, 36).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(14, 56).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild(
				"LeftArm", CubeListBuilder.create().texOffs(0, 56).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(54, 52).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 72).addBox(-3.8684F, -8.9112F, -8.9193F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1F, 21.0F, -3.0F, -0.8727F, 0.0F, -0.0349F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 72).addBox(-14.9302F, -3.5829F, -8.6028F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.9F, 17.0F, 1.0F, -0.8727F, 0.0F, -0.0349F));
		PartDefinition ChestArea = partdefinition.addOrReplaceChild("ChestArea",
				CubeListBuilder.create().texOffs(0, 88).addBox(-11.0F, 0.5F, -0.0675F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 1.0F, -3.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition idkarea = partdefinition.addOrReplaceChild("idkarea",
				CubeListBuilder.create().texOffs(0, 97).addBox(-1.0F, 1.0F, 10.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, -7.0F, -0.9599F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ChestArea.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		idkarea.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg5.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg6.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg7.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
