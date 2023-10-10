package b;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2a;

    public static void a(Context context, String str) {
        if (f2a != null) {
            return;
        }
        f2a = context.getApplicationContext();
        if ((context.getApplicationInfo().flags & 2) != 0) {
            try {
                context.getPackageManager().getPackageInfo(str, 128);
                b.a(f2a, str);
                new Thread(new a(), "LogCat").start();
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -v threadtime").getInputStream()), 20);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                b.a(new String[]{readLine});
            }
        } catch (IOException e) {
        }
    }
}
