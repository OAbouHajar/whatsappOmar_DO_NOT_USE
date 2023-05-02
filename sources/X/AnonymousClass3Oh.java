package X;

import com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity;

/* renamed from: X.3Oh  reason: invalid class name */
public class AnonymousClass3Oh extends AnonymousClass068 {
    public final /* synthetic */ DeviceTransferActivity A00;
    public final /* synthetic */ AnonymousClass4PB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Oh(DeviceTransferActivity deviceTransferActivity, AnonymousClass4PB r3) {
        super(true);
        this.A00 = deviceTransferActivity;
        this.A01 = r3;
    }

    public void A00() {
        AnonymousClass5Q0 r0 = this.A01.A0C;
        if (r0 != null) {
            r0.Ah3();
        } else {
            this.A00.onBackPressed();
        }
    }
}
