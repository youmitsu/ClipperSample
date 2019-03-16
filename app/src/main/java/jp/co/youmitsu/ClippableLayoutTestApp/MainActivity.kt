package jp.co.youmitsu.ClippableLayoutTestApp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import jp.co.youmeee.clipper.CircleClipEntry
import jp.co.youmeee.clipper.ClipperLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        ClipperLayout(this).also {
            it.add(CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
        }.clip(container, window)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}
