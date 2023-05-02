package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import java.util.Collections;
import java.util.List;

public final class CarText {
    public final List mSpans = Collections.emptyList();
    public final List mSpansForVariants = Collections.emptyList();
    public final String mText = "";
    public final List mTextVariants = Collections.emptyList();

    public final class Builder {
        public CharSequence mText;
        public List mTextVariants;
    }

    public class SpanWrapper {
        public final CarSpan mCarSpan = new CarSpan();
        public final int mEnd = 0;
        public final int mFlags = 0;
        public final int mStart = 0;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpanWrapper)) {
                return false;
            }
            SpanWrapper spanWrapper = (SpanWrapper) obj;
            return this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && AnonymousClass09S.A00(this.mCarSpan, spanWrapper.mCarSpan);
        }

        public int hashCode() {
            Object[] objArr = new Object[4];
            AnonymousClass000.A1K(objArr, this.mStart);
            AnonymousClass000.A1L(objArr, this.mEnd);
            objArr[2] = Integer.valueOf(this.mFlags);
            return AnonymousClass000.A0F(this.mCarSpan, objArr, 3);
        }

        public String toString() {
            StringBuilder A0r = AnonymousClass000.A0r("[");
            A0r.append(this.mCarSpan);
            A0r.append(": ");
            A0r.append(this.mStart);
            A0r.append(", ");
            A0r.append(this.mEnd);
            A0r.append(", flags: ");
            A0r.append(this.mFlags);
            return AnonymousClass000.A0h("]", A0r);
        }
    }

    public static String A00(CarText carText) {
        if (carText == null) {
            return null;
        }
        String obj = carText.toString();
        int length = obj.length();
        if (length <= 16) {
            return obj;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(obj.substring(0, 8));
        A0o.append("~");
        return AnonymousClass000.A0h(obj.substring(length - 8), A0o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarText)) {
            return false;
        }
        CarText carText = (CarText) obj;
        return AnonymousClass09S.A00(this.mText, carText.mText) && AnonymousClass09S.A00(this.mSpans, carText.mSpans) && AnonymousClass09S.A00(this.mTextVariants, carText.mTextVariants) && AnonymousClass09S.A00(this.mSpansForVariants, carText.mSpansForVariants);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mText;
        objArr[1] = this.mSpans;
        objArr[2] = this.mTextVariants;
        return AnonymousClass000.A0F(this.mSpansForVariants, objArr, 3);
    }

    public String toString() {
        return this.mText;
    }
}
