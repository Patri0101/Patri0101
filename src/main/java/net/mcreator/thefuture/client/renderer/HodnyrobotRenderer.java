
package net.mcreator.thefuture.client.renderer;

public class HodnyrobotRenderer extends HumanoidMobRenderer<HodnyrobotEntity, HumanoidModel<HodnyrobotEntity>> {

	public HodnyrobotRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(HodnyrobotEntity entity) {
		return new ResourceLocation("the_future:textures/2022_08_16_chillyguy25-20731031.png");
	}

}
