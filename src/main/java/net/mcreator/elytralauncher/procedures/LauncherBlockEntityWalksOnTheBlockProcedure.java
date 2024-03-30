package net.mcreator.elytralauncher.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class LauncherBlockEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		net.mcreator.elytralauncher.my.MyLauncherBlockEntityWalksOnTheBlockProcedure.execute(world, entity);
		/*
		if (world instanceof ServerLevel _origLevel) {
		LevelAccessor _worldorig = world;
		world = _origLevel.getServer().getLevel(Level.OVERWORLD);
		if (world != null) {
		ElytralauncherMod.queueServerWork(20, () -> {
		entity.setDeltaMovement(new Vec3((10*entity.getLookAngle().x), (10*entity.getLookAngle().y), (10*entity.getLookAngle().z)));
		});
		}
		world = _worldorig;
		}*/
	}
}
