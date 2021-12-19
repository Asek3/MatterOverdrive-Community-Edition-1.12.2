
package matteroverdrive.entity;

import matteroverdrive.init.MatterOverdriveSounds;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityFailedCow extends EntityCow {
    public EntityFailedCow(World world) {
        super(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return MatterOverdriveSounds.failedAnimalIdleCow;
    }

    protected SoundEvent getHurtSound() {
        return MatterOverdriveSounds.failedAnimalIdleCow;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return MatterOverdriveSounds.failedAnimalDie;
    }

    public EntityCow createChild(EntityAgeable entity) {
        return new EntityFailedCow(this.world);
    }
}
