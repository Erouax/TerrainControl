package com.khorn.terraincontrol.handler;

import com.khorn.terraincontrol.LocalWorld;
import com.khorn.terraincontrol.customobjects.bo2.BO2;
import com.khorn.terraincontrol.util.Rotation;

public interface SpawnHandler {

	boolean shouldSpawn(BO2 bo2, Rotation rotation, LocalWorld world, int x, int y, int z);

}
