package nurseangel.SuperCompressBlock;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.IBlockAccess;

/*
 * 圧縮ブロッククラス
 */

public class BlockSuperCompressBlock extends Block {

	// 素材になるブロック
	public Block materialBlock;
	// 素材ブロックのメタデータ (このブロックのではない)
	private int metadata;

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

	public BlockSuperCompressBlock(int blockID, Block materialBlock, int metadata) {
		// 素材やテクスチャは素材ブロックを使用
		super(blockID, materialBlock.blockIndexInTexture, materialBlock.blockMaterial);
		// super(blockID, materialBlock.blockMaterial);
		this.setHardness(materialBlock.getBlockHardness(ModLoader.getMinecraftInstance().theWorld, 0, 0, 0));

		this.materialBlock = materialBlock;
		this.metadata = metadata;

	}

	/**
	 * 破壊したときに落とすアイテムのBlockID
	 *
	 * @param メタデータ
	 * @param Random
	 * @param ?
	 */
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		if (ModSuperCompressBlocks.isTest) {
			ModLoader.getMinecraftInstance().thePlayer.addChatMessage("idDropped par1:" + Integer.toString(par1) + "par3:" + Integer.toString(par3));
		}

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
		return metadata;
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
		if (ModSuperCompressBlocks.isTest) {
			ModLoader.getMinecraftInstance().thePlayer.addChatMessage("getRenderColor par1:" + Integer.toString(metadata) + "retRenderColor:" + Integer.toString(retRenderColor));
		}
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
	 * @param int メタデータ このブロックのメタデータなので、使用テクスチャにはこれではなく元ブロックのメタデータを使う
	 * @return 咆哮に対応したテクスチャ番号
	 */
	@Override
	public int getBlockTextureFromSideAndMetadata(int par1, int par2) {
		return this.materialBlock.getBlockTextureFromSideAndMetadata(par1, this.metadata);
	}

	/**
	 * メタデータがある場合にクリエイティブタブに追加
	 *
	 * @param int BlockID
	 * @param CreativeTabs
	 * @param List
	 * @return List
	 */
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 16; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}

}