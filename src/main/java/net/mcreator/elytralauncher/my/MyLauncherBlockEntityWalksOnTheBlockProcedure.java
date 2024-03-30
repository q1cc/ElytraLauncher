package net.mcreator.elytralauncher.my;

import net.mcreator.elytralauncher.ElytralauncherMod;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.loading.FMLEnvironment;

import java.util.HashMap;
import java.util.Map;

public class MyLauncherBlockEntityWalksOnTheBlockProcedure {

	private static final int VELOCITY_FACTOR = 3;
	private static final Map<Entity,Long> walkOnBlockTimes = new HashMap<>();

	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;

		ElytralauncherMod.queueServerWork(1, () -> {

			long currentTimeMillis = System.currentTimeMillis();
			Long prevTime = walkOnBlockTimes.get(entity);
			if (prevTime == null || currentTimeMillis - prevTime > 1000L) {

				entity.sendSystemMessage( Component.literal("launching you in 20 ticks ...") );

				walkOnBlockTimes.put(entity, currentTimeMillis);
				ElytralauncherMod.queueServerWork(20, () -> {
					entity.setDeltaMovement(
							new Vec3(
									VELOCITY_FACTOR * entity.getLookAngle().x,
									VELOCITY_FACTOR * entity.getLookAngle().y,
									VELOCITY_FACTOR * entity.getLookAngle().z
							)
					);
				});

			}

		});

	}

}
