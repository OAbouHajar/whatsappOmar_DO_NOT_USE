package X;

import com.obwhatsapp.greenalert.GreenAlertActivity;

/* renamed from: X.3TJ  reason: invalid class name */
public class AnonymousClass3TJ extends C015907p {
    public final /* synthetic */ GreenAlertActivity A00;

    public AnonymousClass3TJ(GreenAlertActivity greenAlertActivity) {
        this.A00 = greenAlertActivity;
    }

    public void AUP(int i2) {
        int i3;
        GreenAlertActivity greenAlertActivity = this.A00;
        int currentLogicalItem = greenAlertActivity.A06.getCurrentLogicalItem();
        AnonymousClass13G r2 = greenAlertActivity.A0B;
        if (currentLogicalItem == 1) {
            i3 = 7;
            if (AnonymousClass2E5.A02(greenAlertActivity.A0C)) {
                i3 = 3;
            }
        } else {
            i3 = 11;
        }
        r2.A01(Integer.valueOf(i3));
        greenAlertActivity.A37(currentLogicalItem);
        greenAlertActivity.A38(currentLogicalItem);
    }
}
