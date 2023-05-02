package X;

import com.obwhatsapp.camera.CameraActivity;

/* renamed from: X.4wr  reason: invalid class name and case insensitive filesystem */
public class C101184wr implements C51952cZ {
    public final /* synthetic */ CameraActivity A00;

    public C101184wr(CameraActivity cameraActivity) {
        this.A00 = cameraActivity;
    }

    public int AE4() {
        return this.A00.getIntent().getIntExtra("camera_origin", 8);
    }

    public void ANy() {
        this.A00.finish();
    }

    public void AWx() {
        C13690nt.A0q(this.A00);
    }
}
