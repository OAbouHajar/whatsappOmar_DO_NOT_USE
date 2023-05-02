package X;

import android.content.DialogInterface;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;

/* renamed from: X.4fa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91234fa implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsChatHistoryFragment A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C91234fa(SettingsChatHistoryFragment settingsChatHistoryFragment, boolean z2) {
        this.A00 = settingsChatHistoryFragment;
        this.A01 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        SettingsChatHistoryFragment settingsChatHistoryFragment = this.A00;
        boolean z2 = this.A01;
        AnonymousClass2KO r1 = settingsChatHistoryFragment.A00;
        if (r1 != null) {
            AnonymousClass29T.A00(r1, 5);
            AnonymousClass2KO r0 = settingsChatHistoryFragment.A00;
            if (r0 != null) {
                r0.Afr(R.string.str130a, R.string.str13db);
            }
            settingsChatHistoryFragment.A0B.Acl(new RunnableRunnableShape0S0110000_I0(settingsChatHistoryFragment, 26, z2));
        }
    }
}
