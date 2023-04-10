package de.srendi.advancedperipherals.common.setup;

import de.srendi.advancedperipherals.common.addons.computercraft.pocket.*;
import de.srendi.advancedperipherals.common.addons.computercraft.turtles.TurtleChatBoxUpgrade;
import de.srendi.advancedperipherals.common.addons.computercraft.turtles.TurtleEnvironmentDetectorUpgrade;
import de.srendi.advancedperipherals.common.addons.computercraft.turtles.TurtleGeoScannerUpgrade;
import de.srendi.advancedperipherals.common.addons.computercraft.turtles.TurtlePlayerDetectorUpgrade;
import de.srendi.advancedperipherals.common.blocks.PlayerDetectorBlock;
import de.srendi.advancedperipherals.common.blocks.RedstoneIntegratorBlock;
import de.srendi.advancedperipherals.common.blocks.base.APTileEntityBlock;
import de.srendi.advancedperipherals.common.configuration.APConfig;
import de.srendi.advancedperipherals.common.items.APBlockItem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class Blocks {

    static void register() {
    }

    public static final RegistryObject<Block> ENVIRONMENT_DETECTOR = register("environment_detector", () -> new APTileEntityBlock<>(TileEntityTypes.ENVIRONMENT_DETECTOR),
            () -> new APBlockItem(Blocks.ENVIRONMENT_DETECTOR.get(), TurtleEnvironmentDetectorUpgrade.ID, PocketEnvironmentUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_ENVIRONMENT_DETECTOR::get));
    public static final RegistryObject<Block> CHAT_BOX = register("chat_box", () -> new APTileEntityBlock<>(TileEntityTypes.CHAT_BOX),
            () -> new APBlockItem(Blocks.CHAT_BOX.get(), TurtleChatBoxUpgrade.ID, PocketChatBoxUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_CHAT_BOX::get));
    public static final RegistryObject<Block> PLAYER_DETECTOR = register("player_detector", PlayerDetectorBlock::new,
            () -> new APBlockItem(Blocks.PLAYER_DETECTOR.get(), TurtlePlayerDetectorUpgrade.ID, PocketPlayerDetectorUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_PLAYER_DETECTOR::get));
    public static final RegistryObject<Block> ME_BRIDGE = register("me_bridge", () -> new APTileEntityBlock<>( ModList.get().isLoaded("appliedenergistics2") ? TileEntityTypes.ME_BRIDGE : null),
            () -> new APBlockItem(Blocks.ME_BRIDGE.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_ME_BRIDGE::get));
    public static final RegistryObject<Block> RS_BRIDGE = register("rs_bridge", () -> new APTileEntityBlock<>(ModList.get().isLoaded("refinedstorage") ? TileEntityTypes.RS_BRIDGE : null),
            () -> new APBlockItem(Blocks.RS_BRIDGE.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_RS_BRIDGE::get));
    public static final RegistryObject<Block> ENERGY_DETECTOR = register("energy_detector", () -> new APTileEntityBlock<>(TileEntityTypes.ENERGY_DETECTOR),
            () -> new APBlockItem(Blocks.ENERGY_DETECTOR.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_ENERGY_DETECTOR::get));
    public static final RegistryObject<Block> PERIPHERAL_CASING = register("peripheral_casing", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5, 5)),
            () -> new APBlockItem(Blocks.PERIPHERAL_CASING.get(), new Item.Properties().stacksTo(16), null, null, () -> true));
    public static final RegistryObject<Block> AR_CONTROLLER = register("ar_controller", () -> new APTileEntityBlock<>(TileEntityTypes.AR_CONTROLLER),
            () -> new APBlockItem(Blocks.AR_CONTROLLER.get(), null, PocketARControllerUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_AR_GOGGLES::get));
    public static final RegistryObject<Block> INVENTORY_MANAGER = register("inventory_manager", () -> new APTileEntityBlock<>(TileEntityTypes.INVENTORY_MANAGER),
            () -> new APBlockItem(Blocks.INVENTORY_MANAGER.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_INVENTORY_MANAGER::get));
    public static final RegistryObject<Block> REDSTONE_INTEGRATOR = register("redstone_integrator", RedstoneIntegratorBlock::new,
            () -> new APBlockItem(Blocks.REDSTONE_INTEGRATOR.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_REDSTONE_INTEGRATOR::get));
    public static final RegistryObject<Block> BLOCK_READER = register("block_reader", () -> new APTileEntityBlock<>(TileEntityTypes.BLOCK_READER),
            () -> new APBlockItem(Blocks.BLOCK_READER.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_BLOCK_READER::get));
    public static final RegistryObject<Block> GEO_SCANNER = register("geo_scanner", () -> new APTileEntityBlock<>(TileEntityTypes.GEO_SCANNER),
            () -> new APBlockItem(Blocks.GEO_SCANNER.get(), TurtleGeoScannerUpgrade.ID, PocketGeoScannerUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_GEO_SCANNER::get));
    public static final RegistryObject<Block> COLONY_INTEGRATOR = register("colony_integrator", () -> new APTileEntityBlock<>(ModList.get().isLoaded("minecolonies") ? TileEntityTypes.COLONY_INTEGRATOR : null),
            () -> new APBlockItem(Blocks.COLONY_INTEGRATOR.get(), null, PocketColonyIntegratorUpgrade.ID, APConfig.PERIPHERALS_CONFIG.ENABLE_COLONY_INTEGRATOR::get));
    public static final RegistryObject<Block> NBT_STORAGE = register("nbt_storage", () -> new APTileEntityBlock<>(TileEntityTypes.NBT_STORAGE),
            () -> new APBlockItem(Blocks.NBT_STORAGE.get(), null, null, APConfig.PERIPHERALS_CONFIG.ENABLE_NBT_STORAGE::get));

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Supplier<BlockItem> blockItem) {
        RegistryObject<T> registryObject = registerNoItem(name, block);
        Registration.ITEMS.register(name, blockItem);
        return registryObject;
    }

    public static boolean never(BlockState p_235436_0_, IBlockReader p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }

}
