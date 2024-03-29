/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.haipadev.simplysulphur;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.haipadev.simplysulphur.init.SimplySulphurModProcedures;
import net.haipadev.simplysulphur.init.SimplySulphurModItems;
import net.haipadev.simplysulphur.init.SimplySulphurModItemExtensions;
import net.haipadev.simplysulphur.init.SimplySulphurModFeatures;
import net.haipadev.simplysulphur.init.SimplySulphurModBrewingRecipes;
import net.haipadev.simplysulphur.init.SimplySulphurModBlocks;

import net.fabricmc.api.ModInitializer;

public class SimplySulphurMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "simply_sulphur";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SimplySulphurMod");

		SimplySulphurModBlocks.load();
		SimplySulphurModItems.load();

		SimplySulphurModFeatures.load();

		SimplySulphurModProcedures.load();

		SimplySulphurModItemExtensions.load();

		SimplySulphurModBrewingRecipes.load();

	}
}
