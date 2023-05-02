package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.44E  reason: invalid class name */
public class AnonymousClass44E extends Number implements Serializable {
    public static final long serialVersionUID = 0;
    public transient AtomicLong A00;

    public AnonymousClass44E() {
        this(0.0d);
    }

    public AnonymousClass44E(double d2) {
        this.A00 = new AtomicLong(Double.doubleToRawLongBits(d2));
    }

    public static double A00(AnonymousClass44E r1) {
        return Double.longBitsToDouble(r1.A00.get());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A00 = new AtomicLong();
        this.A00.set(Double.doubleToRawLongBits(objectInputStream.readDouble()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(A00(this));
    }

    public double doubleValue() {
        return A00(this);
    }

    public float floatValue() {
        return (float) A00(this);
    }

    public int intValue() {
        return (int) A00(this);
    }

    public long longValue() {
        return (long) A00(this);
    }

    public String toString() {
        return Double.toString(A00(this));
    }
}
