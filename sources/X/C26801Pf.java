package X;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.whatsapp.voipcalling.VideoPort;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Pf  reason: invalid class name and case insensitive filesystem */
public class C26801Pf {
    public final C16040sK A00;
    public final C15860rz A01;
    public final C14710pd A02;
    public final Set A03 = new HashSet();

    public C26801Pf(C16040sK r2, C15860rz r3, C14710pd r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public VideoPort A00(View view, boolean z2) {
        VideoPort r1;
        boolean A0M = C30341cC.A0M(this.A01, this.A02);
        if (view instanceof SurfaceView) {
            r1 = new C73013n8((SurfaceView) view, z2, A0M);
        } else if (view instanceof TextureView) {
            r1 = new C73003n7((TextureView) view, z2, A0M);
        } else {
            throw new IllegalArgumentException("createVideoPort must be called with either SurfaceView or TextureView");
        }
        if (A0M) {
            this.A03.add(r1);
        }
        return r1;
    }

    public void A01() {
        Set<VideoPort> set = this.A03;
        for (VideoPort videoPort : set) {
            if (videoPort != null) {
                videoPort.release();
            }
        }
        set.clear();
    }
}
