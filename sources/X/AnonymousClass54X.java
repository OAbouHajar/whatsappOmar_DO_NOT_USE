package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.54X  reason: invalid class name */
public final class AnonymousClass54X implements Externalizable {
    public static final long serialVersionUID = 0;
    public Collection collection;
    public final int tag;

    public AnonymousClass54X() {
        this(C440222l.A00, 0);
    }

    public AnonymousClass54X(Collection collection2, int i2) {
        this.collection = collection2;
        this.tag = i2;
    }

    private final Object readResolve() {
        return this.collection;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List, java.util.AbstractCollection, X.2dH] */
    public void readExternal(ObjectInput objectInput) {
        C106105Cn r3;
        C18450wi.A0H(objectInput, 0);
        byte readByte = objectInput.readByte();
        byte b2 = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (b2 == 0) {
                    ? r32 = new C52182dH((C52182dH) null, (C52182dH) null, new Object[readInt], 0, 0, false);
                    while (i2 < readInt) {
                        i2++;
                        r32.add(objectInput.readObject());
                    }
                    AnonymousClass1JB.A0W(r32);
                    r3 = r32;
                } else if (b2 == 1) {
                    C106105Cn r33 = new C106105Cn(readInt);
                    while (i2 < readInt) {
                        i2++;
                        r33.add(objectInput.readObject());
                    }
                    AnonymousClass1FA.A06(r33);
                    r3 = r33;
                } else {
                    StringBuilder A0r = AnonymousClass000.A0r("Unsupported collection type tag: ");
                    A0r.append(b2);
                    throw new InvalidObjectException(AnonymousClass3K3.A0p(A0r, FilenameUtils.EXTENSION_SEPARATOR));
                }
                this.collection = r3;
                return;
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("Illegal size value: ");
            A0r2.append(readInt);
            throw new InvalidObjectException(AnonymousClass3K3.A0p(A0r2, FilenameUtils.EXTENSION_SEPARATOR));
        }
        StringBuilder A0r3 = AnonymousClass000.A0r("Unsupported flags value: ");
        A0r3.append(readByte);
        throw new InvalidObjectException(AnonymousClass3K3.A0p(A0r3, FilenameUtils.EXTENSION_SEPARATOR));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C18450wi.A0H(objectOutput, 0);
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        for (Object writeObject : this.collection) {
            objectOutput.writeObject(writeObject);
        }
    }
}
