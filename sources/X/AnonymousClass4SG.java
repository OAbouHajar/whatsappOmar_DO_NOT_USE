package X;

import java.util.Arrays;

/* renamed from: X.4SG  reason: invalid class name */
public class AnonymousClass4SG {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;
    public final byte[] A09;

    public AnonymousClass4SG(String str, String str2, String str3, String str4, String str5, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A08 = bArr;
        this.A07 = bArr2;
        this.A09 = bArr3;
        this.A02 = str4;
        this.A04 = str5;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("WamsysMMSDownloadRequest{mediaType=");
        A0r.append(this.A01);
        A0r.append(", downloadMode=");
        A0r.append(this.A00);
        A0r.append(", transferOption=");
        A0r.append(7);
        A0r.append(", temporaryFilePath='");
        char A002 = AnonymousClass3K3.A00(this.A06, A0r);
        A0r.append(", outputFilePath='");
        A0r.append(this.A05);
        A0r.append(A002);
        A0r.append(", directPath='");
        A0r.append(this.A03);
        A0r.append(A002);
        A0r.append(", hashIdentifier=");
        A0r.append(Arrays.toString(this.A07));
        A0r.append(", plaintextHashIdentifier=");
        A0r.append(Arrays.toString(this.A09));
        A0r.append(", connBlockJSONStr='");
        A0r.append(this.A02);
        A0r.append(A002);
        A0r.append(", loggingIdentifier='");
        A0r.append(this.A04);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }
}
