package mods.nurseangel.supercompressblock;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModSuperCompressBlocks {

	public static boolean isTest = false;

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
			CompressedPillarNetherQuartzBlockID;

	public static BlockSuperCompressBlock[] blockCompressedBlock = new BlockSuperCompressBlock[53];
	public int loopCount = 0;

	public static final CreativeTabs creativeTab = new CreativeTabSuperCompressBlock(Reference.MOD_NAME);

	// コンストラクタ的なもの
	@Mod.PreInit
	public void myPreInitMethod(FMLPreInitializationEvent event) {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		int BlockIdDefault = 1188;

		try {
			cfg.load();
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
			CompressedWhiteWoolBlockID = cfg.getBlock("Compressed WhiteWool BlockID", BlockIdDefault++).getInt();
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

		} catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " loadding configuration failure");
		} finally {
			cfg.save();
		}

	}

	// load()なもの
	@Mod.Init
	public void myInitMethod(FMLInitializationEvent event) {

		if (CompressedStoneBlockID > 1) {
			this.addCompressedBlock(CompressedStoneBlockID, Block.stone, "Stone", "石ブロック");

			if (CompressedCompressedStoneBlockID > 1) {
				// この順の場合blockCompressedBlock[0]は必ず圧縮石ブロック
				this.addCompressedBlock(CompressedCompressedStoneBlockID, blockCompressedBlock[0], "Compressed Stone", "圧縮石ブロック", 15);
			}
		}

		if (CompressedDirtBlockID > 1) {
			this.addCompressedBlock(CompressedDirtBlockID, Block.dirt, "Dirt", "土ブロック");
		}
		if (CompressedCobblestoneBlockID > 1) {
			this.addCompressedBlock(CompressedCobblestoneBlockID, Block.cobblestone, "Cobblestone", "丸石");
		}
		if (CompressedIronBlockID > 1) {
			this.addCompressedBlock(CompressedIronBlockID, Block.blockSteel, "Iron Brock", "鉄ブロック");
		}
		if (CompressedGoldBlockID > 1) {
			this.addCompressedBlock(CompressedGoldBlockID, Block.blockGold, "Gold Brock", "金ブロック");
		}
		if (CompressedLapisBlockID > 1) {
			this.addCompressedBlock(CompressedLapisBlockID, Block.blockLapis, "Lapis Brock", "ラピスブロック");
		}
		if (CompressedDiamondBlockID > 1) {
			this.addCompressedBlock(CompressedDiamondBlockID, Block.blockDiamond, "Diamond Brock", "ダイヤモンドブロック");
		}
		if (CompressedEmeraldBlockID > 1) {
			this.addCompressedBlock(CompressedEmeraldBlockID, Block.blockEmerald, "Emerald Brock", "エメラルドブロック");
		}
		if (CompressedSandBlockID > 1) {
			this.addCompressedBlock(CompressedSandBlockID, Block.sand, "Sand", "砂");
		}
		if (CompressedGravelBlockID > 1) {
			this.addCompressedBlock(CompressedGravelBlockID, Block.gravel, "Gravel", "砂利");
		}
		if (CompressedSandStoneBlockID > 1) {
			this.addCompressedBlock(CompressedSandStoneBlockID, Block.sandStone, "SandStone", "砂岩");
		}
		if (CompressedObsidanBlockID > 1) {
			this.addCompressedBlock(CompressedObsidanBlockID, Block.obsidian, "Obsidian", "黒曜石");
		}
		if (CompressedSnowBlockID > 1) {
			this.addCompressedBlock(CompressedSnowBlockID, Block.blockSnow, "Snow", "雪");
		}
		if (CompressedSoulsandBlockID > 1) {
			this.addCompressedBlock(CompressedSoulsandBlockID, Block.slowSand, "Soulsand", "ソウルサンド");
		}
		if (CompressedGlowStoneBlockID > 1) {
			this.addCompressedBlock(CompressedGlowStoneBlockID, Block.glowStone, "GlowStone", "グロウストーン", 0, true);
		}
		if (CompressedEndStoneBlockID > 1) {
			this.addCompressedBlock(CompressedEndStoneBlockID, Block.whiteStone, "EndStone", "エンドストーン");
		}
		if (CompressedNetherrackBlockID > 1) {
			this.addCompressedBlock(CompressedNetherrackBlockID, Block.netherrack, "NetherRack", "ネザーラック");
		}

		if (CompressedWhiteWoolBlockID > 1) {
			this.addCompressedBlock(CompressedWhiteWoolBlockID, Block.cloth, "White Wool", "白羊毛", 0);
		}
		if (CompressedOrangeWoolBlockID > 1) {
			this.addCompressedBlock(CompressedOrangeWoolBlockID, Block.cloth, "Orange Wool", "橙色羊毛", 1);
		}
		if (CompressedMagentaWoolBlockID > 1) {
			this.addCompressedBlock(CompressedMagentaWoolBlockID, Block.cloth, "Magenta Wool", "赤紫色羊毛", 2);
		}
		if (CompressedLightBlueWoolBlockID > 1) {
			this.addCompressedBlock(CompressedLightBlueWoolBlockID, Block.cloth, "Light Blue Wool", "空色羊毛", 3);
		}
		if (CompressedYellowWoolBlockID > 1) {
			this.addCompressedBlock(CompressedYellowWoolBlockID, Block.cloth, "Yellow Wool", "黄羊毛", 4);
		}
		if (CompressedLightGreenWoolBlockID > 1) {
			this.addCompressedBlock(CompressedLightGreenWoolBlockID, Block.cloth, "Light Green Wool", "黄緑羊毛", 5);
		}
		if (CompressedPinkWoolBlockID > 1) {
			this.addCompressedBlock(CompressedPinkWoolBlockID, Block.cloth, "Pink Wool", "桃色羊毛", 6);
		}
		if (CompressedGrayWoolBlockID > 1) {
			this.addCompressedBlock(CompressedGrayWoolBlockID, Block.cloth, "Gray Wool", "灰色羊毛", 7);
		}
		if (CompressedLightGrayWoolBlockID > 1) {
			this.addCompressedBlock(CompressedLightGrayWoolBlockID, Block.cloth, "Light Gray Wool", "薄灰色羊毛", 8);
		}
		if (CompressedCyanWoolBlockID > 1) {
			this.addCompressedBlock(CompressedCyanWoolBlockID, Block.cloth, "Cyan Wool", "水色羊毛", 9);
		}
		if (CompressedPurpleWoolBlockID > 1) {
			this.addCompressedBlock(CompressedPurpleWoolBlockID, Block.cloth, "Purple Wool", "紫羊毛", 10);
		}
		if (CompressedBlueWoolBlockID > 1) {
			this.addCompressedBlock(CompressedBlueWoolBlockID, Block.cloth, "Blue Wool", "青羊毛", 11);
		}
		if (CompressedBrownWoolBlockID > 1) {
			this.addCompressedBlock(CompressedBrownWoolBlockID, Block.cloth, "Brown Wool", "茶羊毛", 12);
		}
		if (CompressedGreenWoolBlockID > 1) {
			this.addCompressedBlock(CompressedGreenWoolBlockID, Block.cloth, "Green Wool", "緑羊毛", 13);
		}
		if (CompressedRedWoolBlockID > 1) {
			this.addCompressedBlock(CompressedRedWoolBlockID, Block.cloth, "Red Wool", "赤羊毛", 14);
		}
		if (CompressedBlackWoolBlockID > 1) {
			this.addCompressedBlock(CompressedBlackWoolBlockID, Block.cloth, "Black Wool", "黒羊毛", 15);
		}

		if (CompressedOakWoodBlockID > 1) {
			this.addCompressedBlock(CompressedOakWoodBlockID, Block.wood, "Oak Wood", "オーク原木", 0);
		}
		if (CompressedSpurceWoodBlockID > 1) {
			this.addCompressedBlock(CompressedSpurceWoodBlockID, Block.wood, "Spurce Wood", "松原木", 1);
		}
		if (CompressedBirchWoodBlockID > 1) {
			this.addCompressedBlock(CompressedBirchWoodBlockID, Block.wood, "Birch Wood", "白樺原木", 2);
		}
		if (CompressedJungleWoodBlockID > 1) {
			this.addCompressedBlock(CompressedJungleWoodBlockID, Block.wood, "Jungle Wood", "ジャングル原木", 3);
		}
		if (CompressedOakPlanksBlockID > 1) {
			this.addCompressedBlock(CompressedOakPlanksBlockID, Block.planks, "Oak Wood Planks", "オーク木材", 0);
		}
		if (CompressedSpurcePlanksBlockID > 1) {
			this.addCompressedBlock(CompressedSpurcePlanksBlockID, Block.planks, "Spurce Wood Planks", "松木材", 1);
		}
		if (CompressedBirchPlanksBlockID > 1) {
			this.addCompressedBlock(CompressedBirchPlanksBlockID, Block.planks, "Birch Wood Planks", "白樺木材", 2);
		}
		if (CompressedJunglePlanksBlockID > 1) {
			this.addCompressedBlock(CompressedJunglePlanksBlockID, Block.planks, "Jungle Wood Planks", "ジャングル木材", 3);
		}

		if (CompressedBrickBlockID > 1) {
			this.addCompressedBlock(CompressedBrickBlockID, Block.brick, "Brick", "レンガブロック");
		}
		if (CompressedBookshelfBlockID > 1) {
			this.addCompressedBlock(CompressedBookshelfBlockID, Block.bookShelf, "Bookshelf", "本棚");
		}
		if (CompressedMossyCobblestoneBlockID > 1) {
			this.addCompressedBlock(CompressedMossyCobblestoneBlockID, Block.cobblestoneMossy, "Mossy Cobblestone", "苔石");
		}
		if (CompressedClayBlockID > 1) {
			this.addCompressedBlock(CompressedClayBlockID, Block.blockClay, "ClayBlock", "粘土");
		}
		if (CompressedStoneBrickBlockID > 1) {
			this.addCompressedBlock(CompressedStoneBrickBlockID, Block.stoneBrick, "Stone Brick", "石レンガブロック", 0);
		}
		if (CompressedMossyStoneBrickBlockID > 1) {
			this.addCompressedBlock(CompressedMossyStoneBrickBlockID, Block.stoneBrick, "Mossy Stone Brick", "苔石レンガブロック", 1);
		}
		if (CompressedCrackedStoneBrickBlockID > 1) {
			this.addCompressedBlock(CompressedCrackedStoneBrickBlockID, Block.stoneBrick, "Cracked Stone Brick", "ひび割れた石レンガブロック", 2);
		}

		if (CompressedRedstoneBlockID > 1) {
			this.addCompressedBlock(CompressedRedstoneBlockID, Block.blockRedstone, "Redstone", "レッドストーンブロック");
		}
		if (CompressedNetherQuartzBlockID > 1) {
			this.addCompressedBlock(CompressedNetherQuartzBlockID, Block.blockNetherQuartz, "Nether Quartz", "ネザー水晶ブロック", 0);
		}
		if (CompressedChiseledNetherQuartzBlockID > 1) {
			this.addCompressedBlock(CompressedChiseledNetherQuartzBlockID, Block.blockNetherQuartz, "Chiseled Nether Quartz", "模様入りネザー水晶ブロック", 1);
		}
		if (CompressedPillarNetherQuartzBlockID > 1) {
			this.addCompressedBlock(CompressedPillarNetherQuartzBlockID, Block.blockNetherQuartz, "Pillar Nether Quartz", "柱状ネザー水晶ブロック", 2);
		}

	}

	/**
	 * 圧縮ブロックを追加
	 *
	 * @param int BlockID
	 *
	 * @param Block
	 *            素材ブロック
	 *
	 * @param String
	 *            英語名
	 *
	 * @param String
	 *            日本語名
	 *
	 * @param int メタデータ
	 *
	 * @param bool
	 *            trueなら光る
	 */
	private void addCompressedBlock(int CompressedBlockID, Block materialBlock, String BlockNameEn, String BlockNameJp) {
		this.addCompressedBlock(CompressedBlockID, materialBlock, BlockNameEn, BlockNameJp, 0, false);
	}

	private void addCompressedBlock(int CompressedBlockID, Block materialBlock, String BlockNameEn, String BlockNameJp, int metadata) {
		this.addCompressedBlock(CompressedBlockID, materialBlock, BlockNameEn, BlockNameJp, metadata, false);
	}

	private void addCompressedBlock(int CompressedBlockID, Block materialBlock, String BlockNameEn, String BlockNameJp, int metadata, boolean isLighting) {

		// ブロック
		blockCompressedBlock[loopCount] = new BlockSuperCompressBlock(CompressedBlockID, materialBlock, metadata);
		blockCompressedBlock[loopCount].setUnlocalizedName("CompressedBlock" + Integer.toString(CompressedBlockID));
		// クリエイティブモードに追加
		blockCompressedBlock[loopCount].setCreativeTab(creativeTab);

		if (isLighting) {
			blockCompressedBlock[loopCount].setLightValue(1.0F);
		}

		// 登録
		ModLoader.registerBlock(blockCompressedBlock[loopCount], ItemSuperCompressBlock.class);

		// 名前、レシピ

		// 0はレシピに元素材を使用
		ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, 0), (Reference.blockNamePrefixEn[0] + BlockNameEn));
		ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, 0), "ja_JP", (Reference.blockNamePrefixJp[0] + BlockNameJp));
		ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 1, 0), new Object[] { "XXX", "XXX", "XX ", 'X',
				new ItemStack(materialBlock, 1, metadata) });
		ModLoader.addShapelessRecipe(new ItemStack(materialBlock, 8, metadata), new Object[] { new ItemStack(blockCompressedBlock[loopCount], 1) });

		// 1～15はひとつ手前のブロック*8
		for (int i = 1; i < Reference.blockNamePrefixEn.length; i++) {
			// 14,15は名前に例外
			if (i == 14 || i == 15) {
				ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, i), Reference.blockNamePrefixEn[i]);
				ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, i), "ja_JP", Reference.blockNamePrefixJp[i]);
				((ItemSuperCompressBlock) Item.itemsList[CompressedBlockID]).setBlockNameEn(BlockNameEn).setBlockNameJp(BlockNameJp);
			} else {
				ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, i), (Reference.blockNamePrefixEn[i] + BlockNameEn));
				ModLoader.addName(new ItemStack(blockCompressedBlock[loopCount], 1, i), "ja_JP", (Reference.blockNamePrefixJp[i] + BlockNameJp));
			}
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 1, i), new Object[] { "XXX", "XXX", "XX ", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, i - 1) });
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 8, i - 1), new Object[] { "X", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, i) }); // 還元
		}

		// テスト
		if (isTest) {
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 64, 3), new Object[] { "X  ", "X  ", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, 0) });
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 64, 6), new Object[] { "X  ", " X ", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, 0) });
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 64, 9), new Object[] { " X ", "X  ", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, 0) });
			ModLoader.addRecipe(new ItemStack(blockCompressedBlock[loopCount], 64, 12), new Object[] { " X ", " X ", 'X',
					new ItemStack(blockCompressedBlock[loopCount], 1, 0) });
		}

		loopCount++;
	}

}
