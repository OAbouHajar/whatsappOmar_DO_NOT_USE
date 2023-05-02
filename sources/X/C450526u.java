package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.26u  reason: invalid class name and case insensitive filesystem */
public final class C450526u extends ArrayAdapter {
    public final Context A00;
    public final LayoutInflater A01;
    public final C17160ud A02;
    public final C16080sP A03;
    public final AnonymousClass2Ao A04;
    public final AnonymousClass013 A05;
    public final C20260zl A06;
    public final C25781Lc A07;

    public C450526u(Context context, C17160ud r3, C16080sP r4, AnonymousClass2Ao r5, AnonymousClass013 r6, C20260zl r7, C25781Lc r8, List list) {
        super(context, R.layout.layout0142, list);
        this.A00 = context;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = LayoutInflater.from(context);
    }

    public int getItemViewType(int i2) {
        C450226r r0 = (C450226r) getItem(i2);
        return r0 == null ? super.getItemViewType(i2) : r0.ACv();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.5Op} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.3F6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.4w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.5Op} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: X.5Op} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.4w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.4w2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.4w2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            r8 = r16
            java.lang.Object r2 = r14.getItem(r15)
            X.26r r2 = (X.C450226r) r2
            r6 = r17
            if (r2 == 0) goto L_0x001e
            if (r16 != 0) goto L_0x0057
            int r1 = r14.getItemViewType(r15)
            r5 = 8
            r4 = 0
            if (r1 == 0) goto L_0x0032
            r0 = 1
            if (r1 == r0) goto L_0x005e
            r0 = 2
            if (r1 == r0) goto L_0x0023
            r8 = 0
        L_0x001e:
            android.view.View r0 = super.getView(r15, r8, r6)
            return r0
        L_0x0023:
            android.view.LayoutInflater r1 = r14.A01
            r0 = 2131559320(0x7f0d0398, float:1.874398E38)
            android.view.View r8 = r1.inflate(r0, r6, r4)
            X.4w1 r6 = new X.4w1
            r6.<init>(r8)
            goto L_0x0080
        L_0x0032:
            android.view.LayoutInflater r1 = r14.A01
            r0 = 2131558722(0x7f0d0142, float:1.8742768E38)
            android.view.View r8 = r1.inflate(r0, r6, r4)
            r0 = 2131362923(0x7f0a046b, float:1.834564E38)
            android.view.View r0 = r8.findViewById(r0)
            r0.setVisibility(r5)
            android.content.Context r7 = r14.A00
            X.0zl r12 = r14.A06
            X.0sP r9 = r14.A03
            X.013 r11 = r14.A05
            X.1Lc r13 = r14.A07
            X.2Ao r10 = r14.A04
            X.3F6 r6 = new X.3F6
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0080
        L_0x0057:
            java.lang.Object r6 = r8.getTag()
            X.5Op r6 = (X.C108595Op) r6
            goto L_0x0083
        L_0x005e:
            android.view.LayoutInflater r1 = r14.A01
            r0 = 2131558722(0x7f0d0142, float:1.8742768E38)
            android.view.View r8 = r1.inflate(r0, r6, r4)
            r0 = 2131362923(0x7f0a046b, float:1.834564E38)
            android.view.View r0 = r8.findViewById(r0)
            r0.setVisibility(r5)
            X.0ud r9 = r14.A02
            X.0sP r10 = r14.A03
            X.1Lc r0 = r14.A07
            X.013 r11 = r14.A05
            X.4w2 r6 = new X.4w2
            r7 = r6
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0080:
            r8.setTag(r6)
        L_0x0083:
            r6.ANe(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C450526u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 3;
    }
}
