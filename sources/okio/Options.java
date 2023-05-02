package okio;

import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: XFMFile */
public final class Options extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final ByteString[] f2355a;

    public Options(ByteString[] byteStringArr) {
        this.f2355a = byteStringArr;
    }

    public static Options of(ByteString... byteStringArr) {
        return new Options((ByteString[]) byteStringArr.clone());
    }

    public ByteString get(int i2) {
        return this.f2355a[i2];
    }

    public int size() {
        return this.f2355a.length;
    }
}
