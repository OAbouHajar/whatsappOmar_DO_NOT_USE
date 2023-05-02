package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.2v4  reason: invalid class name */
public abstract class AnonymousClass2v4 extends AnonymousClass3TH {
    public AnonymousClass050 A00 = null;
    public AnonymousClass01A A01 = null;
    public final AnonymousClass03G A02 = new AnonymousClass03G();
    public final AnonymousClass03G A03 = new AnonymousClass03G();
    public final AnonymousClass02C A04;

    public AnonymousClass2v4(AnonymousClass02C r2) {
        this.A04 = r2;
    }

    public Parcelable A03() {
        Bundle bundle;
        AnonymousClass03G r7 = this.A03;
        int i2 = 0;
        if (r7.A00() > 0) {
            bundle = C13690nt.A0D();
            long[] jArr = new long[r7.A00()];
            for (int i3 = 0; i3 < r7.A00(); i3++) {
                long A012 = r7.A01(i3);
                jArr[i3] = A012;
                bundle.putParcelable(Long.toString(A012), (AnonymousClass0Y8) r7.A03(i3));
            }
            bundle.putLongArray("states", jArr);
        } else {
            bundle = null;
        }
        while (true) {
            AnonymousClass03G r1 = this.A02;
            if (i2 >= r1.A00()) {
                return bundle;
            }
            AnonymousClass01A r3 = (AnonymousClass01A) r1.A03(i2);
            if (r3 != null && r3.A0c()) {
                if (bundle == null) {
                    bundle = C13690nt.A0D();
                }
                this.A04.A0Q(bundle, r3, C13680ns.A0j(AnonymousClass000.A0r("f"), r1.A01(i2)));
            }
            i2++;
        }
    }

    public void A09(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            long[] longArray = bundle.getLongArray("states");
            AnonymousClass03G r7 = this.A03;
            r7.A05();
            AnonymousClass03G r4 = this.A02;
            r4.A05();
            if (longArray != null) {
                for (long j2 : longArray) {
                    r7.A09(j2, bundle.getParcelable(Long.toString(j2)));
                }
            }
            Iterator it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                if (A0m.startsWith("f")) {
                    AnonymousClass01A A09 = this.A04.A09(bundle, A0m);
                    if (A09 != null) {
                        A09.A0b(false);
                        r4.A09(Long.parseLong(A0m.substring(1)), A09);
                    } else {
                        Log.w(C13680ns.A0h("FragmentPagerAdapter/Bad fragment at key ", A0m));
                    }
                }
            }
        }
    }

    public void A0A(ViewGroup viewGroup) {
        AnonymousClass050 r0 = this.A00;
        if (r0 != null) {
            r0.A04();
            this.A00 = null;
        }
    }

    public void A0B(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0r = AnonymousClass000.A0r("ViewPager with adapter ");
            A0r.append(this);
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(" requires a view id", A0r));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.obwhatsapp.mediacomposer.ImageComposerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.obwhatsapp.mediacomposer.ImageComposerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.obwhatsapp.mediacomposer.ImageComposerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.obwhatsapp.mediacomposer.ImageComposerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment} */
    /* JADX WARNING: type inference failed for: r6v5, types: [com.obwhatsapp.mediacomposer.VideoComposerFragment, X.01A] */
    /* JADX WARNING: type inference failed for: r6v6, types: [com.obwhatsapp.mediacomposer.GifComposerFragment, X.01A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            r5 = r8
            boolean r7 = r8 instanceof X.C59982zh
            if (r7 == 0) goto L_0x0109
            r0 = r5
            X.2zh r0 = (X.C59982zh) r0
            com.obwhatsapp.status.playback.StatusPlaybackActivity r0 = r0.A00
            X.398 r0 = r0.A0D
            java.util.HashMap r1 = r0.A01
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            X.4FE r0 = (X.AnonymousClass4FE) r0
            X.1dI r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = r0.A0B
            java.lang.String r0 = r0.getRawString()
            java.lang.Object r0 = r1.get(r0)
        L_0x0022:
            X.AnonymousClass00B.A06(r0)
            long r2 = X.C13700nu.A01(r0)
            X.03G r4 = r8.A02
            r0 = 0
            java.lang.Object r6 = r4.A04(r2, r0)
            if (r6 != 0) goto L_0x0097
            X.050 r0 = r8.A00
            if (r0 != 0) goto L_0x003f
            X.02C r1 = r8.A04
            X.050 r0 = new X.050
            r0.<init>(r1)
            r8.A00 = r0
        L_0x003f:
            if (r7 == 0) goto L_0x009d
            X.2zh r5 = (X.C59982zh) r5
            com.obwhatsapp.status.playback.StatusPlaybackActivity r7 = r5.A00
            X.398 r0 = r7.A0D
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            X.4FE r0 = (X.AnonymousClass4FE) r0
            if (r0 == 0) goto L_0x0129
            X.1Vw r5 = r7.A0A
            X.1dI r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = r0.A0B
            if (r5 != 0) goto L_0x0098
            boolean r0 = r7.A0M
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r6 = com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A02(r1, r0)
        L_0x005f:
            android.graphics.Rect r0 = r7.A0N
            r6.A1E(r0)
        L_0x0064:
            X.03G r1 = r8.A03
            r0 = 0
            java.lang.Object r1 = r1.A04(r2, r0)
            X.0Y8 r1 = (X.AnonymousClass0Y8) r1
            if (r1 == 0) goto L_0x007a
            X.02C r0 = r6.A0H
            if (r0 != 0) goto L_0x0122
            android.os.Bundle r0 = r1.A00
            if (r0 != 0) goto L_0x0078
            r0 = 0
        L_0x0078:
            r6.A06 = r0
        L_0x007a:
            r0 = 0
            r6.A0b(r0)
            r6.A0o(r0)
            r4.A09(r2, r6)
            X.050 r4 = r8.A00
            int r1 = r9.getId()
            java.lang.String r0 = "f"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C13680ns.A0j(r0, r2)
            r4.A0D(r6, r0, r1)
        L_0x0097:
            return r6
        L_0x0098:
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r6 = com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A01(r1, r5)
            goto L_0x005f
        L_0x009d:
            X.2zi r5 = (X.C59992zi) r5
            com.obwhatsapp.mediacomposer.MediaComposerActivity r6 = r5.A00
            java.util.List r1 = r6.A39()
            int r0 = r5.A0L(r10)
            java.lang.Object r5 = r1.get(r0)
            android.net.Uri r5 = (android.net.Uri) r5
            X.0vv r1 = r6.A0i
            X.29Q r0 = r6.A1S
            X.20I r6 = r0.A00(r5)
            byte r1 = r1.A01(r6)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)
            r6.A0C(r0)
            r0 = 1
            if (r1 == r0) goto L_0x00f5
            r0 = 3
            if (r1 == r0) goto L_0x00e1
            r0 = 13
            if (r1 == r0) goto L_0x00ce
            r6 = 0
            goto L_0x0064
        L_0x00ce:
            com.obwhatsapp.mediacomposer.GifComposerFragment r6 = new com.obwhatsapp.mediacomposer.GifComposerFragment
            r6.<init>()
            android.os.Bundle r1 = X.C13690nt.A0D()
            java.lang.String r0 = "uri"
            r1.putParcelable(r0, r5)
            r6.A0T(r1)
            goto L_0x0064
        L_0x00e1:
            com.obwhatsapp.mediacomposer.VideoComposerFragment r6 = new com.obwhatsapp.mediacomposer.VideoComposerFragment
            r6.<init>()
            android.os.Bundle r1 = X.C13690nt.A0D()
            java.lang.String r0 = "uri"
            r1.putParcelable(r0, r5)
            r6.A0T(r1)
            goto L_0x0064
        L_0x00f5:
            com.obwhatsapp.mediacomposer.ImageComposerFragment r6 = new com.obwhatsapp.mediacomposer.ImageComposerFragment
            r6.<init>()
            android.os.Bundle r1 = X.C13690nt.A0D()
            java.lang.String r0 = "uri"
            r1.putParcelable(r0, r5)
            r6.A0T(r1)
            goto L_0x0064
        L_0x0109:
            r3 = r5
            X.2zi r3 = (X.C59992zi) r3
            com.obwhatsapp.mediacomposer.MediaComposerActivity r0 = r3.A00
            java.util.HashMap r2 = r0.A1W
            java.util.List r1 = r0.A39()
            int r0 = r3.A0L(r10)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Object r0 = r2.get(r0)
            goto L_0x0022
        L_0x0122:
            java.lang.String r0 = "Fragment already added"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0129:
            java.lang.String r0 = "Unsupported StatusItem instance"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2v4.A0G(android.view.ViewGroup, int):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0I(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass01A r4 = (AnonymousClass01A) obj;
        AnonymousClass01A r0 = this.A01;
        if (r4 != r0) {
            if (r0 != null) {
                r0.A0b(false);
                this.A01.A0o(false);
            }
            r4.A0b(true);
            r4.A0o(true);
            this.A01 = r4;
        }
    }

    public /* bridge */ /* synthetic */ boolean A0J(View view, Object obj) {
        return AnonymousClass000.A1Y(((AnonymousClass01A) obj).A0A, view);
    }

    /* renamed from: A0K */
    public void A0H(ViewGroup viewGroup, AnonymousClass01A r10, int i2) {
        long j2;
        int A0F = A0F(r10);
        AnonymousClass03G r7 = this.A02;
        if (r7.A01) {
            r7.A06();
        }
        int i3 = 0;
        while (true) {
            if (i3 >= r7.A00) {
                break;
            }
            Object[] objArr = r7.A03;
            if (objArr[i3] != r10) {
                i3++;
            } else if (i3 != -1) {
                j2 = r7.A01(i3);
                Object obj = objArr[i3];
                Object obj2 = AnonymousClass03G.A04;
                if (obj != obj2) {
                    objArr[i3] = obj2;
                    r7.A01 = true;
                }
            }
        }
        j2 = -1;
        if (!r10.A0c() || A0F == -2) {
            this.A03.A07(j2);
        } else {
            this.A03.A09(j2, this.A04.A07(r10));
        }
        AnonymousClass050 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass050(this.A04);
            this.A00 = r1;
        }
        r1.A07(r10);
    }
}
