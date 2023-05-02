package X;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.54W  reason: invalid class name */
public final class AnonymousClass54W implements Externalizable {
    public static final long serialVersionUID = 0;
    public Map map;

    public AnonymousClass54W() {
        this(AnonymousClass1Z8.A00);
    }

    public AnonymousClass54W(Map map2) {
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public void readExternal(ObjectInput objectInput) {
        C18450wi.A0H(objectInput, 0);
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                AnonymousClass28m r3 = new AnonymousClass28m(readInt);
                int i2 = 0;
                while (i2 < readInt) {
                    i2++;
                    r3.put(objectInput.readObject(), objectInput.readObject());
                }
                C25421Js.A0A(r3);
                this.map = r3;
                return;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Illegal size value: ");
            A0r.append(readInt);
            throw new InvalidObjectException(AnonymousClass3K3.A0p(A0r, FilenameUtils.EXTENSION_SEPARATOR));
        }
        throw new InvalidObjectException(C18450wi.A06("Unsupported flags value: ", Integer.valueOf(readByte)));
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C18450wi.A0H(objectOutput, 0);
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        Iterator A0y = AnonymousClass000.A0y(this.map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            objectOutput.writeObject(A0z.getKey());
            objectOutput.writeObject(A0z.getValue());
        }
    }
}
