package com.anonfirefly.glowinggarden.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.util.EnumWorldBlockLayer;

public final class GlowingBlocks { //All blocks for my mod.//
	
	public static Block glowingBrick;
	public static Block glowingGlass;
	
	public static void createBlocks(){
		GameRegistry.registerBlock(glowingBrick = new StandardBlock("glowingBrick", Material.glass, 1.0f, 5.0f, true, "pickaxe", 1, SOLID).setLightLevel(.99f), "glowingBrick");
		GameRegistry.registerBlock(glowingGlass = new StandardBlock("glowingGlass", Material.glass, 1.0f, 5.0f, false, "pickaxe", 1, CUTOUT_MIPPED).setLightLevel(.99f), "glowingGlass");
	// Some of the above is still bugged until the StandardBlock class is cleared up// }
}
