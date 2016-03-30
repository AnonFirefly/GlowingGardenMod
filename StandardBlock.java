package com.anonfirefly.glowinggarden.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;

public class StandardBlock extends Block {
		public boolean isOpaque;
		public EnumWorldBlockLayer BlockLayer;
		
		 StandardBlock(String unlocalizedName, Material material, float hardness, float resistance, boolean opacity, String tool,
				 int level, EnumWorldBlockLayer Blayer){
		  super(material);
		  this.setUnlocalizedName(unlocalizedName);
		  this.setCreativeTab(CreativeTabs.tabBlock);
		  this.setHardness(hardness);
		  this.setResistance(resistance);
		  this.setHarvestLevel(tool, level);
		  this.isOpaque = opacity;
		  this.BlockLayer = Blayer; //Options are SOLID, CUTOUT_MIPPED, CUTOUT, or TRANSLUCENT//
		  }
		  public EnumWorldBlockLayer getBlockLayer(){
			  return EnumWorldBlockLayer(this.BlockLayer);
		  }
		 public boolean isOpaqueCube(){
			 return isOpaque;
		 }
}
