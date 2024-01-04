
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.haipadev.simplysulphur.procedures.SulphurOreWalkOnProcedure;
import net.haipadev.simplysulphur.procedures.SulphurOreOnBlockHitByProjectileProcedure;
import net.haipadev.simplysulphur.procedures.SulphurOreBlockDestroyedByPlayerProcedure;
import net.haipadev.simplysulphur.procedures.SulphurOreBlockDestroyedByExplosionProcedure;
import net.haipadev.simplysulphur.procedures.SulphurFlintandsteelProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockWalkOnProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockOnBlockHitByProjectileProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockFlintAndSteelProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockDestroyedByPlayerProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockDestroyedByExplosionProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class SimplySulphurModProcedures {
	public static void load() {
		new SulphurOreOnBlockHitByProjectileProcedure();
		new SulphurOreBlockDestroyedByExplosionProcedure();
		new SulphurOreWalkOnProcedure();
		new SulphurOreBlockDestroyedByPlayerProcedure();
		new SulphurFlintandsteelProcedure();
		new SulphurBlockDestroyedByExplosionProcedure();
		new SulphurBlockDestroyedByPlayerProcedure();
		new SulphurBlockOnBlockHitByProjectileProcedure();
		new SulphurBlockWalkOnProcedure();
		new SulphurBlockFlintAndSteelProcedure();
	}
}
