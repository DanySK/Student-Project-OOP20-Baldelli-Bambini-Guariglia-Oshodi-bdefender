package com.bdefender.game;

import com.bdefender.map.Coordinates;
import com.bdefender.tower.Tower;


public interface TowersController {



    /**
     * Creates the tower threads and add its view to the game panel.
     * @param towerName tower type identification code.
     * @return created tower ID.
     */
    Tower addTower(TowerName towerName, Coordinates pos);

    /**
     * Removes the tower from prompted panel and interrupts its life thread.
     * @param towerId tower ID.
     */
    void removeTower(Tower tower);

    /**
     * Upgrade the tower to the next level.
     * @param towerId tower ID.
     * @return level after the upgrade
     */
    Integer upgradeTower(Integer towerId);


}
