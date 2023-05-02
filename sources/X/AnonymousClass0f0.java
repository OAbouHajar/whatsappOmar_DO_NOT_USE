package X;

import java.util.List;

/* renamed from: X.0f0  reason: invalid class name */
public class AnonymousClass0f0 implements Cloneable {
    public long A00 = 0;
    public C04900Ol A01;
    public AnonymousClass0I5 A02;
    public C09150f1 A03;
    public C09150f1 A04;
    public C09150f1 A05;
    public C03620Jf A06;
    public C03620Jf A07;
    public C03720Jp A08;
    public C03730Jq A09;
    public C03740Jr A0A;
    public C03750Js A0B;
    public C03760Jt A0C;
    public AnonymousClass0K6 A0D;
    public C03630Jg A0E;
    public C03640Jh A0F;
    public AnonymousClass0ez A0G;
    public AnonymousClass0ez A0H;
    public AnonymousClass0ez A0I;
    public AnonymousClass0ez A0J;
    public AnonymousClass0ez A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Float A0S;
    public Float A0T;
    public Float A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public C09150f1[] A0c;

    public static AnonymousClass0f0 A00() {
        AnonymousClass0f0 r5 = new AnonymousClass0f0();
        r5.A00 = -1;
        AnonymousClass0I5 r7 = AnonymousClass0I5.A01;
        r5.A0G = r7;
        C03620Jf r6 = C03620Jf.NonZero;
        r5.A07 = r6;
        Float valueOf = Float.valueOf(1.0f);
        r5.A0O = valueOf;
        r5.A0J = null;
        r5.A0T = valueOf;
        r5.A05 = new C09150f1(1.0f);
        r5.A09 = C03730Jq.Butt;
        r5.A0A = C03740Jr.Miter;
        r5.A0S = Float.valueOf(4.0f);
        r5.A0c = null;
        r5.A04 = new C09150f1(0.0f);
        r5.A0P = valueOf;
        r5.A02 = r7;
        r5.A0b = null;
        r5.A03 = new C09150f1(C03770Ju.pt, 12.0f);
        r5.A0V = 400;
        r5.A08 = C03720Jp.Normal;
        r5.A0D = AnonymousClass0K6.None;
        r5.A0E = C03630Jg.LTR;
        r5.A0C = C03760Jt.Start;
        Boolean bool = Boolean.TRUE;
        r5.A0M = bool;
        r5.A01 = null;
        r5.A0Z = null;
        r5.A0Y = null;
        r5.A0X = null;
        r5.A0L = bool;
        r5.A0N = bool;
        r5.A0I = r7;
        r5.A0R = valueOf;
        r5.A0W = null;
        r5.A06 = r6;
        r5.A0a = null;
        r5.A0H = null;
        r5.A0Q = valueOf;
        r5.A0K = null;
        r5.A0U = valueOf;
        r5.A0F = C03640Jh.None;
        r5.A0B = C03750Js.auto;
        return r5;
    }

    public Object clone() {
        AnonymousClass0f0 r1 = (AnonymousClass0f0) super.clone();
        C09150f1[] r0 = this.A0c;
        if (r0 != null) {
            r1.A0c = (C09150f1[]) r0.clone();
        }
        return r1;
    }
}
