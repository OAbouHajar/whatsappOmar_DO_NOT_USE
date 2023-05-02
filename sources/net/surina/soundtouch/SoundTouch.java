package net.surina.soundtouch;

/* compiled from: XFMFile */
public final class SoundTouch {

    /* renamed from: a  reason: collision with root package name */
    public long f135a;

    static {
        System.loadLibrary("soundtouch");
    }

    public SoundTouch() {
        this.f135a = 0;
        this.f135a = newInstance();
    }

    private final native void deleteInstance(long j2);

    public static final native String getErrorString();

    public static final native String getVersionString();

    private static final native long newInstance();

    private final native int processFile(long j2, String str, String str2);

    private final native void setPitchSemiTones(long j2, float f2);

    private final native void setSpeed(long j2, float f2);

    private final native void setTempo(long j2, float f2);

    public void close() {
        deleteInstance(this.f135a);
        this.f135a = 0;
    }

    public int processFile(String str, String str2) {
        return processFile(this.f135a, str, str2);
    }

    public void setPitchSemiTones(float f2) {
        setPitchSemiTones(this.f135a, f2);
    }

    public void setSpeed(float f2) {
        setSpeed(this.f135a, f2);
    }

    public void setTempo(float f2) {
        setTempo(this.f135a, f2);
    }
}
