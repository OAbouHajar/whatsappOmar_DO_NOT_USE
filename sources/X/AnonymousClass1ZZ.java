package X;

import com.obwhatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.1ZZ  reason: invalid class name */
public class AnonymousClass1ZZ extends ObjectInputStream {
    public final /* synthetic */ C16040sK A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ZZ(C16040sK r1, InputStream inputStream) {
        super(inputStream);
        this.A00 = r1;
    }

    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        return readClassDescriptor.getName().equals("com.obwhatsapp.App$Me") ? ObjectStreamClass.lookup(Me.class) : readClassDescriptor;
    }
}
