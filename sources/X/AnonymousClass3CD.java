package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.3CD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CD implements DialogInterface.OnKeyListener {
    public final /* synthetic */ VoipCallControlBottomSheetV2 A00;

    public /* synthetic */ AnonymousClass3CD(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        this.A00 = voipCallControlBottomSheetV2;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        C001000l A0C;
        AnonymousClass2Tr r0;
        CallInfo A3B;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A00;
        if (i2 == 4 && keyEvent.getAction() == 1) {
            AnonymousClass2PE r02 = voipCallControlBottomSheetV2.A0Z;
            if (r02 != null && (A3B = r02.A00.A3B()) != null && (Voip.A09(A3B.callState) || voipCallControlBottomSheetV2.A0J.A01)) {
                voipCallControlBottomSheetV2.A1Q(1);
                return true;
            } else if ((voipCallControlBottomSheetV2.A1T() || ((r0 = voipCallControlBottomSheetV2.A0H) != null && !r0.A08())) && (A0C = voipCallControlBottomSheetV2.A0C()) != null) {
                A0C.onBackPressed();
                return true;
            } else {
                voipCallControlBottomSheetV2.A1N();
                return true;
            }
        } else {
            C001000l A0C2 = voipCallControlBottomSheetV2.A0C();
            if (A0C2 == null || !(A0C2 instanceof C000900k)) {
                return false;
            }
            return ((C000900k) A0C2).dispatchKeyEvent(keyEvent);
        }
    }
}
