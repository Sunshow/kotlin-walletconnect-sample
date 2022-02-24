package net.sunshow.walletconnect.sample

import android.app.Application
import org.walletconnect.Session
import org.walletconnect.impls.WCSessionStore
import org.walletconnect.nullOnThrow

class ExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        private lateinit var storage: WCSessionStore
        lateinit var config: Session.Config
        lateinit var session: Session

        fun resetSession() {
            nullOnThrow { session }?.clearCallbacks()
        }
    }
}
