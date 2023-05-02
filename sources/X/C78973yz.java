package X;

import android.graphics.Bitmap;
import com.whatsapp.filter.FilterUtils;

/* renamed from: X.3yz  reason: invalid class name and case insensitive filesystem */
public class C78973yz extends C16690tT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C30141bo A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ Runnable A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78973yz(Bitmap bitmap, C001300o r3, C30141bo r4, Runnable runnable, Runnable runnable2, int i2) {
        super(r3, true);
        this.A02 = r4;
        this.A01 = bitmap;
        this.A00 = i2;
        this.A04 = runnable;
        this.A03 = runnable2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C30141bo r5 = this.A02;
        Bitmap bitmap = r5.A04;
        if (bitmap != null) {
            Bitmap bitmap2 = this.A01;
            if (bitmap2 == null || bitmap2 == bitmap || bitmap2.getHeight() != r5.A04.getHeight() || bitmap2.getWidth() != r5.A04.getWidth()) {
                return FilterUtils.A00(r5.A04, r5.A0U, this.A00, true);
            }
            if (FilterUtils.A02(r5.A04, bitmap2, r5.A0U, this.A00)) {
                return bitmap2;
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C30141bo r3 = this.A02;
            r3.A03 = bitmap;
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            r3.A01 = this.A00;
            r3.A0V.A00();
            r3.A0R.A03(r3.A0Y, r3.A03);
            return;
        }
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null) {
            C30141bo r32 = this.A02;
            r32.A03 = bitmap2;
            r32.A0V.A00();
            r32.A0R.A03(r32.A0Y, r32.A03);
        }
        this.A03.run();
    }
}
