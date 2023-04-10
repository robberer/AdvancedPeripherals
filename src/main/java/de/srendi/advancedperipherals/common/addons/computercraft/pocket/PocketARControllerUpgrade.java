package de.srendi.advancedperipherals.common.addons.computercraft.pocket;

import dan200.computercraft.api.pocket.IPocketAccess;
import de.srendi.advancedperipherals.AdvancedPeripherals;
import de.srendi.advancedperipherals.common.addons.computercraft.peripheral.ARControllerPeripheral;
import de.srendi.advancedperipherals.common.setup.Blocks;
import de.srendi.advancedperipherals.lib.pocket.BasePocketUpgrade;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PocketARControllerUpgrade extends BasePocketUpgrade<ARControllerPeripheral> {
    public static final ResourceLocation ID = new ResourceLocation(AdvancedPeripherals.MOD_ID, "arcontroller_pocket");

    public PocketARControllerUpgrade() {
        super(ID, Blocks.GEO_SCANNER);
    }

    @Nullable
    @Override
    public ARControllerPeripheral getPeripheral(@NotNull IPocketAccess iPocketAccess) {
        return new ARControllerPeripheral(iPocketAccess);
    }

}
