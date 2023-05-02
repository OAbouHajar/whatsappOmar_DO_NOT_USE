package X;

/* renamed from: X.4nv  reason: invalid class name and case insensitive filesystem */
public class C96184nv implements AnonymousClass5L7 {
    public int A00 = 13107200;
    public boolean A01;
    public final long A02 = C90604eR.A01((long) 0);
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C97574qD A07;

    public C96184nv(C97574qD r6, int i2, int i3, int i4, int i5) {
        A00("bufferForPlaybackMs", "0", i4, 0);
        A00("bufferForPlaybackAfterRebufferMs", "0", i5, 0);
        A00("minBufferMs", "bufferForPlaybackMs", i2, i4);
        A00("minBufferMs", "bufferForPlaybackAfterRebufferMs", i2, i5);
        A00("maxBufferMs", "minBufferMs", i3, i2);
        A00("backBufferDurationMs", "0", 0, 0);
        this.A07 = r6;
        this.A06 = C90604eR.A01((long) i2);
        this.A05 = C90604eR.A01((long) i3);
        this.A04 = C90604eR.A01((long) i4);
        this.A03 = C90604eR.A01((long) i5);
    }

    public static void A00(String str, String str2, int i2, int i3) {
        boolean A1P = AnonymousClass3K3.A1P(i2, i3);
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(" cannot be less than ");
        String A0h = AnonymousClass000.A0h(str2, A0q);
        if (!A1P) {
            throw AnonymousClass000.A0T(String.valueOf(A0h));
        }
    }
}
