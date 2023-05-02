package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ff  reason: invalid class name and case insensitive filesystem */
public class C111285ff extends AnonymousClass3MG {
    public final /* synthetic */ ChangeEphemeralSettingActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111285ff(Context context, ChangeEphemeralSettingActivity changeEphemeralSettingActivity) {
        super(context);
        this.A00 = changeEphemeralSettingActivity;
    }

    public void onClick(View view) {
        ChangeEphemeralSettingActivity changeEphemeralSettingActivity = this.A00;
        int i2 = 4;
        if (changeEphemeralSettingActivity.A0H instanceof UserJid) {
            i2 = 3;
        }
        Intent A09 = C13680ns.A09();
        C14750ph.A0r(changeEphemeralSettingActivity, A09, i2);
        changeEphemeralSettingActivity.startActivity(A09);
    }
}
