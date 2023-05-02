package X;

import android.view.ViewTreeObserver;
import android.widget.Switch;
import com.obwhatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.4l0  reason: invalid class name and case insensitive filesystem */
public class C94494l0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;
    public final /* synthetic */ boolean A01;

    public C94494l0(ChangeNumberNotifyContacts changeNumberNotifyContacts, boolean z2) {
        this.A00 = changeNumberNotifyContacts;
        this.A01 = z2;
    }

    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        AnonymousClass3K2.A10(changeNumberNotifyContacts.A04, this);
        Switch switchR = changeNumberNotifyContacts.A09;
        boolean z2 = this.A01;
        switchR.setChecked(!z2);
        changeNumberNotifyContacts.A09.setChecked(z2);
        return false;
    }
}
