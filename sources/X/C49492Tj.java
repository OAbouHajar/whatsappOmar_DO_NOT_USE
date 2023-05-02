package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;

/* renamed from: X.2Tj  reason: invalid class name and case insensitive filesystem */
public class C49492Tj implements C440622p {
    public final /* synthetic */ C47252If A00;
    public final /* synthetic */ C209712h A01;

    public C49492Tj(C47252If r1, C209712h r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void ALw() {
    }

    public void AQQ() {
        this.A00.AQQ();
    }

    public void AYu() {
        this.A00.AYu();
    }

    public void onSuccess() {
        C209712h r4 = this.A01;
        C15860rz r3 = r4.A0B.A01;
        r3.A0K().putInt("payment_background_backoff_attempt", 0).apply();
        r3.A0K().remove("payment_backgrounds_backoff_timestamp").apply();
        r3.A0x("payment_backgrounds_last_fetch_timestamp");
        r4.A0D.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 24, this.A00));
    }
}
