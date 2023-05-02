package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.3bf  reason: invalid class name and case insensitive filesystem */
public class C67473bf extends C54882iQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupAdminPickerActivity A01;

    public C67473bf(GroupAdminPickerActivity groupAdminPickerActivity, int i2) {
        this.A01 = groupAdminPickerActivity;
        this.A00 = i2;
    }

    public void A01(View view, float f2) {
        int i2 = ((int) (f2 * 127.0f)) << 24;
        GroupAdminPickerActivity groupAdminPickerActivity = this.A01;
        groupAdminPickerActivity.A00.setColor(i2);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = groupAdminPickerActivity.getWindow();
            int A03 = AnonymousClass090.A03(1.0f, this.A00, i2);
        }
    }

    public void A02(View view, int i2) {
        if (i2 == 4) {
            AnonymousClass3K4.A0j(this.A01);
        }
    }
}
