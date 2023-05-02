package X;

import android.app.Activity;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zA  reason: invalid class name and case insensitive filesystem */
public abstract class C79083zA extends C16690tT {
    public int A00;
    public C17930vs A01;
    public C17380uz A02;
    public C16050sL A03;
    public UserJid A04;
    public final C16440t3 A05;
    public final C17780vd A06;

    public C79083zA(C16440t3 r1, C17780vd r2, C16050sL r3, UserJid userJid) {
        this.A05 = r1;
        this.A06 = r2;
        this.A03 = r3;
        this.A04 = userJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A06.A02(new C40901us(this), this.A03, Collections.singletonList(this.A04)).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14870pt r2;
        int i2;
        if (this.A02 == null || this.A01 == null) {
            if (this instanceof C76633uR) {
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) ((C76633uR) this).A00.get();
                if (viewGroupInviteActivity != null) {
                    viewGroupInviteActivity.A35(R.string.str1478);
                    return;
                }
                return;
            }
            C76623uQ r1 = (C76623uQ) this;
            C14550pN r0 = (C14550pN) r1.A01.get();
            if (r0 != null) {
                r0.Ac1();
                r2 = r1.A00;
                i2 = R.string.str1478;
            } else {
                return;
            }
        } else {
            if (this instanceof C76633uR) {
                C76633uR r12 = (C76633uR) this;
                Activity activity = (Activity) r12.A00.get();
                if (activity != null) {
                    r12.A01.A09(R.string.str1479, 0);
                    activity.finish();
                    return;
                }
                return;
            }
            C76623uQ r13 = (C76623uQ) this;
            C14550pN r02 = (C14550pN) r13.A01.get();
            if (r02 != null) {
                r02.Ac1();
                r2 = r13.A00;
                i2 = R.string.str1479;
            } else {
                return;
            }
        }
        r2.A09(i2, 0);
    }
}
