package jp.co.youmitsu.ClippableLayoutTestApp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import jp.co.youmeee.clipper.CircleClipEntry
import jp.co.youmeee.clipper.CircleRevealClipAnimator
import jp.co.youmeee.clipper.ClipperLayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        ClipperLayoutInflater.inflate(this, R.layout.tutorial_view_first)
            .addEntry(CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
            .clip(container, window, CircleRevealClipAnimator())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}
