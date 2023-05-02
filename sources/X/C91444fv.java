package X;

import android.content.DialogInterface;
import android.widget.CheckBox;

/* renamed from: X.4fv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91444fv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ AnonymousClass5SC A03;
    public final /* synthetic */ C25721Kw A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C91444fv(CheckBox checkBox, CheckBox checkBox2, AnonymousClass5SC r3, C25721Kw r4, int i2, boolean z2) {
        this.A04 = r4;
        this.A01 = checkBox;
        this.A03 = r3;
        this.A02 = checkBox2;
        this.A00 = i2;
        this.A05 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C25721Kw r5 = this.A04;
        CheckBox checkBox = this.A01;
        AnonymousClass5SC r4 = this.A03;
        CheckBox checkBox2 = this.A02;
        int i3 = this.A00;
        boolean z2 = this.A05;
        boolean isChecked = checkBox.isChecked();
        r4.AV0(!checkBox2.isChecked(), isChecked);
        if (i3 == 2 && z2 != isChecked) {
            C13680ns.A0z(r5.A02.A0K(), "pref_media_delete_per_conversation", isChecked);
        }
    }
}
