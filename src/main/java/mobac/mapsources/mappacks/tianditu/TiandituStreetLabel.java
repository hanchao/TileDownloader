/*******************************************************************************
 * Copyright (c) MOBAC developers
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package mobac.mapsources.mappacks.tianditu;

import mobac.mapsources.AbstractHttpMapSource;
import mobac.program.model.TileImageType;

/**
 * https://sourceforge.net/tracker/?func=detail&atid=1105497&aid=3376462&group_id=238075
 * 
 * http://www.chartbundle.com/charts/
 */
public class TiandituStreetLabel extends AbstractHttpMapSource {

	private static String[] SERVERS = { "t1", "t2", "t3", "t4", "t5", "t6", "t7" };
	private static int SERVER_NUM = 0;
	
	public TiandituStreetLabel() {
		super("TiandituStreetLabel", 3, 18, TileImageType.PNG, TileUpdate.None);
	}

	@Override
	public String toString() {
		return "Tianditu Street Label";
	}

	public String getTileUrl(int zoom, int tilex, int tiley) {
		String server = SERVERS[SERVER_NUM];
		SERVER_NUM = (SERVER_NUM + 1) % SERVERS.length;
		return "http://" + server + ".tianditu.cn/DataServer?T=cva_w&X=" + tilex + "&Y=" + tiley + "&L=" + zoom;
	}

}