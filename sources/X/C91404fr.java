package X;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: X.4fr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91404fr implements DialogInterface.OnClickListener {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ AnonymousClass5SB A01;
    public final /* synthetic */ C25721Kw A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C91404fr(CheckBox checkBox, AnonymousClass5SB r2, C25721Kw r3, boolean z2, boolean z3) {
        this.A02 = r3;
        this.A00 = checkBox;
        this.A01 = r2;
        this.A03 = z2;
        this.A04 = z3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C25721Kw r4 = this.A02;
        CheckBox checkBox = this.A00;
        AnonymousClass5SB r3 = this.A01;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        boolean isChecked = checkBox.isChecked();
        r3.AUz(isChecked);
        if (z2 && z3 != isChecked) {
            C13680ns.A0z(r4.A02.A0K(), "pref_media_delete_per_conversation", isChecked);
        }
    }
}
