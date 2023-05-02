package X;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.R;
import com.obwhatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5do  reason: invalid class name and case insensitive filesystem */
public class C110285do extends GestureDetector.SimpleOnGestureListener {
    public Bundle A00;
    public C000900k A01;
    public AnonymousClass01A A02;
    public RootHostView A03;
    public C49852We A04;
    public C26251Mz A05;
    public AnonymousClass22A A06;
    public AnonymousClass68F A07;
    public C1221968q A08;
    public HashMap A09;
    public Map A0A;

    public void A00() {
        C1221968q r1;
        C49852We r2 = this.A04;
        if (r2 != null && (r1 = this.A08) != null) {
            ((BloksDialogFragment) r1).A0B = Boolean.TRUE;
            RootHostView rootHostView = this.A03;
            if (rootHostView != null) {
                r2.A05(rootHostView);
            }
            ((BloksDialogFragment) this.A08).A0B = Boolean.FALSE;
        }
    }

    public void A01(Bundle bundle, C000900k r7, AnonymousClass01A r8, AnonymousClass22A r9, AnonymousClass68F r10, C1221968q r11, String str, HashMap hashMap) {
        this.A01 = r7;
        this.A02 = r8;
        this.A08 = r11;
        this.A07 = r10;
        C119865zk r3 = new C119865zk(this);
        this.A00 = bundle;
        this.A09 = hashMap;
        this.A06 = r9;
        bundle.getBoolean("hot_reload");
        C119855zj r4 = (C119855zj) this.A05;
        AnonymousClass00B.A0C(AnonymousClass000.A0h(str, AnonymousClass000.A0r("BloksPayloadHelperImpl/getBloks/invalid screen name: ")), !AnonymousClass1XI.A0S(str));
        r4.A00.A08(0, R.string.str0c8c);
        r4.A03.Aco(new AnonymousClass66H(r4, r3, str));
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }
}
