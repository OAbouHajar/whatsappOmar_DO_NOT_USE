package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.redex.IDxSupplierShape283S0100000_I0;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1wr  reason: invalid class name and case insensitive filesystem */
public class C41911wr implements Closeable {
    public static final C87204Vv A04;
    public static final C87204Vv A05;
    public static final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public static final AtomicBoolean A07 = new AtomicBoolean(false);
    public final ParcelFileDescriptor A00;
    public final GifImage A01;
    public final C614939d A02;
    public final AnonymousClass3TZ A03;

    static {
        AnonymousClass4JN r1 = new AnonymousClass4JN();
        r1.A00 = 4096;
        r1.A02 = true;
        A05 = new C87204Vv(r1);
        AnonymousClass4JN r12 = new AnonymousClass4JN();
        r12.A00 = 4096;
        A04 = new C87204Vv(r12);
    }

    public C41911wr(ParcelFileDescriptor parcelFileDescriptor, GifImage gifImage, AnonymousClass3TZ r9) {
        this.A00 = parcelFileDescriptor;
        this.A03 = r9;
        this.A01 = gifImage;
        C805244e r5 = new C805244e();
        this.A02 = new C614939d(new C61803Aj(new Rect(0, 0, gifImage.getWidth(), gifImage.getHeight()), new C85654Pj(gifImage), r5, false), new C95684n5(this));
    }

    public static Bitmap A00(File file) {
        C41911wr A012 = A01(ParcelFileDescriptor.open(file, 268435456), true);
        try {
            Bitmap A052 = A012.A05(0);
            A012.close();
            return A052;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088 A[SYNTHETIC, Splitter:B:46:0x0088] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C41911wr A01(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = A07
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x0034
            java.util.concurrent.ExecutorService r2 = A06
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L_0x0034
            X.57r r0 = new X.57r     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            r0.<init>()     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            r1 = 0
            java.lang.Object r0 = r0.get()     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            r3.compareAndSet(r1, r0)     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            r2.shutdown()     // Catch:{ RejectedExecutionException -> 0x0034, InterruptedException | ExecutionException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            java.lang.String r1 = "Failed to initialize Fresco"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0034:
            boolean r0 = r3.get()
            if (r0 == 0) goto L_0x0096
            r4 = 0
            int r3 = r5.getFd()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            if (r6 == 0) goto L_0x0047
            X.4Vv r2 = A05     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
        L_0x0043:
            java.lang.Class<com.facebook.animated.gif.GifImage> r1 = com.facebook.animated.gif.GifImage.class
            monitor-enter(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            goto L_0x004a
        L_0x0047:
            X.4Vv r2 = A04     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            goto L_0x0043
        L_0x004a:
            boolean r0 = com.facebook.animated.gif.GifImage.sInitialized     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x005b
            r0 = 1
            com.facebook.animated.gif.GifImage.sInitialized = r0     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "c++_shared"
            X.C31281dr.A01(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = "gifimage"
            X.C31281dr.A01(r0)     // Catch:{ all -> 0x0077 }
        L_0x005b:
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            int r1 = r2.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            boolean r0 = r2.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            com.facebook.animated.gif.GifImage r3 = com.facebook.animated.gif.GifImage.nativeCreateFromFileDescriptor(r3, r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            X.4Pj r0 = new X.4Pj     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0074 }
            r0.<init>(r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0074 }
            X.3TZ r2 = new X.3TZ     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0074 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0074 }
            X.1wr r0 = new X.1wr     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007d }
            r0.<init>(r5, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007d }
            return r0
        L_0x0074:
            r1 = move-exception
            r2 = r4
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x007a }
        L_0x007a:
            r1 = move-exception
            r2 = r4
            goto L_0x0083
        L_0x007d:
            r1 = move-exception
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            r3.dispose()
        L_0x0083:
            X.C30311c8.A04(r2)
            if (r5 == 0) goto L_0x0090
            r5.close()     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0090:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0096:
            java.lang.String r1 = "Fresco failed to initialize"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41911wr.A01(android.os.ParcelFileDescriptor, boolean):X.1wr");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C41921ws A02(android.content.ContentResolver r2, android.net.Uri r3, X.C16510tB r4) {
        /*
            if (r2 == 0) goto L_0x004e
            r4.A01(r3)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r3, r0)     // Catch:{ SecurityException -> 0x0036 }
            if (r2 == 0) goto L_0x0018
            r4.A02(r2)     // Catch:{ all -> 0x002f }
            X.1ws r0 = A03(r2)     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ SecurityException -> 0x0036 }
            return r0
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "gifdecoder/getmetadata/cannot open uri, pfd=null, uri="
            r1.append(r0)     // Catch:{ all -> 0x002f }
            r1.append(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x002f }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x002f }
            r0.<init>(r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ SecurityException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            java.lang.String r1 = "gifdecoder/getmetadata/failed to read uri "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x004e:
            java.lang.String r1 = "gifdecoder/getmetadata/cannot open uri, cr=null"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41911wr.A02(android.content.ContentResolver, android.net.Uri, X.0tB):X.1ws");
    }

    public static C41921ws A03(ParcelFileDescriptor parcelFileDescriptor) {
        C41911wr A012 = A01(parcelFileDescriptor, true);
        try {
            GifImage gifImage = A012.A01;
            C41921ws r0 = new C41921ws(gifImage.getWidth(), gifImage.getHeight(), gifImage.isAnimated());
            A012.close();
            return r0;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static C41921ws A04(File file) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        try {
            C41921ws A032 = A03(open);
            if (open != null) {
                open.close();
            }
            return A032;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Bitmap A05(int i2) {
        boolean z2 = true;
        boolean z3 = false;
        if (i2 >= 0) {
            z3 = true;
        }
        AnonymousClass00B.A0F(z3);
        GifImage gifImage = this.A01;
        if (i2 >= gifImage.getFrameCount()) {
            z2 = false;
        }
        AnonymousClass00B.A0F(z2);
        Bitmap createBitmap = Bitmap.createBitmap(gifImage.getWidth(), gifImage.getHeight(), Bitmap.Config.ARGB_8888);
        this.A02.A00(i2, createBitmap);
        return createBitmap;
    }

    public AnonymousClass0Aj A06(Context context) {
        boolean z2;
        AnonymousClass0S4 r2;
        Class<AnonymousClass4ON> cls = AnonymousClass4ON.class;
        synchronized (cls) {
            z2 = false;
            if (AnonymousClass4ON.A07 != null) {
                z2 = true;
            }
        }
        if (!z2) {
            AnonymousClass4LK r1 = new AnonymousClass4LK(context.getApplicationContext());
            r1.A01 = 1;
            AnonymousClass4PC r3 = new AnonymousClass4PC(r1);
            synchronized (cls) {
                if (AnonymousClass4ON.A07 != null) {
                    C13370lv r12 = AnonymousClass0X1.A00;
                    if (r12.AJ7(5)) {
                        r12.Ai1(cls.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                }
                AnonymousClass4ON.A07 = new AnonymousClass4ON(r3);
            }
            AnonymousClass44X.A00 = false;
        }
        AnonymousClass4ON r6 = AnonymousClass4ON.A07;
        if (r6 != null) {
            AnimatedFactoryV2Impl animatedFactoryV2Impl = r6.A00;
            if (animatedFactoryV2Impl == null) {
                AnonymousClass4SM r7 = r6.A01;
                if (r7 == null) {
                    AnonymousClass4V9 r72 = r6.A05.A0D;
                    C89204bl r0 = r6.A03;
                    if (r0 == null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 26) {
                            int i3 = r72.A08.A02.A00;
                            r0 = new C65193Th(new AnonymousClass0EH(i3), r72.A00(), i3);
                        } else if (i2 >= 21 || !AnonymousClass44X.A00) {
                            int i4 = r72.A08.A02.A00;
                            r0 = new C65183Tg(new AnonymousClass0EH(i4), r72.A00(), i4);
                        } else {
                            try {
                                Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(new Class[]{C83234Fw.class});
                                Object[] objArr = new Object[1];
                                C83234Fw r32 = r72.A04;
                                if (r32 == null) {
                                    AnonymousClass4OO r02 = r72.A08;
                                    r32 = new C83234Fw(r02.A00, r02.A02);
                                    r72.A04 = r32;
                                }
                                objArr[0] = r32;
                                r0 = (C89204bl) constructor.newInstance(objArr);
                            } catch (ClassNotFoundException e2) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
                            } catch (IllegalAccessException e3) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
                            } catch (NoSuchMethodException e4) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
                            } catch (InvocationTargetException e5) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
                            } catch (InstantiationException e6) {
                                throw new RuntimeException("Wrong Native code setup, reflection failed.", e6);
                            }
                        }
                        r6.A03 = r0;
                    }
                    C82074Bc r8 = r6.A04;
                    if (Build.VERSION.SDK_INT >= 21) {
                        r7 = new AnonymousClass3TV(r8, r72.A00());
                    } else {
                        boolean z3 = !AnonymousClass44X.A00;
                        C12200k0 r22 = r72.A01;
                        if (r22 == null) {
                            C65143Tc A012 = r72.A01(z3 ? 1 : 0);
                            StringBuilder sb = new StringBuilder("failed to get pool for chunk type: ");
                            sb.append(z3);
                            String obj = sb.toString();
                            if (A012 != null) {
                                C65143Tc A013 = r72.A01(z3);
                                C04680Nm r13 = r72.A02;
                                if (r13 == null) {
                                    C13560ma r4 = r72.A00;
                                    if (r4 == null) {
                                        AnonymousClass4OO r14 = r72.A08;
                                        r4 = new C65163Te(r14.A00, r14.A04, r14.A07);
                                        r72.A00 = r4;
                                    }
                                    r13 = new C04680Nm(r4);
                                    r72.A02 = r13;
                                }
                                r22 = new C95634mx(r13, A013);
                                r72.A01 = r22;
                            } else {
                                throw new NullPointerException(String.valueOf(obj));
                            }
                        }
                        r7 = new AnonymousClass3TW(new AnonymousClass4ZQ(r22), r8, r0);
                    }
                    r6.A01 = r7;
                }
                AnonymousClass4PC r03 = r6.A05;
                AnonymousClass5NW r9 = r03.A0A;
                C95604mu r82 = r6.A02;
                if (r82 == null) {
                    r82 = new C95604mu(r03.A03, r03.A06, new C95694n6());
                    r6.A02 = r82;
                }
                if (!C804944b.A01) {
                    try {
                        C804944b.A00 = AnimatedFactoryV2Impl.class.getConstructor(new Class[]{AnonymousClass4SM.class, AnonymousClass5NW.class, C95604mu.class, Boolean.TYPE}).newInstance(new Object[]{r7, r9, r82, false});
                    } catch (Throwable unused) {
                    }
                    if (C804944b.A00 != null) {
                        C804944b.A01 = true;
                    }
                }
                animatedFactoryV2Impl = C804944b.A00;
                r6.A00 = animatedFactoryV2Impl;
            }
            if (animatedFactoryV2Impl == null) {
                r2 = null;
            } else {
                r2 = animatedFactoryV2Impl.A01;
                if (r2 == null) {
                    IDxSupplierShape283S0100000_I0 iDxSupplierShape283S0100000_I0 = new IDxSupplierShape283S0100000_I0(animatedFactoryV2Impl, 0);
                    C03480Ir r92 = new C03480Ir(animatedFactoryV2Impl.A05.A9C());
                    IDxSupplierShape283S0100000_I0 iDxSupplierShape283S0100000_I02 = new IDxSupplierShape283S0100000_I0(animatedFactoryV2Impl, 1);
                    AnonymousClass0PN r62 = animatedFactoryV2Impl.A00;
                    if (r62 == null) {
                        r62 = new AnonymousClass0PN(animatedFactoryV2Impl);
                        animatedFactoryV2Impl.A00 = r62;
                    }
                    C11300iW r10 = C11300iW.A01;
                    if (r10 == null) {
                        r10 = new C11300iW();
                        C11300iW.A01 = r10;
                    }
                    r2 = new AnonymousClass0S4(iDxSupplierShape283S0100000_I0, iDxSupplierShape283S0100000_I02, RealtimeSinceBootClock.A00, r62, animatedFactoryV2Impl.A03, animatedFactoryV2Impl.A04, r92, r10);
                    animatedFactoryV2Impl.A01 = r2;
                }
            }
            if (r2 != null) {
                return new AnonymousClass0Aj(r2.A00(this.A03.A02()));
            }
            throw new IOException("Failed to create gif drawable, no drawable factory");
        }
        throw new NullPointerException(String.valueOf("ImagePipelineFactory was not initialized!"));
    }

    public void close() {
        this.A01.dispose();
        C30311c8.A04(this.A03);
        try {
            this.A00.close();
        } catch (Throwable th) {
            Log.e(th);
        }
    }
}
