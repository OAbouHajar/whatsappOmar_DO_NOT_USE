package com.facebook.redex;

import X.AnonymousClass00B;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C16010sH;
import X.C16320sq;
import X.C49682Va;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.SettingsGoogleDrive;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.obwhatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.obwhatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.jid.UserJid;

public class ViewOnClickCListenerShape2S1100000_I0 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape2S1100000_I0(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        C14570pP r4;
        String str;
        C16320sq r2;
        int i2;
        switch (this.A02) {
            case 0:
                r4 = (C14570pP) this.A00;
                str = this.A01;
                r2 = r4.A05;
                i2 = 9;
                break;
            case 1:
                r4 = (C14570pP) this.A00;
                str = this.A01;
                r2 = r4.A05;
                i2 = 10;
                break;
            case 2:
                C14570pP r5 = (C14570pP) this.A00;
                String str2 = this.A01;
                r5.A05.Acl(new RunnableRunnableShape0S1200000_I0(new SettingsGoogleDrive.AuthRequestDialogFragment(), str2, r5, 7));
                return;
            case 3:
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = (BusinessDirectoryContextualSearchViewModel) this.A00;
                String str3 = this.A01;
                businessDirectoryContextualSearchViewModel.A05 = null;
                businessDirectoryContextualSearchViewModel.A0O(str3, 1);
                return;
            case 4:
                C49682Va r3 = (C49682Va) this.A00;
                String str4 = this.A01;
                boolean A0G = r3.A05.A0G();
                UserJid userJid = r3.A09;
                if (!A0G) {
                    AnonymousClass00B.A06(userJid);
                    UserJid userJid2 = r3.A02;
                    AnonymousClass00B.A06(userJid2);
                    ((C14550pN) r3.A01).Afc(ChangeNumberNotificationDialogFragment.A01(userJid, userJid2, str4));
                    return;
                } else if (!userJid.equals(r3.A02)) {
                    C16010sH A0A = r3.A06.A0A(r3.A02);
                    C14750ph r0 = new C14750ph();
                    Context context = (Context) r3.A01;
                    context.startActivity(r0.A0v(context, A0A));
                    return;
                } else {
                    return;
                }
            case 5:
                C14550pN r42 = (C14550pN) this.A00;
                String str5 = this.A01;
                Uri parse = Uri.parse(str5);
                if (parse.getScheme() == null) {
                    StringBuilder sb = new StringBuilder("http://");
                    sb.append(str5);
                    parse = Uri.parse(sb.toString());
                }
                try {
                    r42.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return;
                } catch (ActivityNotFoundException unused) {
                    r42.A05.A09(R.string.str00a0, 0);
                    return;
                }
            default:
                SettingsDataUsageActivity.A02((SettingsDataUsageActivity) this.A00, this.A01);
                return;
        }
        r2.Acl(new RunnableRunnableShape0S1100000_I0(i2, str, r4));
    }
}
