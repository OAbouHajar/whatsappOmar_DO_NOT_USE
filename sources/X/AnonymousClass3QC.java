package X;

import com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.3QC  reason: invalid class name */
public class AnonymousClass3QC extends C014206u {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity A00;

    public AnonymousClass3QC(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        this.A00 = inviteNonWhatsAppContactPickerActivity;
    }

    public C003401n A6s(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass2AY.class)) {
            InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.A00;
            return new AnonymousClass2AY(inviteNonWhatsAppContactPickerActivity.getApplication(), inviteNonWhatsAppContactPickerActivity.A0D, inviteNonWhatsAppContactPickerActivity.A0F, inviteNonWhatsAppContactPickerActivity.A0L, inviteNonWhatsAppContactPickerActivity.A0M);
        }
        throw AnonymousClass000.A0T("Invalid viewModel");
    }
}
