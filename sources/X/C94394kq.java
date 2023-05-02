package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.obwhatsapp.R;
import com.obwhatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment;

/* renamed from: X.4kq  reason: invalid class name and case insensitive filesystem */
public class C94394kq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScrollView A01;
    public final /* synthetic */ SMBSoftEnforcementEducationFragment A02;

    public C94394kq(View view, ScrollView scrollView, SMBSoftEnforcementEducationFragment sMBSoftEnforcementEducationFragment) {
        this.A02 = sMBSoftEnforcementEducationFragment;
        this.A01 = scrollView;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        ScrollView scrollView = this.A01;
        int i2 = 0;
        if (C49732Vm.A01(scrollView)) {
            i2 = R.drawable.smb_soft_enforcement_acknowledgement_background;
        }
        this.A00.setBackgroundResource(i2);
        AnonymousClass3K2.A0z(scrollView, this);
    }
}
