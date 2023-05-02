package X;

/* renamed from: X.0t7  reason: invalid class name and case insensitive filesystem */
public abstract class C16470t7 implements Cloneable {
    public static final AnonymousClass00F DEFAULT_SAMPLING_RATE = new AnonymousClass00F(1, 20, 20);
    public static final int NOT_ALLOWED_PS_ID = -1;
    public final int channel;
    public final int code;
    public final int psIdKey;
    public final AnonymousClass00F samplingRate;

    public C16470t7(int i2) {
        this(i2, DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public C16470t7(int i2, AnonymousClass00F r2, int i3, int i4) {
        this.code = i2;
        this.samplingRate = r2;
        this.channel = i3;
        this.psIdKey = i4;
    }

    public static void appendFieldToStringBuilder(StringBuilder sb, String str, Object obj) {
        if (obj != null) {
            sb.append(str);
            sb.append("=");
            sb.append(obj);
            sb.append(", ");
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new InternalError(e2.toString());
        }
    }

    public AnonymousClass00F getSamplingRate() {
        return this.samplingRate;
    }

    public abstract void serialize(C29081Zz r1);
}
