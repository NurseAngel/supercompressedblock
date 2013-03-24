package mods.nurseangel.supercompressblock;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StringTranslate;

public class ItemSuperCompressBlock extends ItemBlock {

	/**
	 * コンストラクタ
	 *
	 * @param アイテムID
	 */
	public ItemSuperCompressBlock(int i) {
		super(i);
		setMaxStackSize(64);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	// 補足事項用
	public String BlockNameEn;
	public String BlockNameJp;

	public ItemSuperCompressBlock setBlockNameEn(String BlockNameEn) {
		this.BlockNameEn = BlockNameEn;
		return this;
	}

	public ItemSuperCompressBlock setBlockNameJp(String BlockNameJp) {
		this.BlockNameJp = BlockNameJp;
		return this;
	}

	/**
	 * メタデータ(=subType)を返す
	 */
	@Override
	public int getMetadata(int i) {
		return i;
	}

	/**
	 * 内部的ブロックの名前を返す
	 *
	 * @param ItenStack
	 * @return String
	 */
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		return (new StringBuilder()).append(getUnlocalizedName()).append(i).toString();
	}

	/**
	 * 名前に追加する補足事項があればlistに追加する
	 *
	 * @param ItemStack
	 *            アイテム
	 * @param List
	 *            java.util.List
	 */
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		// スーパーウルトラデラックスファイナルロマンシングドラゴン圧縮ブロック
		// SuperUltraDeluxeFinalRomancingDragon
		// ハイパーゴールドラグジュアリーフルオートマチック真ファイナルヴァーチャルロマンシングときめきドラゴン圧縮ブロック
		// HyperGoldLuxuryFullAutomaticVeritableFinalVirtualRomancingTokimekiDragon
		int i = itemstack.getItemDamage();
		if (i < 14) {
			return;
		}

		String currentLanguage = StringTranslate.getInstance().getCurrentLanguage();
		/*
		 * TODO BlockNameJpとかReferenceに持って行ければ
		 */

		if (currentLanguage.equals("ja_JP")) {
			if (i == 14) {
				list.add("ファイナルロマンシングドラゴン");
				list.add("圧縮" + BlockNameJp);
			} else {
				list.add("フルオートマチック真ファイナル");
				list.add("ヴァーチャルロマンシングときめきドラゴン");
				list.add("圧縮" + BlockNameJp);
			}
		} else {
			if (i == 14) {
				list.add("Final Romancing Dragon");
				list.add("Compressed " + BlockNameEn);
			} else {
				list.add("FullAutomatic Veritable Final");
				list.add("Virtual Romancing Tokimeki Dragon");
				list.add("Compressed " + BlockNameEn);
			}
		}
	}

}
