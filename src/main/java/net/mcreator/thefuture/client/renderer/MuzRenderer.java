
package net.mcreator.thefuture.client.renderer;

public class MuzRenderer extends HumanoidMobRenderer<MuzEntity, HumanoidModel<MuzEntity>> {

	public MuzRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(MuzEntity entity) {
		return new ResourceLocation("the_future:textures/2022_08_15_water-boy-20729432.png");
	}

}
