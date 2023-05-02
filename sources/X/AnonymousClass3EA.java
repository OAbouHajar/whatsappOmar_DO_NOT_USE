package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.3EA  reason: invalid class name */
public final class AnonymousClass3EA implements C15030qD {
    public final AnonymousClass3EC A00;

    public AnonymousClass3EA(AnonymousClass3EC r1) {
        this.A00 = r1;
    }

    public final C438121p AiN(C438121p r1) {
        AiP(r1);
        return r1;
    }

    public final C438121p AiP(C438121p r6) {
        try {
            AnonymousClass3EC r4 = this.A00;
            C57912sB r3 = r4.A05;
            C87954Zi r1 = r3.A0B;
            r1.A01.add(r6);
            r6.zai.set(r1.A00);
            AnonymousClass458 r2 = r6.A00;
            C15750rn r12 = (C15750rn) r3.A0G.get(r2);
            C13710nw.A02(r12, "Appropriate Api was not requested.");
            if (r12.isConnected() || !r4.A0A.containsKey(r2)) {
                r6.A01(r12);
                return r6;
            }
            r6.A02(new Status(17, (String) null));
            return r6;
        } catch (DeadObjectException unused) {
            AnonymousClass3EC r0 = this.A00;
            C65683We r22 = new C65683We(this, this);
            C66313Yw r13 = r0.A06;
            r13.sendMessage(r13.obtainMessage(1, r22));
            return r6;
        }
    }

    public final void AiU() {
    }

    public final void AiX() {
    }

    public final void Aia(Bundle bundle) {
    }

    public final void Aib(C15700rh r1, C437721l r2, boolean z2) {
    }

    public final void Aic(int i2) {
        AnonymousClass3EC r1 = this.A00;
        r1.A00((C15700rh) null);
        r1.A07.AiT(i2, false);
    }

    public final boolean Aid() {
        this.A00.A00((C15700rh) null);
        return true;
    }
}
