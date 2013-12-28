package mmmod.test1.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityFrozen extends EntityThrowable {

	// 伤害值
	int damage = 4;

	/**
	 * 在客户端同步时被调用的构造器。
	 */
	public EntityFrozen(World par1World) {
		super(par1World);
		setSize(0.8F, 0.8F); // 大小0.8格
	}

	/**
	 * 我们在服务端生成时调用的构造器。
	 */
	public EntityFrozen(World par1World, EntityLivingBase par2EntityLivingBase, int dmg) {
		super(par1World, par2EntityLivingBase);
		this.damage = dmg;
		setSize(0.8F, 0.8F); // 大小0.8格
	}

	/**
	 * 当实体碰撞到其他世界物品时被调用。进行碰撞计算。
	 */
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		Vec3 vec3 = mop.hitVec; // 获取碰撞结果的“碰撞位置”Vec3
		int beginX = (int) (vec3.xCoord - 4), beginY = (int) (vec3.yCoord - 2), beginZ = (int) (vec3.zCoord - 4);

		for (int x = beginX + 8; x >= beginX; x--)
			// 替换水
			for (int y = beginY + 3; y >= beginY; y--)
				for (int z = beginZ + 8; z >= beginZ; z--) {
					int blockID = worldObj.getBlockId(x, y, z);
					if (blockID != 0) { // 无差别冰冻方块
						worldObj.setBlock(x, y, z, Block.ice.blockID, 0, 0x03);
					}
				}

		// 伤害实体
		if (mop.typeOfHit == EnumMovingObjectType.ENTITY) {
			mop.entityHit.attackEntityFrom(DamageSource.causeThornsDamage(this), damage);
		}

		this.setDead();
	}

	/**
	 * 获取实体的初速度值。
	 */
	protected float func_70182_d() {
		return 1.0F;
	}

	/**
	 * 获取重力加速度的大小。
	 */
	protected float getGravityVelocity() {
		return 0.001F; // 重力影响极小
	}

}
