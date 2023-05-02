package com.obwhatsapp.conversationslist;

import android.view.MenuItem;
import com.obwhatsapp.yo.yo;
import java.util.Objects;

public final /* synthetic */ class a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f151a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HiddenConversationsActivity f152b;

    public /* synthetic */ a(HiddenConversationsActivity hiddenConversationsActivity, int i2) {
        this.f151a = i2;
        this.f152b = hiddenConversationsActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f151a) {
            case 0:
                HiddenConversationsActivity hiddenConversationsActivity = this.f152b;
                int i2 = HiddenConversationsActivity.f150a;
                Objects.requireNonNull(hiddenConversationsActivity);
                yo.showHChatsLockSetupDlg(hiddenConversationsActivity);
                return false;
            default:
                HiddenConversationsActivity hiddenConversationsActivity2 = this.f152b;
                int i3 = HiddenConversationsActivity.f150a;
                Objects.requireNonNull(hiddenConversationsActivity2);
                yo.showHChatsSettings(hiddenConversationsActivity2);
                return false;
        }
    }
}
