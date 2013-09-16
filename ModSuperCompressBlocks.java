package mods.nurseangel.supercompressedblock;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModSuperCompressBlocks {

	public static boolean isTest = false;

	public static BlockSuperCompressBlock[] blockCompressedBlock = new BlockSuperCompressBlock[71];
	public int loopCount = 0;

	Config config;

	public static final CreativeTabs creativeTab = new CreativeTabSuperCompressBlock(Reference.MOD_NAME);

	// コンストラクタ的なもの
	@Mod.EventHandler
	public void myPreInitMethod(FMLPreInitializationEvent event) {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		config = new Config();
		config.loadConfig(cfg);

	}

	/**
	 * TODO ID/名前とか含めて配列に持っておいて、initではforくるくるするだけにしたい
	 */

	// load()なもの
	@Mod.EventHandler
	public void myInitMethod(FMLInitializationEvent event) {
		if(config.isEnabled == false){
			return;
		}


		if (config.CompressedStoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedStoneBlockID, Block.stone, "Stone", "石ブロック");

			if (config.CompressedCompressedStoneBlockID > 1) {
				// この順の場合blockCompressedBlock[0]は必ず圧縮石ブロック
				this.addCompressedBlock(config.CompressedCompressedStoneBlockID, blockCompressedBlock[0], "Compressed Stone", "圧縮石ブロック", 15);
			}
		}

		if (config.CompressedDirtBlockID > 1) {
			this.addCompressedBlock(config.CompressedDirtBlockID, Block.dirt, "Dirt", "土ブロック");
		}
		if (config.CompressedCobblestoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedCobblestoneBlockID, Block.cobblestone, "Cobblestone", "丸石");
		}
		if (config.CompressedIronBlockID > 1) {
			this.addCompressedBlock(config.CompressedIronBlockID, Block.blockIron, "Iron Brock", "鉄ブロック");
		}
		if (config.CompressedGoldBlockID > 1) {
			this.addCompressedBlock(config.CompressedGoldBlockID, Block.blockGold, "Gold Brock", "金ブロック");
		}
		if (config.CompressedLapisBlockID > 1) {
			this.addCompressedBlock(config.CompressedLapisBlockID, Block.blockLapis, "Lapis Brock", "ラピスブロック");
		}
		if (config.CompressedDiamondBlockID > 1) {
			this.addCompressedBlock(config.CompressedDiamondBlockID, Block.blockDiamond, "Diamond Brock", "ダイヤモンドブロック");
		}
		if (config.CompressedEmeraldBlockID > 1) {
			this.addCompressedBlock(config.CompressedEmeraldBlockID, Block.blockEmerald, "Emerald Brock", "エメラルドブロック");
		}
		if (config.CompressedSandBlockID > 1) {
			this.addCompressedBlock(config.CompressedSandBlockID, Block.sand, "Sand", "砂");
		}
		if (config.CompressedGravelBlockID > 1) {
			this.addCompressedBlock(config.CompressedGravelBlockID, Block.gravel, "Gravel", "砂利");
		}
		if (config.CompressedSandStoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedSandStoneBlockID, Block.sandStone, "SandStone", "砂岩");
		}
		if (config.CompressedObsidanBlockID > 1) {
			this.addCompressedBlock(config.CompressedObsidanBlockID, Block.obsidian, "Obsidian", "黒曜石");
		}
		if (config.CompressedSnowBlockID > 1) {
			this.addCompressedBlock(config.CompressedSnowBlockID, Block.blockSnow, "Snow", "雪");
		}
		if (config.CompressedSoulsandBlockID > 1) {
			this.addCompressedBlock(config.CompressedSoulsandBlockID, Block.slowSand, "Soulsand", "ソウルサンド");
		}
		if (config.CompressedGlowStoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedGlowStoneBlockID, Block.glowStone, "GlowStone", "グロウストーン", 0, true);
		}
		if (config.CompressedEndStoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedEndStoneBlockID, Block.whiteStone, "EndStone", "エンドストーン");
		}
		if (config.CompressedNetherrackBlockID > 1) {
			this.addCompressedBlock(config.CompressedNetherrackBlockID, Block.netherrack, "NetherRack", "ネザーラック");
		}

		if (config.CompressedWhiteWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedWhiteWoolBlockID, Block.cloth, "White Wool", "白羊毛", 0);
		}
		if (config.CompressedOrangeWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedOrangeWoolBlockID, Block.cloth, "Orange Wool", "橙色羊毛", 1);
		}
		if (config.CompressedMagentaWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedMagentaWoolBlockID, Block.cloth, "Magenta Wool", "赤紫色羊毛", 2);
		}
		if (config.CompressedLightBlueWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightBlueWoolBlockID, Block.cloth, "Light Blue Wool", "空色羊毛", 3);
		}
		if (config.CompressedYellowWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedYellowWoolBlockID, Block.cloth, "Yellow Wool", "黄羊毛", 4);
		}
		if (config.CompressedLightGreenWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightGreenWoolBlockID, Block.cloth, "Light Green Wool", "黄緑羊毛", 5);
		}
		if (config.CompressedPinkWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedPinkWoolBlockID, Block.cloth, "Pink Wool", "桃色羊毛", 6);
		}
		if (config.CompressedGrayWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedGrayWoolBlockID, Block.cloth, "Gray Wool", "灰色羊毛", 7);
		}
		if (config.CompressedLightGrayWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightGrayWoolBlockID, Block.cloth, "Light Gray Wool", "薄灰色羊毛", 8);
		}
		if (config.CompressedCyanWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedCyanWoolBlockID, Block.cloth, "Cyan Wool", "水色羊毛", 9);
		}
		if (config.CompressedPurpleWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedPurpleWoolBlockID, Block.cloth, "Purple Wool", "紫羊毛", 10);
		}
		if (config.CompressedBlueWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedBlueWoolBlockID, Block.cloth, "Blue Wool", "青羊毛", 11);
		}
		if (config.CompressedBrownWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedBrownWoolBlockID, Block.cloth, "Brown Wool", "茶羊毛", 12);
		}
		if (config.CompressedGreenWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedGreenWoolBlockID, Block.cloth, "Green Wool", "緑羊毛", 13);
		}
		if (config.CompressedRedWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedRedWoolBlockID, Block.cloth, "Red Wool", "赤羊毛", 14);
		}
		if (config.CompressedBlackWoolBlockID > 1) {
			this.addCompressedBlock(config.CompressedBlackWoolBlockID, Block.cloth, "Black Wool", "黒羊毛", 15);
		}

		if (config.CompressedOakWoodBlockID > 1) {
			this.addCompressedBlock(config.CompressedOakWoodBlockID, Block.wood, "Oak Wood", "オーク原木", 0);
		}
		if (config.CompressedSpurceWoodBlockID > 1) {
			this.addCompressedBlock(config.CompressedSpurceWoodBlockID, Block.wood, "Spurce Wood", "松原木", 1);
		}
		if (config.CompressedBirchWoodBlockID > 1) {
			this.addCompressedBlock(config.CompressedBirchWoodBlockID, Block.wood, "Birch Wood", "白樺原木", 2);
		}
		if (config.CompressedJungleWoodBlockID > 1) {
			this.addCompressedBlock(config.CompressedJungleWoodBlockID, Block.wood, "Jungle Wood", "ジャングル原木", 3);
		}
		if (config.CompressedOakPlanksBlockID > 1) {
			this.addCompressedBlock(config.CompressedOakPlanksBlockID, Block.planks, "Oak Wood Planks", "オーク木材", 0);
		}
		if (config.CompressedSpurcePlanksBlockID > 1) {
			this.addCompressedBlock(config.CompressedSpurcePlanksBlockID, Block.planks, "Spurce Wood Planks", "松木材", 1);
		}
		if (config.CompressedBirchPlanksBlockID > 1) {
			this.addCompressedBlock(config.CompressedBirchPlanksBlockID, Block.planks, "Birch Wood Planks", "白樺木材", 2);
		}
		if (config.CompressedJunglePlanksBlockID > 1) {
			this.addCompressedBlock(config.CompressedJunglePlanksBlockID, Block.planks, "Jungle Wood Planks", "ジャングル木材", 3);
		}

		if (config.CompressedBrickBlockID > 1) {
			this.addCompressedBlock(config.CompressedBrickBlockID, Block.brick, "Brick", "レンガブロック");
		}
		if (config.CompressedBookshelfBlockID > 1) {
			this.addCompressedBlock(config.CompressedBookshelfBlockID, Block.bookShelf, "Bookshelf", "本棚");
		}
		if (config.CompressedMossyCobblestoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedMossyCobblestoneBlockID, Block.cobblestoneMossy, "Mossy Cobblestone", "苔石");
		}
		if (config.CompressedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedClayBlockID, Block.blockClay, "ClayBlock", "粘土");
		}
		if (config.CompressedStoneBrickBlockID > 1) {
			this.addCompressedBlock(config.CompressedStoneBrickBlockID, Block.stoneBrick, "Stone Brick", "石レンガブロック", 0);
		}
		if (config.CompressedMossyStoneBrickBlockID > 1) {
			this.addCompressedBlock(config.CompressedMossyStoneBrickBlockID, Block.stoneBrick, "Mossy Stone Brick", "苔石レンガブロック", 1);
		}
		if (config.CompressedCrackedStoneBrickBlockID > 1) {
			this.addCompressedBlock(config.CompressedCrackedStoneBrickBlockID, Block.stoneBrick, "Cracked Stone Brick", "ひび割れた石レンガブロック", 2);
		}

		if (config.CompressedRedstoneBlockID > 1) {
			this.addCompressedBlock(config.CompressedRedstoneBlockID, Block.blockRedstone, "Redstone", "レッドストーンブロック");
		}
		if (config.CompressedNetherQuartzBlockID > 1) {
			this.addCompressedBlock(config.CompressedNetherQuartzBlockID, Block.blockNetherQuartz, "Nether Quartz", "ネザー水晶ブロック", 0);
		}
		if (config.CompressedChiseledNetherQuartzBlockID > 1) {
			this.addCompressedBlock(config.CompressedChiseledNetherQuartzBlockID, Block.blockNetherQuartz, "Chiseled Nether Quartz", "模様入りネザー水晶ブロック", 1);
		}
		if (config.CompressedPillarNetherQuartzBlockID > 1) {
			this.addCompressedBlock(config.CompressedPillarNetherQuartzBlockID, Block.blockNetherQuartz, "Pillar Nether Quartz", "柱状ネザー水晶ブロック", 2);
		}

		if (config.CompressedWhiteStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedWhiteStainedClayBlockID, Block.field_111039_cA, "White StainedClay", "白の色付き粘土", 0);
		}
		if (config.CompressedOrangeStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedOrangeStainedClayBlockID, Block.field_111039_cA, "Orange StainedClay", "橙色の色付き粘土", 1);
		}
		if (config.CompressedMagentaStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedMagentaStainedClayBlockID, Block.field_111039_cA, "Magenta StainedClay", "赤紫色の色付き粘土", 2);
		}
		if (config.CompressedLightBlueStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightBlueStainedClayBlockID, Block.field_111039_cA, "Light Blue StainedClay", "空色の色付き粘土", 3);
		}
		if (config.CompressedYellowStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedYellowStainedClayBlockID, Block.field_111039_cA, "Yellow StainedClay", "黄の色付き粘土", 4);
		}
		if (config.CompressedLightGreenStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightGreenStainedClayBlockID, Block.field_111039_cA, "Light Green StainedClay", "黄緑の色付き粘土", 5);
		}
		if (config.CompressedPinkStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedPinkStainedClayBlockID, Block.field_111039_cA, "Pink StainedClay", "桃色の色付き粘土", 6);
		}
		if (config.CompressedGrayStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedGrayStainedClayBlockID, Block.field_111039_cA, "Gray StainedClay", "灰色の色付き粘土", 7);
		}
		if (config.CompressedLightGrayStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedLightGrayStainedClayBlockID, Block.field_111039_cA, "Light Gray StainedClay", "薄灰色の色付き粘土", 8);
		}
		if (config.CompressedCyanStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedCyanStainedClayBlockID, Block.field_111039_cA, "Cyan StainedClay", "水色の色付き粘土", 9);
		}
		if (config.CompressedPurpleStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedPurpleStainedClayBlockID, Block.field_111039_cA, "Purple StainedClay", "紫の色付き粘土", 10);
		}
		if (config.CompressedBlueStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedBlueStainedClayBlockID, Block.field_111039_cA, "Blue StainedClay", "青の色付き粘土", 11);
		}
		if (config.CompressedBrownStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedBrownStainedClayBlockID, Block.field_111039_cA, "Brown StainedClay", "茶の色付き粘土", 12);
		}
		if (config.CompressedGreenStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedGreenStainedClayBlockID, Block.field_111039_cA, "Green StainedClay", "緑の色付き粘土", 13);
		}
		if (config.CompressedRedStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedRedStainedClayBlockID, Block.field_111039_cA, "Red StainedClay", "赤の色付き粘土", 14);
		}
		if (config.CompressedBlackStainedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedBlackStainedClayBlockID, Block.field_111039_cA, "Black StainedClay", "黒の色付き粘土", 15);
		}
		if (config.CompressedHardenedClayBlockID > 1) {
			this.addCompressedBlock(config.CompressedHardenedClayBlockID, Block.field_111032_cD, "Hardened Clay", "堅焼き粘土");
		}
		if (config.CompressedCoalBlockBlockID > 1) {
			this.addCompressedBlock(config.CompressedCoalBlockBlockID, Block.field_111034_cE, "Block of Coal", "石炭ブロック");
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
