package X;

/* renamed from: X.1oK  reason: invalid class name and case insensitive filesystem */
public class C36921oK {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C36921oK(String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, long j2) {
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = str6;
        this.A02 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StickerSyncMetadata{fileHash=");
        long j2 = this.A02;
        sb.append(j2);
        sb.append(", url=");
        sb.append(this.A08);
        sb.append(", encFileHash=");
        sb.append(this.A04);
        sb.append(", mediaKey=");
        sb.append(this.A05);
        sb.append(", mimeType=");
        sb.append(this.A06);
        sb.append(", width=");
        sb.append(this.A01);
        sb.append(", height=");
        sb.append(this.A00);
        sb.append(", directPath=");
        sb.append(this.A03);
        sb.append(", fileSize=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
