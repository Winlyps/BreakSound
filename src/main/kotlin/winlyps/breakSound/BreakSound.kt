package winlyps.breakSound

import org.bukkit.plugin.java.JavaPlugin

class BreakSound : JavaPlugin() {

    override fun onEnable() {
        // Register the BlockBreakListener
        server.pluginManager.registerEvents(BlockBreakListener(this), this)
        logger.info("BreakSound plugin enabled.")
    }

    override fun onDisable() {
        logger.info("BreakSound plugin disabled.")
    }
}