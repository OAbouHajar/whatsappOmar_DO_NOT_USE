package X;

import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.19y  reason: invalid class name and case insensitive filesystem */
public class C229619y implements C18950xW {
    public final C16300so A00;
    public final C16600tK A01;
    public final AnonymousClass1CQ A02;
    public final C15860rz A03;
    public final C14710pd A04;
    public final C17190ug A05;
    public final AtomicReference A06 = new AtomicReference();

    public C229619y(C16300so r2, C16600tK r3, AnonymousClass1CQ r4, C15860rz r5, C14710pd r6, C17190ug r7) {
        this.A04 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public void A00(String str) {
        if (!this.A01.A08()) {
            this.A06.set(str);
            return;
        }
        C17190ug r2 = this.A05;
        String A022 = r2.A02();
        try {
            C51392bb r0 = new C51392bb(new AnonymousClass2BJ(A022), str);
            r2.A0A(new C51402bc(this, r0, str), r0.A00, A022, 314, 32000);
        } catch (IllegalArgumentException unused) {
            Log.e("ClientAuthTokenManager/failed to create request for auth_token");
        }
    }

    public void ARy() {
        String str = (String) this.A06.getAndSet((Object) null);
        if (str != null) {
            A00(str);
        }
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }
}
