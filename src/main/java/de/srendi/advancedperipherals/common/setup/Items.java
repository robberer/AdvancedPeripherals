package de.srendi.advancedperipherals.common.setup;

import de.srendi.advancedperipherals.common.addons.computercraft.turtles.TurtleChunkyUpgrade;
import de.srendi.advancedperipherals.common.addons.computercraft.turtles.metaphysics.*;
import de.srendi.advancedperipherals.common.configuration.APConfig;
import de.srendi.advancedperipherals.common.items.APItem;
import de.srendi.advancedperipherals.common.items.ARGogglesItem;
import de.srendi.advancedperipherals.common.items.MemoryCardItem;
import de.srendi.advancedperipherals.common.items.WeakAutomataCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final RegistryObject<Item> CHUNK_CONTROLLER = Registration.ITEMS.register("chunk_controller", () -> new APItem(new Item.Properties().stacksTo(16),
            TurtleChunkyUpgrade.ID, null, APConfig.PERIPHERALS_CONFIG.ENABLE_CHUNKY_TURTLE::get));

    public static final RegistryObject<ARGogglesItem> AR_GOGGLES = Registration.ITEMS.register("ar_goggles", ARGogglesItem::new);

    public static final RegistryObject<Item> COMPUTER_TOOL = Registration.ITEMS.register("computer_tool", () -> new APItem(new Item.Properties().stacksTo(1),
            null, null, () -> true));

    public static final RegistryObject<Item> MEMORY_CARD = Registration.ITEMS.register("memory_card", MemoryCardItem::new);

    public static final RegistryObject<Item> END_AUTOMATA_CORE = Registration.ITEMS.register("end_automata_core", () -> new APItem(new Item.Properties().stacksTo(1),
            EndAutomata.ID, null, APConfig.METAPHYSICS_CONFIG.ENABLE_END_AUTOMATA_CORE::get));

    public static final RegistryObject<Item> HUSBANDRY_AUTOMATA_CORE = Registration.ITEMS.register("husbandry_automata_core", () -> new APItem(new Item.Properties().stacksTo(1),
            HusbandryAutomata.ID, null, APConfig.METAPHYSICS_CONFIG.ENABLE_HUSBANDRY_AUTOMATA_CORE::get));

    public static final RegistryObject<Item> WEAK_AUTOMATA_CORE = Registration.ITEMS.register("weak_automata_core", () -> new WeakAutomataCore(new Item.Properties().stacksTo(1),
            WeakAutomata.ID, null));

    public static final RegistryObject<Item> OVERPOWERED_WEAK_AUTOMATA_CORE = Registration.ITEMS.register("overpowered_weak_automata_core", () -> new APItem(new Item.Properties().stacksTo(1),
            OverpoweredWeakAutomata.ID, null, APConfig.METAPHYSICS_CONFIG.ENABLE_WEAK_AUTOMATA_CORE::get));

    public static final RegistryObject<Item> OVERPOWERED_END_AUTOMATA_CORE = Registration.ITEMS.register("overpowered_end_automata_core", () -> new APItem(new Item.Properties().stacksTo(1),
            OverpoweredEndAutomata.ID, null, APConfig.METAPHYSICS_CONFIG.ENABLE_END_AUTOMATA_CORE::get));

    public static final RegistryObject<Item> OVERPOWERED_HUSBANDRY_AUTOMATA_CORE = Registration.ITEMS.register("overpowered_husbandry_automata_core", () -> new APItem(new Item.Properties().stacksTo(1),
            OverpoweredHusbandryAutomata.ID, null, APConfig.METAPHYSICS_CONFIG.ENABLE_HUSBANDRY_AUTOMATA_CORE::get));

    public static void register() {
    }


}
