package net.minecraft.client;

public class ClientBrandRetriever
{
    public static String getClientModName()
    {
        return net.minecraftforge.fml.common.FMLCommonHandler.instance().getModName();
    }
}
