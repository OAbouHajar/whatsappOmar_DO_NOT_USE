package com.facebook.redex;

import X.AnonymousClass1L1;
import X.C16740tZ;
import X.C55062ik;
import android.net.Uri;
import android.view.View;
import android.widget.RadioButton;
import com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;

public class ViewOnClickCListenerShape1S1200000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public ViewOnClickCListenerShape1S1200000_I0(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                ((GoogleDriveNewUserSetupActivity) this.A00).A3F((RadioButton) this.A01, this.A02);
                return;
            case 1:
                String str = this.A02;
                RestoreFromBackupActivity.A0T((C55062ik) this.A01, (RestoreFromBackupActivity) this.A00, str);
                return;
            default:
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
                String str2 = this.A02;
                AnonymousClass1L1 r3 = statusPlaybackContactFragment.A0b;
                r3.A0I.put(((C16740tZ) this.A01).A11.A01, Boolean.TRUE);
                statusPlaybackContactFragment.A04.Act(statusPlaybackContactFragment.A0u(), Uri.parse(str2));
                return;
        }
    }
}
