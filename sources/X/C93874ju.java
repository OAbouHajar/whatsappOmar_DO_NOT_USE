package X;

import android.view.MenuItem;
import com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.4ju  reason: invalid class name and case insensitive filesystem */
public class C93874ju implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ AnonymousClass2AX A00;
    public final /* synthetic */ AnonymousClass267 A01;

    public C93874ju(AnonymousClass2AX r1, AnonymousClass267 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        ((InviteNonWhatsAppContactPickerActivity) this.A00).A0K.A05((String) null);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
