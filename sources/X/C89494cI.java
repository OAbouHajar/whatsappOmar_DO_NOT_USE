package X;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.regex.Pattern;

/* renamed from: X.4cI  reason: invalid class name and case insensitive filesystem */
public abstract class C89494cI {
    public static C89494cI A01(Object obj) {
        char charAt;
        if (obj == null) {
            return AnonymousClass5TX.A02;
        }
        if (obj instanceof C89494cI) {
            return (C89494cI) obj;
        }
        if (obj instanceof Class) {
            return new C70103g7((Class) obj);
        }
        if (obj instanceof String) {
            String A0Z = AnonymousClass3K4.A0Z(obj);
            if (A0Z.length() > 0 && ((charAt = A0Z.charAt(0)) == '@' || charAt == '$')) {
                try {
                    C89144bf.A00(A0Z, new AnonymousClass5OQ[0]);
                    return new C70123g9(C89144bf.A00(obj.toString().toString(), new AnonymousClass5OQ[0]), false, false);
                } catch (Exception unused) {
                }
            }
            String A0Z2 = AnonymousClass3K4.A0Z(obj);
            int length = A0Z2.length();
            if (length > 1) {
                char charAt2 = A0Z2.charAt(0);
                char charAt3 = A0Z2.charAt(length - 1);
                if (charAt2 != '[' ? charAt2 == '{' && charAt3 == '}' : charAt3 == ']') {
                    try {
                        new C107215Gw(-1).A0A(A0Z2, C89774ct.A02.A00);
                        return new C70163gD((CharSequence) obj.toString());
                    } catch (Exception unused2) {
                    }
                }
            }
            return new C70133gA(obj.toString(), true);
        } else if (obj instanceof Character) {
            return new C70133gA(obj.toString(), false);
        } else {
            if (obj instanceof Number) {
                return new C70173gE((CharSequence) obj.toString());
            }
            if (obj instanceof Boolean) {
                return Boolean.parseBoolean(obj.toString().toString()) ? AnonymousClass5TX.A01 : AnonymousClass5TX.A00;
            }
            if (obj instanceof Pattern) {
                return new C70153gC((Pattern) obj);
            }
            if (obj instanceof OffsetDateTime) {
                return new C70143gB(obj.toString());
            }
            throw new AnonymousClass5Ar("Could not determine value type");
        }
    }

    public C70163gD A02() {
        if (this instanceof C70163gD) {
            return (C70163gD) this;
        }
        throw C70003fx.A00("Expected json node");
    }

    public C70173gE A03() {
        if (this instanceof C70133gA) {
            try {
                return new C70173gE(new BigDecimal(((C70133gA) this).A01));
            } catch (NumberFormatException unused) {
                return C70173gE.A01;
            }
        } else if (this instanceof C70173gE) {
            return (C70173gE) this;
        } else {
            throw C70003fx.A00("Expected number node");
        }
    }

    public C70143gB A04() {
        if (this instanceof C70143gB) {
            return (C70143gB) this;
        }
        throw C70003fx.A00("Expected offsetDateTime node");
    }

    public C70133gA A05() {
        if (this instanceof C70133gA) {
            return (C70133gA) this;
        }
        if (this instanceof C70173gE) {
            return new C70133gA(((C70173gE) this).A00.toString(), false);
        }
        throw C70003fx.A00("Expected string node");
    }

    public C70183gF A06() {
        if (this instanceof C70183gF) {
            return (C70183gF) this;
        }
        throw C70003fx.A00("Expected value list node");
    }
}
