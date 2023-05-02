package X;

import android.content.SharedPreferences;

/* renamed from: X.1B6  reason: invalid class name */
public class AnonymousClass1B6 implements AnonymousClass1B7 {
    public final C19610yi A00;
    public final C15860rz A01;

    public AnonymousClass1B6(C19610yi r1, C15860rz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(long j2, int i2, boolean z2) {
        SharedPreferences.Editor A0K = this.A01.A0K();
        StringBuilder sb = new StringBuilder("ptt_saved_playback_position_");
        sb.append(j2);
        SharedPreferences.Editor putInt = A0K.putInt(sb.toString(), i2);
        if (z2) {
            putInt.commit();
        } else {
            putInt.apply();
        }
    }

    public int AFH(long j2) {
        StringBuilder sb = new StringBuilder("ptt_saved_playback_position_");
        sb.append(j2);
        return ((SharedPreferences) this.A01.A01.get()).getInt(sb.toString(), -1);
    }

    public void Ac2(long j2) {
        SharedPreferences.Editor A0K = this.A01.A0K();
        StringBuilder sb = new StringBuilder("ptt_saved_playback_position_");
        sb.append(j2);
        A0K.remove(sb.toString()).apply();
    }

    public void Adn() {
        C38701rH r0;
        AnonymousClass2DT A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0O) != null) {
            A00(r0.A13, A002.A03(), false);
        }
    }

    public void Ado() {
        C38701rH r0;
        AnonymousClass2DT A002 = this.A00.A00();
        if (A002 != null && (r0 = A002.A0O) != null) {
            A00(r0.A13, A002.A03(), true);
        }
    }

    public void AeS(long j2, int i2) {
        A00(j2, i2, false);
    }
}
