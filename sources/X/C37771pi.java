package X;

import java.util.List;

/* renamed from: X.1pi  reason: invalid class name and case insensitive filesystem */
public class C37771pi {
    public int A00;
    public long A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final long A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C37771pi(C37761ph r3) {
        String str = r3.A0D;
        AnonymousClass00B.A06(str);
        this.A0F = str;
        String str2 = r3.A0F;
        AnonymousClass00B.A06(str2);
        this.A0H = str2;
        String str3 = r3.A0H;
        AnonymousClass00B.A06(str3);
        this.A0J = str3;
        this.A09 = r3.A02;
        this.A08 = r3.A01;
        this.A05 = r3.A0R;
        this.A0L = r3.A0J;
        this.A0M = r3.A0K;
        List list = r3.A0L;
        AnonymousClass00B.A06(list);
        this.A03 = list;
        this.A0R = r3.A0S;
        List list2 = r3.A0M;
        AnonymousClass00B.A06(list2);
        this.A04 = list2;
        this.A0G = r3.A0E;
        this.A01 = r3.A00;
        this.A02 = r3.A05;
        this.A0A = r3.A08;
        this.A0B = r3.A09;
        this.A0O = r3.A0O;
        this.A0I = r3.A0G;
        this.A0E = r3.A0C;
        this.A0N = r3.A0N;
        this.A0P = r3.A0P;
        this.A0Q = r3.A0Q;
        this.A0K = r3.A0I;
        this.A0C = r3.A0A;
        this.A0D = r3.A0B;
    }

    public static boolean A00(Object obj, List list, int i2) {
        return ((C37771pi) list.get(i2)).A0F.equals(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r2.A0G
            if (r0 == 0) goto L_0x000f
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37771pi.A01():boolean");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerPack{");
        stringBuffer.append("id='");
        stringBuffer.append(this.A0F);
        stringBuffer.append('\'');
        stringBuffer.append(", name='");
        stringBuffer.append(this.A0H);
        stringBuffer.append('\'');
        stringBuffer.append(", publisher='");
        stringBuffer.append(this.A0J);
        stringBuffer.append('\'');
        stringBuffer.append(", description='");
        stringBuffer.append(this.A09);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", isDownloading=");
        stringBuffer.append(this.A05);
        stringBuffer.append(", trayImageId='");
        stringBuffer.append(this.A0L);
        stringBuffer.append('\'');
        stringBuffer.append(", trayImagePreviewId='");
        stringBuffer.append(this.A0M);
        stringBuffer.append('\'');
        stringBuffer.append(", previewImageIds=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", stickers=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", order=");
        stringBuffer.append(this.A00);
        stringBuffer.append(", isThirdParty=");
        stringBuffer.append(this.A0R);
        stringBuffer.append(", imageDataHash='");
        stringBuffer.append(this.A0G);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", downloadedImageDataHash='");
        stringBuffer.append(this.A02);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImageId='");
        stringBuffer.append(this.A0A);
        stringBuffer.append('\'');
        stringBuffer.append(", downloadedTrayImagePreviewId='");
        stringBuffer.append(this.A0B);
        stringBuffer.append('\'');
        stringBuffer.append(", isUnseen=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isNew=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", avoidCaching=");
        stringBuffer.append(this.A0O);
        stringBuffer.append(", playLink='");
        stringBuffer.append(this.A0I);
        stringBuffer.append('\'');
        stringBuffer.append(", iOSLink='");
        stringBuffer.append(this.A0E);
        stringBuffer.append('\'');
        stringBuffer.append(", animatedPack=");
        stringBuffer.append(this.A0N);
        stringBuffer.append(", downloadedAnimatedPack=");
        stringBuffer.append(this.A0P);
        stringBuffer.append(", isAvatarStickerPack=");
        stringBuffer.append(this.A0Q);
        stringBuffer.append(", trayIconAvatarStickerTemplateId=");
        stringBuffer.append(this.A0K);
        stringBuffer.append(", emptyFavoritesAvatarStickerTemplateId=");
        stringBuffer.append(this.A0C);
        stringBuffer.append(", emptyRecentsAvatarStickerTemplateId=");
        stringBuffer.append(this.A0D);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
