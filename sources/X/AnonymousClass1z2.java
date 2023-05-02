package X;

/* renamed from: X.1z2  reason: invalid class name */
public class AnonymousClass1z2 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public final C34151jm A04;

    public AnonymousClass1z2(C34151jm r1, String str, String str2, String str3, long j2) {
        this.A02 = str;
        this.A03 = str2;
        this.A04 = r1;
        this.A00 = j2;
        this.A01 = str3;
    }

    public void A00(C34151jm r3) {
        C34151jm r1 = this.A04;
        r1.A0D = r3.A0D;
        r1.A0A = r3.A0A;
        r1.A0G = r3.A0G;
        r1.A08 = r3.A08;
        r1.A06 = r3.A06;
        r1.A0C = r3.A0C;
        r1.A0B = r3.A0B;
        r1.A00 = r3.A00;
        r1.A03 = r3.A03;
        r1.A02 = r3.A02;
        r1.A0A = r3.A0A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RecentStickerIdentifier{fileHash='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", imageHash='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", sticker=");
        sb.append(this.A04);
        sb.append(", lastStickerSentTs=");
        sb.append(this.A00);
        sb.append(", avatarTemplateId='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
