package X;

import android.content.SharedPreferences;

/* renamed from: X.273  reason: invalid class name */
public class AnonymousClass273 {
    public int A00 = 0;
    public boolean A01;
    public final C15860rz A02;
    public final /* synthetic */ AnonymousClass134 A03;

    public AnonymousClass273(C15860rz r2, AnonymousClass134 r3, int i2, boolean z2) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = z2;
        this.A00 = i2;
    }

    public synchronized void A00(int i2) {
        SharedPreferences.Editor editor;
        int i3 = this.A00 - 1;
        this.A00 = i3;
        if (this.A01 && i3 == 0) {
            this.A03.A08.A04("account_sync", (Long) null);
        }
        if (i2 == 1) {
            editor = this.A02.A0K().remove("account_sync_status_num_retries");
        } else if (i2 == 2) {
            editor = this.A02.A0K().remove("account_sync_picture_num_retries");
        } else if (i2 == 3) {
            editor = this.A02.A0K().remove("account_sync_privacy_num_retries");
        } else if (i2 == 4) {
            editor = this.A02.A0K().remove("account_sync_blocklist_num_retries");
        }
        editor.apply();
    }
}
