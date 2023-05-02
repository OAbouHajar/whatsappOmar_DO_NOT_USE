package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;

/* renamed from: X.1RJ  reason: invalid class name */
public class AnonymousClass1RJ implements C18950xW, C19170xs {
    public final C16040sK A00;
    public final C15480r5 A01;
    public final C16000sG A02;
    public final AnonymousClass16U A03;
    public final C15800rs A04;
    public final C16440t3 A05;
    public final C15860rz A06;
    public final C16070sO A07;
    public final C16900tq A08;
    public final AnonymousClass162 A09;
    public final C19810z2 A0A;
    public final C14710pd A0B;
    public final C16320sq A0C;

    public AnonymousClass1RJ(C16040sK r1, C15480r5 r2, C16000sG r3, AnonymousClass16U r4, C15800rs r5, C16440t3 r6, C15860rz r7, C16070sO r8, C16900tq r9, AnonymousClass162 r10, C19810z2 r11, C14710pd r12, C16320sq r13) {
        this.A05 = r6;
        this.A0B = r12;
        this.A00 = r1;
        this.A0C = r13;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = r2;
    }

    public final boolean A00(C37401p6 r11, long j2) {
        long j3 = r11.A04;
        if (j2 - j3 < ((long) Math.min(35, Math.max(this.A0B.A03(C16620tM.A02, 730), 1))) * 86400) {
            return r11.A01 > j3 && r11.A03 != ((SharedPreferences) this.A06.A01.get()).getLong("adv_last_device_job_ts", 0) && (j2 * 1000) - r11.A02 >= 90000000;
        }
        return true;
    }

    public /* synthetic */ void ARy() {
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public void AS1() {
        AS4();
    }

    public void AS4() {
        C16040sK r0 = this.A00;
        r0.A0B();
        if (r0.A05 != null) {
            this.A0C.Acm(new RunnableRunnableShape8S0100000_I0_7(this, 48), "DeviceADVInfoChecker/checkDeviceListADVInfo");
        }
    }
}
