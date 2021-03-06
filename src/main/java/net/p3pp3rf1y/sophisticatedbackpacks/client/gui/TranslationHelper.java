package net.p3pp3rf1y.sophisticatedbackpacks.client.gui;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class TranslationHelper {
	private TranslationHelper() {}

	private static final String GUI_PREFIX = "gui.sophisticatedbackpacks.";
	private static final String GUI_UPGRADE_PREFIX = GUI_PREFIX + "upgrades.";
	private static final String BUTTONS_PREFIX = GUI_PREFIX + "buttons.";
	private static final String ITEM_UPGRADE_PREFIX = "item.sophisticatedbackpacks.";
	private static final String UPGRADE_BUTTONS_PREFIX = GUI_UPGRADE_PREFIX + "buttons.";
	private static final String KEYBIND_PREFIX = "keybind.sophisticatedbackpacks.";

	public static String translUpgrade(String upgradeName) {
		return GUI_UPGRADE_PREFIX + upgradeName;
	}

	public static String translUpgradeTooltip(String upgradeName) {
		return translUpgrade(upgradeName) + ".tooltip";
	}

	public static ITextComponent translColoredButton(String buttonName, TextFormatting color) {
		return new TranslationTextComponent(translButton(buttonName)).mergeStyle(color);
	}

	public static String translButton(String buttonName) {
		return BUTTONS_PREFIX + buttonName;
	}

	public static String translUpgradeButton(String buttonName) {
		return UPGRADE_BUTTONS_PREFIX + buttonName;
	}

	public static String translUpgradeItemTooltip(String upgradeName) {
		return ITEM_UPGRADE_PREFIX + upgradeName + ".tooltip";
	}

	public static List<StringTextComponent> getTranslatedLines(String translateKey, @Nullable Object parameters, TextFormatting... textFormattings) {
		List<StringTextComponent> ret = getTranslatedLines(translateKey, parameters);
		ret.forEach(l -> l.mergeStyle(textFormattings));
		return ret;
	}

	public static List<StringTextComponent> getTranslatedLines(String translateKey, @Nullable Object parameters) {
		String text = I18n.format(translateKey, parameters);

		String[] lines = text.split("\n");

		List<StringTextComponent> ret = new ArrayList<>();
		for (String line : lines) {
			ret.add(new StringTextComponent(line));
		}

		return ret;
	}

	public static String translKeybind(String keybindName) {
		return KEYBIND_PREFIX + keybindName;
	}
}
