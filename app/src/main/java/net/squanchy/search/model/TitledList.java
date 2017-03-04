package net.squanchy.search.model;

import android.support.annotation.Nullable;
import android.support.annotation.StringRes;

import java.util.Collections;
import java.util.List;

public final class TitledList<T> {

    @StringRes
    private final int title;
    private List<T> items = Collections.emptyList();

    TitledList(int title, @Nullable List<T> items) {
        this.title = title;
        if (items != null) {
            this.items = items;
        }
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @StringRes
    public int getTitle() {
        return title;
    }

    public List<T> getItems() {
        return items;
    }

    public T get(int position) {
        return items.get(position);
    }
}
