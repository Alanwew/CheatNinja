package b;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Context f3a;

    /* renamed from: b  reason: collision with root package name */
    private static String f4b;

    public static void a(Context context, String str) {
        f3a = context;
        f4b = str;
    }

    public static void a(String[] strArr) {
        Intent intent = new Intent();
        intent.setPackage(f4b);
        intent.setAction("com.adrt.LOGCAT_ENTRIES");
        intent.putExtra("lines", strArr);
        f3a.sendBroadcast(intent);
    }
}
