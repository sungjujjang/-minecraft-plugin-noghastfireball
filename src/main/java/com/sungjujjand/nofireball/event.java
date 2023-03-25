package com.sungjujjand.nofireball;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class event implements Listener {
    public static boolean fireball;

    @EventHandler
    //if ghast fireball is shot
    public void onFireball(org.bukkit.event.entity.ProjectileLaunchEvent event) {
        //if projectile is ghast fireball
        if (event.getEntity().getType().equals(org.bukkit.entity.EntityType.FIREBALL)) {
    //if fireball is disabled
            if (!fireball) {
                //cancel event
                event.setCancelled(true);
                //print message to console
                System.out.println("가스트의 화염구가 플러그인에 의해 보호되었습니다");
            }else {
                //print message to console
                System.out.println("가스트의 화염구는 그대로 발사됩니다");
            }
        }
    }
}
