package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5hx  reason: invalid class name and case insensitive filesystem */
public class C112105hx extends C114525nu {
    public final int A00;
    public final C118245uN A01;
    public final C1222268t A02;
    public final List A03;

    public C112105hx(C18260wP r7, C18300wT r8, C18310wU r9, C118245uN r10, C1222268t r11, C116325rC r12, AnonymousClass0y5 r13, List list, int i2) {
        super(r7, r8, r9, r12, r13);
        this.A03 = list;
        this.A02 = r11;
        this.A00 = i2;
        this.A01 = r10;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r7 = (AnonymousClass01Q) obj;
        String str = (String) r7.A00;
        AnonymousClass2HJ r4 = (AnonymousClass2HJ) r7.A01;
        C1222268t r3 = this.A02;
        if (r3 != null) {
            if (str == null) {
                Log.i(AnonymousClass1Vo.A01("PinTokenizer", AnonymousClass000.A0f(r4, AnonymousClass000.A0q("PaymentPinTokenTask token error: "))));
                r3.AQW(r4 != null ? r4 : C110115dX.A0N());
            } else {
                r3.AYC(str);
            }
        }
        C118245uN r32 = this.A01;
        if (r32 == null) {
            return;
        }
        if (str == null) {
            Log.i(AnonymousClass1Vo.A01("PinTokenizer", AnonymousClass000.A0f(r4, AnonymousClass000.A0q("PaymentPinTokenTask token error: "))));
            if (r4 == null) {
                r4 = C110115dX.A0N();
            }
            if (r32.A01.compareAndSet(false, true)) {
                r32.A02.decrementAndGet();
                r32.A00.AQW(r4);
                return;
            }
            return;
        }
        r32.A00(this.A00, str);
    }
}
