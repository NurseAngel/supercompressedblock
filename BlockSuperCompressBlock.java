package mods.nurseangel.supercompressblock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * 圧縮ブロッククラス
 */

public class BlockSuperCompressBlock extends Block {

	// 素材になるブロック
	public Block materialBlock;
	// 素材ブロックのメタデータ (このブロックのではない)
	private int materialMetadata;

	/**
	 * コンストラクタ
	 *
	 * @param int BlockID
	 * @param Block
	 *            素材になるブロック
	 * @param int メタデータ
	 */
	public BlockSuperCompressBlock(int blockID, Block materialBlock) {
		this(blockID, materialBlock, 0);
	}

	public BlockSuperCompressBlock(int blockID, Block materialBlock, int materialMetadata) {
		super(blockID, materialBlock.blockMaterial);

		this.setHardness(materialBlock.getBlockHardness(null, 0, 0, 0));

		this.materialBlock = materialBlock;
		this.materialMetadata = materialMetadata;

	}

	/**
	 * 破壊したときに落とすアイテムのBlockID
	 *
	 * @param メタデータ
	 * @param Random
	 * @param fortune
	 */
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		// メタデータが0以外であれば自分
		if (par1 > 0) {
			return blockID;
		}

		// メタデータが0であれば元の素材ブロック
		return materialBlock.blockID;
	}

	/**
	 * 破壊したときに落とすアイテムのメタデータ
	 *
	 * @param int 破壊したブロックのメタデータ
	 * @return int 落とすブロックのメタデータ
	 */
	@Override
	public int damageDropped(int par1) {

		// 1以上であれば-1した値
		if (par1 > 0) {
			return par1 - 1;
		}
		// 0であれば、素材ブロックのメタデータ
		return materialMetadata;
	}

	/**
	 * 破壊したときに落とすアイテムの個数
	 *
	 * @param Random
	 */
	@Override
	public int quantityDropped(Random par1Random) {
		/*
		 * quantityDroppedで返した数だけidDroppedが呼ばれる
		 * 単にidDropped→quantityDroppedということではない
		 */
		return 8;
	}

	/**
	 * ブロックの色乗算 手持ち時
	 *
	 * @param int メタデータ
	 */
	@Override
	public int getRenderColor(int metadata) {
		int retRenderColor = 0xffffff - (0x111111 * metadata);
		return retRenderColor;
	}

	/**
	 * ブロックの色乗算 設置時
	 *
	 * @param IBlockAccess
	 * @param int x,y,z
	 */
	@Override
	public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		int metadata = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
		return 0xffffff - (0x111111 * metadata);
	}

	/**
	 * 使用するテクスチャを返す。素材ブロックにメタデータがある場合用
	 *
	 * @param int 方向
	 * @param int メタデータ
	 * @return Icon 該当のテクスチャ
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
		// 引数のはこのブロックのメタデータなので、使用するテクスチャはこれではなく元ブロックのメタデータを使う
		return this.materialBlock.getBlockTextureFromSideAndMetadata(par1, this.materialMetadata);
	}

	/**
	 * 使用するアイコンをセット
	 *
	 * @param iconRegister
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		// 上書きしないとエラーが出る
	}

	/**
	 * メクリエイティブタブに追加
	 *
	 * @param int BlockID
	 * @param CreativeTabs
	 * @param List
	 * @return List
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 16; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

	// テキスト
	private void showMessage(String message) {
		if (ModSuperCompressBlocks.isTest) {
			try {
				Side side = FMLCommonHandler.instance().getSide();

				if (side.isClient()) {
					FMLClientHandler.instance().getClient().thePlayer.addChatMessage(message);
				}
			} catch (Exception e) {
			}
		}
	}



}