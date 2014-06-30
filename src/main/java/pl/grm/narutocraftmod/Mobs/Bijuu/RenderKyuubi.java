package pl.grm.narutocraftmod.Mobs.Bijuu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderKyuubi extends RenderLiving 
{
	private static final ResourceLocation Your_Texture = new ResourceLocation("yourmod:textures/entity/yourtexture.png");  //refers to:assets/yourmod/textures/entity/yourtexture.png

    public RenderKyuubi(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return Your_Texture;
    }
	
}
