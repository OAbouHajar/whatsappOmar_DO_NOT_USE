package X;

import android.database.Cursor;
import com.obwhatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.36o  reason: invalid class name and case insensitive filesystem */
public class C609036o extends C16690tT {
    public AnonymousClass024 A00;
    public final C42391xi A01;
    public final C15830rv A02;
    public final WeakReference A03;

    public C609036o(C42391xi r2, GalleryFragmentBase galleryFragmentBase, C15830rv r4) {
        this.A03 = C13690nt.A0h(galleryFragmentBase);
        this.A02 = r4;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A1B;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A03.get();
        C16700tU r6 = this.A02;
        if (r6.isCancelled() || galleryFragmentBase == null) {
            return null;
        }
        AnonymousClass024 r2 = new AnonymousClass024();
        synchronized (this) {
            this.A00 = r2;
        }
        try {
            StringBuilder A0o = AnonymousClass000.A0o();
            String str = galleryFragmentBase.A0H;
            A0o.append(str);
            C28921Zf r3 = new C28921Zf(AnonymousClass000.A0h("/getCursor", A0o));
            A1B = galleryFragmentBase.A1B(r2, this.A01, this.A02);
            r3.A01();
            StringBuilder A0q = AnonymousClass000.A0q(str);
            A0q.append("/loadInBackground ");
            A0q.append(A1B.getCount());
            C13680ns.A1V(A0q);
            synchronized (this) {
                this.A00 = null;
            }
            if (!r6.isCancelled()) {
                return A1B;
            }
            A1B.close();
            return null;
        } catch (RuntimeException e2) {
            A1B.close();
            throw e2;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2 A[EDGE_INSN: B:33:0x00b2->B:27:0x00b2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r13) {
        /*
            r12 = this;
            android.database.Cursor r13 = (android.database.Cursor) r13
            if (r13 == 0) goto L_0x00d4
            java.lang.ref.WeakReference r0 = r12.A03
            java.lang.Object r10 = r0.get()
            com.obwhatsapp.gallery.GalleryFragmentBase r10 = (com.obwhatsapp.gallery.GalleryFragmentBase) r10
            if (r10 == 0) goto L_0x00d4
            X.1xi r8 = r12.A01
            int r4 = r13.getCount()
            r7 = 0
            android.view.View r1 = r10.A0A
            if (r1 == 0) goto L_0x001f
            r0 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            X.C13690nt.A11(r1, r0)
        L_0x001f:
            android.view.View r2 = r10.A0A
            if (r2 == 0) goto L_0x00d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r3 = r10.A0H
            r1.append(r3)
            java.lang.String r0 = "/onLoadFinished "
            r1.append(r0)
            r1.append(r4)
            X.C13680ns.A1V(r1)
            r10.A00 = r4
            r10.A1D()
            X.372 r0 = r10.A0C
            if (r0 == 0) goto L_0x0043
            r0.A0B()
        L_0x0043:
            java.util.ArrayList r6 = r10.A0I
            r6.clear()
            r5 = 0
            int r2 = r2.getHeight()
            android.content.Context r0 = r10.A02()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167053(0x7f07074d, float:1.7948369E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r4 = r2 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r3)
            java.lang.String r0 = "/approxScreenItemCount "
            r1.append(r0)
            r1.append(r4)
            X.C13680ns.A1V(r1)
            android.content.Context r1 = r10.A02()
            X.013 r0 = r10.A05
            X.2l0 r3 = new X.2l0
            r3.<init>(r1, r0)
            boolean r0 = r13.moveToFirst()
            if (r0 == 0) goto L_0x00b5
            r2 = 0
        L_0x0080:
            boolean r0 = r13 instanceof X.C16930tt
            if (r0 == 0) goto L_0x00d5
            r0 = r13
            X.0tt r0 = (X.C16930tt) r0
            X.0tY r0 = r0.A00()
        L_0x008b:
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.A0I
            X.2kz r1 = r3.A00(r0)
            if (r5 == 0) goto L_0x009f
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x00a2
            r6.add(r5)
        L_0x009f:
            r1.count = r7
            r5 = r1
        L_0x00a2:
            int r0 = r5.count
            int r0 = r0 + 1
            r5.count = r0
            int r2 = r2 + 1
            boolean r0 = r13.moveToNext()
            if (r0 == 0) goto L_0x00b2
            if (r2 < r4) goto L_0x0080
        L_0x00b2:
            r6.add(r5)
        L_0x00b5:
            X.3R5 r0 = r10.A0A
            android.database.Cursor r0 = r0.A0E(r13)
            if (r0 == 0) goto L_0x00c0
            r0.close()
        L_0x00c0:
            X.013 r6 = r10.A05
            X.0t6 r7 = r10.A06
            X.0y0 r9 = r10.A09
            X.0rv r11 = r10.A0D
            X.372 r5 = new X.372
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r10.A0C = r5
            X.0sq r0 = r10.A0E
            X.C13700nu.A0W(r5, r0)
        L_0x00d4:
            return
        L_0x00d5:
            X.0t6 r1 = r10.A06
            X.0rv r0 = r10.A0D
            X.0tZ r0 = r1.A0G(r13, r0)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609036o.A0A(java.lang.Object):void");
    }
}
