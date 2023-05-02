package X;

import android.util.Pair;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.io.File;
import java.util.Collections;

/* renamed from: X.36m  reason: invalid class name and case insensitive filesystem */
public class C608836m extends C16690tT {
    public final AnonymousClass01Z A00;
    public final C55532jo A01;
    public final AnonymousClass1CX A02;

    public C608836m(AnonymousClass01Z r1, C55532jo r2, AnonymousClass1CX r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Boolean bool;
        Pair[] pairArr = (Pair[]) objArr;
        AnonymousClass00B.A06(pairArr);
        boolean z2 = true;
        AnonymousClass00B.A0F(AnonymousClass000.A1R(pairArr.length, 1));
        Pair pair = pairArr[0];
        C34151jm r4 = (C34151jm) pair.first;
        AnonymousClass00B.A06(r4);
        AnonymousClass00B.A06(r4.A0F);
        AnonymousClass00B.A06(r4.A0D);
        Object obj = pair.second;
        A07(obj);
        AnonymousClass01Z r2 = this.A00;
        File A03 = r2.A03(r4.A0D);
        if ((r4.A09 == null || r4.A01 == 1) && !A03.exists()) {
            File A032 = r2.A03(r4.A0D);
            AnonymousClass00B.A06(A032);
            if (this.A02.A05(r4, A032) == null) {
                bool = Boolean.FALSE;
                return C13690nt.A0I(bool, obj);
            }
            z2 = false;
        }
        this.A02.A0G(Collections.singleton(r4), z2);
        bool = Boolean.TRUE;
        return C13690nt.A0I(bool, obj);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        boolean A1X = AnonymousClass000.A1X(pair.first);
        Number number = (Number) pair.second;
        C55532jo r4 = this.A01;
        if (r4 != null && number != null) {
            int intValue = number.intValue();
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r4;
            if (!A1X) {
                stickerStorePackPreviewActivity.A05.A09(R.string.str169b, 1);
            }
            stickerStorePackPreviewActivity.A0S.A0G(intValue, false);
        }
    }
}
