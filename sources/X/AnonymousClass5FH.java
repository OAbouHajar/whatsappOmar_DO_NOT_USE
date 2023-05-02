package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.5FH  reason: invalid class name */
public final class AnonymousClass5FH extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ C73193nS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FH(C73193nS r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C18450wi.A0H(bitmap, 0);
        ((ImageView) this.this$0.A01.getValue()).setImageBitmap(bitmap);
        return AnonymousClass22M.A00;
    }
}
