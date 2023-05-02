package com.obwhatsapp;

import android.view.MenuItem;

final /* synthetic */ class hips implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HiddenConversationsActivity f94a;

    hips(HiddenConversationsActivity hiddenConversationsActivity) {
        this.f94a = hiddenConversationsActivity;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f94a.b(menuItem);
    }
}
