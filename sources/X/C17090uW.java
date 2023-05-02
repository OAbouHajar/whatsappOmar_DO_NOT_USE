package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.0uW  reason: invalid class name and case insensitive filesystem */
public class C17090uW implements C17100uX {
    public final C19980zJ A00;
    public final C17230uk A01;
    public final C18030w2 A02;
    public final C14710pd A03;
    public final C228119j A04;

    public C17090uW(C19980zJ r1, C17230uk r2, C18030w2 r3, C14710pd r4, C228119j r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void Act(Context context, Uri uri) {
        Acu(context, uri, 0);
    }

    public void Acu(Context context, Uri uri, int i2) {
        Acv(context, uri, i2, 4);
    }

    public void Acv(Context context, Uri uri, int i2, int i3) {
        Intent intent;
        if (uri == null) {
            Log.e("linklauncher/start-activity/uri-is-null");
            return;
        }
        String A002 = C51792cH.A00(uri);
        if (!TextUtils.isEmpty(A002)) {
            Activity A003 = C19980zJ.A00(context);
            boolean A0E = this.A03.A0E(C16620tM.A02, 2749);
            if ((this.A01.A0A() || A0E) && (A003 instanceof C000900k)) {
                C453428a.A01(JoinGroupBottomSheetFragment.A02(A002, i2, false), ((C001000l) A003).AGM());
                return;
            }
            intent = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity");
            intent.putExtra("code", A002);
        } else if (this.A02.A08(uri) != 1) {
            intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.deeplink.DeepLinkActivity");
            intent.setData(uri);
            intent.putExtra("source", 2);
            intent.putExtra("extra_entry_point", i3);
        } else {
            C228119j r5 = this.A04;
            if (context != null) {
                List list = r5.A04;
                if (!list.isEmpty()) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        Intent AaE = ((C52342de) list.get(i4)).AaE(context, uri);
                        if (AaE != null) {
                            ((C20180zd) r5.A03.get()).A01(context).A00(new C52402dk(AaE, r5, new WeakReference(context)), C52382di.class, r5);
                            r5.A00(context, AaE);
                            return;
                        }
                    }
                }
            }
            this.A00.Act(context, uri);
            return;
        }
        this.A00.A06(context, intent);
    }
}
