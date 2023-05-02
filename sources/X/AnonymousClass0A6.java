package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.0A6  reason: invalid class name */
public class AnonymousClass0A6 extends SharedElementCallback {
    public final C000700i A00;

    public AnonymousClass0A6(C000700i r1) {
        this.A00 = r1;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        return this.A00.A01(view, matrix, rectF);
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        return C000700i.A00(context, parcelable);
    }

    public void onMapSharedElements(List list, Map map) {
        this.A00.A03(list, map);
    }

    public void onRejectSharedElements(List list) {
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        this.A00.A02(list, list2, list3);
    }

    public void onSharedElementStart(List list, List list2, List list3) {
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        new AnonymousClass0PL(onSharedElementsReadyListener).A00();
    }
}
