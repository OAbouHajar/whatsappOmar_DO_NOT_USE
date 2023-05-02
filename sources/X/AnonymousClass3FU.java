package X;

import android.app.Activity;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3FU  reason: invalid class name */
public class AnonymousClass3FU implements AnonymousClass2Ga {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C14600pS A01;
    public final /* synthetic */ C18800xH A02;
    public final /* synthetic */ C16260sj A03;
    public final /* synthetic */ AnonymousClass013 A04;
    public final /* synthetic */ C14730pf A05;
    public final /* synthetic */ C210912t A06;
    public final /* synthetic */ AnonymousClass5QK A07;

    public AnonymousClass3FU(Activity activity, C14600pS r2, C18800xH r3, C16260sj r4, AnonymousClass013 r5, C14730pf r6, C210912t r7, AnonymousClass5QK r8) {
        this.A00 = activity;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
    }

    public void AMF(int i2) {
        int i3;
        this.A06.A0H.A03(this);
        Activity activity = this.A00;
        AnonymousClass29T.A00(activity, 600);
        AnonymousClass2UF.A01 = null;
        this.A07.AT1(i2);
        if (i2 == 3) {
            C40691uX.A09(activity.getApplicationContext());
            byte[] A0E = C004101u.A0E(16);
            byte[] A0G = C40691uX.A0G(A0E);
            if (A0G != null) {
                this.A02.A01((Runnable) null, A0G, A0E, 1);
                this.A01.Afg(R.string.str0d86);
                Log.w("settings/backup/failed/missing-or-mismatch");
                return;
            }
        } else if (i2 == 2) {
            C14600pS r3 = this.A01;
            boolean A002 = C14730pf.A00();
            StringBuilder A0o = AnonymousClass000.A0o();
            if (A002) {
                C13690nt.A0t(activity, " ", A0o, R.string.str0d84);
                i3 = R.string.str13eb;
            } else {
                C13690nt.A0t(activity, " ", A0o, R.string.str0d85);
                i3 = R.string.str13ec;
            }
            r3.Afh(AnonymousClass000.A0h(activity.getString(i3), A0o));
            return;
        } else if (i2 != 1) {
            if (!this.A03.A0B()) {
                Log.i("settings/backup/failed/missing-permissions");
                this.A01.Afg(R.string.str0d83);
                return;
            }
            return;
        }
        this.A01.Afg(R.string.str0d83);
        Log.w("settings/backup/failed/null");
    }

    public void ANX() {
        AnonymousClass29T.A01(this.A00, 600);
    }

    public void AVO(int i2) {
        AnonymousClass2SD r10 = AnonymousClass2UF.A01;
        if (r10 != null) {
            r10.setMessage(C13680ns.A0d(this.A00, this.A04.A0L().format(((double) i2) / 100.0d), new Object[1], 0, R.string.str152b));
        }
        int i3 = i2 % 10;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, i2, 0);
        if (i3 == 0) {
            C13700nu.A0Z("settings/backup/msgstore/progress/%d%%", locale, objArr);
        } else {
            String.format(locale, "settings/backup/msgstore/progress/%d%%", objArr);
        }
    }
}
