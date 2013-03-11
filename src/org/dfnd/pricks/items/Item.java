package org.dfnd.pricks.items;

import java.util.Map;

import org.dfnd.pricks.constants.StatTypes;
import org.dfnd.pricks.interfaces.IStats;

public class Item implements IStats
{
	private Map<StatTypes, Integer>	_stats;

	@Override
	public int getStat(StatTypes stat)
	{
		return _stats.get(stat);
	}
}
