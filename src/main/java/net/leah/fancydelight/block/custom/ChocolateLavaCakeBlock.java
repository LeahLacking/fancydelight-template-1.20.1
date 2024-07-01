package net.leah.fancydelight.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class ChocolateLavaCakeBlock extends Block {
    public static final int MAX_BITES = 3;
    public static final IntProperty BITES = Properties.BITES;
    public static final int DEFAULT_COMPARATOR_OUTPUT = CakeBlock.getComparatorOutput(0);
    protected static final float field_31047 = 1.0f;
    protected static final float field_31048 = 2.0f;

    protected static final VoxelShape[] BITES_TO_SHAPE = new VoxelShape[]{

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(3.63, 3.5, 8.54,14.41, 9.66, 8.54),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(3.63, 3.5, 8.54,14.41, 9.66, 8.54),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(3.63, 3.5, 8.54,14.41, 9.66, 8.54),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(3.63, 3.5, 8.54,14.41, 9.66, 8.54),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(3.63, 3.5, 8.54,14.41, 9.66, 8.54),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            VoxelShapes.union(createCuboidShape(3.63, 3.885, 3.92,12.87, 3.885, 13.16),
                    createCuboidShape(2.09, 0.42, 2.38, 14.41, 3.5, 14.7),
                    createCuboidShape(12.87, 3.5, 2.38,14.41, 5.04, 14.7),
                    createCuboidShape(2.09, 3.5, 2.38,3.63, 5.04, 14.7),
                    createCuboidShape(3.63, 3.5, 2.38, 12.87, 5.04, 3.92),
                    createCuboidShape(0, 0, 0,16, 1, 16)),

            Block.createCuboidShape(0, 0, 0,16, 1, 16)};

    public ChocolateLavaCakeBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState)this.stateManager.getDefaultState()).with(BITES, 0));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return BITES_TO_SHAPE[state.get(BITES)];
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);;
        if (world.isClient) {
            if (ChocolateLavaCakeBlock.tryEat(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }
            if (itemStack.isEmpty()) {
                return ActionResult.CONSUME;
            }
        }
        return ChocolateLavaCakeBlock.tryEat(world, pos, state, player);
    }

    protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        }
        player.incrementStat(Stats.EAT_CAKE_SLICE);
        player.getHungerManager().add(3, 0.1f);
        int i = state.get(BITES);
        world.emitGameEvent((Entity)player, GameEvent.EAT, pos);
        if (i < 3) {
            world.setBlockState(pos, (BlockState)state.with(BITES, i + 1), Block.NOTIFY_ALL);
        } else {
            world.removeBlock(pos, false);
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_DESTROY, pos);
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSolid();
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }

    @Override
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return CakeBlock.getComparatorOutput(state.get(BITES));
    }

    public static int getComparatorOutput(int bites) {
        return (7 - bites) * 2;
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
}

