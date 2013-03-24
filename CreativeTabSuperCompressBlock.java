package nurseangel.SuperCompressBlock;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabSuperCompressBlock extends CreativeTabs{

	public CreativeTabSuperCompressBlock(String label) {
		super(label);
	}

	/**
	 * タブに使用するアイコン
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		// 特に無いので石で
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return Reference.MOD_NAME;
	}
}
