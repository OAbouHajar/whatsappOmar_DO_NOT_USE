package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.0yR  reason: invalid class name and case insensitive filesystem */
public class C19440yR {
    public final AnonymousClass1CG A00;
    public final AnonymousClass12E A01;
    public final C16300so A02;
    public final C14870pt A03;
    public final C19300yD A04;
    public final C16040sK A05;
    public final C18020w1 A06;
    public final C211512z A07;
    public final AnonymousClass1HD A08;
    public final AnonymousClass1H7 A09;
    public final C16600tK A0A;
    public final C18800xH A0B;
    public final C17150uc A0C;
    public final C19680yp A0D;
    public final C15480r5 A0E;
    public final C17030uP A0F;
    public final C15800rs A0G;
    public final AnonymousClass11R A0H;
    public final AnonymousClass1H9 A0I;
    public final C16440t3 A0J;
    public final C16980tz A0K;
    public final C19380yL A0L;
    public final C15860rz A0M;
    public final C16290sm A0N;
    public final C16460t6 A0O;
    public final C16900tq A0P;
    public final C221116r A0Q;
    public final AnonymousClass16V A0R;
    public final AnonymousClass15G A0S;
    public final C14710pd A0T;
    public final C16490t9 A0U;
    public final AnonymousClass1HA A0V;
    public final C19470yU A0W;
    public final AnonymousClass1HE A0X;
    public final AnonymousClass1H3 A0Y;
    public final C222717h A0Z;
    public final C17190ug A0a;
    public final C19090xk A0b;
    public final C46032Cb A0c;
    public final AnonymousClass124 A0d;
    public final C18500wn A0e;
    public final C14770pj A0f;
    public final AnonymousClass13O A0g;
    public final C19210xw A0h;
    public final C14850pr A0i;
    public final AnonymousClass125 A0j;
    public final AnonymousClass1HC A0k;
    public final AnonymousClass1HB A0l;
    public final AnonymousClass134 A0m;
    public final C229319v A0n;
    public final C18990xa A0o;
    public final C19760yx A0p;
    public final C19040xf A0q;
    public final AnonymousClass116 A0r;
    public final C226918x A0s;
    public final AnonymousClass135 A0t;
    public final C19770yy A0u;
    public final C17770vc A0v;
    public final C28921Zf A0w = new C28921Zf(true);
    public final C16320sq A0x;
    public final C18980xZ A0y;

    public C19440yR(AnonymousClass1CG r14, AnonymousClass12E r15, C16300so r16, C14870pt r17, AnonymousClass1H8 r18, C19300yD r19, C16040sK r20, C18020w1 r21, C211512z r22, AnonymousClass1HD r23, AnonymousClass1H7 r24, C16600tK r25, C19010xc r26, C18800xH r27, C17150uc r28, C19280yB r29, AnonymousClass127 r30, C19680yp r31, C15480r5 r32, C17030uP r33, C19230xz r34, C15800rs r35, AnonymousClass11R r36, AnonymousClass1H9 r37, C16440t3 r38, C16980tz r39, C19380yL r40, C15860rz r41, C16290sm r42, C216114t r43, C16460t6 r44, C16900tq r45, C221116r r46, AnonymousClass16V r47, AnonymousClass15G r48, C14710pd r49, C16490t9 r50, AnonymousClass1HA r51, C19470yU r52, AnonymousClass1HE r53, AnonymousClass1H3 r54, C222717h r55, C17190ug r56, C19090xk r57, AnonymousClass124 r58, C18500wn r59, C207811o r60, C14770pj r61, AnonymousClass13O r62, C19210xw r63, C14850pr r64, AnonymousClass125 r65, AnonymousClass1HC r66, AnonymousClass1HB r67, AnonymousClass134 r68, C229319v r69, C18990xa r70, C19760yx r71, C19040xf r72, AnonymousClass116 r73, C226918x r74, AnonymousClass135 r75, C19770yy r76, C17770vc r77, C16320sq r78, C18980xZ r79) {
        this.A0K = r39;
        this.A0J = r38;
        this.A0T = r49;
        C14870pt r2 = r17;
        this.A03 = r2;
        C16300so r1 = r16;
        this.A02 = r1;
        this.A05 = r20;
        this.A0x = r78;
        this.A0u = r76;
        this.A0U = r50;
        AnonymousClass124 r10 = r58;
        this.A0d = r10;
        this.A0y = r79;
        this.A00 = r14;
        this.A0o = r70;
        this.A0a = r56;
        this.A0q = r72;
        this.A06 = r21;
        C19090xk r9 = r57;
        this.A0b = r9;
        this.A09 = r24;
        this.A0n = r69;
        this.A0i = r64;
        AnonymousClass125 r12 = r65;
        this.A0j = r12;
        this.A0O = r44;
        this.A0v = r77;
        this.A0r = r73;
        this.A0Z = r55;
        this.A07 = r22;
        this.A0A = r25;
        this.A0B = r27;
        this.A0h = r63;
        this.A0I = r37;
        this.A0m = r68;
        this.A0V = r51;
        this.A04 = r19;
        this.A0S = r48;
        this.A0f = r61;
        this.A0P = r45;
        this.A0l = r67;
        this.A0k = r66;
        this.A0p = r71;
        this.A0s = r74;
        this.A0t = r75;
        this.A0F = r33;
        this.A0M = r41;
        this.A0e = r59;
        this.A0G = r35;
        this.A0R = r47;
        this.A08 = r23;
        this.A0L = r40;
        this.A0C = r28;
        this.A0W = r52;
        this.A0Q = r46;
        this.A0X = r53;
        this.A0Y = r54;
        this.A0N = r42;
        this.A0E = r32;
        this.A0H = r36;
        this.A0D = r31;
        this.A01 = r15;
        this.A0g = r62;
        this.A0c = new C46032Cb(r1, r2, r18, r26, r29, r30, r34, r43, r9, r10, r60, r12);
    }

    public void A00() {
        C16600tK r3 = this.A0A;
        boolean z2 = false;
        if (r3.A03 == 2) {
            z2 = true;
        }
        r3.A03 = 3;
        r3.A04 = false;
        r3.A02.close();
        AnonymousClass00B.A01();
        for (C18950xW AS0 : r3.A01()) {
            AS0.AS0();
        }
        AnonymousClass1HC r6 = this.A0k;
        r6.A00 = false;
        C229319v r2 = this.A0n;
        r2.A01 = false;
        r2.A00 = 0;
        Log.i("server disconnected");
        C15860rz r32 = this.A0M;
        if (((SharedPreferences) r32.A01.get()).getBoolean("spam_banned", false)) {
            Context context = this.A0K.A00;
            long A0J2 = r32.A0J("spam_banned_expiry_timestamp");
            long j2 = -1;
            if (A0J2 != -1) {
                A0J2 = (A0J2 - System.currentTimeMillis()) / 1000;
            }
            if (A0J2 > 0) {
                j2 = A0J2;
            }
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.spamwarning.SpamWarningActivity");
            intent.putExtra("expiry_in_seconds", (int) j2);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                intent.putExtra("spam_warning_message_key", (String) null);
            }
            if (!TextUtils.isEmpty((CharSequence) null)) {
                intent.putExtra("faq_url_key", (String) null);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        C19040xf r22 = this.A0q;
        r22.A02 = false;
        Log.i("routeselector/cancelrouterequesttimer");
        r22.A04.removeMessages(0);
        this.A0I.A00();
        this.A0j.A03();
        if (z2) {
            C17770vc r1 = this.A0v;
            r1.A00.A00();
            r1.A01.A00();
            r1.A02.A00();
        }
        int i2 = this.A0i.A00;
        if (i2 == 2) {
            C19210xw r23 = this.A0h;
            r23.A04.A00();
            StringBuilder sb = new StringBuilder("presencestatemanager/setUnavailable previous-state: ");
            C14850pr r12 = r23.A05;
            sb.append(r12);
            Log.i(sb.toString());
            r12.A00 = 3;
        } else if (i2 == 1 && z2) {
            long j3 = this.A0b.A03;
            if (j3 <= 0 || SystemClock.elapsedRealtime() >= j3) {
                r6.A00();
            }
        }
    }

    public void A01() {
        Log.i("message-handler-callback/ready");
        if (((SharedPreferences) this.A0M.A01.get()).getBoolean("refresh_broadcast_lists", false)) {
            this.A0e.A00();
        }
    }

    public final void A02() {
        C14600pS r2 = this.A03.A00;
        if (r2 == null || !C46052Cd.A03(r2, this.A0b, this.A0f)) {
            StringBuilder sb = new StringBuilder("message-handler-callback/handlerconnected/displaysoftwareexpired/notification ");
            sb.append(new Date());
            sb.append(" ");
            sb.append(System.currentTimeMillis());
            Log.w(sb.toString());
            Context context = this.A0K.A00;
            C33881jL.A01(context, this.A0L, context.getString(R.string.str0894, new Object[]{context.getString(R.string.str1cf7)}), context.getString(R.string.str1660, new Object[]{context.getString(R.string.str1cf7)}), 2);
            this.A0f.A03 = true;
        }
    }
}
