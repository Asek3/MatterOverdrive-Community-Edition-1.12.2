
package matteroverdrive.items.includes;

import matteroverdrive.api.internal.OreDictItem;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @author shadowfacts
 */
public class MOItemOre extends MOBaseItem implements OreDictItem {

	private final String oreDict;

	public MOItemOre(String name, String oreDict) {
		super(name);
		this.oreDict = oreDict;
	}

	@Override
	public void registerOreDict() {
		OreDictionary.registerOre(oreDict, this);
	}

}