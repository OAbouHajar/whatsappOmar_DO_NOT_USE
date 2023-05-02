package X;

/* renamed from: X.5wl  reason: invalid class name and case insensitive filesystem */
public class C119235wl {
    public static final C111215fW A0B = new C111215fW(5);
    public static final C111215fW A0C = new C111215fW(3);
    public static final C111215fW A0D = new C111215fW(2);
    public static final C111215fW A0E = new C111215fW(4);
    public static final C115895qU A0F = new C115895qU(7);
    public static final C115895qU A0G = new C115895qU(0);
    public static final C115895qU A0H = new C115895qU(6);
    public static final C115895qU A0I = new C115895qU(12);
    public static final C115895qU A0J = new C115895qU(13);
    public static final C115895qU A0K = new C115895qU(14);
    public static final C115895qU A0L = new C115895qU(8);
    public long A00;
    public long A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final String A09;
    public final boolean A0A;

    public C119235wl(C118475uk r3) {
        String str = r3.A08;
        if (str == null) {
            throw AnonymousClass000.A0T("one of file path or FileDescriptor must be set");
        }
        this.A09 = str;
        this.A06 = r3.A03;
        this.A05 = r3.A02;
        this.A07 = r3.A04;
        this.A04 = r3.A01;
        this.A0A = true;
        this.A03 = r3.A00;
        this.A08 = r3.A05;
        this.A00 = r3.A06;
        this.A01 = r3.A07;
        this.A02 = -1;
    }

    public Object A00(C111215fW r3) {
        int i2;
        int i3 = r3.A00;
        if (i3 == 2) {
            i2 = this.A06;
        } else if (i3 == 3) {
            i2 = this.A05;
        } else if (i3 == 4) {
            i2 = this.A07;
        } else if (i3 == 5) {
            i2 = this.A04;
        } else {
            throw AnonymousClass000.A0a(C13680ns.A0c(i3, "Invalid required video capture result key: "));
        }
        return Integer.valueOf(i2);
    }

    public Object A01(C115895qU r3) {
        int i2;
        int i3 = r3.A00;
        if (i3 == 0) {
            return this.A09;
        }
        if (i3 == 1) {
            return null;
        }
        switch (i3) {
            case 6:
                return Boolean.valueOf(this.A0A);
            case 7:
                i2 = this.A03;
                break;
            case 8:
                i2 = this.A08;
                break;
            default:
                throw AnonymousClass000.A0a(C13680ns.A0c(i3, "Invalid required video capture result key: "));
        }
        return Integer.valueOf(i2);
    }

    public void A02(C115895qU r6, Object obj) {
        String str;
        String str2;
        switch (r6.A00) {
            case 12:
                if (this.A00 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start request time was already set, cannot set it again";
                    break;
                } else {
                    this.A00 = C13700nu.A01(obj);
                    return;
                }
            case 13:
                if (this.A01 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start time was already set, cannot set it again";
                    break;
                } else {
                    this.A01 = C13700nu.A01(obj);
                    return;
                }
            default:
                if (this.A02 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop request time was already set, cannot set it again";
                    break;
                } else {
                    this.A02 = C13700nu.A01(obj);
                    return;
                }
        }
        AnonymousClass5xH.A01(str, str2);
    }
}
