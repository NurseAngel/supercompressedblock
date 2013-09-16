package mods.nurseangel.supercompressedblock;

import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class Config {

	/** 全体の有効無効 */
	public boolean isEnabled = false;

	/** ブロックIDスタート初期値 */
	int BlockIdDefault = 1188;

	Configuration cfg;

	// BlockID
	public static int CompressedStoneBlockID, CompressedDirtBlockID, CompressedCobblestoneBlockID, CompressedIronBlockID, CompressedGoldBlockID,
			CompressedLapisBlockID, CompressedDiamondBlockID, CompressedSandBlockID, CompressedGravelBlockID, CompressedSandStoneBlockID,
			CompressedObsidanBlockID, CompressedSnowBlockID, CompressedSoulsandBlockID, CompressedGlowStoneBlockID, CompressedEndStoneBlockID,
			CompressedNetherrackBlockID, CompressedEmeraldBlockID, CompressedWhiteWoolBlockID, CompressedOrangeWoolBlockID, CompressedMagentaWoolBlockID,
			CompressedLightBlueWoolBlockID, CompressedYellowWoolBlockID, CompressedLightGreenWoolBlockID, CompressedPinkWoolBlockID, CompressedGrayWoolBlockID,
			CompressedLightGrayWoolBlockID, CompressedCyanWoolBlockID, CompressedPurpleWoolBlockID, CompressedBlueWoolBlockID, CompressedBrownWoolBlockID,
			CompressedGreenWoolBlockID, CompressedRedWoolBlockID, CompressedBlackWoolBlockID, CompressedOakWoodBlockID, CompressedSpurceWoodBlockID,
			CompressedBirchWoodBlockID, CompressedJungleWoodBlockID, CompressedOakPlanksBlockID, CompressedSpurcePlanksBlockID, CompressedBirchPlanksBlockID,
			CompressedJunglePlanksBlockID, CompressedCompressedStoneBlockID, CompressedBrickBlockID, CompressedBookshelfBlockID,
			CompressedMossyCobblestoneBlockID, CompressedStoneBrickBlockID, CompressedClayBlockID, CompressedMossyStoneBrickBlockID,
			CompressedCrackedStoneBrickBlockID, CompressedRedstoneBlockID, CompressedNetherQuartzBlockID, CompressedChiseledNetherQuartzBlockID,
			CompressedPillarNetherQuartzBlockID, CompressedWhiteStainedClayBlockID, CompressedOrangeStainedClayBlockID, CompressedMagentaStainedClayBlockID,
			CompressedLightBlueStainedClayBlockID, CompressedYellowStainedClayBlockID, CompressedLightGreenStainedClayBlockID,
			CompressedPinkStainedClayBlockID, CompressedGrayStainedClayBlockID, CompressedLightGrayStainedClayBlockID, CompressedCyanStainedClayBlockID,
			CompressedPurpleStainedClayBlockID, CompressedBlueStainedClayBlockID, CompressedBrownStainedClayBlockID, CompressedGreenStainedClayBlockID,
			CompressedRedStainedClayBlockID, CompressedBlackStainedClayBlockID, CompressedHardenedClayBlockID, CompressedCoalBlockBlockID;

	public void loadConfig(Configuration conf) {
		this.cfg = conf;

		try {

			cfg.load();

			isEnabled = cfg.get(Configuration.CATEGORY_GENERAL, "Enable", true).getBoolean(true);

			CompressedStoneBlockID = cfg.getBlock("Compressed Stone BlockID", BlockIdDefault++).getInt();
			CompressedDirtBlockID = cfg.getBlock("Compressed Dirt BlockID", BlockIdDefault++).getInt();
			CompressedCobblestoneBlockID = cfg.getBlock("Compressed Cobblestone BlockID", BlockIdDefault++).getInt();
			CompressedIronBlockID = cfg.getBlock("Compressed Iron BlockID", BlockIdDefault++).getInt();
			CompressedGoldBlockID = cfg.getBlock("Compressed Gold BlockID", BlockIdDefault++).getInt();
			CompressedLapisBlockID = cfg.getBlock("Compressed Lapis BlockID", BlockIdDefault++).getInt();
			CompressedDiamondBlockID = cfg.getBlock("Compressed Diamond BlockID", BlockIdDefault++).getInt();
			CompressedSandBlockID = cfg.getBlock("Compressed Sand BlockID", BlockIdDefault++).getInt();
			CompressedGravelBlockID = cfg.getBlock("Compressed Grabel BlockID", BlockIdDefault++).getInt();
			CompressedSandStoneBlockID = cfg.getBlock("Compressed SandStone BlockID", BlockIdDefault++).getInt();
			CompressedObsidanBlockID = cfg.getBlock("Compressed Obsidan BlockID", BlockIdDefault++).getInt();
			CompressedSnowBlockID = cfg.getBlock("Compressed Snow BlockID", BlockIdDefault++).getInt();
			CompressedSoulsandBlockID = cfg.getBlock("Compressed Soulsand BlockID", BlockIdDefault++).getInt();
			CompressedGlowStoneBlockID = cfg.getBlock("Compressed GlowStone BlockID", BlockIdDefault++).getInt();
			CompressedEndStoneBlockID = cfg.getBlock("Compressed EndStone BlockID", BlockIdDefault++).getInt();
			CompressedNetherrackBlockID = cfg.getBlock("Compressed Netherrack BlockID", BlockIdDefault++).getInt();
			CompressedEmeraldBlockID = cfg.getBlock("Compressed Emerald BlockID", BlockIdDefault++).getInt();
			CompressedWhiteWoolBlockID = cfg.getBlock("Compressed White Wool BlockID", BlockIdDefault++).getInt();
			CompressedOrangeWoolBlockID = cfg.getBlock("Compressed Orange Wool BlockID", BlockIdDefault++).getInt();
			CompressedMagentaWoolBlockID = cfg.getBlock("Compressed Magenta Wool BlockID", BlockIdDefault++).getInt();
			CompressedLightBlueWoolBlockID = cfg.getBlock("Compressed LightBlue Wool BlockID", BlockIdDefault++).getInt();
			CompressedYellowWoolBlockID = cfg.getBlock("Compressed Yellow Wool BlockID", BlockIdDefault++).getInt();
			CompressedLightGreenWoolBlockID = cfg.getBlock("Compressed LightGreen Wool BlockID", BlockIdDefault++).getInt();
			CompressedPinkWoolBlockID = cfg.getBlock("Compressed Pink Wool BlockID", BlockIdDefault++).getInt();
			CompressedGrayWoolBlockID = cfg.getBlock("Compressed Gray Wool BlockID", BlockIdDefault++).getInt();
			CompressedLightGrayWoolBlockID = cfg.getBlock("Compressed LightGray Wool BlockID", BlockIdDefault++).getInt();
			CompressedCyanWoolBlockID = cfg.getBlock("Compressed Cyan Wool BlockID", BlockIdDefault++).getInt();
			CompressedPurpleWoolBlockID = cfg.getBlock("Compressed Purple Wool BlockID", BlockIdDefault++).getInt();
			CompressedBlueWoolBlockID = cfg.getBlock("Compressed Blue Wool BlockID", BlockIdDefault++).getInt();
			CompressedBrownWoolBlockID = cfg.getBlock("Compressed Brown Wool BlockID", BlockIdDefault++).getInt();
			CompressedGreenWoolBlockID = cfg.getBlock("Compressed Green Wool BlockID", BlockIdDefault++).getInt();
			CompressedRedWoolBlockID = cfg.getBlock("Compressed Red Wool BlockID", BlockIdDefault++).getInt();
			CompressedBlackWoolBlockID = cfg.getBlock("Compressed Black Wool BlockID", BlockIdDefault++).getInt();
			CompressedOakWoodBlockID = cfg.getBlock("Compressed Oak Wood BlockID", BlockIdDefault++).getInt();
			CompressedSpurceWoodBlockID = cfg.getBlock("Compressed Spurce Wood BlockID", BlockIdDefault++).getInt();
			CompressedBirchWoodBlockID = cfg.getBlock("Compressed Birch Wood BlockID", BlockIdDefault++).getInt();
			CompressedJungleWoodBlockID = cfg.getBlock("Compressed Jungle Wood BlockID", BlockIdDefault++).getInt();
			CompressedOakPlanksBlockID = cfg.getBlock("Compressed Oak Planks BlockID", BlockIdDefault++).getInt();
			CompressedSpurcePlanksBlockID = cfg.getBlock("Compressed Spurce Planks BlockID", BlockIdDefault++).getInt();
			CompressedBirchPlanksBlockID = cfg.getBlock("Compressed Birch Planks BlockID", BlockIdDefault++).getInt();
			CompressedJunglePlanksBlockID = cfg.getBlock("Compressed Jungle Planks BlockID", BlockIdDefault++).getInt();
			CompressedBrickBlockID = cfg.getBlock("Compressed Brick BlockID", BlockIdDefault++).getInt();
			CompressedBookshelfBlockID = cfg.getBlock("Compressed Bookshelf BlockID", BlockIdDefault++).getInt();
			CompressedMossyCobblestoneBlockID = cfg.getBlock("Compressed Mossy Cobblestone BlockID", BlockIdDefault++).getInt();
			CompressedStoneBrickBlockID = cfg.getBlock("Compressed Stone Brick BlockID", BlockIdDefault++).getInt();
			CompressedClayBlockID = cfg.getBlock("Compressed Clay BlockID", BlockIdDefault++).getInt();
			CompressedMossyStoneBrickBlockID = cfg.getBlock("Compressed Mossy Stone Brick BlockID", BlockIdDefault++).getInt();
			CompressedCrackedStoneBrickBlockID = cfg.getBlock("Compressed Cracked Stone Brick BlockID", BlockIdDefault++).getInt();
			CompressedCompressedStoneBlockID = cfg.getBlock("Compressed Compressed Stone BlockID", BlockIdDefault++).getInt();

			CompressedRedstoneBlockID = cfg.getBlock("Compressed RedStone BlockID", BlockIdDefault++).getInt();
			CompressedNetherQuartzBlockID = cfg.getBlock("Compressed Nether Quartz BlockID", BlockIdDefault++).getInt();
			CompressedChiseledNetherQuartzBlockID = cfg.getBlock("Compressed Chiseled Nether Quartz BlockID", BlockIdDefault++).getInt();
			CompressedPillarNetherQuartzBlockID = cfg.getBlock("Compressed Piller Nether Quartz BlockID", BlockIdDefault++).getInt();

			CompressedWhiteStainedClayBlockID = cfg.getBlock("Compressed White StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedOrangeStainedClayBlockID = cfg.getBlock("Compressed Orange StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedMagentaStainedClayBlockID = cfg.getBlock("Compressed Magenta StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedLightBlueStainedClayBlockID = cfg.getBlock("Compressed LightBlue StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedYellowStainedClayBlockID = cfg.getBlock("Compressed Yellow StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedLightGreenStainedClayBlockID = cfg.getBlock("Compressed LightGreen StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedPinkStainedClayBlockID = cfg.getBlock("Compressed Pink StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedGrayStainedClayBlockID = cfg.getBlock("Compressed Gray StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedLightGrayStainedClayBlockID = cfg.getBlock("Compressed LightGray StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedCyanStainedClayBlockID = cfg.getBlock("Compressed Cyan StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedPurpleStainedClayBlockID = cfg.getBlock("Compressed Purple StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedBlueStainedClayBlockID = cfg.getBlock("Compressed Blue StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedBrownStainedClayBlockID = cfg.getBlock("Compressed Brown StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedGreenStainedClayBlockID = cfg.getBlock("Compressed Green StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedRedStainedClayBlockID = cfg.getBlock("Compressed Red StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedBlackStainedClayBlockID = cfg.getBlock("Compressed Black StainedClay BlockID", BlockIdDefault++).getInt();
			CompressedHardenedClayBlockID = cfg.getBlock("Compressed HardenedClay BlockID", BlockIdDefault++).getInt();
			CompressedCoalBlockBlockID = cfg.getBlock("Compressed CoalBlock BlockID", BlockIdDefault++).getInt();

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " loadding configuration failure");
		} finally {
			cfg.save();
		}
	}
}
