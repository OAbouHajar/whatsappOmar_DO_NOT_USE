package X;

import android.content.SharedPreferences;

/* renamed from: X.2h6  reason: invalid class name and case insensitive filesystem */
public class C54262h6 {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final C15860rz A04;
    public final AnonymousClass1B0 A05;
    public final C30201bw A06;

    public C54262h6(C15860rz r1, AnonymousClass1B0 r2, C30201bw r3) {
        this.A05 = r2;
        this.A04 = r1;
        this.A06 = r3;
    }

    public void A00() {
        SharedPreferences.Editor A0K;
        SharedPreferences sharedPreferences;
        String str;
        C15830rv r3 = this.A06.A00.A0J;
        long j2 = this.A00 + 1;
        this.A00 = j2;
        if (r3 != null && j2 == 1) {
            if (C16030sJ.A0G(r3)) {
                C15860rz r0 = this.A04;
                A0K = r0.A0K();
                sharedPreferences = (SharedPreferences) r0.A01.get();
                str = "ptt_pause_tap_broadcast";
            } else {
                boolean A0L = C16030sJ.A0L(r3);
                C15860rz r02 = this.A04;
                A0K = r02.A0K();
                sharedPreferences = (SharedPreferences) r02.A01.get();
                str = A0L ? "ptt_pause_tap_group" : "ptt_pause_tap_individual";
            }
            A0K.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
    }

    public void A01(long j2, long j3, boolean z2) {
        SharedPreferences.Editor A0K;
        SharedPreferences sharedPreferences;
        String str;
        this.A05.A00(2, j2, j3, this.A01, this.A02, this.A00, z2, this.A03);
        C15830rv r1 = this.A06.A00.A0J;
        if (r1 != null) {
            if (C16030sJ.A0G(r1)) {
                C15860rz r0 = this.A04;
                A0K = r0.A0K();
                sharedPreferences = (SharedPreferences) r0.A01.get();
                str = "ptt_cancel_broadcast";
            } else {
                boolean A0L = C16030sJ.A0L(r1);
                C15860rz r02 = this.A04;
                A0K = r02.A0K();
                sharedPreferences = (SharedPreferences) r02.A01.get();
                str = A0L ? "ptt_cancel_group" : "ptt_cancel_individual";
            }
            A0K.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
    }

    public void A02(long j2, long j3, boolean z2) {
        SharedPreferences.Editor A0K;
        SharedPreferences sharedPreferences;
        String str;
        C15830rv r1 = this.A06.A00.A0J;
        this.A05.A00(1, j2, j3, this.A01, this.A02, this.A00, z2, this.A03);
        if (r1 != null) {
            if (C16030sJ.A0G(r1)) {
                C15860rz r0 = this.A04;
                A0K = r0.A0K();
                sharedPreferences = (SharedPreferences) r0.A01.get();
                str = "ptt_send_broadcast";
            } else {
                boolean A0L = C16030sJ.A0L(r1);
                C15860rz r02 = this.A04;
                A0K = r02.A0K();
                sharedPreferences = (SharedPreferences) r02.A01.get();
                str = A0L ? "ptt_send_group" : "ptt_send_individual";
            }
            A0K.putLong(str, sharedPreferences.getLong(str, 0) + 1).apply();
        }
    }
}
