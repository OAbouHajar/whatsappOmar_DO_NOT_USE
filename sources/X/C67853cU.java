package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3cU  reason: invalid class name and case insensitive filesystem */
public class C67853cU extends C67813cQ implements AnonymousClass5Ue {
    public static final long serialVersionUID = 0;

    public C67853cU(C17930vs r1, int i2) {
        super(r1, i2);
    }

    public static C67833cS builder() {
        return new C67833cS();
    }

    public static C67853cU fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        AnonymousClass1C5 r5 = new AnonymousClass1C5(collection.size());
        int i2 = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(it);
            Object key = A0z.getKey();
            C34641kb copyOf = C34641kb.copyOf((Collection) A0z.getValue());
            if (!copyOf.isEmpty()) {
                r5.put(key, copyOf);
                i2 += copyOf.size();
            }
        }
        return new C67853cU(r5.build(), i2);
    }

    public static C67853cU of() {
        return C67803cP.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AnonymousClass1C5 builder = C17930vs.builder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C67763cL builder2 = C34641kb.builder();
                    int i4 = 0;
                    do {
                        builder2.add(objectInputStream.readObject());
                        i4++;
                    } while (i4 < readInt2);
                    builder.put(readObject, builder2.build());
                    i3 += readInt2;
                    i2++;
                } else {
                    throw new InvalidObjectException(C13680ns.A0i("Invalid value count ", C13690nt.A0g(31), readInt2));
                }
            }
            try {
                C81904Af.MAP_FIELD_SETTER.set((Object) this, (Object) builder.build());
                C81904Af.SIZE_FIELD_SETTER.set((Object) this, i3);
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException(C13680ns.A0i("Invalid key count ", C13690nt.A0g(29), readInt));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C90544eL.writeMultimap(this, objectOutputStream);
    }

    public C34641kb get(Object obj) {
        C34641kb r0 = (C34641kb) this.map.get(obj);
        return r0 == null ? C34641kb.of() : r0;
    }
}
