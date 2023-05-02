package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.5Ft  reason: invalid class name and case insensitive filesystem */
public final class C106935Ft extends AnonymousClass1DR implements AnonymousClass1UJ {
    public final /* synthetic */ C84774Lv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106935Ft(C84774Lv r2) {
        super(2);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String str = (String) obj2;
        AnonymousClass3K2.A1H(imageView, str);
        AnonymousClass1PY r3 = this.this$0.A03;
        Drawable A02 = AnonymousClass2SR.A02(imageView.getContext(), R.drawable.ic_business_category, R.color.color04d2);
        C18450wi.A0B(A02);
        r3.A00.A00((Drawable) null, A02, imageView, (C109485Sh) null, str);
        return AnonymousClass22M.A00;
    }
}
