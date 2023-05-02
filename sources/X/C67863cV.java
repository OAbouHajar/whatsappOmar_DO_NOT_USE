package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3cV  reason: invalid class name and case insensitive filesystem */
public class C67863cV extends C67813cQ implements AnonymousClass5T4 {
    public static final long serialVersionUID = 0;
    public final transient C17380uz emptySet = emptySet((Comparator) null);

    public C67863cV(C17930vs r2, int i2, Comparator comparator) {
        super(r2, i2);
    }

    public static C67843cT builder() {
        return new C67843cT();
    }

    public static C67863cV copyOf(AnonymousClass5T4 r1) {
        return copyOf(r1, (Comparator) null);
    }

    public static C67863cV copyOf(AnonymousClass5T4 r2, Comparator comparator) {
        return r2.isEmpty() ? of() : r2 instanceof C67863cV ? (C67863cV) r2 : fromMapEntries(r2.asMap().entrySet(), (Comparator) null);
    }

    public static C17380uz emptySet(Comparator comparator) {
        return comparator == null ? C17380uz.of() : C67943cd.emptySet(comparator);
    }

    public static C67863cV fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        AnonymousClass1C5 r5 = new AnonymousClass1C5(collection.size());
        int i2 = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(it);
            Object key = A0z.getKey();
            C17380uz valueSet = valueSet((Comparator) null, (Collection) A0z.getValue());
            if (!valueSet.isEmpty()) {
                r5.put(key, valueSet);
                i2 += valueSet.size();
            }
        }
        return new C67863cV(r5.build(), i2, (Comparator) null);
    }

    public static C67863cV of() {
        return C67923cb.INSTANCE;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            AnonymousClass1C5 builder = C17930vs.builder();
            int i2 = 0;
            int i3 = 0;
            while (i2 < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    C18390wc valuesBuilder = valuesBuilder(comparator);
                    int i4 = 0;
                    do {
                        valuesBuilder.add(objectInputStream.readObject());
                        i4++;
                    } while (i4 < readInt2);
                    C17380uz build = valuesBuilder.build();
                    if (build.size() == readInt2) {
                        builder.put(readObject, build);
                        i3 += readInt2;
                        i2++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 40);
                        A0g.append("Duplicate key-value pairs exist for key ");
                        throw new InvalidObjectException(AnonymousClass000.A0h(valueOf, A0g));
                    }
                } else {
                    throw new InvalidObjectException(C13680ns.A0i("Invalid value count ", C13690nt.A0g(31), readInt2));
                }
            }
            try {
                C81904Af.MAP_FIELD_SETTER.set((Object) this, (Object) builder.build());
                C81904Af.SIZE_FIELD_SETTER.set((Object) this, i3);
                AnonymousClass492.EMPTY_SET_FIELD_SETTER.set((Object) this, (Object) emptySet(comparator));
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException(C13680ns.A0i("Invalid key count ", C13690nt.A0g(29), readInt));
        }
    }

    public static C17380uz valueSet(Comparator comparator, Collection collection) {
        return C17380uz.copyOf(collection);
    }

    public static C18390wc valuesBuilder(Comparator comparator) {
        return comparator == null ? new C18390wc() : new C67873cW(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C90544eL.writeMultimap(this, objectOutputStream);
    }

    public C17380uz get(Object obj) {
        Object obj2 = this.map.get(obj);
        C17380uz r0 = this.emptySet;
        if (obj2 == null) {
            if (r0 != null) {
                obj2 = r0;
            } else {
                throw AnonymousClass000.A0W("Both parameters are null");
            }
        }
        return (C17380uz) obj2;
    }

    public Comparator valueComparator() {
        C17380uz r1 = this.emptySet;
        if (r1 instanceof C67943cd) {
            return ((C67943cd) r1).comparator();
        }
        return null;
    }
}
