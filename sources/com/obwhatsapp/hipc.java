package com.obwhatsapp;

import android.view.MenuItem;

final /* synthetic */ class hipc implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HiddenConversationsActivity f93a;

    hipc(HiddenConversationsActivity hiddenConversationsActivity) {
        this.f93a = hiddenConversationsActivity;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.f93a.a(menuItem);
    }
}
