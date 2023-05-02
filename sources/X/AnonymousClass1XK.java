package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;

/* renamed from: X.1XK  reason: invalid class name */
public class AnonymousClass1XK implements Parcelable {
    public static final AnonymousClass1XK A04;
    public static final AnonymousClass1XK A05;
    public static final AnonymousClass1XK A06;
    public static final AnonymousClass1XK A07;
    public static final AnonymousClass1XK A08;
    public static final AnonymousClass1XK A09;
    public static final AnonymousClass1XK A0A;
    public static final AnonymousClass1XK A0B;
    public static final AnonymousClass1XK A0C;
    public static final AnonymousClass1XK A0D;
    public static final AnonymousClass1XK A0E;
    public static final AnonymousClass1XK A0F;
    public static final AnonymousClass1XK A0G;
    public static final AnonymousClass1XK A0H;
    public static final AnonymousClass1XK A0I;
    public static final AnonymousClass1XK A0J;
    public static final AnonymousClass1XK A0K;
    public static final AnonymousClass1XK A0L;
    public static final AnonymousClass1XK A0M;
    public static final AnonymousClass1XK A0N;
    public static final AnonymousClass1XK A0O;
    public static final AnonymousClass1XK A0P;
    public static final AnonymousClass1XK A0Q;
    public static final AnonymousClass1XK A0R;
    public static final AnonymousClass1XK A0S;
    public static final AnonymousClass1XK A0T;
    public static final AnonymousClass1XK A0U;
    public static final AnonymousClass1XK A0V;
    public static final AnonymousClass1XK A0W;
    public static final AnonymousClass1XK A0X;
    public static final AnonymousClass1XK A0Y;
    public static final AnonymousClass1XK A0Z;
    public static final AnonymousClass1XK A0a;
    public static final byte[] A0b;
    public static final byte[] A0c;
    public static final byte[] A0d;
    public static final byte[] A0e;
    public static final byte[] A0f;
    public static final byte[] A0g;
    public static final byte[] A0h;
    public static final byte[] A0i;
    public static final byte[] A0j;
    public static final byte[] A0k;
    public static final byte[] A0l;
    public static final byte[] A0m;
    public static final byte[] A0n;
    public static final byte[] A0o;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(95);
    public final byte A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    static {
        byte[] bytes = "WhatsApp Audio Keys".getBytes();
        A0c = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes();
        A0f = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes();
        A0g = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes();
        A0n = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes();
        A0o = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes();
        A0d = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes();
        A0e = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes();
        A0i = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes();
        A0j = bytes9;
        byte[] bytes10 = "walibra_hkdf_info".getBytes();
        A0k = bytes10;
        byte[] bytes11 = "WhatsApp Link Thumbnail Keys".getBytes();
        A0h = bytes11;
        byte[] bytes12 = "WhatsApp Payment Background Keys".getBytes();
        A0l = bytes12;
        byte[] bytes13 = "PAYMENT_DOC_UPLOAD".getBytes();
        A0m = bytes13;
        byte[] bytes14 = "ads-image".getBytes();
        A0b = bytes14;
        A05 = new AnonymousClass1XK("audio", "AUD", bytes, (byte) 2);
        A0I = new AnonymousClass1XK("ptt", "PTT", bytes, (byte) 2);
        A0B = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 1);
        A0C = new AnonymousClass1XK("thumbnail-image", (String) null, bytes3, (byte) 1);
        A0Z = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 42);
        A0R = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 23);
        A0E = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 57);
        A06 = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 37);
        A0O = new AnonymousClass1XK("image", "IMG", bytes2, (byte) 44);
        A0S = new AnonymousClass1XK("sticker", "STK", bytes2, (byte) 20);
        A0V = new AnonymousClass1XK("image", (String) null, bytes2, (byte) 25);
        A0G = new AnonymousClass1XK("kyc-id", (String) null, bytes2, (byte) 1);
        A0X = new AnonymousClass1XK("video", "VID", bytes4, (byte) 3);
        A0F = new AnonymousClass1XK("video", "VID", bytes4, (byte) 3);
        A0Y = new AnonymousClass1XK("thumbnail-video", (String) null, bytes5, (byte) 3);
        A0a = new AnonymousClass1XK("video", "VID", bytes4, (byte) 43);
        A04 = new AnonymousClass1XK("gif", "VID", bytes4, (byte) 13);
        A0A = new AnonymousClass1XK("thumbnail-gif", (String) null, bytes5, (byte) 13);
        A0W = new AnonymousClass1XK("video", (String) null, bytes4, (byte) 28);
        A0U = new AnonymousClass1XK("gif", (String) null, bytes4, (byte) 29);
        A08 = new AnonymousClass1XK("document", "DOC", bytes6, (byte) 9);
        A0D = new AnonymousClass1XK("document", "DOC", bytes6, (byte) 9);
        A0T = new AnonymousClass1XK("document", (String) null, bytes6, (byte) 26);
        A09 = new AnonymousClass1XK("thumbnail-document", (String) null, bytes7, (byte) 9);
        A0H = new AnonymousClass1XK("thumbnail-link", (String) null, bytes11, (byte) 0);
        A0J = new AnonymousClass1XK("md-app-state", (String) null, bytes8, (byte) 80);
        A0K = new AnonymousClass1XK("md-msg-hist", "HIST_SYNC", bytes9, (byte) 35);
        A0M = new AnonymousClass1XK("novi-image", (String) null, bytes10, (byte) 1);
        A0N = new AnonymousClass1XK("novi-video", (String) null, bytes10, (byte) 3);
        A0P = new AnonymousClass1XK("payment-bg-image", (String) null, bytes12, (byte) 65);
        A0Q = new AnonymousClass1XK("payment-br-document", (String) null, bytes13, (byte) 1);
        A0L = new AnonymousClass1XK("ads-image", (String) null, bytes14, (byte) 1);
        A07 = new AnonymousClass1XK("biz-cover-photo", "IMG", bytes2, (byte) 1);
    }

    public AnonymousClass1XK(String str, String str2, byte[] bArr, byte b2) {
        this.A00 = b2;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Byte.valueOf(this.A00)});
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder("MmsType{type=");
        sb.append(this.A00);
        sb.append(", origin=");
        if (this == A0I) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0G) {
                i2 = 6;
            }
        }
        sb.append(i2);
        sb.append(", fileType=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeByte(this.A00);
        if (this == A0I) {
            i3 = 1;
        } else {
            i3 = 0;
            if (this == A0G) {
                i3 = 6;
            }
        }
        parcel.writeInt(i3);
    }
}
