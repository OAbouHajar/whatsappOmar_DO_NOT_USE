package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1qs  reason: invalid class name and case insensitive filesystem */
public class C38491qs extends C16690tT {
    public final AnonymousClass1CX A00;
    public final C38481qr A01;

    public C38491qs(AnonymousClass1CX r1, C38481qr r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C37771pi[] r10 = (C37771pi[]) objArr;
        AnonymousClass00B.A06(r10);
        AnonymousClass1CX r5 = this.A00;
        C37771pi r1 = r10[0];
        AnonymousClass00B.A00();
        if (!r1.A0R) {
            String str = r1.A0F;
            AnonymousClass00B.A00();
            return r5.A00(r5.A06(str), str);
        }
        C27041Qf r7 = r5.A0O;
        String str2 = r1.A0F;
        Pair A002 = C27031Qe.A00(str2);
        File file = null;
        if (A002 != null) {
            if (r7.A07.A02((String) A002.first, (String) A002.second)) {
                C27021Qd r3 = r7.A05;
                File A012 = r3.A01(str2);
                if (A012 == null || !A012.exists()) {
                    try {
                        C37771pi A03 = r7.A02.A03((String) A002.first, (String) A002.second);
                        A012 = r3.A00(A03, C27031Qe.A02(r7.A01.A00, A03));
                    } catch (Exception e2) {
                        Log.e("ThirdPartyStickerManager/getTrayIcon/error fetching pack", e2);
                    }
                }
                file = A012;
            }
        }
        return r5.A00(file, str2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C38481qr r0 = this.A01;
        if (bitmap == null) {
            r0.ASq();
        } else {
            r0.ASv(bitmap);
        }
    }
}
