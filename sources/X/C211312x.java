package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.12x  reason: invalid class name and case insensitive filesystem */
public class C211312x {
    public C38631rA A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C17150uc A05;
    public final C16000sG A06;
    public final C16080sP A07;
    public final C18180wH A08;
    public final AnonymousClass12W A09;
    public final C16440t3 A0A;
    public final C16980tz A0B;
    public final C19380yL A0C;
    public final C15860rz A0D;
    public final AnonymousClass013 A0E;
    public final C14730pf A0F;
    public final AnonymousClass1GG A0G;
    public final C16460t6 A0H;
    public final C19150xq A0I;
    public final AnonymousClass173 A0J;
    public final C14710pd A0K;
    public final C16490t9 A0L;
    public final C18230wM A0M;
    public final C209212c A0N;
    public final C18290wS A0O;
    public final AnonymousClass1GF A0P;
    public final C222617g A0Q;

    public C211312x(C16300so r2, C16180sb r3, C14870pt r4, C16040sK r5, C17150uc r6, C16000sG r7, C16080sP r8, C18180wH r9, AnonymousClass12W r10, C16440t3 r11, C16980tz r12, C19380yL r13, C15860rz r14, AnonymousClass013 r15, C14730pf r16, AnonymousClass1GG r17, C16460t6 r18, C19150xq r19, AnonymousClass173 r20, C14710pd r21, C16490t9 r22, C18230wM r23, C209212c r24, C18290wS r25, AnonymousClass1GF r26, C222617g r27) {
        this.A0B = r12;
        this.A0A = r11;
        this.A0K = r21;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A0L = r22;
        this.A0F = r16;
        this.A06 = r7;
        this.A07 = r8;
        this.A0E = r15;
        this.A0Q = r27;
        this.A0O = r25;
        this.A0H = r18;
        this.A0I = r19;
        this.A09 = r10;
        this.A0P = r26;
        this.A0M = r23;
        this.A0D = r14;
        this.A0N = r24;
        this.A0C = r13;
        this.A08 = r9;
        this.A05 = r6;
        this.A0J = r20;
        this.A0G = r17;
    }

    public static C38631rA A00(C16300so r27, C16040sK r28, C17150uc r29, C16000sG r30, C18180wH r31, C16980tz r32, AnonymousClass013 r33, AnonymousClass1GG r34, AnonymousClass173 r35, C14710pd r36, C18290wS r37, AnonymousClass1GF r38, C222617g r39, byte[] bArr) {
        try {
            C33211iD A0U = C33211iD.A0U(bArr);
            if (A0U != null) {
                C14710pd r14 = r36;
                return (C38631rA) C41061vA.A05(r27, r28, r29, r30, r31, r32, r33, r34, r35, r14, (C15830rv) null, r37, r38, C41061vA.A01(r14, A0U), A0U, new C28381Vw(C34931l6.A00, "", false), r39, 0, false, false, false);
            }
            Log.e("gdpr/create-gdpr-message/null");
            return null;
        } catch (C29791bD | AnonymousClass23S e2) {
            Log.e("gdpr/create-gdpr-message", e2);
            return null;
        }
    }

    public synchronized int A01() {
        return ((SharedPreferences) this.A0D.A01.get()).getInt("gdpr_report_state", 0);
    }

    public synchronized long A02() {
        return this.A0D.A0J("gdpr_report_timestamp");
    }

    public C38631rA A03() {
        if (this.A00 == null) {
            C16980tz r5 = this.A0B;
            byte[] A0H2 = C004101u.A0H(new File(r5.A00.getFilesDir(), "gdpr.info"));
            if (A0H2 != null) {
                C14710pd r9 = this.A0K;
                C16300so r0 = this.A01;
                C16000sG r3 = this.A06;
                AnonymousClass013 r6 = this.A0E;
                AnonymousClass1GF r11 = this.A0P;
                C17150uc r2 = this.A05;
                C16040sK r1 = this.A04;
                C222617g r12 = this.A0Q;
                C18290wS r10 = this.A0O;
                AnonymousClass173 r8 = this.A0J;
                this.A00 = A00(r0, r1, r2, r3, this.A08, r5, r6, this.A0G, r8, r9, r10, r11, r12, A0H2);
            }
        }
        return this.A00;
    }

    public synchronized void A04() {
        Log.i("gdpr/on-report-deleted");
        A05();
    }

    public synchronized void A05() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File file = new File(this.A0B.A00.getFilesDir(), "gdpr.info");
        if (file.exists() && !file.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        AnonymousClass1XI.A0E(this.A02.A09(), 0);
        this.A0D.A0a();
    }

    public synchronized void A06(byte[] bArr, long j2, long j3) {
        synchronized (this) {
            Log.i("gdpr/on-report-available");
            try {
                C16980tz r8 = this.A0B;
                byte[] bArr2 = bArr;
                C004101u.A09(new File(r8.A00.getFilesDir(), "gdpr.info"), bArr2);
                C14710pd r12 = this.A0K;
                C16300so r3 = this.A01;
                C16000sG r6 = this.A06;
                AnonymousClass013 r9 = this.A0E;
                AnonymousClass1GF r14 = this.A0P;
                C17150uc r5 = this.A05;
                C16040sK r4 = this.A04;
                C222617g r0 = this.A0Q;
                C18290wS r13 = this.A0O;
                AnonymousClass173 r11 = this.A0J;
                C38631rA A002 = A00(r3, r4, r5, r6, this.A08, r8, r9, this.A0G, r11, r12, r13, r14, r0, bArr2);
                this.A00 = A002;
                if (A002 == null) {
                    Log.e("gdpr/on-report-available/cannot-create-message");
                } else {
                    C15860rz r1 = this.A0D;
                    r1.A0h(2);
                    r1.A14("gdpr_report_timestamp", j2);
                    r1.A0K().putLong("gdpr_report_expiration_timestamp", j3).apply();
                }
            } catch (IOException e2) {
                Log.e("gdpr/on-report-available/cannot-save", e2);
            }
        }
        return;
    }
}
