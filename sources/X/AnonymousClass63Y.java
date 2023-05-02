package X;

import com.obwhatsapp.dmsetting.ChangeDMSettingActivity;
import java.util.List;

/* renamed from: X.63Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass63Y implements Runnable {
    public final /* synthetic */ ChangeDMSettingActivity A00;

    public /* synthetic */ AnonymousClass63Y(ChangeDMSettingActivity changeDMSettingActivity) {
        this.A00 = changeDMSettingActivity;
    }

    public final void run() {
        ChangeDMSettingActivity changeDMSettingActivity = this.A00;
        int i2 = changeDMSettingActivity.A03;
        if (i2 == -1) {
            i2 = changeDMSettingActivity.A07.A04().intValue();
        }
        changeDMSettingActivity.A08.A01((List) null, 1, i2, 0, changeDMSettingActivity.A00, changeDMSettingActivity.A01);
        AnonymousClass391 r2 = new AnonymousClass391(changeDMSettingActivity);
        r2.A0D = true;
        r2.A0F = true;
        r2.A0R = AnonymousClass000.A0u();
        r2.A0A = true;
        r2.A0I = Integer.valueOf(i2);
        changeDMSettingActivity.startActivityForResult(r2.A00(), 1);
    }
}
