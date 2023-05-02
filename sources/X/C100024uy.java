package X;

import com.obwhatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.4uy  reason: invalid class name and case insensitive filesystem */
public class C100024uy implements C18950xW {
    public boolean A00;
    public final /* synthetic */ SpamWarningActivity A01;

    public C100024uy(SpamWarningActivity spamWarningActivity) {
        this.A01 = spamWarningActivity;
    }

    public /* synthetic */ void ARy() {
    }

    public void ARz() {
        if (!this.A00) {
            SpamWarningActivity spamWarningActivity = this.A01;
            spamWarningActivity.startActivity(C14750ph.A02(spamWarningActivity));
            spamWarningActivity.finish();
        }
        this.A00 = true;
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }
}
