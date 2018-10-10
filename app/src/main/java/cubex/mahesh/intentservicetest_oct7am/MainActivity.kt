package cubex.mahesh.intentservicetest_oct7am

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getImage.setOnClickListener {
            var i = Intent(this@MainActivity,
                    MyService::class.java)
            startService(i)
        }

        var filter = IntentFilter( )
        filter.addAction("image_loading_done")
        registerReceiver(object:BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                iview.setImageBitmap(bmp)
            }
        },filter)

    }
}
