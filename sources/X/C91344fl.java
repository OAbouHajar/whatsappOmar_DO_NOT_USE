package X;

import android.content.DialogInterface;
import com.obwhatsapp.conversation.conversationrow.DeviceUpdateDialogFragment;

/* renamed from: X.4fl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91344fl implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceUpdateDialogFragment A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ C15830rv A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C91344fl(DeviceUpdateDialogFragment deviceUpdateDialogFragment, C15830rv r2, C15830rv r3, String str) {
        this.A00 = deviceUpdateDialogFragment;
        this.A03 = str;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = this.A00;
        String str = this.A03;
        C15830rv r2 = this.A01;
        C15830rv r1 = this.A02;
        if (deviceUpdateDialogFragment.A01.A0I(r2)) {
            str = r1.getRawString();
        }
        deviceUpdateDialogFragment.A0r(C14750ph.A0e(deviceUpdateDialogFragment.A0u(), str));
    }
}
