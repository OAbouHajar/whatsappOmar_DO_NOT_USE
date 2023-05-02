package X;

import android.hardware.Camera;
import android.view.View;

/* renamed from: X.5yn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119635yn implements View.OnClickListener {
    public final /* synthetic */ Camera.PictureCallback A00;
    public final /* synthetic */ AnonymousClass4HD A01;
    public final /* synthetic */ C119915zp A02;
    public final /* synthetic */ C119925zq A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C119635yn(Camera.PictureCallback pictureCallback, AnonymousClass4HD r2, C119915zp r3, C119925zq r4, String str) {
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = pictureCallback;
    }

    public final void onClick(View view) {
        C119925zq r6 = this.A03;
        String str = this.A04;
        AnonymousClass4HD r4 = this.A01;
        C119915zp r3 = this.A02;
        Camera.PictureCallback pictureCallback = this.A00;
        if (!r6.A00) {
            r6.A00 = true;
            int hashCode = str.hashCode();
            if (hashCode == 100313435 || hashCode != 112202875 || !str.equals("video")) {
                r3.A03.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, pictureCallback);
                return;
            }
            C111585h1 r1 = r3.A06;
            AnonymousClass00B.A04(r1);
            C119925zq.A00(r1, r4, r3, r6.A02);
        }
    }
}
