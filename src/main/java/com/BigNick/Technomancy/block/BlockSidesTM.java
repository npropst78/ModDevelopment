package com.BigNick.Technomancy.block;

import com.BigNick.Technomancy.creativetab.CreativeTabTechnomancy;
import com.BigNick.Technomancy.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


public class BlockSidesTM extends Block {

    public IIcon[] icons = new IIcon[6];

    public BlockSidesTM(Material material) {

        super(material);
        this.setCreativeTab(CreativeTabTechnomancy.TM_TAB);
    }

    public BlockSidesTM() {

        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        for(int i = 0; i < 6; i ++){

            //0 bot, 1 top, 2 back, 3 front, 4 left, 5 right
            //1      2      3       4        5       6

            this.icons[i] = iconRegister.registerIcon(String.format("%s%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()), "_" + i));
        }
    }

    public IIcon getIcon (int side, int meta) {
        return this.icons[side];
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
