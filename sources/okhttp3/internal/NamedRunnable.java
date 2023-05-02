package okhttp3.internal;

/* compiled from: XFMFile */
public abstract class NamedRunnable implements Runnable {
    protected final String name;

    public NamedRunnable(String str, Object... objArr) {
        this.name = Util.format(str, objArr);
    }

    public abstract void execute();

    public final void run() {
        String name2 = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name2);
        }
    }
}
