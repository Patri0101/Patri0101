
package net.mcreator.thefuture.client.renderer;

public class HolkaRenderer extends HumanoidMobRenderer<HolkaEntity, HumanoidModel<HolkaEntity>> {

	public HolkaRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(HolkaEntity entity) {
		return new ResourceLocation("the_future:textures/2022_08_15_girl-version-of-me-20728001.png");
	}

}
