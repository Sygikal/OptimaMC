package net.minecraft.client.gui.controls;

import net.minecraft.client.resources.I18n;

public enum SearchType {
    NAME, KEY, CATEGORY;

    public SearchType cycle() {
        return SearchType.values()[(this.ordinal() + 1) % SearchType.values().length];
    }

    public String getName() {
        switch (this) {
            default:
            case NAME:
                return I18n.format("options.search.name");
            case KEY:
                return I18n.format("options.search.key");
            case CATEGORY:
                return I18n.format("options.search.category");
        }
    }
}
