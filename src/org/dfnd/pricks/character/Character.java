package org.dfnd.pricks.character;

import java.util.Map;

import org.dfnd.pricks.constants.EquipSlot;
import org.dfnd.pricks.constants.StatTypes;
import org.dfnd.pricks.interfaces.IStats;
import org.dfnd.pricks.items.Item;

public class Character implements IStats
{
	private Map<EquipSlot, Item>	_equipment;
	private Item					_food;
	private Item					_nourishment;

	@Override
	public int getStat(StatTypes stat)
	{
		int value = 0;
		for (Item i : _equipment.values())
		{
			value += i.getStat(stat);
		}
		value += _food.getStat(stat);
		value += _nourishment.getStat(stat);
		return value;
	}
}
