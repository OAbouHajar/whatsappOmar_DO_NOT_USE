package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3c4  reason: invalid class name and case insensitive filesystem */
public class C67603c4 extends C67693cD {
    public static final long serialVersionUID = 0;
    public transient AnonymousClass5OI factory;

    public C67603c4(Map map, AnonymousClass5OI r2) {
        super(map);
        this.factory = r2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.factory = (AnonymousClass5OI) objectInputStream.readObject();
        setMap((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.factory);
        objectOutputStream.writeObject(backingMap());
    }

    public Map createAsMap() {
        return createMaybeNavigableAsMap();
    }

    public List createCollection() {
        return (List) this.factory.get();
    }

    public Set createKeySet() {
        return createMaybeNavigableKeySet();
    }
}
