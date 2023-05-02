package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.PhotoViewPager;
import java.util.HashSet;

/* renamed from: X.29n  reason: invalid class name and case insensitive filesystem */
public class C456029n implements C456129o {
    public float A00;
    public float A01;
    public C456629y A02;
    public C456129o A03;
    public AnonymousClass29N A04;
    public final Context A05;
    public final RecyclerView A06;
    public final AnonymousClass013 A07;
    public final PhotoViewPager A08;
    public final AnonymousClass2S8 A09;

    public C456029n(RecyclerView recyclerView, C34711kk r24, AnonymousClass013 r25, C26051Md r26, C17250um r27, C14710pd r28, AnonymousClass29Q r29, AnonymousClass2OM r30, PhotoViewPager photoViewPager, C17960vv r32, AnonymousClass29P r33, AnonymousClass2S8 r34, AnonymousClass1MF r35, AnonymousClass1A9 r36, HashSet hashSet, boolean z2, boolean z3) {
        RecyclerView recyclerView2 = recyclerView;
        this.A06 = recyclerView2;
        this.A08 = photoViewPager;
        AnonymousClass2S8 r14 = r34;
        this.A09 = r14;
        AnonymousClass013 r6 = r25;
        this.A07 = r6;
        Context context = recyclerView2.getContext();
        this.A05 = context;
        C17960vv r12 = r32;
        C26051Md r7 = r26;
        C34711kk r5 = r24;
        C17250um r8 = r27;
        C14710pd r9 = r28;
        AnonymousClass29Q r10 = r29;
        AnonymousClass2OM r11 = r30;
        this.A02 = new C456629y(context, r5, r6, r7, r8, r9, r10, r11, r12, r33, r14, this, r35, r36, hashSet, context.getResources().getDimensionPixelSize(z2 ? R.dimen.dimen0580 : R.dimen.dimen03fc), z2, z3);
        recyclerView2.setItemAnimator((C005502j) null);
        recyclerView2.A0h = true;
    }

    public void AYq(int i2) {
        C456129o r0 = this.A03;
        if (r0 != null) {
            r0.AYq(i2);
        }
    }
}
