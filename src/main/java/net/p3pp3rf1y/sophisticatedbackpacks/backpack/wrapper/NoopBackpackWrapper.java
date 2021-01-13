package net.p3pp3rf1y.sophisticatedbackpacks.backpack.wrapper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.p3pp3rf1y.sophisticatedbackpacks.api.IBackpackWrapper;
import net.p3pp3rf1y.sophisticatedbackpacks.common.gui.SortBy;
import net.p3pp3rf1y.sophisticatedbackpacks.init.ModItems;

import java.util.Optional;
import java.util.function.Consumer;

public class NoopBackpackWrapper implements IBackpackWrapper {
	public static final NoopBackpackWrapper INSTANCE = new NoopBackpackWrapper();

	private final ItemStack backpack = new ItemStack(ModItems.BACKPACK.get());
	private final BackpackUpgradeHandler backpackUpgradeHandler = new BackpackUpgradeHandler(backpack, this, s -> {}, () -> {});

	private NoopBackpackWrapper() {}

	@Override
	public void setBackpackSaveHandler(Consumer<ItemStack> saveHandler) {
		//noop
	}

	@Override
	public BackpackInventoryHandler getInventoryForUpgradeProcessing() {
		return new BackpackInventoryHandler(backpack, s -> {});
	}

	@Override
	public BackpackInventoryHandler getInventoryHandler() {
		return new BackpackInventoryHandler(backpack, s -> {});
	}

	@Override
	public IItemHandlerModifiable getInventoryForInputOutput() {
		return new BackpackInventoryHandler(backpack, s -> {});
	}

	@Override
	public void copyDataTo(IBackpackWrapper otherBackpackWrapper) {
		//noop
	}

	@Override
	public BackpackUpgradeHandler getUpgradeHandler() {
		return backpackUpgradeHandler;
	}

	@Override
	public int getClothColor() {
		return -1;
	}

	@Override
	public int getBorderColor() {
		return -1;
	}

	@Override
	public Optional<Integer> getOpenTabId() {
		return Optional.empty();
	}

	@Override
	public void setOpenTabId(int openTabId) {
		//noop
	}

	@Override
	public void removeOpenTabId() {
		//noop
	}

	@Override
	public void setColors(int clothColor, int borderColor) {
		//noop
	}

	@Override
	public void setSortBy(SortBy sortBy) {
		//noop
	}

	@Override
	public SortBy getSortBy() {
		return SortBy.NAME;
	}

	@Override
	public ItemStack getBackpack() {
		return backpack;
	}

	@Override
	public void sort() {
		//noop
	}

	@Override
	public void refreshInventoryForUpgradeProcessing() {
		//noop
	}

	@Override
	public void refreshInventoryForInputOutput() {
		//noop
	}
}
