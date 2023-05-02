package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Looper;
import com.facebook.redex.IDxCListenerShape6S0101000_2_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2RY  reason: invalid class name */
public class AnonymousClass2RY extends C46552Ev {
    public static AnonymousClass2SD A0G;
    public static final AtomicReference A0H = new AtomicReference((Object) null);
    public boolean A00;
    public final Activity A01;
    public final C14870pt A02;
    public final AnonymousClass2SB A03;
    public final C51362bV A04;
    public final C18930xU A05;
    public final C32301g2 A06 = new IDxSCallbackShape221S0100000_2_I0(this, 1);
    public final AnonymousClass12W A07;
    public final C14730pf A08;
    public final C18790xG A09;
    public final C19650ym A0A;
    public final AnonymousClass131 A0B;
    public final AnonymousClass01D A0C;
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final boolean A0E;
    public final boolean A0F;

    public AnonymousClass2RY(Activity activity, C14870pt r13, AnonymousClass2SB r14, C18930xU r15, AnonymousClass12W r16, C14730pf r17, C18790xG r18, C16250si r19, C19650ym r20, AnonymousClass131 r21, C19090xk r22, AnonymousClass0y3 r23, C18990xa r24, AnonymousClass11L r25, C19760yx r26, C16320sq r27, AnonymousClass01D r28, boolean z2, boolean z3) {
        super(r19, r22, r23, r25, r26, r27);
        this.A02 = r13;
        this.A08 = r17;
        this.A09 = r18;
        this.A07 = r16;
        this.A0A = r20;
        this.A01 = activity;
        this.A03 = r14;
        this.A0F = z2;
        this.A04 = new C51362bV(Looper.getMainLooper(), r24, new WeakReference(activity));
        this.A05 = r15;
        this.A0B = r21;
        this.A0E = z3;
        this.A0C = r28;
    }

    public final Dialog A01(int i2, int i3) {
        C32241fu r3 = new C32241fu(this.A01);
        r3.A01(i3);
        r3.A07(false);
        r3.setPositiveButton(R.string.str146a, new IDxCListenerShape6S0101000_2_I0(this, i2, 0));
        r3.setNegativeButton(R.string.str0d91, new IDxCListenerShape6S0101000_2_I0(this, i2, 1));
        return r3.create();
    }

    public void A02() {
        int A052 = this.A01.A05();
        StringBuilder sb = new StringBuilder("restore>VerifyMessageStoreHelper/usehistoryifexists/backupfilesfound ");
        sb.append(A052);
        Log.i(sb.toString());
        if (A052 > 0) {
            AnonymousClass29T.A01(this.A01, 103);
        } else {
            A03(false, true);
        }
    }

    public void A03(boolean z2, boolean z3) {
        this.A00 = z2;
        StringBuilder sb = new StringBuilder("restore>VerifyMessageStoreHelper/preparemsgstore isregname=");
        boolean z4 = this.A0F;
        sb.append(z4);
        sb.append(" restorefrombackup=");
        sb.append(z2);
        sb.append(" skipdialog=");
        sb.append(z3 ? "true" : "false");
        Log.i(sb.toString());
        if (!z3) {
            Activity activity = this.A01;
            if (!activity.isFinishing() && (!z4 || this.A00)) {
                AnonymousClass29T.A01(activity, 100);
            }
        }
        if (!this.A05.A0F()) {
            this.A00.A09(0);
        } else {
            A00();
        }
    }
}
