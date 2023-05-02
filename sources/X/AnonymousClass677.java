package X;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.677  reason: invalid class name */
public class AnonymousClass677 implements Callable {
    public final /* synthetic */ AnonymousClass5zD A00;
    public final /* synthetic */ C110215dh A01;
    public final /* synthetic */ String A02;

    public AnonymousClass677(AnonymousClass5zD r1, C110215dh r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        CameraManager A012 = this.A00.A0N;
        String str = this.A02;
        C110215dh r1 = this.A01;
        A012.openCamera(str, r1, (Handler) null);
        return r1;
    }
}
