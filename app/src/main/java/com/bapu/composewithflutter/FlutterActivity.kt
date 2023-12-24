package com.bapu.composewithflutter
import io.flutter.embedding.android.FlutterActivity

class FlutterActivity : FlutterActivity() {
    override fun getInitialRoute(): String {
        return "/second"
    }
}