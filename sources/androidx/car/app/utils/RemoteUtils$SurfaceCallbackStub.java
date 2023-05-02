package androidx.car.app.utils;

import X.AnonymousClass000;
import X.AnonymousClass0T5;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y7;
import X.C009704q;
import X.C10200gk;
import X.C10390h3;
import X.C11640j6;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import com.facebook.redex.IDxHCallShape0S0100002_I1;
import com.facebook.redex.IDxHCallShape351S0100000_I1;
import com.facebook.redex.IDxHCallShape76S0200000_I1;

public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    public final C009704q mLifecycle;
    public final C11640j6 mSurfaceCallback;

    public static /* synthetic */ Object $r8$lambda$OZtEIqNp19Tbq1qCTePWz81Lfjw(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, AnonymousClass0Y7 r1) {
        remoteUtils$SurfaceCallbackStub.lambda$onSurfaceDestroyed$3(r1);
        throw AnonymousClass000.A0Z();
    }

    public static /* synthetic */ Object $r8$lambda$R9wGpjT6l2l3YCIS8YoCZAVNEAE(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f2, float f3) {
        throw AnonymousClass000.A0W("onFling");
    }

    public static /* synthetic */ Object $r8$lambda$RGBhsjx_1J8NWgBb4N8Ae6NrbZk(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, AnonymousClass0Y7 r1) {
        remoteUtils$SurfaceCallbackStub.lambda$onSurfaceAvailable$0(r1);
        throw AnonymousClass000.A0Z();
    }

    /* renamed from: $r8$lambda$U-s3aqspNPssoqTo05TqqsVHIzE  reason: not valid java name */
    public static /* synthetic */ Object m5$r8$lambda$Us3aqspNPssoqTo05TqqsVHIzE(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect) {
        remoteUtils$SurfaceCallbackStub.lambda$onVisibleAreaChanged$1(rect);
        throw AnonymousClass000.A0Z();
    }

    public static /* synthetic */ Object $r8$lambda$agkemRv7pRP3C6NQN9BVj2kcidA(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, Rect rect) {
        remoteUtils$SurfaceCallbackStub.lambda$onStableAreaChanged$2(rect);
        throw AnonymousClass000.A0Z();
    }

    public static /* synthetic */ Object $r8$lambda$r4G3KDS1mW6dVVN5X2VGoyvWBMU(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f2, float f3, float f4) {
        throw AnonymousClass000.A0W("onScale");
    }

    /* renamed from: $r8$lambda$yKsu_zMb-h4L5DkmqvskzvGJj-A  reason: not valid java name */
    public static /* synthetic */ Object m6$r8$lambda$yKsu_zMbh4L5DkmqvskzvGJjA(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f2, float f3) {
        throw AnonymousClass000.A0W("onScroll");
    }

    public RemoteUtils$SurfaceCallbackStub(C009704q r1, C11640j6 r2) {
        this.mLifecycle = r1;
        this.mSurfaceCallback = r2;
    }

    private /* synthetic */ Object lambda$onFling$5(float f2, float f3) {
        throw AnonymousClass000.A0W("onFling");
    }

    private /* synthetic */ Object lambda$onScale$6(float f2, float f3, float f4) {
        throw AnonymousClass000.A0W("onScale");
    }

    private /* synthetic */ Object lambda$onScroll$4(float f2, float f3) {
        throw AnonymousClass000.A0W("onScroll");
    }

    private /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        throw AnonymousClass000.A0W("onStableAreaChanged");
    }

    private /* synthetic */ Object lambda$onSurfaceAvailable$0(AnonymousClass0Y7 r2) {
        AnonymousClass0XL.A07(r2.A00);
        throw AnonymousClass000.A0W("onSurfaceAvailable");
    }

    private /* synthetic */ Object lambda$onSurfaceDestroyed$3(AnonymousClass0Y7 r2) {
        AnonymousClass0XL.A07(r2.A00);
        throw AnonymousClass000.A0W("onSurfaceDestroyed");
    }

    private /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw AnonymousClass000.A0W("onVisibleAreaChanged");
    }

    public void onFling(float f2, float f3) {
        AnonymousClass0T5.A00(new C10200gk(new IDxHCallShape0S0100002_I1(this, f2, f3, 0), this.mLifecycle, "onFling"));
    }

    public void onScale(float f2, float f3, float f4) {
        AnonymousClass0T5.A00(new C10200gk(new IDxHCallShape351S0100000_I1(this, 2), this.mLifecycle, "onScale"));
    }

    public void onScroll(float f2, float f3) {
        AnonymousClass0T5.A00(new C10200gk(new IDxHCallShape0S0100002_I1(this, f2, f3, 1), this.mLifecycle, "onScroll"));
    }

    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0T5.A00(new C10390h3(iOnDoneCallback, new IDxHCallShape76S0200000_I1(rect, 1, this), this.mLifecycle, "onStableAreaChanged"));
    }

    public void onSurfaceAvailable(AnonymousClass0Y7 r5, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0T5.A00(new C10390h3(iOnDoneCallback, new IDxHCallShape76S0200000_I1(r5, 3, this), this.mLifecycle, "onSurfaceAvailable"));
    }

    public void onSurfaceDestroyed(AnonymousClass0Y7 r5, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0T5.A00(new C10390h3(iOnDoneCallback, new IDxHCallShape76S0200000_I1(r5, 2, this), this.mLifecycle, "onSurfaceDestroyed"));
    }

    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0T5.A00(new C10390h3(iOnDoneCallback, new IDxHCallShape76S0200000_I1(rect, 0, this), this.mLifecycle, "onVisibleAreaChanged"));
    }
}
