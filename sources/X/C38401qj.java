package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1qj  reason: invalid class name and case insensitive filesystem */
public class C38401qj extends C16690tT {
    public C109565Sq A00;
    public final AnonymousClass1CX A01;

    public C38401qj(AnonymousClass1CX r1) {
        this.A01 = r1;
    }

    public C38401qj(AnonymousClass1CX r1, C109565Sq r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C109565Sq r0 = this.A00;
        if (r0 != null) {
            r0.AUK();
        }
        this.A00 = null;
    }

    /* renamed from: A0B */
    public Void A08(Void... voidArr) {
        C16700tU r5 = this.A02;
        if (!r5.isCancelled()) {
            AnonymousClass1CX r4 = this.A01;
            List A08 = r4.A08();
            if (!r5.isCancelled()) {
                List<C37771pi> A07 = r4.A07();
                if (!r5.isCancelled()) {
                    A07(new AnonymousClass5C2(A08, A07));
                    if (!r5.isCancelled()) {
                        List<C37771pi> A0A = r4.A0A(new C38381qh(this));
                        HashSet hashSet = new HashSet();
                        for (C37771pi r0 : A0A) {
                            hashSet.add(r0.A0F);
                        }
                        for (C37771pi r3 : A07) {
                            String str = r3.A0F;
                            if (!hashSet.contains(str)) {
                                StringBuilder sb = new StringBuilder("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack ");
                                sb.append(str);
                                Log.e(sb.toString());
                                A07(r3);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
