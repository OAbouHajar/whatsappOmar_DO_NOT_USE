package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.5FG  reason: invalid class name */
public final class AnonymousClass5FG extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ C73173nQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FG(C73173nQ r2) {
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
