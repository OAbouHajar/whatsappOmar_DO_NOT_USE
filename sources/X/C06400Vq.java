package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Vq  reason: invalid class name and case insensitive filesystem */
public class C06400Vq {
    public static final Object A00 = new Object();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue((String) null, str) : attributeValue;
    }

    public static ArrayList A01(Context context) {
        if (A01 == null) {
            synchronized (A00) {
                if (A01 == null) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A0u2 = AnonymousClass000.A0u();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    throw AnonymousClass000.A0T(AnonymousClass000.A0h(activityInfo.name, AnonymousClass000.A0r("Failed to open android.app.shortcuts meta-data resource of ")));
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A002 = A00(loadXmlMetaData, "targetClass");
                                            ArrayList A0u3 = AnonymousClass000.A0u();
                                            ArrayList A0u4 = AnonymousClass000.A0u();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 != 1) {
                                                    if (next2 != 2) {
                                                        if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                            break;
                                                        }
                                                    } else {
                                                        String name = loadXmlMetaData.getName();
                                                        if (name.equals("data")) {
                                                            A00(loadXmlMetaData, "scheme");
                                                            A00(loadXmlMetaData, "host");
                                                            A00(loadXmlMetaData, "port");
                                                            A00(loadXmlMetaData, "path");
                                                            A00(loadXmlMetaData, "pathPattern");
                                                            A00(loadXmlMetaData, "pathPrefix");
                                                            A0u3.add(new AnonymousClass0NT(A00(loadXmlMetaData, "mimeType")));
                                                        } else if (name.equals("category")) {
                                                            A0u4.add(A00(loadXmlMetaData, FacebookFacade.RequestParameter.NAME));
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            AnonymousClass0ON r0 = (A0u3.isEmpty() || A002 == null || A0u4.isEmpty()) ? null : new AnonymousClass0ON(A002, (AnonymousClass0NT[]) A0u3.toArray(new AnonymousClass0NT[A0u3.size()]), (String[]) A0u4.toArray(new String[A0u4.size()]));
                                            if (r0 != null) {
                                                A0u2.add(r0);
                                            }
                                        }
                                    } catch (Exception e2) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e2);
                                    }
                                }
                                loadXmlMetaData.close();
                                A0u.addAll(A0u2);
                            }
                        }
                    }
                    A01 = A0u;
                }
            }
        }
        return A01;
    }
}
