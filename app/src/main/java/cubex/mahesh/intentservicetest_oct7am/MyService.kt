package cubex.mahesh.intentservicetest_oct7am

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.net.URL

var bmp:Bitmap? =null

class MyService : IntentService("MyService")
{
    override fun onHandleIntent(p0: Intent?) {

        var url: URL = URL("https://images.techhive.com/images/article/2016/09/android-old-habits-100682662-primary.idge.jpg")
        var isr= url.openStream()
        bmp = BitmapFactory.decodeStream(isr)

        var i = Intent( )
        i.setAction("image_loading_done")
        sendBroadcast(i)
    }

}